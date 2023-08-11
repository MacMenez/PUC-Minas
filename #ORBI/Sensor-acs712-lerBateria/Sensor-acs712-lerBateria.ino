#include <Arduino.h>

const int pinoSensor = A0;
const float sensibilidade = 0.185; // Sensibilidade do sensor (mV/A)
const float voltageRef = 3.3; // Tensão de referência do ESP32 (V)
const float capacidadeBateria = 1000; // Capacidade da bateria (mAh)

void setup() {
  Serial.begin(9600);
  pinMode(pinoSensor, INPUT);
}

void loop() {
  // Leitura analógica da saída do sensor ACS712
  int valorSensor = analogRead(pinoSensor);

  // Conversão da leitura analógica para corrente (em A)
  float corrente = (valorSensor - 2048) * sensibilidade / 1000.0;

  // Cálculo da porcentagem da bateria
  float percentualBateria = (corrente / (capacidadeBateria / 1000.0)) * 100;

  Serial.print("Corrente: ");
  Serial.print(corrente);
  Serial.print(" A");

  Serial.print(" | Nível da bateria: ");
  Serial.print(percentualBateria);
  Serial.println("%");

  delay(1000); // Aguarda 1 segundo antes de fazer a próxima medição
}
