#include <stdio.h>
#include <stdlib.h>

#define FILENAME "arq.txt"

void mostrarq() {
    FILE *arquivo = fopen(FILENAME, "rb");
    if (arquivo == NULL) {
        printf("erro\n");
        return;
    }

    // Move o ponteiro para o final do arquivo
    fseek(arquivo, 0, SEEK_END);
    long n = ftell(arquivo);

    while (n > 0) {
        n -= sizeof(double);
        fseek(arquivo, n, SEEK_SET);
        double valor;
        fread(&valor, sizeof(double), 1, arquivo);

        if ((long) valor == valor) {
            printf("%d\n", (int) valor);
        } else {
            printf("%.3f\n", valor);
        }
    }

    fclose(arquivo);
}

void larq(int total) {
    FILE *arquivo = fopen(FILENAME, "wb");
    if (arquivo == NULL) {
        printf("erro\n");
        return;
    }

    for (int i = 0; i < total; i++) {
        double n;
        scanf("%lf", &n);
        fwrite(&n, sizeof(double), 1, arquivo);
    }

    fclose(arquivo);
}

int main() {
    int numR;
    scanf("%d", &numR);

    larq(numR);
    mostrarq();

    return 0;
}
