/*
* Combinador em C - Implemente um programa denominado Combinador, que recebe duas
* strings e deve combiná-las, alternando as letras de cada string, começando com a primeira letra
* da primeira string, seguido pela primeira letra da segunda string, em seguida pela segunda letra
* da primeira string, e assim sucessivamente. As letras restantes da cadeia mais longa devem ser
* adicionadas ao fim da string resultante e retornada.
*/

#include <stdio.h>
#include <string.h>

void combinar(char palavra[], char palavra2[]){
    int tamanho = strlen(palavra), tamanho2 = strlen(palavra2);
    char palavraNova[tamanho + tamanho2 + 1];
    int i, j, k;
   // Concatenar letras das palavras 
    for(i = 0, j = 0, k = 0;( (i < tamanho) &&  (i < tamanho2)); i++, j++){
        palavraNova[k++] = palavra[i];
        palavraNova[k++] = palavra2[j];
    }

    // Caso as palavras tenham tamnhos diferentes, estes 2 laços complementarão a concatenação
    while(i < tamanho){ palavraNova[k++] = palavra[i++]; }
    while(j < tamanho2){ palavraNova[k++] = palavra[j++];}
    palavraNova[k] = '\0';
    printf("%s\n", palavraNova);
}

int main(){
    char palavra[100], palavra2[100];
    while(scanf("%s %s", palavra, palavra2) != EOF){ //ou != EOF
        combinar(palavra, palavra2);
    }
    return 0;
}
