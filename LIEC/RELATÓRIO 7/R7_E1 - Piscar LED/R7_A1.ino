// C++ code
//
int led = 13;
void setup()
{
  pinMode(led, OUTPUT);
}

void loop()
{
  digitalWrite(13, HIGH);
  delay(4000); // Wait for 1000 millisecond(s)
  digitalWrite(13, LOW);
  delay(5000); // Wait for 1000 millisecond(s)

  digitalWrite(12, HIGH);
  delay(2000); // Wait for 1000 millisecond(s)
  digitalWrite(12, LOW);
  delay(7000); // Wait for 1000 millisecond(s)

  digitalWrite(11, HIGH);
  delay(3000); // Wait for 1000 millisecond(s)
  digitalWrite(11, LOW);
  delay(6000); // Wait for 1000 millisecond(s)
}
