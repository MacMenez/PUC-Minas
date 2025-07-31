#include <WiFi.h>
#include <HTTPClient.h>

const char* ssid = "Menez";
const char* password = "best#menez";

void setup() {
  Serial.begin(115200);
  WiFi.begin(ssid, password);

  while (WiFi.status() != WL_CONNECTED) {
    delay(1000);
    Serial.println("Connecting to WiFi...");
  }
}

void loop() {
  if (WiFi.status() == WL_CONNECTED) {
    HTTPClient http;

    // Endereço do servidor HTTPBin.org e endpoint /get
    String url = "https://httpbin.org/get";

    http.begin(url);

    int httpCode = http.GET();

    if (httpCode > 0) {
      // Resposta recebida com sucesso
      String payload = http.getString();
      Serial.println("Resposta:");
      Serial.println(payload);
    } else {
      Serial.printf("Falha na solicitação HTTP: %s\n", http.errorToString(httpCode).c_str());
    }

    http.end();
  }

  delay(5000); // Espera 5 segundos antes de fazer a próxima requisição
}
