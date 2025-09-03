/*
LINK DE REFERENCIA:

https://www.electronicwings.com/esp32/microsd-card-interfacing-with-esp32
*/

/*
 https://www.electronicwings.com/
  SD Card Interface code for ESP32
  SPI Pins of ESP32 SD card as follows:
  SS    = 5;
  MOSI  = 23;
  MISO  = 19;
  SCK   = 18; 
*/

#include <SPI.h>
#include <SD.h>

File myFile;
const int CS = 5;

void WriteFile(const char *path, const char *message, bool append = false) {
  // Abre o arquivo com base no modo especificado (escrita ou anexo)
  if (append) {
    myFile = SD.open(path, FILE_APPEND);
  } else {
    myFile = SD.open(path, FILE_WRITE);
  }

  // Se o arquivo foi aberto com sucesso, escreve a informação nele
  if (myFile) {
    Serial.printf("Writing to %s ", path);
    myFile.println(message);
    myFile.close(); // Fecha o arquivo
    Serial.println("completed.");
  } 
  // Se o arquivo não pôde ser aberto, exibe uma mensagem de erro
  else {
    Serial.println("error opening file ");
    Serial.println(path);
  }
}



void ReadFile(const char * path){
  // open the file for reading:
  myFile = SD.open(path);
  if (myFile) {
     Serial.printf("Reading file from %s\n", path);
     // read from the file until there's nothing else in it:
    while (myFile.available()) {
      Serial.write(myFile.read());
    }
    myFile.close(); // close the file:
  } 
  else {
    // if the file didn't open, print an error:
    Serial.println("error opening test.txt");
  }
}

void setup() {
  Serial.begin(9600);    // Set serial baud rate to 9600
  delay(500);
  while (!Serial) { ; }  // wait for serial port to connect. Needed for native USB port only
  Serial.println("Initializing SD card...");
  if (!SD.begin(CS)) {
    Serial.println("initialization failed!");
    return;
  }
  Serial.println("initialization done.");

  // Inicialização e configurações
  String myData = "Dados a serem gravados no arquivo"; // Sua variável String
  const char* filePath = "/test.txt"; // Caminho do arquivo

  // Chama a função WriteFile passando a variável String convertida para const char*
  WriteFile(filePath, myData.c_str(), false);

  WriteFile("/test.txt", "Teste ORBISAT", true);
  ReadFile("/test.txt");
  Serial.println("---------------------------------");
  WriteFile("/test.txt", "Nova informacao", true);
  ReadFile("/test.txt");
}

void loop() {
  // nothing happens after setup
}

