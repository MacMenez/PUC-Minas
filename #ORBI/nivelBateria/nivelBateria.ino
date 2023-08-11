const int VP_PIN = 36; // Pino VP do ESP32
const float VOLTAGE_DIVIDER_RATIO = 2.0; // Relação do divisor de tensão
const float MAX_VOLTAGE = 5.0; // Tensão máxima do ESP32 em volts
const float BATTERY_MAX_VOLTAGE = 4.2; // Tensão máxima da bateria em volts
const float BATTERY_MIN_VOLTAGE = 2.5; // Tensão mínima da bateria em volts

void setup() {
  Serial.begin(115200);
}

void loop() {
  // Faz a leitura analógica do pino VP do ESP32
  int adcValue = analogRead(VP_PIN);

  // Converte o valor lido para a tensão real usando o divisor de tensão
  float voltage = adcValue * (MAX_VOLTAGE / 4095.0) * VOLTAGE_DIVIDER_RATIO;

  // Calcula a estimativa do nível da bateria com base nas tensões máxima e mínima da bateria
  int batteryLevel = map(voltage, BATTERY_MIN_VOLTAGE, BATTERY_MAX_VOLTAGE, 0, 100);
  batteryLevel = constrain(batteryLevel, 0, 100);

  // Exibe a leitura da tensão e a estimativa do nível da bateria no monitor serial
  Serial.print("Tensão de Alimentação: ");
  Serial.print(voltage, 2);
  Serial.print(" V | Nível da Bateria: ");
  Serial.print(batteryLevel);
  Serial.println("%");

  delay(5000); // Aguarda 5 segundos antes de fazer a próxima leitura
}
