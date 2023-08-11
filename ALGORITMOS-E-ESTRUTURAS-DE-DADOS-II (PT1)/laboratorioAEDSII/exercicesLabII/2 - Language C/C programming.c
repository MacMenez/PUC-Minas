// 1 - Faça um progrmama em C que escreva seu nome na tela   
// 2 - Faça uma função que receba N e retorne o valor do fatorial
//3 - Faça uma função que receba doi pontos (x0, y0) e (x, y) e retorne a distância Euclidiana
    //Formula: Raiz = ((x0 - x1) + (y0 - y1))
//4 - Faça uma função que retorne o produto de 2 numeros usando recursividade. Fazer pela soma.
    //Ex: 2*4 = 2 + 2 + 2 + 2

#include <stdio.h>
#include <math.h>

int calculoFatorial(int digitoFatorial){
  int contador;
  int fat = 1;
  
  for(contador = 1; contador <= digitoFatorial; contador++){
    fat = fat*contador;
    printf("%d ", fat);
  }
  printf("\n %d", fat);
}

double diastanciaEuclidiana(int x0, int x1, int y0, int y1){
  int potencia;
  double raizQuadrada;
  potencia = (pow((x0-x1), 2) + pow((y0-y1), 2));
  raizQuadrada = sqrt(potencia);
  printf("%f.2 \n", raizQuadrada);
}

int main() {
    printf("Hello, world! \n");
    printf("My namne is David");

    int digitoFatorial;
    printf("\n Informe o valor para calcular o fatorial: ");
    scanf("%d \n", &digitoFatorial);
    calculoFatorial(digitoFatorial);

    printf("Distância Euclidiana \n");
    int x0 = 1, x1 = 2, y0 = 3, y1 = 4;
    diastanciaEuclidiana(x0, x1, y0, y1);

    int x = 1, y = 4;
    produtoDeDois(x, y);
    
    return 0;
}