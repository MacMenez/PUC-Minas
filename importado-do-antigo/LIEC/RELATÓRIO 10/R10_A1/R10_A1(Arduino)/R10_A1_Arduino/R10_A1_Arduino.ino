//Configurando Sensor de Luminosidade
int sensor = A1; //Pino analógico em que o sensor está conectado.
int valorSensor = 0; //Usado para ler o alor do sensor em tempo real

//Configurando LEDs
int ledAz = 10; //Led Azul
int ledVd = 11; //Led Verde
int ledAm = 12; //Led Amarelo
int ledVr = 13; //Led Vermelho

//Configurando o Buzzer
int buzzer = 4;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(ledAz,OUTPUT);
  pinMode(ledVd,OUTPUT);
  pinMode(ledAm,OUTPUT);
  pinMode(ledVr,OUTPUT);
  pinMode(buzzer, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:

  //Taxa do sensor varia entre 0 e 1023. 0 = 0V  |  1023 = 5V
  
  //Lendo a Intensidade da Luz
  int valorSensor = analogRead(sensor);

  //Classificando a Taxa de Luz -> 1023 / 4 = 225,75

  //Muito Escuro - P10(Azul) => 0 - 255,75
  if((valorSensor <= 255.75){
    digitalWrite(ledAz,1);
    digitalWrite(ledVd,0);
    digitalWrite(ledAm,0);
    digitalWrite(ledVr,0);
    
    //Buzzer deligado
    noTone(buzzer);
    
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor);
    Serial.println("Muito Escuro");
    delay(100);
  }
  //Escuro - P11(Verde) -> 255,76 - 511,5
  if((valorSensor > 255.75) && (valorSensor <= 511.5)){
    digitalWrite(ledAz,0);
    digitalWrite(ledVd,1);
    digitalWrite(ledAm,0);
    digitalWrite(ledVr,0);

    //Buzzer deligado
    noTone(buzzer);
    
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor);
    Serial.println("Escuro");
    delay(100);
  }
  //Claro - P12(Amarelo) -> 511,51 - 767,25
  if((valorSensor > 511.50) && (valorSensor <= 767.25)){
    digitalWrite(ledAz,0);
    digitalWrite(ledVd,0);
    digitalWrite(ledAm,1);
    digitalWrite(ledVr,0);

    //Buzzer deligado
    noTone(buzzer);
    
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor); 
    Serial.println("Claro");
    delay(100);
  }
  //Muito Claro(Buzzer Apita) - P13(Vermelho) -> 767,25 - 1023
  if((valorSensor > 767.25) && (valorSensor <= 1023)){
    digitalWrite(ledAz,0);
    digitalWrite(ledVd,0);
    digitalWrite(ledAm,0);
    digitalWrite(ledVr,1);

    //Buzzer Ligado - Frequência de 1500 Hz
    tone(buzzer, 1500);
    
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor);
    Serial.println("Muito Claro");
    delay(100);
  }

  //Exibindo o valor do sensor no serial monitor.
  Serial.println(valorSensor);
  delay(100);
}
