#include "EmonLib.h"
EnergyMonitor emon1;
float ruido = 0.33;
int tensao = 5;

//#define LED_BUILTIN D4;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  /*pinMode(LED_BUILTIN, OUTPUT);
  digitalWrite(LED_BUILTIN, HIGH);

  emon1.current(D4, 5.5);*/
}

void loop() {
  // put your main code here, to run repeatedly:
  double Irms = emon1.calcIrms(1480);
  Irms = Irms - ruido;

  if (Irms < 0) {
    Irms = 0;
  }

  char ls = Serial.read();

  /*if(ls == 'R'){
    digitalWrite(rele, !digitalWrite(rele));
  }*/

  if(Irms > 0){
    Serial.println("ESP32 Ligado");
  }
  else {
    Serial.println("ESP32 Desligado");
  }

  Serial.println("Corrente: ");
  Serial.println(Irms);
  Serial.println(" A");
  Serial.println("Potência: ");
  Serial.println(Irms * tensao);
  Serial.println(" W");
  delay(1000);
}
