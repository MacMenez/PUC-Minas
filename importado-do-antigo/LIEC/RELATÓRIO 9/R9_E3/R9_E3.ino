char letra = '0';

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  if(Serial.available() > 0){
    //lê o dado
    letra = Serial.read();
    Serial.println(letra);
    delay(1000);
    }

}
