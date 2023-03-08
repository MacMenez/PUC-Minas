# include <stdio.h>

int main(int argc, char const *argv[])
{
    int x; //Valor que será utilizado como referência
    int deslocamento; //Valor de Bitwise - casas decimais que serão trabalhadas
    int shift; //Função SHIFT - SLL ou SLR

    printf("Digite o valor a ser analisado: ");
    scanf("%d", &x);

    printf("Dê um valor do deslocamento: ");
    scanf("%d", &deslocamento);

    if (shift > 0){
        //SSL - Shift Logical Left
    }
    if (shift == 0){
        printf(" Valor é 0!");
    }
    else{
        //SSR - Shift Logical Right
        shift =  x >> deslocamento;
        printf("O valor %d com o SHIFT RIGHT de %d corresponde a: %d", &x, &deslocamento, shift);
    }
    return 0;
}
