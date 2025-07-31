#include <stdio.h>
#include <iostream>
#include "1.1 -  AreaePerimetro-POO.hpp"

using namespace std;

void mostraMensagem(string msg, float vlr){
    cout << msg << "\n";
}

int main(){
    Retangulo r;
    
    float altura, largura, area, perimetro;

    printf("Digite o valor da altura do retângulo: ");
    scanf("%f%*c", &altura);

    printf("Digite o valor da largura do retângulo: ");
    scanf("%f%*c", &largura);

    r.setAltura(altura);
    r.setLargura(largura);

    mostraMensagem("O valor da árear é ", r.calculaArear());
    mostraMensagem("O valor do perimetro é ", r.calculaPerimetro());
    return 0;
}