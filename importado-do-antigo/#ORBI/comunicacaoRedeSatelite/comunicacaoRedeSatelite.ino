// Pacotes necessários para se estabelecer uma conexão Wi-Fi
# include <WiFi.h>

// pacotes necessários para enviar uma requisição HTTP
# include <HTTPClient.h>

//Intervalo entre cada execução (coleta/envio de dados)
# define DELAY 7000;

String nomeServidor = "​http://httpbin.org/post";

//Controle de tempo por execução
unsigned long ultimaAtualizacao = 0;


//Coleta de Informações e estruturação em JSON
String getWifiList() {

  // Escanear as redes Wi-Fi presentes, retornando como resposta um inteiro correspondente ao número de redes encontradas
  int n = WiFi.scanNetworks(); // Coletar informações das redes Wi-Fi existentes na região

  // Informações que serão enviadas na requisição em formato JSON
  String resultado = "{";
  for (int i = 0; i < n; i++) {
    if (i == n - 1) {
      resultado = resultado + "\"wifi" + i + "\":\"" + WiFi.SSID (i) + "\""; //Formatação de "texto" do resultado encontrado
    }
    else {
      resultado = resultado + "\"wifi" + i + "\":\"" + WiFi.SSID (i) + "\",";
    }
  }

  resultado = resultado + "}";
  return resultado;
}

// Incrementar o JSON a partir de uma String formatada
String getInformations() {
  String resultado = "{\"signals\":{\"wi-fi\":" + getWifiList() + "}}";
  return resultado; //retorno já se apresenta em formato JSON
}


void setup() {
  // put your setup code here, to run once:

  // Configurações de conexão Wi-Fi e a Inicialização da porta serial de comunicação entre a placa e o computador
  Serial.begin(115200); // Inicializar Porta Serial para comunicações
  char* ssid = "WifiSsid"; //Configuração do nome da rede que deseja-se conectar
  char* senha = "wifiPassword"; //Configuração da senha de acesso

  WiFi.begin(ssid, senha);
  Serial.print("Conectando!");
  while (WiFi.status() != WL_CONNECTED) {
    Serial.println(".");
    delay(1000);
  }
  Serial.println("Conectado ao Wi-Fi!");
  ssid = "null";
  senha = "null";

  /*
     Aqui será definido a posição dos pinos de cada sensor que será utilizado no projeto.
     Verificar o datasheet do ESP32 - NodeMCU-ESP32 DEVKITV1
     Utilize os pinos de leitura para captação de dados através dos sensores
  */
}


void loop() {
  // put your main code here, to run repeatedly:

  String toSend;
  long unsigned int now = millis();

  // Intervalo entre a última execução (ultimaAtualizacao) e o tempo atual já é maior que o delay desejado entre os envios (DELAY)
  if((now - ultimaAtualizacao) > DELAY){
    if(WiFi.status() == WL_CONNECTED){
      // Inicializar uma requisição nova HTTPClient
      HTTPClient http;
      http.begin(nomeServidor.c_str()) ; // Definir a url do servidor que irá receber a requisição
      http.addHeader("Content-Type", "application/json"); // Configurar o cabeçalho da requisição HTTPCliente

      toSend = getInformations(); // JSON contendo as informações da requisição solicitada

      int httpResponse = http.POST(toSend.c_str()); // Recebe como parâmetro o corpo da requisição, e a realiza, enviando-a para o servidor de destino

      /*
       * o método “POST()” irá retornar o status da resposta do servidor, podendo ser 200 para uma resposta de sucesso, 400 para
       * erros de cliente, 500 para erro de servidor, entre outros. Caso a requisição não chegue ao servidor, o valor de retorno do método será 0.
      */

      if(httpResponse > 0){
        Serial.println("Resposta HTTP: ");
        Serial.println(httpResponse);
        Serial.println(http.getString());
      }else{
        Serial.println("Erro: ");
        Serial.println(httpResponse);
      }
      http.end();
      
    }else{
      Serial.println("WiFi Desconectado!");
    }

    ultimaAtualizacao = millis();
  }

}
