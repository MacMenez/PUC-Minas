#include <WiFi.h>
#include <Wire.h>
#include <Adafruit_Sensor.h>
#include <Adafruit_BMP085.h>
#include <Adafruit_MPU6050.h>
#include <SPI.h>
#include <SD.h>
#include <ArduinoJson.h>
#include <HTTPClient.h>
#include <IOXhop_FirebaseESP32.h>

const char* ssid = "moto g(6) play 1143";
const char* password = "123456789";

#define FIREBASE_HOST "https://orbi-sat-default-rtdb.firebaseio.com/"
#define FIREBASE_AUTH "8AeASQJzvOSwe9VQCAO13B4J6ScDXtKlkrfWpwSu"


const int BMP085_ADDRESS_barometro = 0x76;
const int MPU6050_ADDRESS = 0x68;
const int CS_PIN = 5;

Adafruit_BMP085 bmp;
Adafruit_MPU6050 mpu;

WiFiClientSecure wifiClient;

File dataFile;

void setup() {
  Serial.begin(115200);
  Serial.println();
  Serial.println("Iniciando...");

  if (!SD.begin(CS_PIN)) {
    Serial.println("Falha na inicialização do cartão microSD!");
    return;
  }

  if (!bmp.begin(BMP085_ADDRESS_barometro)) {
    Serial.println("Sensor BMP180 (BMP085) não encontrado. Reinicialize o ESP32 ou verifique o sensor.");
    while (1);
  }

  Wire.begin();
  Wire.beginTransmission(MPU6050_ADDRESS);
  Wire.write(0x6B);
  Wire.write(0);
  Wire.endTransmission(true);
  mpu.begin(MPU6050_ADDRESS);

  Serial.print("Conectando à rede WiFi ");
  Serial.println(ssid);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(2000);
    Serial.print(".");
  }
  Serial.println("");
  Serial.print("[INFO] Conectado! Endereço IP: ");
  Serial.println(WiFi.localIP());

  Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);
}

void gravarCartaoSD(String data) {
  dataFile = SD.open("/sateliteORBI_dados_leitura.txt", FILE_APPEND);
  if (dataFile) {
    dataFile.println(data);
    dataFile.close();
  }
}

void loop() {
  sensors_event_t a, g, temp;
  mpu.getEvent(&a, &g, &temp);

  float temperature = bmp.readTemperature();
  float pressure = bmp.readPressure();
  float altitude = bmp.readAltitude();

  StaticJsonBuffer<200> jsonBuffer;

  JsonObject& root = jsonBuffer.createObject();
  JsonObject& aceleracao = root.createNestedObject("Aceleração");
  aceleracao["x"] = a.acceleration.x;
  aceleracao["y"] = a.acceleration.y;
  aceleracao["z"] = a.acceleration.z;

  JsonObject& giroscopio = root.createNestedObject("Giroscópio");
  giroscopio["x"] = g.gyro.x;
  giroscopio["y"] = g.gyro.y;
  giroscopio["z"] = g.gyro.z;

  root["Temperatura Medida no Sensor MPU6050"] = temp.temperature;
  root["Temperatura Medida no Sensor BMP180"] = temperature;
  root["Pressão"] = pressure;
  root["Altitude"] = altitude;

  // Aloca a memória para armazenar o JSON em uma string
  // Defina o tamanho da string de acordo com o tamanho do JSON desejado
  // Neste caso, definimos 200, mas ajuste conforme a necessidade
  char jsonString[200];
  root.printTo(jsonString, sizeof(jsonString));

  Serial.println(jsonString);

  gravarCartaoSD(jsonString);
  
  Firebase.pushString("/registro", jsonString);

  delay(240000); // Aguarda 4 minutos (4 minutos = 240000 milissegundos) para enviar os dados novamente
}