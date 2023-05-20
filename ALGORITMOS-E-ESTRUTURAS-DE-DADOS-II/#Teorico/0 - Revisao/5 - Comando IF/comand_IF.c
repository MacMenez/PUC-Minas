#include <stdio.h>

int main(int argc, char const *argv[]){
    int num;

    printf("Digite um número: ");
    scanf("%d", &num);

    if (num < 0){
        printf("Número %d é negativo!", num);
    }
    else{
        //Considerar 0 como nulo
        if (num == 0){
            printf("O número %d é Nulo!", num);
        }
        else{
            printf("O número %d é positivo!", num);
        }
    }
        
    return 0;
}
