#include <stdio.h>
#include <string.h>

void palindromo(char palavra[]){
  int ePalindromo = 1;
  int tamanho = strlen(palavra);
  for(int i=0, j = tamanho-1; i<j; i++, j--){
   if(palavra[i] != palavra[j]){
     ePalindromo = 0;
     i = j;
   }
  }
  if(ePalindromo){ printf("SIM\n"); }
  else{ printf("NAO\n"); }
  //printf("%s\n", palavra);
}

int main(){
  char palavra[500]; // 499 tem que ter um \n no final
  scanf(" %[^\n]", palavra);

  while(strcmp(palavra, "FIM")){
    palindromo(palavra);
    scanf(" %[^\n]", palavra);
  }
  return 0;
}
