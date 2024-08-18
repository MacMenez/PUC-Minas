#include <stdio.h>

// Método com Linker
// void parImpar(int valor);

void parImpar(int valor){
  if(valor % 2 == 0){ printf("1 \n"); }
  else{  printf("2 \n"); }
}

int main(){
  int valor, valorDigitado;
  scanf("%d", &valor);

  for(int i = 0; i < valor; i++){
    scanf("%d", &valorDigitado);
    parImpar(valorDigitado);
  }

  return 0;
}

// Método do Linker
/*
void parImpar(int valor){
  if(valor % 2 == 0){printf("1 \n");}
  else{printf("2 \n");}
}
*/
