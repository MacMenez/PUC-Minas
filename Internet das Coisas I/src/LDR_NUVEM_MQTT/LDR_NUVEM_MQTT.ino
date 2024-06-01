/*
  Implementação do sensor LDR para simulação de um Piranómetro e Heliógrafo comunicando com
  um servidor MQTT. 
  Desenvolviemento de leitura e análise da seguinte forma:

  Piranômetro
  - Anomalias Climáticas: Detectar anomalias na irradiância solar que possam indicar 
  mudanças climáticas ou eventos atmosféricos específicos, como vulcões ou grandes 
  tempestades de poeira.

  Heliógrafo
  1. Medição da Duração do Brilho Solar
  - Duração Diária: Registro da quantidade de horas de brilho solar por dia.

  2. Impacto na Agricultura e Ecossistemas
  - Fotossíntese e Crescimento das Plantas: Avaliação da quantidade de luz solar disponível 
  para a fotossíntese, influenciando o crescimento das plantas e a produtividade agrícola.
*/

#include <WiFi.h>
#include <PubSubClient.h>

/* CONFIGURAÇÃO DO SENSOR LDR */
#define LDR 1 // Pino do LDR

// Variáveis para controle do tempo das leituras
unsigned long t_anterior_piranometro = 0; // Função millis para o LDR simular um Piranômetro
unsigned long t_anterior_heliografo = 0; // Função millis para o LDR simular um Heliógrafo
const long intervaloPiranometro = 10000; // Intervalo de leitura do piranômetro (10 segundos)
const long intervaloHeliografo = 60000; // Intervalo de leitura do heliógrafo (1 minuto)

// Variáveis para medições do heliógrafo
unsigned long duracaoBrilhoSolar = 0; // Duração do brilho solar em milissegundos
unsigned long inicioBrilhoSolar = 0;
bool brilhoSolarAtivo = false;

// Configurações do MQTT
#define TOPICO_PUBLISH_PIRANOMETRO "iot_puc_minas_topico_sensor_ldr_piranometro"

#define TOPICO_PUBLISH_HELIOGRAFO_SOL "iot_puc_minas_topico_sensor_ldr_heliografo_sol"
#define TOPICO_PUBLISH_HELIOGRAFO_LUMINOSIDADE "iot_puc_minas_topico_sensor_ldr_heliografo_luminosidade"

const char* ssid = "Menez";
const char* password = "best#menez";
const char* mqtt_server = "test.mosquitto.org";

WiFiClient espClient;
PubSubClient client(espClient);

void setup_wifi() {
  delay(10);
  Serial.println();
  Serial.print("Conectando-se a ");
  Serial.println(ssid);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  Serial.println("");
  Serial.println("WiFi conectado");
  Serial.println("Endereço IP: ");
  Serial.println(WiFi.localIP());
}

void reconnect() {
  while (!client.connected()) {
    Serial.print("Tentando conectar ao MQTT...");
    if (client.connect("ESP32Client")) {
      Serial.println("conectado");
    } else {
      Serial.print("falhou, rc=");
      Serial.print(client.state());
      Serial.println(" tente novamente em 5 segundos");
      delay(5000);
    }
  }
}

void setup() {
  Serial.begin(115200); // Inicializa a comunicação serial
  setup_wifi();
  client.setServer(mqtt_server, 1883);
  pinMode(LDR, INPUT);
}

void loop() {
  if (!client.connected()) {
    reconnect();
  }
  client.loop();

  unsigned long currentMillis = millis();

  // Leitura do Piranômetro
  if (currentMillis - t_anterior_piranometro >= intervaloPiranometro) {
    t_anterior_piranometro = currentMillis;

    int irradiancia = analogRead(LDR); // Lê o valor do LDR
    float irradianciaPct = (irradiancia / 4095.0) * 100; // Convertendo para porcentagem

    // Análise de Anomalias Climáticas
    if (irradiancia < 200) {
      Serial.println("Anomalia Detectada: Baixa Irradiância Solar (Possível tempestade de poeira ou vulcão)");
    }

    Serial.print("Irradiância Solar (Piranômetro): ");
    Serial.print(irradianciaPct);
    Serial.println(" %");

    // Envio dos dados do Piranômetro para o broker MQTT
    char irradiancia_str[10] = {0};
    sprintf(irradiancia_str, "%.2f", irradianciaPct);
    client.publish(TOPICO_PUBLISH_PIRANOMETRO, irradiancia_str);
  }

  // Leitura do Heliógrafo
  if (currentMillis - t_anterior_heliografo >= intervaloHeliografo) {
    t_anterior_heliografo = currentMillis;

    int nivelLuminosidade = analogRead(LDR); // Lê o valor do LDR
    float nivelLuminosidadePct = (nivelLuminosidade / 4095.0) * 100; // Convertendo para porcentagem

    if (nivelLuminosidade > 500) {
      if (!brilhoSolarAtivo) {
        inicioBrilhoSolar = currentMillis;
        brilhoSolarAtivo = true;
      }
    } else {
      if (brilhoSolarAtivo) {
        duracaoBrilhoSolar += currentMillis - inicioBrilhoSolar;
        brilhoSolarAtivo = false;
      }
    }

    // Conversão da duração de milissegundos para horas
    float duracaoBrilhoSolarHoras = duracaoBrilhoSolar / 3600000.0;

    Serial.print("Duração do Brilho Solar: ");
    Serial.print(duracaoBrilhoSolarHoras);
    Serial.println(" horas");

    // Impacto na Agricultura e Ecossistemas
    if (duracaoBrilhoSolarHoras < 4) {
      Serial.println("Alerta: Baixa duração de brilho solar, pode impactar na fotossíntese e crescimento das plantas.");
    } else if (duracaoBrilhoSolarHoras > 10) {
      Serial.println("Nota: Alta duração de brilho solar, favorável para a fotossíntese.");
    }

    // Envio dos dados do Heliógrafo para o broker MQTT
    char duracaoBrilhoSolarHoras_str[10] = {0};
    sprintf(duracaoBrilhoSolarHoras_str, "%.2f", duracaoBrilhoSolarHoras);
    client.publish(TOPICO_PUBLISH_HELIOGRAFO_SOL, duracaoBrilhoSolarHoras_str);

    char nivelLuminosidade_str[10] = {0};
    sprintf(nivelLuminosidade_str, "%.2f", nivelLuminosidadePct);
    client.publish(TOPICO_PUBLISH_HELIOGRAFO_LUMINOSIDADE, nivelLuminosidade_str);
  }

  delay(1000); // Pequeno atraso para estabilizar as leituras
}