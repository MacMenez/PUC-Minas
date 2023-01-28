//Testando Saída Serial
//Escrever Números

int numero = 0;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600); //Abre a porta serial à 9600 bps
  Serial.println("Gerando uma Série de Números");
  
}

void loop() {
  // put your main code here, to run repeatedly:
  Serial.print("Valor: ");
  Serial.println (numero);
  delay(1000);
  numero = numero + 1;
}
