#include <WiFi.h>
#include <FirebaseESP32.h>
#include <Wire.h>
#include <Adafruit_Sensor.h>
#include <Adafruit_BMP280.h>
#include <Adafruit_MPU6050.h>
#include <SPI.h>
#include <SD.h>
#include <ArduinoJson.h>

const char* ssid = "PUCMinas";
const char* password = "K(GVR>JNRR";

const char* host = "https://orbi-sat-default-rtdb.firebaseio.com/"; // Substitua pelo nome do seu projeto do Firebase

/* REST API Key */
const char* apiKey = ""; // Substitua pela sua chave da API do Firebase

const int ACS712_PIN = 36;
const int BMP280_ADDRESS_barometro = 0x76;
const int MPU6050_ADDRESS = 0x68;
const int CS_PIN = 5;

const float ACS712_SENSITIVITY = 0.185;
const float BMP280_REFERENCE_VOLTAGE = 3.3;
const float BATTERY_CAPACITY = 1000;

Adafruit_BMP280 bmp;
Adafruit_MPU6050 mpu;

WiFiClientSecure wifiClient;
FirebaseData firebaseData; // Objeto FirebaseData para comunicação com o Firebase

File dataFile;

void setup() {
  Serial.begin(115200);
  Serial.println();
  Serial.println("Iniciando...");

  if (!SD.begin(CS_PIN)) {
    Serial.println("Falha na inicialização do cartão microSD!");
    return;
  }

  if (!bmp.begin(BMP280_ADDRESS_barometro)) {
    Serial.println("Sensor BMP280 não encontrado. Reinicialize o ESP32 ou verifique o sensor.");
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
}

void gravarCartaoSD(String data) {
  dataFile = SD.open("/sateliteORBI_dados_leitura.txt", FILE_APPEND);
  if (dataFile) {
    dataFile.println(data);
    dataFile.close();
  }
}

void loop() {
  int sensorValue = analogRead(ACS712_PIN);
  float current = (sensorValue - 2048) * ACS712_SENSITIVITY / 1000.0;

  sensors_event_t a, g, temp;
  mpu.getEvent(&a, &g, &temp);

  float temperature = bmp.readTemperature();
  float pressure = bmp.readPressure();
  float altitude = bmp.readAltitude();

  float batteryPercentage = (current / (BATTERY_CAPACITY / 1000.0)) * 100;

  StaticJsonDocument<200> jsonBuffer;

  jsonBuffer["Corrente (A)"] = current;

  jsonBuffer["Aceleração"]["x"] = a.acceleration.x;
  jsonBuffer["Aceleração"]["y"] = a.acceleration.y;
  jsonBuffer["Aceleração"]["z"] = a.acceleration.z;

  jsonBuffer["Giroscópio"]["x"] = g.gyro.x;
  jsonBuffer["Giroscópio"]["y"] = g.gyro.y;
  jsonBuffer["Giroscópio"]["z"] = g.gyro.z;

  jsonBuffer["Temperatura Medida no Sensor MPU6050"] = temp.temperature;

  jsonBuffer["Temperatura Medida no Sensor BMP280"] = temperature;
  jsonBuffer["Pressão"] = pressure;
  jsonBuffer["Altitude"] = altitude;

  jsonBuffer["Nível da Bateria (%)"] = batteryPercentage;

  String jsonString;
  serializeJson(jsonBuffer, jsonString);

  Serial.println(jsonString);

  gravarCartaoSD(jsonString);

  sendToFirebase(jsonString); // Envia os dados para o Firebase Realtime Database
}

void sendToFirebase(String data) {
  String path = "/dados_leitura.json";

  if (Firebase.begin(host, apiKey, firebaseData)) { // Alteração para usar o objeto FirebaseData
    Firebase.setAsync(firebaseData, path, data);
    Firebase.pushInt(firebaseData, "/logs", millis());
    Firebase.pushString(firebaseData, "/logs", data);
    Firebase.pushInt(firebaseData, "/logs", millis());
    if (firebaseData.dataPath() == path) {
      Serial.println("Envio para o Firebase Realtime Database concluído.");
    } else {
      Serial.println("Falha ao enviar para o Firebase Realtime Database.");
    }
  } else {
    Serial.println("Falha ao conectar ao Firebase Realtime Database.");
  }
}
