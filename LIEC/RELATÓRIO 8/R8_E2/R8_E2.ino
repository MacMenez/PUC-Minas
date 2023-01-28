 int chave = 2; // pino para a chave
 int val = 0;   // variavel para ler o valor do pino de entrada
 
 void setup() {
   // declara a chave como entrada
   pinMode(chave , INPUT);
}
 void loop(){
  // leia valor de entrada
  val = digitalRead(chave);

  // verif.  se entrada é HIGH (botão não press.)
  if (val == HIGH) {
    Serial.println(“Botão Pressionado”); 
  } 
  
  else {
    Serial.println(“Botão Não Presssionado”);
  } 
}
