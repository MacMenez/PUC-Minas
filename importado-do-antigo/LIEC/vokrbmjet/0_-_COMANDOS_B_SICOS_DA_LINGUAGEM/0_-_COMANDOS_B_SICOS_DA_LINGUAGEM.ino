ind led; //Definimos a variável LED

//Configurações Iniciais
void setup() {
  // put your setup code here, to run once:
  
  //COMANDOS BÁSICOS DA LINGUAGEM
  /*
    - Esta define um pino como entrada ou saída. O arduino possí 20 pinos disponíveis, 
    - 14 digitias(0 a 13) e 6 analógicos(14 a 19).
    - Esse comando deverá estar preferencialmente na função setup().    
  */
  pinMode(pino, modo);
  /*
   - Exemplo:
    pinMode(13, OUTPUT); Elemento de saída, um LED por exemplo.
    pinMode(10, INPUT); Elemento de entrada, um BOTAO por exemplo
  */
}

//Loop Sem Fim
void loop() {
  // put your main code here, to run repeatedly:
  //Ações Que Serão Continuamente Executadas
  
  digitalWrite(pino, valor);
  /*
    Liga ou desliga uma saída digital, apenas caso o pino seja definido como OUTPUT. 
    Os valores podem ser HIGH(valor 1) ou LOW(valor 0).

    - Exemplos:
    digitalWrite(13,HIGH);
    digitalWrite(13, LOW);
  */

  delay(ms); //Aguarda o tempo passado com argumento em milissegundos(ms). Exemplo: delay(1000); -> 1 Segundo.
  
}
