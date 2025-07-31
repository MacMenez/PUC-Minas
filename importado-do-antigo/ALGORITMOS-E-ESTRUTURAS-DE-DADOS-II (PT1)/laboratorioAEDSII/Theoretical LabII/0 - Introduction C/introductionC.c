//http://linguagemc.com.br/a-estrutura-de-repeticao-for-em-c/#:~:text=O%20la%C3%A7o%20for%20%C3%A9%20uma,loop%2C%20bem%20como%20seu%20incremento.
//http://linguagemc.com.br/funcoes-em-c/
//http://linguagemc.com.br/a-biblioteca-math-h/
//https://www.inf.pucrs.br/~pinho/LaproI/Vetores/Vetores.htm

//Bibliotecas da Linguagem
//Estrutura Base
//Condicional
//Laço de Repetição
//Métodos
//Vetor
int vetor[numeroDePosicoes]; //Criando um vetor
int vetor[0] = x; //Vetor na posição 0 recebe um valor específico
//Matriz

//Números Aleatórios
#include <stdio.h>      
#include <stdlib.h>  
void main()  
{     
    // use rand() function to generate the number  
    printf (" The random number is: %d", rand());  
    printf ("\n The random number is: %d", rand());  
      
    printf (" \n The random number is: %d", rand());  
    printf ("\n The random number is: %d", rand());  
}  
//###################################################################################
#include <time.h>
#include <stdlib.h>

srand(time(NULL));   // Initialization, should only be called once.
int r = rand();      // Returns a pseudo-random integer between 0 and RAND_MAX.

/* random int between 0 and 19 */
int r = rand() % 20;

//###################################################################################

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

int main(void)
{
  int i;
  
  printf("Gerando 10 valores aleatorios:\n\n");
  
  for (i = 0; i < 10; i++)
  {
    /* gerando valores aleatórios entre zero e 100 */
    printf("%d ", rand() % 100);
  }
  
  getch();
  return 0;
}