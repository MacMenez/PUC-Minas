void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600); //Taxa de transmissão. 9600 bytes por segundo
}

void loop() {
  // put your main code here, to run repeatedly:
  Serial.println("Olá Mundo!");
  delay(1000);

}
