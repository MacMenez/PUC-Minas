// C++ code
//

// Lê o valor no pino e retorna valores entre 0(0v) e 1023(5v)
//Pode ser usado apenas nos pinos analógicos 14 à 19 e A0 à A5
//analogRead(pino);

/*
int valor;
valor = analogRead(A1);
valor = analogRead(14);
*/

//INTRUÇÕES
//No TinkerCad: 
//- Execute o código abaixo, clique na aba Monitor Serial
//- Após clique no Sensor e vá reduzindo a luminosidade conforme deseja

//No Arduino:
//- Execute o código abaixo, clique na aba Monitor Serial
//- Faça simulações tampando o sendor ligado no Arduino com a mão

int sensor = A1; //Pino analógico em que o sensor está conectado.
int valorSensor = 0; //Usado para ler o alor do sensor em tempo real

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  int valorSensor = analogRead(sensor);

  //Exibindo o valor do sensor no serial monitor.
  Serial.println(valorSensor);
  delay(100);
}
