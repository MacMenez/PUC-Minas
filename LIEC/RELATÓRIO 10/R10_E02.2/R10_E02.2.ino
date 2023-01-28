int buzzer = 4;
int led = 13;

void setup() {
  // put your setup code here, to run once:
  pinMode(buzzer, OUTPUT);
  pinMode(led,OUTPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  //Ligando o buzzer com uma frequência de 1500 Hz.
  tone (buzzer, 1500);
  digitalWrite(led, 1);
  delay(500);

  //Desligando o buzzer.
  noTone(buzzer);
  digitalWrite(led, 0);
  delay(500);
}
