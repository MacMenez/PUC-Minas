//Configurando Sensor de Luminosidade
int sensor = A1; //Pino analógico em que o sensor está conectado.
int valorSensor = 0; //Usado para ler o alor do sensor em tempo real

//Configurando LED
int led = 11;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:

  //Taxa do sensor varia de 0 e 1023. 0 = 0V  |  1023 = 5V
  //Taxa do Pino PWM varia de 0 a 255 -> 0 = 0V   |   255 = 5v
  
  //Lendo a Intensidade da Luz
  int valorSensor = analogRead(sensor);

  //Classificando a Taxa de Luz -> 679 / 5 = 135,80
  
  //Muito Escuro => 6 - 135,80
  if(valorSensor <= 135.80){
    //Luminancia do LED
    analogWrite(led,0);
    delay(200);
    
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor);
    Serial.println("Muito Escuro");
    delay(100);
  }
  
  //Escuro => 135,80 - 271,6
  if((valorSensor > 135.80) && (valorSensor <= 271.60)){
    //Luminancia do LED
    analogWrite(led,31);
    delay(200);
    
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor);
    Serial.println("Escuro");
    delay(100);
  }
  
  //Meio Claro -> 271.60 - 407,40
  if((valorSensor > 271.60) && (valorSensor <= 407.40)){
    //Luminancia do LED
    analogWrite(led,63);
    delay(200);
  
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor);
    Serial.println("Meio Claro");
    delay(100);
  }
  //Claro - P12(Amarelo) -> 407,40 - 543,20
  if((valorSensor > 407.40) && (valorSensor <= 543.20)){
    //Luminancia do LED
    analogWrite(led,127);
    delay(200);
    
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor); 
    Serial.println("Claro");
    delay(100);
  }
  //Muito Claro - P13(Vermelho) -> 509,25 - 679
  if((valorSensor > 543.20) && (valorSensor <= 679)){
    //Luminancia do LED
    analogWrite(led,255);
    delay(200);
  
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor);
    Serial.println("Muito Claro");
    delay(100);
  }
}
