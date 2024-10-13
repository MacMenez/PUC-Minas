#include <stdio.h>

int main() {
    int N; // Número de competidores
    int grid_largada[100]; // Vetor para guardar a ordem do grid de largada
    int grid_chegada[100]; // Vetor para guardar a ordem do grid de chegada
    int ultrapassagens = 0; // Contador de ultrapassagens

    // Leitura da entrada
    scanf("%d", &N);
    for (int i = 0; i < N; i++) {
        scanf("%d", &grid_largada[i]);
    }
    for (int i = 0; i < N; i++) {
        scanf("%d", &grid_chegada[i]);
    }

    // Cálculo das ultrapassagens
    // Complexidade: O(N^2) - A comparação é feita para cada par de competidores
    for (int i = 0; i < N; i++) { 
        for (int j = i + 1; j < N; j++) { // Comparando a posição de cada competidor
            if (grid_chegada[i] > grid_chegada[j] && // Se o competidor na posição i chegou antes do competidor na posição j
                grid_largada[i] < grid_largada[j]) { // e estava atrás dele na largada
                ultrapassagens++; // Incrementa a contagem de ultrapassagens
            }
        }
    }

    // Impressão do resultado
    printf("%d\n", ultrapassagens);

    return 0;
}

/*
gcc main.c -o main | ./main < lab07.in > saida.out
*/