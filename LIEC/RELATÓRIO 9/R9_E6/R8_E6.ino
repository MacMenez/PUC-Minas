int led = 11;

void setup() {
  // put your setup code here, to run once:
  
}

void loop() {
  // put your main code here, to run repeatedly:
  analogWrite(led, 0);
  delay(200);
  analogWrite(led, 31);
  delay(200);
  analogWrite(led, 63);
  delay(200);
  analogWrite(led, 127);
  delay(200);
  analogWrite(led, 191);
  delay(200);
  analogWrite(led, 255);
  delay(200);
}
