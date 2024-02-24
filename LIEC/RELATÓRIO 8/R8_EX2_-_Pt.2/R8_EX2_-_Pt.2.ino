 int chave = 7; // pino para a chave
 int val = 0;   // variavel para ler o valor do pino de entrada
 int led = 
 void setup() {
   // declara a chave como entrada
   pinMode(chave , INPUT);
}
 void loop(){
  // leia valor de entrada
  val = digitalRead(chave);

  // verif.  se entrada é HIGH (botão não press.)
  if (val == HIGH) {
    digitalWrite(led, 1);
  } 
  
  else {
    Serial.println(“Botão Não Presssionado.”);
  } 
}
