#include <stdio.h>

int main(int argc, char const *argv[]){
    float base, altura, area;
    
    printf("Digite a base do retângulo: ");
    scanf("%f", &base);

    while (base > 0){
        printf("Digite a altura do retângulo: ");
        scanf("%f", &altura);

        area = base * altura;

        printf("A área do retângulo = %.1f. \n", area);
        
        printf("Digite a base do retângulo: ");
        scanf("%f", &base);
    }
    
    return 0;
}
