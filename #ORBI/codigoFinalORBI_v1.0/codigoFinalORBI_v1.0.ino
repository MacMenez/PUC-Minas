#include <WiFi.h>
#include <PubSubClient.h>
#include <Wire.h>
#include <Adafruit_Sensor.h>
#include <Adafruit_BMP280.h>
#include <SPI.h>
#include <SD.h>

// Cartão microSD
const int CS_PIN = 5;
File arquivoDados;

// Sensor MPU6050
#include <Wire.h>
#include <Adafruit_Sensor.h>
#include <Adafruit_MPU6050.h>
Adafruit_MPU6050 mpu;

// Sensor BMP280
Adafruit_BMP280 bmp;

// WiFi e MQTT
WiFiClient wifiClient;
PubSubClient client(wifiClient);

//atualize SSID e senha WiFi
const char* ssid = "SEU_SSID";
const char* password = "SUA_SENHA";

//atualize os valores de Org, device type, device id e token
#define ORG "lcj8oh"
#define DEVICE_TYPE "esp32"
#define DEVICE_ID "meuESP32"
#define TOKEN "123456789"

//broker messagesight server
char server[] = ORG ".messaging.internetofthings.ibmcloud.com";
char topic[] = "iot-2/evt/status/fmt/json";
char authMethod[] = "use-token-auth";
char token[] = TOKEN;
char clientId[] = "d:" ORG ":" DEVICE_TYPE ":" DEVICE_ID;

void WriteDataToSDCard(String data) {
  arquivoDados = SD.open("/data.txt", FILE_WRITE);
  if (arquivoDados) {
    arquivoDados.println(data);
    arquivoDados.close();
  }
}

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
  if (!bmp.begin()) {
    Serial.println("Sensor BMP280 não encontrado. Reinicialize o ESP32 ou verifique o sensor.");
    while (1);
  }

  // Inicializar sensor MPU6050
  if (!mpu.begin()) {
    Serial.println("Sensor MPU6050 não encontrado. Reinicialize o ESP32 ou verifique o sensor.");
    while (1);
  }

  // Iniciar conexão Wi-Fi
  Serial.print("Conectando à rede WiFi ");
  Serial.print(ssid);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  Serial.println("");
  Serial.print("[INFO] Conectado! Endereço IP: ");
  Serial.println(WiFi.localIP());
}

void loop() {
  // Obter leituras dos sensores MPU6050 e BMP280
  sensors_event_t a, g, temp;
  mpu.getEvent(&a, &g, &temp);

  float temperature = bmp.readTemperature();
  float pressure = bmp.readPressure();
  float altitude = bmp.readAltitude();

  // Criar JSON
  StaticJsonDocument<200> jsonBuffer; // O tamanho do buffer deve ser suficiente para conter o JSON gerado

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
  jsonBuffer["pressure"] = pressure;
  jsonBuffer["altitude"] = altitude;

  String jsonString;
  serializeJson(jsonBuffer, jsonString);

  Serial.println(jsonString);

  // Gravar no cartão microSD
  WriteDataToSDCard(jsonString);

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

  delay(1000); // Intervalo entre leituras
}
