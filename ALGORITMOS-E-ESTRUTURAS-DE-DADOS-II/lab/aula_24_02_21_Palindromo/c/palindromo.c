//Trabalhar o charset para utilizar outro conjunto de caracteres que nao seja o ascii
#include <stdio.h>
#include <string.h>

int palindromo(char *palavra){
    int ePalindromo = 1;
    int tamanho = strlen(palavra);

    for (int i = 0, j = tamanho -1; i < j; i++, j--){
        char inicio = palavra[i];
        char fim = palavra[j];
        if (inicio != fim)
        {
            ePalindromo = 0;
            i = tamanho; //break;
        }
        return ePalindromo;
    }
    
}

int fimLeitura(char *palavra){ return strcmp(palavra, "FIM")  == 0; }

//Ler até uma quebra de linha
void lerLinha(char *palavra){ scanf(" %[^\r\n]", palavra); }

int main(){
    char linha[1000]; // Tem 1 díguito extra (0) para terminação de String em C. Logo, vai de 0 - 999.

    lerLinha(linha);

    while(!fimLeitura(linha)){

        if(palindromo(linha)){printf("SIM \n");}
        else{printf("NAO \n");}

        lerLinha(linha);
    }

    return 0;
}