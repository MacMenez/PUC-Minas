/*
  A leitura analógica é inversa, onde um valor mais alto indica menos chuva e um valor mais baixo indica mais chuva.
  Usar a fórmula (1.0 - (leituraAnalogica_Chuva / 4095.0)) * 100 é mais direta e mais intuitiva para alguém lendo o código, já que expressa claramente a inversão e reescala os valores em termos de porcentagem.
  Valor máximo enviado pelo sensor é 8191 em leitura analógica.
  A variação é descrescente, ou seja, seco da o valor total 8191 até molhado que será próximo de 0. Apx. 3 partes de 2730.
*/

#include <Wire.h>

/* CONFIGURAÇÃO DO SENSOR DE CHUVA */
#define RAIN_SENSOR 11          // Pino de leitura analógica no ESP32 (GPIO34)
int leituraAnalogica_Chuva = 0; // Valor inicial para leitura do sensor de chuva
float porcentagemChuva = 0.0;   // Valor utilizado para calcular a precição da quantidade de chuva
unsigned long t_anterior_chuva = 0;   // Variável para armazenar o último tempo em que a leitura foi feita
const long intervalo_chuva = 60000;   // Intervalo de 1 minuto (60000 milissegundos)

void setup() {
  Serial.begin(115200);
  pinMode(RAIN_SENSOR, INPUT);  // Configurando o sensor de chuva
}

void loop() {

  /* PROGRAMANDO O SENSOR DE CHUVA */
  unsigned long t_atual_chuva = millis(); // Obtém o tempo atual

  if (t_atual_chuva - t_anterior_chuva >= intervalo_chuva) {
    // Salva o tempo atual como o último tempo em que a leitura foi feita
    t_anterior_chuva = t_atual_chuva;

    // Faz a leitura do sensor
    leituraAnalogica_Chuva = analogRead(RAIN_SENSOR); // Valor máximo enviado pelo sensor é 4095 em leitura analógica no ESP32

    // Calcular a porcentagem da chuva (0-100%)
    porcentagemChuva = (1.0 - (leituraAnalogica_Chuva / 4095.0)) * 100;

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
  }
}
