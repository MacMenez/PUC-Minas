// C++ code
int teclado = 12; //Led Amarelo
int mouse = 11; //LED Azul
int tela = 10; //Monitor - LED Laranja
int binario = 4; //A cada digito lido ele irá piscar representando a leitura binária


Serial.print("Sistema de POST");
    
println("Monitor Reconhecido");
digitalWrite(tela, HIGH);
println("Monitor LIGADO");

println("Digite T para inicializar o teclado");
//tecla = digitalRead(tecla);
digitalWrite(teclado, HIGH);
// println("Teclado LIGADO");

// println("Digite M para inicializar o mouse");

digitalWrite(mouse, HIGH);
println("Mouse LIGADO");