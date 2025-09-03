// C++ code
//
int ledVerde = 13;
int ledAmarelo = 12;
int ledVermelho = 11;

void setup()
{
  pinMode(ledVerde, OUTPUT);
  pinMode(ledAmarelo, OUTPUT);
  pinMode(ledVermelho, OUTPUT);
}

void loop()
{
  digitalWrite(13, HIGH);
  delay(4000); // Verde Ligado
  digitalWrite(13, LOW);
  delay(5000); // Verde Desligado
  
  digitalWrite(12, HIGH);
  delay(2000); // Amarelo Ligado
  digitalWrite(12, LOW);
  delay(7000); // Amarelo Desligado
  
  digitalWrite(11, HIGH);
  delay(3000); // Vermelho Ligado
  digitalWrite(11, LOW);
  delay(6000); // Vermelho Desligado
}
