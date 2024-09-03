#include <stdio.h>
#include <ctype.h>
#include <string.h>

// Função recursiva que conta o número de caracteres maiúsculos em uma string
int contarMaiusculasRecursivo(const char *informacao, int posicao) {
    // Caso base: se o índice é igual ao comprimento da string, retorne 0
    if (posicao >= strlen(informacao)) { return 0; }

    // Verifique se o caractere atual é maiúsculo e conte-o
    int incremento = isupper(informacao[posicao]) ? 1 : 0;

    // Retorne a soma do incremento e o resultado da chamada recursiva para o próximo índice
    return incremento + contarMaiusculasRecursivo(informacao, posicao + 1);
}

int main(){
    char informacao[100];

    while (fgets(informacao, sizeof(informacao), stdin)) {
        // Remove a nova linha do final da string, se existir
        informacao[strcspn(informacao, "\n")] = '\0';

        // Verifica se a linha é "FIM"
        if (!strcmp(informacao, "FIM") == 0) { printf("%d\n", contarMaiusculasRecursivo(informacao, 0)); }
    }

    return 0;
}
