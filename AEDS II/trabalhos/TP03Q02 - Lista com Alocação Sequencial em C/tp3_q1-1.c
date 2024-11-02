#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

#define MAX_TAM_LISTA 1000

//=============== Pokemon ================
typedef struct{
  int id;
  int geracao;
  char nome[50];
  char descricao[200];
  char tipos[2][50];        // Array de strings para armazenar os tipos
  char habilidades[10][50]; // Array de strings para armazenar as habilidades
  double peso;
  double altura;
  int capRate;
  bool lendario;
  char datacaptura[20];
} Pokemon;

// Criar "objeto" pokemon
Pokemon *newPokemon(){
  Pokemon *p = (Pokemon *)malloc(sizeof(Pokemon));
  return p;
}

void delPokemon(Pokemon *p){ free(p); }

void lerPokemon(Pokemon *p, char linha[]){
  char *token = strtok(linha, ",");
  p->id = atoi(token);

  token = strtok(NULL, ",");
  p->geracao = atoi(token);

  token = strtok(NULL, ",");
  strcpy(p->nome, token);

  token = strtok(NULL, ",");
  strcpy(p->descricao, token);

  token = strtok(NULL, ",");
  strcpy(p->tipos[0], token);

  token = strtok(NULL, ",");
  if (token != NULL){ strcpy(p->tipos[1], token); } // Verifica se há um segundo tipo
  else{ p->tipos[1][0] = '\0';  } // Limpa a string se não houver segundo tipo

  token = strtok(NULL, "[\""); // Pula a parte "[\"
  token = strtok(NULL, "\"]"); // Lê as habilidades até "]"
  int i = 0;
  while (token != NULL)
  {
    strcpy(p->habilidades[i], token);
    token = strtok(NULL, ", ");
    i++;
  }

  token = strtok(NULL, ",");
  p->peso = atof(token);

  token = strtok(NULL, ",");
  p->altura = atof(token);

  token = strtok(NULL, ",");
  p->capRate = atoi(token);

  token = strtok(NULL, ",");
  p->lendario = (strcmp(token, "1") == 0);

  token = strtok(NULL, ",");
  strcpy(p->datacaptura, token);
}

void imprimirPokemon(Pokemon *p){
  char tipos[100] = "";
  if (p->tipos[1][0] != '\0'){ sprintf(tipos, "'%s', '%s'", p->tipos[0], p->tipos[1]); }
  else{ sprintf(tipos, "'%s'", p->tipos[0]); }

  printf(
      "[#%d -> %s: %s - [%s] - %s - %.1fkg - %.1fm - %d%% - %s - %d gen] - %s\n",
      p->id, p->nome, p->descricao, tipos, p->habilidades[0], p->peso, p->altura, p->capRate, p->lendario ? "true" : "false",
      p->geracao, p->datacaptura);
}

//=============== Gerenciamento de Pokemons ================
Pokemon *pokemons[801]; // array de ponteiros para Pokemon

void lerPokemonsDeArquivo()
{
  char linha[2000];
  // FILE *arquivo = fopen("/tmp/pokemon.csv", "r"); // Diretório no VERDE
  FILE *arquivo = fopen("pokemon.csv", "r"); // Diretório local
  if (arquivo == NULL)
  {
    perror("Erro ao abrir o arquivo");
    exit(1);
  }

  fgets(linha, 2000, arquivo); // Ignora a primeira linha (cabeçalho)
  int i = 0;
  while (fgets(linha, 2000, arquivo) != NULL)
  {
    Pokemon *p = newPokemon();
    lerPokemon(p, linha);
    pokemons[i] = p;
    i++;
  }

  fclose(arquivo);
}

void delPokemons()
{
  for (int i = 0; i < 801; i++)
  {
    if (pokemons[i] != NULL)
    {
      delPokemon(pokemons[i]);
    }
  }
}

//=============== Lista de Pokemons ================
typedef struct
{
  int n;
  Pokemon *array[MAX_TAM_LISTA];
} Lista;

Lista *newLista()
{
  Lista *lista = (Lista *)malloc(sizeof(Lista));
  lista->n = 0;
  return lista;
}

void inserirInicioLista(Lista *lista, Pokemon *p)
{
  if (lista->n < MAX_TAM_LISTA)
  {
    for (int i = lista->n; i > 0; i--)
    {
      lista->array[i] = lista->array[i - 1];
    }
    lista->array[0] = p;
    lista->n++;
  }
  else
  {
    printf("Erro: Lista cheia.\n");
  }
}

void inserirFimLista(Lista *lista, Pokemon *p)
{
  if (lista->n < MAX_TAM_LISTA)
  {
    lista->array[lista->n] = p;
    lista->n++;
  }
  else
  {
    printf("Erro: Lista cheia.\n");
  }
}

void inserirLista(Lista *lista, Pokemon *p, int posicao)
{
  if (lista->n < MAX_TAM_LISTA && posicao >= 0 && posicao <= lista->n)
  {
    for (int i = lista->n; i > posicao; i--)
    {
      lista->array[i] = lista->array[i - 1];
    }
    lista->array[posicao] = p;
    lista->n++;
  }
  else
  {
    printf("Erro: Lista cheia ou posição inválida.\n");
  }
}

Pokemon *removerInicioLista(Lista *lista)
{
  if (lista->n > 0)
  {
    Pokemon *p = lista->array[0];
    for (int i = 0; i < lista->n - 1; i++)
    {
      lista->array[i] = lista->array[i + 1];
    }
    lista->n--;
    return p;
  }
  else
  {
    printf("Erro: Lista vazia.\n");
    return NULL;
  }
}

Pokemon *removerFimLista(Lista *lista)
{
  if (lista->n > 0)
  {
    Pokemon *p = lista->array[lista->n - 1];
    lista->n--;
    return p;
  }
  else
  {
    printf("Erro: Lista vazia.\n");
    return NULL;
  }
}

Pokemon *removerLista(Lista *lista, int posicao)
{
  if (lista->n > 0 && posicao >= 0 && posicao < lista->n)
  {
    Pokemon *p = lista->array[posicao];
    for (int i = posicao; i < lista->n - 1; i++)
    {
      lista->array[i] = lista->array[i + 1];
    }
    lista->n--;
    return p;
  }
  else
  {
    printf("Erro: Lista vazia ou posição inválida.\n");
    return NULL;
  }
}

void mostrarLista(Lista *lista)
{
  for (int i = 0; i < lista->n; i++)
  {
    printf("[%d] ", i);
    imprimirPokemon(lista->array[i]);
  }
}

//=============== Exercicio 2 ================
int main()
{
  lerPokemonsDeArquivo();

  // FAÇA O SEU EXERCICIO
  Lista *lista = newLista();

  char input[100];
  scanf("%s", input);
  while (strcmp(input, "FIM") != 0)
  {
    int id = atoi(input) - 1;
    if (id >= 0 && id < 801)
    {
      inserirFimLista(lista, pokemons[id]);
    }
    scanf("%s", input);
  }

  int n;
  scanf("%d", &n);
  getchar(); // Consome o caractere de nova linha.

  for (int i = 0; i < n; i++)
  {
    fgets(input, 100, stdin);
    char *action = strtok(input, " ");

    if (strcmp(action, "II") == 0)
    {
      int idII = atoi(strtok(NULL, " ")) - 1;
      inserirInicioLista(lista, pokemons[idII]);
    }
    else if (strcmp(action, "IF") == 0)
    {
      int idIF = atoi(strtok(NULL, " ")) - 1;
      inserirFimLista(lista, pokemons[idIF]);
    }
    else if (strcmp(action, "I*") == 0)
    {
      int posI = atoi(strtok(NULL, " "));
      int idI = atoi(strtok(NULL, " ")) - 1;
      inserirLista(lista, pokemons[idI], posI);
    }
    else if (strcmp(action, "RI") == 0)
    {
      Pokemon *removido = removerInicioLista(lista);
      printf("(R) %s\n", removido->nome);
    }
    else if (strcmp(action, "RF") == 0)
    {
      Pokemon *removido = removerFimLista(lista);
      printf("(R) %s\n", removido->nome);
    }
    else if (strcmp(action, "R*") == 0)
    {
      int posR = atoi(strtok(NULL, " "));
      Pokemon *removido = removerLista(lista, posR);
      printf("(R) %s\n", removido->nome);
    }
  }

  mostrarLista(lista);

  delPokemons();
  free(lista);

  return 0;
}