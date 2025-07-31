
int VER=13, AML=12, VED=11, estagio=1, ledAzul = 10;
unsigned long tempo, tInicial, tAtual;

int estadoLedAzul = HIGH;
unsigned long MillisAnteriorAzul = 0;
unsigned long MillisAzul = 0;

void setup() {
    Serial.begin(9600);  //COMUNICAÇÃO NA SERIAL
    tInicial=millis();   //CAPTURA O PRIMEIRO VALOR DO MILLIS

    //LAÇO DE REPETIÇÃO PARA CONFIGURAR TODAS AS PORTAS COMO OUTPUT
    for(int i=1; i< 14; i++){
        //REPETIR POR 13X
        pinMode(i, OUTPUT);     
    }

    // ESTAGIO INICIAL - SEMAFORO (VERMELHO)
    // Semáforo 
    digitalWrite(VER, HIGH);
    digitalWrite(AML, LOW);
    digitalWrite(VED, LOW);
    digitalWrite(ledAzul, HIGH);    
}

void loop() {
  //CAPTURA O SEGUNDO VALOR DO MILLIS (SEMPRE ATUALIZANDO)
  tAtual=millis();

  //DIFERANÇA DO TEMPO INICIAL COM O TEMPO QUE ESTA ATUALIZANDO
  tempo = tAtual - tInicial;  
  
  //CONDICIONAL PARA TEMPO EM 8 SEGUNDOS
  if((tempo > 8000) && (estagio == 1)){
    // ESTÁGIO 01 - SEMAFORO (VERDE)
    
    // Semáforo 
    digitalWrite(VER, LOW);
    digitalWrite(AML, LOW);
    digitalWrite(VED, HIGH);
    Serial.println("Sinal Verde");
    estagio=2;
  }

  //CONDICIONAL QUE IRÁ ENTRAR SE O TEMPO FOR 4 SEGUNDOS
  if((tempo > 4000) && (estagio == 2)){
    // ESTÁGIO 02 SEMAFORO (AMARELO)
    
    // Semáforo 
    digitalWrite(VER, LOW);
    digitalWrite(AML, HIGH);
    digitalWrite(VED, LOW);
    Serial.println("Sinal Amarelo");
    estagio=3;
  }

  //CONDICIONAL QUE IRÁ ENTRAR SE O TEMPO FOR 6 SEGUNDOS
  if((tempo > 6000) && (estagio == 3)){
    // ESTAGIO 03 - SEMAFORO (VERDE)
    
    // Semáforo 
    digitalWrite(VER, HIGH);
    digitalWrite(AML, LOW);
    digitalWrite(VED, LOW);
    Serial.println("Sinal vermelho");
    tInicial=millis();
    estagio=1;
  }
  
  MillisAzul = millis(); 
  if (MillisAzul - MillisAnteriorAzul > 1000){
    MillisAnteriorAzul = MillisAzul;
    if (estadoLedAzul == LOW){
      estadoLedAzul = HIGH;
      digitalWrite(ledAzul, HIGH);
    }

    else{
      estadoLedAzul = LOW;
      digitalWrite(ledAzul, LOW);
    }
  }
  
}
