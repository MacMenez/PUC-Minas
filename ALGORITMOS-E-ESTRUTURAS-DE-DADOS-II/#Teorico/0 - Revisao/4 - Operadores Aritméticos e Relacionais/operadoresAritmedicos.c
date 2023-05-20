# include <stdio.h>

int main (void){
    int a = 5, b = 3;
    int soma, subt, mult, quoc, resto, increm, decrem;
    float div; //Divisão exata

    soma = a + b;
    printf("%d + %d = %d \n", a, b, soma);

    subt = a - b;
    printf("%d - %d = %d \n", a, b, subt);

    mult = a * b;
    printf("%d * %d = %d \n", a, b, mult);
    
    //Divisão exata entre a e b, isto inclui as casas decimais, por isso da conversão feita abaixo
    div = (float)a / b; //Variavel a foi convertida para Ponto Flutuante
    printf("%f / %d = %f \n", (float)a, b, div);

    //Mantem o valor inteiro e deixa o resto. Calcula a divisão "inteira"
    quoc = a / b;
    printf("%d / %d = %d \n", a, b, quoc);

    //Resto da divisão inteira
    resto = a % b;
    printf("%d %% %d = %d \n", a, b, resto);

    increm = a;
    printf("Antes do incrimento, o valor da variavel increm = %d. \n", increm);
    increm++;
    printf("Após o incrimento, o valor da variavel increm = %d. \n", increm);

    decrem = b;
    printf("Antes do decremento, o valor da variavel increm = %d. \n", decrem);
    decrem--;
    printf("Após o decremento, o valor da variavel increm = %d. \n", decrem);

    return 0;
}