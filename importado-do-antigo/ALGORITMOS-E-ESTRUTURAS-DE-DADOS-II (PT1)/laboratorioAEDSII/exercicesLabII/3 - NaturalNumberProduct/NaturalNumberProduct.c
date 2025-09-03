/*
    APÓS DIVERSAS TENTATIVAS, NÃO CONSEGUI RESOLVER 2 ERROS, DAS QUESTÕES 2 E 3:
    - A questão 2 os testes individuais deram certo, porém quando unificou no metodos, 
    ao ser concluída a execução, ele apresenta um erro que não consegui resolver.

    - A questão 3, mesmo com as variáveis declaradas, a matriz no metodo não é reconhecida.
    Em testes isolados, a lógica da matriz com numeros aleatórios e a mesma trasposta, deram certo.
    Quando colocado no método, o mesmo apresenta erro e não reconhece.
*/

#include <stdio.h>

//1 - Faça uma função recursiva que retorne o produto entre 2 números naturais
int produtoNumeroNatural(int x, int y){
  int produto;
  if(y == 0){
    return y;
  }
  else{
    return x + produtoNumeroNatural(x, (y - 1));
  }
}

//2 - Faça uma função recursiva que retorne o valor do somatório de um vetor de números naturais.
int somatorioNumeroNatural(int vetorNumeroNatural[], int tamanhoVetor){
  if(tamanhoVetor == 0){
    return 0;
  }
  else{
    return vetorNumeroNatural[tamanhoVetor - 1] + somatorioNumeroNatural(vetorNumeroNatural, tamanhoVetor);
  }
}

//3 - Faça um método que receba uma matriz de inteiros e exiba a matriz transposta para o usuário
int matrizTransposta(int matrizNumeroNatural[linhaMatriz][colunaMatriz]){
    int contadorLinha, contadorColuna;
    int matrizTransposta[linhaMatriz][colunaMatriz];

    printf("Matriz Transposta \n");
    for(contadorLinha = 0; contadorLinha < linhaMatriz; contadorLinha++){
        for(contadorColuna = 0; contadorColuna < colunaMatriz; contadorColuna++){
            printf("%d ", matrizTransposta[linhaMatriz][colunaMatriz] = matrizNumeroNatural[colunaMatriz][contadorLinha]);
        }
        printf("\n");
    }
}
int main() {
  //PARTE 1
    int x = 940, y = 15;

    printf("%d \n \n", produtoNumeroNatural(x, y));

    //PARTE 2
    int contadorLinha;
    int tamanhoVetor = 4;
    int vetorNumeroNatural[tamanhoVetor];

    for(contadorLinha = 0; contadorLinha < tamanhoVetor; contadorLinha++){
      vetorNumeroNatural[contadorLinha] = rand() %100;
      printf("%d ", vetorNumeroNatural[contadorLinha]);
    }

    printf("%d \n", somatorioNumeroNatural(vetorNumeroNatural, tamanhoVetor));

    //PARTE 3

    int contadorColuna;
    int colunaMatriz = 4, linhaMatriz = 4;
    int matrizNumeroNatural[linhaMatriz][colunaMatriz];

    for(contadorLinha = 0; contadorLinha < linhaMatriz; contadorLinha++){
        for(contadorColuna = 0; contadorColuna < colunaMatriz; contadorColuna++){
            printf("%d ", matrizNumeroNatural[contadorLinha][contadorColuna] = rand() %100);
        }
        printf("\n");
    }

    printf("\n");

    matrizTransposta(matrizNumeroNatural[linhaMatriz][colunaMatriz]);


    return 0;
}