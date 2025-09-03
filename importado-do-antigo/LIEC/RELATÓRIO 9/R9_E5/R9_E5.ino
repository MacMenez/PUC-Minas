char entrada = '0';
int led = 13;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600); // Abre a Porta Serial a 9600 bps
  pinMode(led, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  //Verifica Dados a Serem Lidos
  if(Serial.available() > 0){
    //Lê o Dado
    entrada = Serial.read();
    if (entrada == 'a'){
      digitalWrite(led, HIGH);  
    }  

    if(entrada == 'b'){
      digitalWrite(led, LOW)
    }
  }

}
