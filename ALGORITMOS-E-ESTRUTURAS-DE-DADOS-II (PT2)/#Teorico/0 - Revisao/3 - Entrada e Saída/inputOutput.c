#include <stdio.h>

int main(){
    int x;
    scanf(x); //Entrada
    
    printf("Hello World!\n"); //Saída

    //Exemplo
    char nome[20];
    int idade;
    float altura;

    printf("Digite seu primeiro nome: ");
    scanf("%s", nome); //Não utiliza o & pois é uma cadeia de caractere

    printf("Digite sua idade: ");
    scanf("%d", &idade);

    printf("Digite sua altura: ");
    scanf("%f", &altura);

    printf("%s tem %d anos de idade e mede %.2fm.", nome, idade, altura);
    return 0;
}