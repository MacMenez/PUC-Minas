typedef int elemento;
struct tipo item{
    int
    elemento item
    tipoItem * prox;
    /* data */
};

Class fila{
    private
        tipoItem *front;
    void enfileirar(elemento e);
    elemento desenfileirar();
    bool vazio();
    int ultimo();
    int tamanho();
    ~fila(); // ~ -> destrutor, apga a fila inteira
}

fila :: fila(){ // :: -> informa uma referencia. No caso, diz que esta implemetnando algo no procedimento fila
    front = NULL;
}

void fila :: enfileire(elemento e){
    tipoItem *novo, *aux, *novo;
    
    novo = new tipoItem;
    novo2 =  = new tipoItem;

    novo -> item = e;
    novo -> prox = NULL;

    if (front == NULL){
        front = novo;
        /* code */
    }
    else
    {
        novo2 = front;
        aux = front -> prox;

        while (aux != NULL){
            novo2 = aux;
            aux = novo2 -> prox;
        }
    }   
}

fila :: bool vazio(){
    return front == NULL;
}