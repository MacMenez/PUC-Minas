/*
  programa 1: Liga todos os LED
*/
//Definição de valores para variáveis
int led10 = 10;
int led11 = 11; 
int led12 = 12; 
int led13 = 13; 

//Rotina Executada 1 vez e que em geralconfigura entradas e saídas
void setup() {
  // put your setup code here, to run once:
  //Configuramos os pinos como saídas DIGITAIS.
  pinMode(led10, OUTPUT);
  pinMode(led11, OUTPUT);
  pinMode(led12, OUTPUT);
  pinMode(led13, OUTPUT);
}

//Loop Sem Fim
void loop() {
  // put your main code here, to run repeatedly:
  //Ações Que Serão Continuamente Executadas
  digitalWrite(led10,HIGH); //Faz a saída do respectivo LED ser alta(1 ou HIGH).
  delay(100); //Aguarda 100 ms
  digitalWrite(led11,HIGH); //Faz a saída do respectivo LED ser alta(1 ou HIGH).
  delay(100); //Aguarda 100 ms
  digitalWrite(led12,HIGH); //Faz a saída do respectivo LED ser alta(1 ou HIGH).
  delay(100); //Aguarda 100 ms
  digitalWrite(led13,HIGH); //Faz a saída do respectivo LED ser alta(1 ou HIGH).
  delay(100); //Aguarda 100 ms
  
  digitalWrite(led10, LOW);//Faz a saída do respectivo LED ser baixa(0 ou LOW).
  delay(100); //Aguarda 100 ms
  digitalWrite(led11, LOW);//Faz a saída do respectivo LED ser baixa(0 ou LOW).
  delay(100); //Aguarda 100 ms
  digitalWrite(led12, LOW);//Faz a saída do respectivo LED ser baixa(0 ou LOW).
  delay(100); //Aguarda 100 ms
  digitalWrite(led13, LOW);//Faz a saída do respectivo LED ser baixa(0 ou LOW).
  delay(100); //Aguarda 100 ms
}
