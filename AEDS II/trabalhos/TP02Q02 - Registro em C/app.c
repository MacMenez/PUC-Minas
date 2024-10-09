/**
 * Lista estatica
 * @author Davi Carneiro Menez
 * @version 2 09/2024
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

#define MAXTAM 10 // Tamanho da lista

typedef struct Lista{
    char* array[MAXTAM]; // vetor de Strings
    int n;
}Lista;

/**
 * Inicializacoes
 */
void start(Lista* l){
   l->n = 0;
}


/**
 * Insere um elemento na primeira posicao da lista e move os demais
 * elementos para o fim da 
 * @param x int elemento a ser inserido.
 */
void inserirInicio(Lista* l, char* x) {
   int i;

   //validar insercao
    if(l->n >= MAXTAM){
        printf("Erro ao inserir!");
        exit(1);
    } 

   //levar elementos para o fim do array
    for(i = l->n; i > 0; i--){
        l->array[i] = l->array[i-1];
    }

   l->array[0] = x;
   //strcpy(l->array[0], x);
   l->n++;
}


/**
 * Insere um elemento na ultima posicao da 
 * @param x int elemento a ser inserido.
 */
void inserirFim(char* x, Lista* l) {

   //validar insercao
   if(l->n >= MAXTAM){
      printf("Erro ao inserir!");
      exit(1);
   }

   l->array[l->n] = x;
   l->n++;
}


/**
 * Insere um elemento em uma posicao especifica e move os demais
 * elementos para o fim da 
 * @param x int elemento a ser inserido.
 * @param pos Posicao de insercao.
 */
void inserir(char* x, int pos, Lista* l) {
   int i;

   //validar insercao
   if(l->n >= MAXTAM || pos < 0 || pos > l->n){
      printf("Erro ao inserir!");
      exit(1);
   }

   //levar elementos para o fim do array
   for(i = l->n; i > pos; i--){
      l->array[i] = l->array[i-1];
   }

   l->array[pos] = x;
   l->n++;
}


/**
 * Remove um elemento da primeira posicao da lista e movimenta 
 * os demais elementos para o inicio da mesma.
 * @return resp int elemento a ser removido.
 */
char* removerInicio(Lista* l) {
   int i, resp;

   //validar remocao
   if (l->n == 0) {
      printf("Erro ao remover!");
      exit(1);
   }

   resp = l->array[0];
   l->n--;

   for(i = 0; i < l->n; i++){
      l->array[i] = l->array[i+1];
   }

   return resp;
}


/**
 * Remove um elemento da ultima posicao da 
 * @return resp int elemento a ser removido.
 */
char* removerFim(Lista* l) {

   //validar remocao
   if (l->n == 0) {
      printf("Erro ao remover!");
      exit(1);
   }

   return l->array[--(l->n)];
}


/**
 * Remove um elemento de uma posicao especifica da lista e 
 * movimenta os demais elementos para o inicio da mesma.
 * @param pos Posicao de remocao.
 * @return resp int elemento a ser removido.
 */
char* remover(int pos, Lista* l) {
   int i, resp;

   //validar remocao
   if (l->n == 0 || pos < 0 || pos >= n) {
      printf("Erro ao remover!");
      exit(1);
   }

   resp = l->array[pos];
   l->n--;

   for(i = pos; i < l->n; i++){
      l->array[i] = l->array[i+1];
   }

   return resp;
}


/**
 * Mostra os array separados por espacos.
 */
void mostrar (Lista* l){
   int i;

   printf("[ ");

   for(i = 0; i < l->n; i++){
      printf("%d ", l->array[i]);
   }

   printf("]\n");
}


/**
 * Procura um array e retorna se ele existe.
 * @param x int elemento a ser pesquisado.
 * @return <code>true</code> se o array existir,
 * <code>false</code> em caso contrario.
 */
bool pesquisar(int x, Lista* l) {
   bool retorno = false;
   int i;

   for (i = 0; i < l->n && retorno == false; i++) {
      retorno = (l->array[i] == x);
   }
   return retorno;
}

typedef struct Date{
    char dia[3];
    char mes[3];
    char ano[5];
}Date;

typedef struct Pokemon{
    int id;
    int generation;
    char name[100]; // Variável String
    char description[100]; // Variável String
    Lista types;
    Lista abilities;
    double weight;
    double height;
    int captureRate;
    bool isLegendary;
    Date captureDate;
}Pokemon;


// Pokemon* pokemons[802];

void ler_texto_texto(){

    char texto[1001];

    // ABRIR O ARQUIVO
    FILE *arq = fopen("pokemon.csv", "r");

    if(arq == NULL){
        printf("Erro ao tentar abrir o arquivo!\n");
        return;
    }

    fscanf(arq, " %1001[^ \r\n]", texto); // ler cabeeçalho

    // ler linhas do arquivo CSV
    int n = 0;
    while (fscanf(arq, " %1001[^ \r\n]", texto))
    {
        // pokemons[n] = malloc(sizeof(Pokemon));
        // lerDados(p, linha);
        // n++;

    }
    
        
    // FECHA O ARQUIVO
    fclose(arq);
}
//=============================================================================

int main(){
    
    ler_texto_texto();

    // Ler aquivo PUB.in
    // Exibir dados exigidos no enunciado
    return 1;
}