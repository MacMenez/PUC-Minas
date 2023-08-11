#include <WiFi.h>
#include <PubSubClient.h>
#include <Wire.h>
#include <Adafruit_Sensor.h>
#include <Adafruit_BMP280.h>
#include <Adafruit_MPU6050.h>
#include <SPI.h>
#include <SD.h>
#include <ArduinoJson.h>

const int ACS712_PIN = 36; //Pino de Sinal do sensor ACS712
const int BMP280_ADDRESS_barometro = 0x76; //Porta de Comunicação do Sensor 	BMP280
const int MPU6050_ADDRESS = 0x68; //Porta de Comunicação do Sensor MPU6050
const int CS_PIN = 5; //Pino de Comunicação do Módulo de MicroSD

/*INÍCIO - REGULAGEM SENSOR ACS712*/
const float ACS712_SENSITIVITY = 0.185; // Sensibilidade do sensor ACS712 (mV/A)
const float BMP280_REFERENCE_VOLTAGE = 3.3; // Tensão de referência do ESP32 (V)
const float BATTERY_CAPACITY = 1000; // Capacidade da bateria (mAh)
/*FIM - REGULAGEM SENSOR ACS712*/

Adafruit_BMP280 bmp; //Inicializando Sensor BMP280
Adafruit_MPU6050 mpu; //Inicializando Sensor MPU6050

// WiFi e MQTT
WiFiClient wifiClient;
PubSubClient client(wifiClient);

//Atualize SSID e Senha WiFi conforme a rede que está utilizando
const char* ssid = "SEU_SSID";
const char* password = "SUA_SENHA";

//atualize os valores de Org, device type, device id e token
#define ORG "lcj8oh"
#define DEVICE_TYPE "esp32ORBI"
#define DEVICE_ID "cubesatORBI"
#define TOKEN "1234567890"

//broker messagesight server
char server[] = ORG ".messaging.internetofthings.ibmcloud.com";
char topic[] = "iot-2/evt/status/fmt/json";
char authMethod[] = "use-token-auth";
char token[] = TOKEN;
char clientId[] = "d:" ORG ":" DEVICE_TYPE ":" DEVICE_ID;

File dataFile; //Inicializando arquivo para gravar informações.

void setup() {
  Serial.begin(115200);
  Serial.println();
  Serial.println("Iniciando...");

  // Inicializar cartão microSD
  if (!SD.begin(CS_PIN)) {
    Serial.println("Falha na inicialização do cartão microSD!");
    return;
  }

  // Inicializar sensor BMP280
  if (!bmp.begin(BMP280_ADDRESS_barometro)) {
    Serial.println("Sensor BMP280 não encontrado. Reinicialize o ESP32 ou verifique o sensor.");
    while (1);
  }

  // Inicializar sensor MPU6050
  Wire.begin();
  Wire.beginTransmission(MPU6050_ADDRESS);
  Wire.write(0x6B);
  Wire.write(0);
  Wire.endTransmission(true);
  mpu.begin(MPU6050_ADDRESS);

  // Iniciar conexão Wi-Fi
  Serial.print("Conectando à rede WiFi ");
  Serial.print(ssid);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(2000);
    Serial.print(".");
  }
  Serial.println("");
  Serial.print("[INFO] Conectado! Endereço IP: ");
  Serial.println(WiFi.localIP());
}

void gravarCartaoSD(String data) {
  dataFile = SD.open("/sateliteORBI_dados_leitura.txt", FILE_APPEND);
  if (dataFile) {
    dataFile.println(data);
    dataFile.close();
  }
}

void loop() {
  // Leitura do sensor ACS712
  int sensorValue = analogRead(ACS712_PIN);
  float current = (sensorValue - 2048) * ACS712_SENSITIVITY / 1000.0;

  // Leitura do sensor MPU6050
  sensors_event_t a, g, temp;
  mpu.getEvent(&a, &g, &temp);

  // Leitura do sensor BMP280
  float temperature = bmp.readTemperature();
  float pressure = bmp.readPressure();
  float altitude = bmp.readAltitude();

  // Cálculo da porcentagem da bateria
  float batteryPercentage = (current / (BATTERY_CAPACITY / 1000.0)) * 100;

  // Criar JSON
  StaticJsonDocument<200> jsonBuffer; // O tamanho do buffer deve ser suficiente para conter o JSON gerado

  /*DADOS DO SENSOR ACS712*/
  jsonBuffer["Corrente (A)"] = current;

  /*DADOS DO SENSOR MPU6050*/
  jsonBuffer["Aceleração"]["x"] = a.acceleration.x;
  jsonBuffer["Aceleração"]["y"] = a.acceleration.y;
  jsonBuffer["Aceleração"]["z"] = a.acceleration.z;

  jsonBuffer["Giroscópio"]["x"] = g.gyro.x;
  jsonBuffer["Giroscópio"]["y"] = g.gyro.y;
  jsonBuffer["Giroscópio"]["z"] = g.gyro.z;

  jsonBuffer["Temperatura Medida no Sensor MPU6050"] = temp.temperature;

  /*DADOS DO SENSOR BMP280*/
  jsonBuffer["Temperatura Medida no Sensor BMP280"] = temperature;
  jsonBuffer["Pressão"] = pressure;
  jsonBuffer["Altitude"] = altitude;

  /*BATERIA*/
  jsonBuffer["Nível da Bateria (%)"] = batteryPercentage;

  String jsonString;
  serializeJson(jsonBuffer, jsonString);

  Serial.println(jsonString);

  // Gravar no cartão microSD
  gravarCartaoSD(jsonString);

  // Enviar JSON via HTTP
  if (!client.connected()) {
    Serial.print("Conectando ao servidor MQTT ");
    Serial.print(server);
    while (!client.connect(clientId, authMethod, token)) {
      Serial.print(".");
      delay(500);
    }
    Serial.println();
  }

  if (client.connected()) {
    Serial.print("Enviando JSON via HTTP: ");
    Serial.println(jsonString);

    if (client.publish(topic, (char*)jsonString.c_str())) {
      Serial.println("Publicação concluída com sucesso.");
    } else {
      Serial.println("Falha ao publicar.");
    }
  }

  delay(1000); // Intervalo entre leituras. Após realizar tudo, aguardar 1 segundo para fazer novamente.
}
