#include <stdio.h>

void parImpar(int valor){
  if(valor%2 == 0){ printf("O número digitado é PAR!"); }
  else{ printf("O número digitado é IMPAR!"); }
}

int main(){
  printf("Ola Mundo \n");
  
  int valor;
  printf("Digite um valor: ");
  scanf("%d", &valor);

  parImpar(valor);

  return 0;
}
