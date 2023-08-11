/*Inicio - Configuração sensor MPU6050*/
#include <Adafruit_MPU6050.h> //Importando pacotes de dados do sensor MPU6050
#include <Adafruit_Sensor.h> //Importando pacotes de leitura de sensores
#include <Wire.h> //
/*Fim - Configuração sensor MPU6050*/

/*Inicio - Configuração sensor BMP280*/
#include <ESP8266WiFi.h>
#include <PubSubClient.h>
//#include <Wire.h> /*Biblioteca Duplicada*/
//#include <Adafruit_Sensor.h> /*Biblioteca Duplicada*/
#include <Adafruit_BMP280.h>
/*Fim - Configuração sensor BMP280*/

/*Inicio - Configuração Módulo Cartão SD*/
#include <SPI.h>
#include <SD.h>
/*Fim - Configuração Módulo Cartão SD*/

Adafruit_MPU6050 mpu; //Definindo o nome do sensor MPU6050 como "mpu" para utilização no código

Adafruit_BMP280 bmp; //Definindo o nome do sensor BMP280 como "bmp" para utilização no código

/*Início - Definição de Uso do Módulo de Cartão SD*/

File arquivo_ORBISAT; //Criando um arquivo para ser gravada e lida informações neles
const int CS = 5; //Definição da porta primordial para troca de informações do módulo com o cartão SD

/*Fim - Definição de Uso do Módulo de Cartão SD*/

/*Início - Configuração de Rede e Informações de Comunicação do Sensor BMP280*/
//atualize SSID e senha WiFi
const char* ssid = "HackaTruckVisitantes"; //Nome da Rede que for utilizada
const char* password = ""; //Senha da Rede especificada acima

//D4 only for Lolin board
#define LED_BUILTIN D4

//Atualize os valores de Org, device type, device id e token
#define ORG "lcj8oh"
#define DEVICE_TYPE "bmp280"
#define DEVICE_ID "sensorBMP280"
#define TOKEN "123456789"

//broker messagesight server
char server[] = ORG ".messaging.internetofthings.ibmcloud.com";
char topic[] = "iot-2/evt/status/fmt/json";
char authMethod[] = "use-token-auth";
char token[] = TOKEN;
char clientId[] = "d:" ORG ":" DEVICE_TYPE ":" DEVICE_ID;

float pressao = 0.0;
float altitude = 0.0;
float temperatura = 0.0;

char pressaostr[6];
char altitudestr[6];
char temperaturastr[6];

WiFiClient wifiClient;
PubSubClient client(server, 1883, NULL, wifiClient);
/*Fim - Configuração de Rede e Informações de Comunicação do Sensor BMP280*/


void setup() {
  // put your setup code here, to run once:
  //Serial.begin(9600); /*Definindo a velocidade de leitura de dados no Módulo Cartão SD no ESP32*/

  Serial.begin(115200); //Definindo a velocidade de leitura de dados de sensores no ESP32. Em teste deu certo com o módulo também.
  delay(500);

  /*Início - Verificação e Conexão de Rede*/
  Serial.println();
  Serial.println("Iniciando...");

  Serial.print("Conectando na Rede WiFi ");
  Serial.print(ssid);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  Serial.println("");
  Serial.print("[INFO] Conectado WiFi IP: ");
  Serial.println(WiFi.localIP());

  pinMode(LED_BUILTIN, OUTPUT);
  /*Fim - Verificação e Conexão de Rede*/

  /*Início - Verificação do Módulo Cartão SD*/
  while(!Serial){
    Serial.println("Conectando Módulo Cartão SD...");
    //Configurando tempo para mensagem de erro
    while(1){
      delay(10);
    }
  }

  Serial.println("Inicializando Cartão SD...");
  if (!SD.begin(CS)) {
    Serial.println("Falha na Inicialização!");
    return;
  }
  Serial.println("Inicialização Concluída.");
  /*Fim - Verificação do Módulo Cartão SD*/

  /*Início - Verificação do Sensor BMP280*/
  //--------------------------BMP280------------------------

  if (!bmp.begin()) {
    Serial.println("Sensor BMP 280 não encontrado. Reinicialize o Arduino. SÓ HISTORIA TRISTE!!!!!");
    while (1) {}
  }
  /*Início - Verificação do Sensor BMP280*/

  /*Início - Verificação do Sensor MPU*/

  //Tentando inicializar o sensor
  if(!mpu.begin()){
    Serial.println("Falha ao encontrar o sensor MPU6050!");
    //Configurando tempo para mensagem de erro
    while(1){
      delay(10);
    }
  }
  Serial.println("Sensor MPU6050 Encontrado e Inicializado!");
  /*Fim - Verificação do Sensor MPU*/

  /*Início - Regulagem do Sensor MPU6050*/

  //Configuração de Intervalo do Acelerômetro
  mpu.setAccelerometerRange(MPU6050_RANGE_8_G);
  Serial.println("Intervalo do Acelerômetro Definido para: ");
  switch(mpu.getAccelerometerRange()){
    case MPU6050_RANGE_2_G:
      Serial.println("+-2G");
    break;

    case MPU6050_RANGE_4_G:
      Serial.println("+-4G");
    break;

    case MPU6050_RANGE_8_G:
      Serial.println("+-8G");
    break;

    case MPU6050_RANGE_16_G:
      Serial.println("+-16G");
    break;
  }

  //Configuração de Intervalo do Giroscópio
  mpu.setGyroRange(MPU6050_RANGE_500_DEG);
  Serial.print("Intervalo do Giroscópio Definido Para: ");
  switch (mpu.getGyroRange()) {
    case MPU6050_RANGE_250_DEG:
      Serial.println("+- 250 deg/s");
    break;
    
    case MPU6050_RANGE_500_DEG:
      Serial.println("+- 500 deg/s");
    break;
    
    case MPU6050_RANGE_1000_DEG:
      Serial.println("+- 1000 deg/s");
    break;

    case MPU6050_RANGE_2000_DEG:
      Serial.println("+- 2000 deg/s");
    break;
  }

  //Configuração do Filtro de Largura de Banda
  mpu.setFilterBandwidth(MPU6050_BAND_21_HZ);
  Serial.print("Filter bandwidth set to: ");
  switch (mpu.getFilterBandwidth()) {
    case MPU6050_BAND_260_HZ:
      Serial.println("260 Hz");
    break;

    case MPU6050_BAND_184_HZ:
      Serial.println("184 Hz");
    break;

    case MPU6050_BAND_94_HZ:
      Serial.println("94 Hz");
    break;

    case MPU6050_BAND_44_HZ:
      Serial.println("44 Hz");
    break;

    case MPU6050_BAND_21_HZ:
      Serial.println("21 Hz");
    break;

    case MPU6050_BAND_10_HZ:
      Serial.println("10 Hz");
    break;

    case MPU6050_BAND_5_HZ:
      Serial.println("5 Hz");
    break;
  }

  //Separar Informações de Leitura por Ciclo
  Serial.println("");
  delay(100);
  /*Fim - Regulagem do Sensor MPU6050*/



}

void loop() {
  // put your main code here, to run repeatedly:
  /*
  //Converter Caractere para String na função abaixo
  String resultado = "{\"ORBISAT\":{\"Teste\":" + sensorAcelerometro() + "}}";
  Serial.println(resultado);
  */
  /*Início - Verificação da Conexão de Rede*/
  if (!!!client.connected()) {
    Serial.print("Reconnecting client to ");
    Serial.println(server);
    while (!!!client.connect(clientId, authMethod, token)) {
      Serial.print(".");
      delay(500);
    }
    Serial.println();
  }
  /*Fim - Verificação da Conexão de Rede*/
  sensorAcelerometro(); //Função para apresentar os resultados do sensor Acelerômetro
  delay(1000);

  //Usado apenas para testes
  String caminhoArquivo = "/test.txt";
  String dadoSatelite = "Teste ORBISAT";

  gravarInformacao(caminhoArquivo, dadoSatelite);
  lerArquivo(caminhoArquivo);
}

void sensorBarometro{
  Serial.print("Temperatura = ");
  Serial.print(bmp.readTemperature());
  Serial.println(" °C");

  Serial.print("Pressao = ");
  Serial.print(bmp.readPressure());
  Serial.println(" Pa");

  Serial.print("Altitude = ");
  Serial.print(bmp.readAltitude());
  Serial.println(" m");

  digitalWrite(LED_BUILTIN, LOW);
  delay(1000);
  digitalWrite(LED_BUILTIN, HIGH);
  delay(500);
  getData();

  // Conversao Floats para Strings
  char TempString[32];  //  array de character temporario

  // dtostrf( [Float variable] , [Minimum SizeBeforePoint] , [sizeAfterPoint] , [WhereToStoreIt] )
  dtostrf(temperatura, 2, 1, TempString);
  String temperaturastr = String(TempString);
  dtostrf(pressao, 2, 2, TempString);
  String pressaostr = String(TempString);
  dtostrf(altitude, 2, 2, TempString);
  String altitudestr = String(TempString);

  // Prepara JSON para IOT Platform
  int length = 0;

  String payload = "{\"d\":{\"temperatura\": \"" + String(temperaturastr) + "\",\"pressao\":\"" + String(pressaostr) + "\",\"altitude\":\"" + String(altitudestr) + "\"}}";

  length = payload.length();
  Serial.print(F("\nData length"));
  Serial.println(length);

  Serial.print("Sending payload: ");
  Serial.println(payload);

  if (client.publish(topic, (char*)payload.c_str())) {
    Serial.println("Publish ok");
    digitalWrite(LED_BUILTIN, LOW);
    delay(1000);
    digitalWrite(LED_BUILTIN, HIGH);
    delay(1000);
  } else {
    Serial.println("Publish failed");
  }

  delay(10000);
}

void getData() {

  pressao = (float)bmp.readPressure();
  altitude = (float)bmp.readAltitude();
  temperatura = (float)bmp.readTemperature();

  dtostrf(pressao, 6, 0, pressaostr);
  dtostrf(altitude, 6, 0, altitudestr);
  dtostrf(temperatura, 6, 0, temperaturastr);
}

void gravarInformacao(const char * caminho, const char * informacao){
  /*
    Apenas 1 único arquivo pode ser aberto por vez. Então para se ter vários arquivos, 
    é necessário fechar o arquivo atual e abrir outro para ser escrita novas informações.

    Se abrir o mesmo arquivo, as informações são sobreescritas.
  */

  //Abrir o arquivo
  arquivo_ORBISAT = SD.open(caminho, FILE_WRITE);

  //Verificar se arquivo foi aberto. Se for começa a gravar os dados nele
  if(arquivo_ORBISAT){
    Serial.printf("Escrevendo em %s ", caminho);
    myFile.println(informacao);
    myFile.close(); // Fecha o Arquivo
    Serial.println("Informação Gravada com Sucesso!");
  }
  //Se o arquivo não for aberto, exiba a mensagem de erro abaixo
  else{
    Serial.println("Erro ao Abrir Arquivo!");
    Serial.println("Caminho Utilizado: '%s'\n", caminho);
  }
}

void lerArquivo(const char * caminho){
  //Abrir o arquivo ".txt" para ler as informações e exibir o que está escrito no arquivo
  arquivo_ORBISAT = SD.open(caminho);

  if(arquivo_ORBISAT){
    Serial.println("Lendo arquivo localizado em %s\n", caminho);

    //Ler o arquivo por completo, até que não haja mais informações para serem lidas
    while(arquivo_ORBISAT.available()){
      Serial.write(arquivo_ORBISAT.read());
    }
    arquivo_ORBISAT.close(); //Fechando o arquivo após ler os dados contidos em ".txt"
  }
  else{
    //Se o arquivo não for aberto, exibir mensagem de erro
    Serial.println("Erro ao ler Arquivo!");
    Serial.println("Caminho Utilizado: '%s'\n", caminho);
  }
}

void sensorAcelerometro(){
  /*Obtendo dados do sendo atraves das leituras abaixo*/
  sensors_event_t acelerometro, giroscopio, temperatura;
  mpu.getEvent(&acelerometro, &giroscopio, &temperatura);

  /*Mostrando os Valores de leitura obtida no Monitor Serial do Sensor MPU6050*/
  Serial.println("-----------------------------------");
  Serial.println("Leitura - Sensor MPU6050");
  Serial.println("-----------------------------------");
  Serial.print("Acelerômetro X: ");
  Serial.print(acelerometro.acceleration.x);
  Serial.print(", Y: ");
  Serial.print(acelerometro.acceleration.y);
  Serial.print(", Z: ");
  Serial.print(acelerometro.acceleration.z);
  Serial.println(" m/s^2");

  Serial.print("Rotação - Giroscópio X: ");
  Serial.print(giroscopio.gyro.x);
  Serial.print(", Y: ");
  Serial.print(giroscopio.gyro.y);
  Serial.print(", Z: ");
  Serial.print(giroscopio.gyro.z);
  Serial.println(" rad/s");

  Serial.print("Temperatura: ");
  Serial.print(temperatura.temperature);
  Serial.println(" °C");
  Serial.println("-----------------------------------");

  Serial.println("");
  //delay(1000);
}