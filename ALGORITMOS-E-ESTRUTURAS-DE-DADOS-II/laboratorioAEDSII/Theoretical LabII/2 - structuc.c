#include <stdio.h>

// #define tam 100 - declaração de constante global
// const int tam = 150; - declaração de constante global local

type def struct{
  float x; //char nome[10]
  float y;
} ponto; //Declara o nome da Structure

float distancia(ponto a, ponto b){//ponto a -> x e ponto b -> y
  float dx, dy;
  dx = (a * x) - (b * x);
  dy = (a * y) - (b * y);

  return sqrt((dx * dx) + (dy * dy));
}
int main() {
  ponto p1, p2;
  float d;

  print("P1 Escreva X e Y: ");
  scanf("%f %f", &p1.x, &p2.y);

  print("P2 Escreva X e Y: ");
  scanf("%f %f", &p2.x, &p2.y);

  d = distancia(p1, p2);

  print("A distância %f /n", d);
  scanf("%s", )
  return 0;
}

/*
  type def struct{
    char nome[10];
  }

  int main{
    scanf("%s", &p1.nome);
    char vetor[10];
    scanf("%s", pvetor);
    
  }
*/
  