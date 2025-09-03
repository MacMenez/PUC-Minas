int botao1 = A2; //Define Primeiro Botão
int botao2 = A3; //Define Segundo Botão

int led1 = 13; //Pino do LED Vermelho
int led2 = 12; //Pino do LED Amarelo
int led3 = 11; //Pino do LED Verde
int led4 = 10; //Pino do LED Azul

//Variavel que irá Mudar
int pos_bot1 = 0;
int pos_bot2 = 0;

void setup() {
  // put your setup code here, to run once:
  //Define as entradas e saídas
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(led3, OUTPUT);
  pinMode(led4, OUTPUT);

  pinMode(botao1, INPUT);
  pinMode(botao2, INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  //Leia o Estado Valor do Botão de Empurrar
  pos_bot1 = digitalRead(botao1);
  pos_bot2 = digitalRead(botao2);

  if(pos_bot1 == HIGH){
    digitalWrite(led1,HIGH);
    }
  else{
    digitalWrite(led1,LOW);
    }

  if(pos_bot2 == HIGH){
    digitalWrite(led1,HIGH);
    }
  else{
    digitalWrite(led1,LOW);
    }
  
}
