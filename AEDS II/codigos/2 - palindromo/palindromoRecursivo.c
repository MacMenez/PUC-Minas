#include <stdio.h>
#include <string.h>

int recursaoPalindromo(char palavra[], int inicio, int fim){
    int ePalindromo = 1;
    if (inicio < fim){
        if (palavra[inicio] != palavra[fim]){
            inicio = fim;
            ePalindromo = 0;
        }
        else{ ePalindromo = recursaoPalindromo(palavra, inicio+1, fim-1); }   
    }
    return ePalindromo;
}

void palindromo(char palavra[]){
    int tamanho = strlen(palavra);
    
    if (recursaoPalindromo(palavra, 0, tamanho - 1)){ printf("SIM\n"); }
    else{ printf("NAO\n"); }
}

int main(){
    char palavra[500]; // 499. Tem que ter um \n no final
    scanf(" %[^\n]", palavra);

    while (strcmp(palavra, "FIM") != 0){
        palindromo(palavra);
        scanf(" %[^\n]", palavra);
    }
    return 0;
}