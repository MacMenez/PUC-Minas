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

  //Classificando a Taxa de Luz -> 1023 / 5 = 204,60
  
  //Muito Escuro => 0 - 204,60
  if(valorSensor <= 204.60){
    //Luminancia do LED
    analogWrite(led,0);
    delay(200);
    
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor);
    Serial.println("Muito Escuro");
    delay(100);
  }
  
  //Escuro => 204.60 - 409,20
  if((valorSensor > 204.60) && (valorSensor <= 409.20)){
    //Luminancia do LED
    analogWrite(led,31);
    delay(200);
    
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor);
    Serial.println("Escuro");
    delay(100);
  }
  
  //Meio Claro -> 409,20 - 613,80
  if((valorSensor > 409.20) && (valorSensor <= 613,80)){
    //Luminancia do LED
    analogWrite(led,63);
    delay(200);
  
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor);
    Serial.println("Meio Claro");
    delay(100);
  }
  //Claro - P12(Amarelo) -> 613,80 - 818,40
  if((valorSensor > 613.80) && (valorSensor <= 818.40)){
    //Luminancia do LED
    analogWrite(led,127);
    delay(200);
    
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor); 
    Serial.println("Claro");
    delay(100);
  }
  //Muito Claro - P13(Vermelho) -> 818,40 - 1023
  if((valorSensor > 818.40) && (valorSensor <= 1023)){
    //Luminancia do LED
    analogWrite(led,255);
    delay(200);
  
    //Exibindo o valor do sensor no serial monitor.
    Serial.println(valorSensor);
    Serial.println("Muito Claro");
    delay(100);
  }
}
