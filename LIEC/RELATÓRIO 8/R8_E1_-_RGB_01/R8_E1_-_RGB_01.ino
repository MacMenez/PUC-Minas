int ledVerd = 9; //Verde
int ledAzu = 10; //Azul
int ledVerm = 11; //Vermelho

void setup() {
  // put your setup code here, to run once:
  pinMode(ledVerd, OUTPUT);
  pinMode(ledAzu, OUTPUT);
  pinMode(ledVerm, OUTPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(ledVerd, 0);
  digitalWrite(ledAzu, 0);
  digitalWrite(ledVerm, 0);
  digitalWrite(ledVerd, 1);
  delay(500);
  digitalWrite(ledVerd, 0);
  digitalWrite(ledAzu, 1);
  delay(500);
  digitalWrite(ledAzu, 0);
  digitalWrite(ledVerm, 1);
  delay(500);
  digitalWrite(ledVerm, 0);
  digitalWrite(ledVerd, 1);
  digitalWrite(ledAzu, 1);
  delay(500);
  digitalWrite(ledVerd, 0);
  digitalWrite(ledVerm, 1);
  delay(500);
  digitalWrite(ledAzu, 0);
  digitalWrite(ledVerd, 1);
  delay(500);
}
