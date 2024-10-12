#include <stdio.h>

int main(int argc, char const *argv[])
{
    int x;
    int totalCompetidores;
    int ordemLargada[totalCompetidores];
    int ordemChegada[totalCompetidores];

    while (scanf("%d", &x) == 1){ // ou != EOF
        printf("consegui ler x = %d", x);
        scanf("%d", &totalCompetidores);
    }
    return 0;
}