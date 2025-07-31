char numero = '0';

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:

  //Verifica se existem números a serem lidos
  if(Serial.available() > 0){
    //lê o dado
    numero = Serial.read();

    //numero = Serial.parseInt();
    Serial.println(numero);

    //Serial.println(numero-48);
    delay(1000);
    }

}
