#include <stdio.h>
#include <ctype.h>
#include <string.h>

int contarMaiusculas(const char *informacao) {
    int contador = 0;
    int i = 0;
    
    // Itera sobre cada caractere da string
    while (informacao[i] != '\0') {
        // Verifica se o caractere atual é maiúsculo e conta-o
        if (isupper(informacao[i])) { contador++; }
        i++;
    }
    
    return contador;
}

int main() {
    char linha[1000]; // Buffer para armazenar cada linha de entrada

    // Leitura da entrada padrão
    while (fgets(linha, sizeof(linha), stdin)) {
        // Remove a nova linha do final da string, se existir
        linha[strcspn(linha, "\n")] = '\0';

        // Verifica se a linha é "FIM"
        if (!strcmp(linha, "FIM") == 0) {
            // Contar maiúsculas e imprimir o resultado
            int numeroMaiusculas = contarMaiusculas(linha);
            printf("%d\n", numeroMaiusculas);
        }
    }

    return 0;
}
