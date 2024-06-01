/*
  Implementação do sensor LDR para simulação de um Piranómetro e Heliógrafo. 
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

/* CONFIGURAÇÃO DO SENSOR LDR */
#define LDR 1 // Pino do LDR

// Variáveis para controle do tempo das leituras
unsigned long t_anterior_piranometro = 0; // Função Millis para o LDR simular um Piranometro
unsigned long t_anterior_heliografo = 0; // Função Millis para o LDR simular um Heliografo
const long intervaloPiranometro = 10000; // Intervalo de leitura do piranômetro (10 segundos)
const long intervaloHeliografo = 60000; // Intervalo de leitura do heliógrafo (1 minuto)

// Variáveis para medições do heliógrafo
unsigned long duracaoBrilhoSolar = 0; // Duração do brilho solar em milissegundos
unsigned long inicioBrilhoSolar = 0;
bool brilhoSolarAtivo = false;

void setup() {
  Serial.begin(9600); // Inicializa a comunicação serial
  pinMode(LDR, INPUT);
}

void loop() {
  unsigned long currentMillis = millis();

  // Leitura do Piranômetro
  if (currentMillis - t_anterior_piranometro >= intervaloPiranometro) {
    t_anterior_piranometro = currentMillis;

    int irradiancia = analogRead(LDR); // Lê o valor do LDR

    // Análise de Anomalias Climáticas
    if (irradiancia < 200) {
      Serial.println("Anomalia Detectada: Baixa Irradiância Solar (Possível tempestade de poeira ou vulcão)");
    }

    Serial.print("Irradiância Solar (Piranômetro): ");
    Serial.print(irradiancia);
    Serial.println(" LDR");
  }

  // Leitura do Heliógrafo
  if (currentMillis - t_anterior_heliografo >= intervaloHeliografo) {
    t_anterior_heliografo = currentMillis;

    int nivelLuminosidade = analogRead(LDR); // Lê o valor do LDR

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
  }

  delay(1000); // Pequeno atraso para estabilizar as leituras
}