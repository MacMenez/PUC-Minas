int led = 13; //Definimos a variável LED, definida na saída PINO 13

//Configurações Iniciais
void setup() {
  // put your setup code here, to run once:
  pinMode(led, OUTPUT);//Avisamos que o pino será do tipo SAÍDA,pois teremos que ligar o LED.
}

//Loop Sem Fim
void loop() {
  // put your main code here, to run repeatedly:
  //Ações Que Serão Continuamente Executadas
  digitalWrite(led,HIGH); //Saída digital do LED recebe valor 1.
  delay(1000); //Aguarda 1 SEGUNDO
  digitalWrite(led, LOW);//Saída digital do LED recebe valor 0.
  delay(1000); //Aguarda 1 SEGUNDO
}
