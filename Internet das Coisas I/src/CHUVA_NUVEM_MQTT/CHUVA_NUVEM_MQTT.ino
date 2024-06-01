#include <Wire.h>
#include <WiFi.h>
#include <PubSubClient.h>

/* CONFIGURAÇÃO DO SENSOR DE CHUVA */
#define RAIN_SENSOR 11          // Pino de leitura analógica no ESP32 (GPIO34)
int leituraAnalogica_Chuva = 0; // Valor inicial para leitura do sensor de chuva
float porcentagemChuva = 0.0;   // Valor utilizado para calcular a previsão da quantidade de chuva
unsigned long t_anterior_chuva = 0;   // Variável para armazenar o último tempo em que a leitura foi feita
const long intervalo_chuva = 60000;   // Intervalo de 1 minuto (60000 milissegundos)

/* Configuração WiFi e MQTT */
const char* ssid = "SEU_SSID";          // SSID da sua rede WiFi
const char* password = "SUA_SENHA";     // Senha da sua rede WiFi
const char* mqtt_server = "SEU_BROKER"; // Utilizado no trabalho o broker test.mosquitto.org

WiFiClient espClient;
PubSubClient client(espClient);

#define TOPICO_PUBLISH_CHUVA "iot_puc_minas_topico_sensor_chuva"

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
  // Loop até que esteja conectado
  while (!client.connected()) {
    Serial.print("Tentando conexão MQTT...");
    // Tenta conectar
    if (client.connect("ESP32Client")) {
      Serial.println("Conectado");
    } else {
      Serial.print("Falha, rc=");
      Serial.print(client.state());
      Serial.println(" Tentar novamente em 5 segundos");
      // Espera 5 segundos antes de tentar novamente
      delay(5000);
    }
  }
}

void setup() {
  Serial.begin(115200);
  pinMode(RAIN_SENSOR, INPUT);  // Configurando o sensor de chuva

  setup_wifi();
  client.setServer(mqtt_server, 1883);
}

void loop() {
  if (!client.connected()) {
    reconnect();
  }
  client.loop();

  /* PROGRAMANDO O SENSOR DE CHUVA */
  unsigned long t_atual_chuva = millis(); // Obtém o tempo atual

  if (t_atual_chuva - t_anterior_chuva >= intervalo_chuva) {
    // Salva o tempo atual como o último tempo em que a leitura foi feita
    t_anterior_chuva = t_atual_chuva;

    // Faz a leitura do sensor
    leituraAnalogica_Chuva = analogRead(RAIN_SENSOR); // Valor máximo enviado pelo sensor é 4095 em leitura analógica no ESP32

    // Calcular a porcentagem da chuva (0-100%)
    porcentagemChuva = ((leituraAnalogica_Chuva / 4095.0)) * 100;

    Serial.print("Leitura Analógica: ");
    Serial.println(leituraAnalogica_Chuva);

    Serial.print("Porcentagem de Chuva: ");
    Serial.print(porcentagemChuva);
    Serial.println("%");

    // A variação é decrescente, ou seja, seco dá o valor total (4095) até molhado que será próximo de 0.
    if (porcentagemChuva <= 10.0) {
      Serial.println("Sem previsão de chuva"); // Sem previsão de Chuva
    } else if (porcentagemChuva <= 33.33) {
      Serial.println("Chuva Leve/Chuvisco"); // Chuva Leve/Chuviscando
    } else if (porcentagemChuva <= 66.66) {
      Serial.println("Chuva Moderada"); // Chuva Moderada
    } else {
      Serial.println("Chuva Intensa"); // Chuva intensa
    }

    /* Envio dos Dados do Sensor de Chuva Para a Nuvem */
    char chuva_str[10] = {0}; // String de envio da porcentagem de chuva
    dtostrf(porcentagemChuva, 6, 2, chuva_str); // Formatar porcentagem de chuva como String
    client.publish(TOPICO_PUBLISH_CHUVA, chuva_str); // Publicar Porcentagem da Chuva
  }
}
