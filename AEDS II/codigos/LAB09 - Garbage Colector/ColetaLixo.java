

class ColetaLixo {
    private Celula primeiro;
    private Celula ultimo;

    public ColetaLixo () {
        primeiro = new Celula();
        // ultimo = primeiro; // Descomente esta parte para simular o aumento de uso de memória RAM
    }

    public void inserir(int x) {
        primeiro.prox = new Celula(x);
        primeiro = primeiro.prox;

        /* Descomente a parte abaixo e comente a parte acima para simular o aumento de uso de memória RAM */
        // ultimo.prox = new Celula(x);
        // ultimo = ultimo.prox;
    }

    public static void main (String [] args) {
        ColetaLixo coletaLixo = new ColetaLixo ();
        while(true){
            coletaLixo.inserir(0);
        }
    }
}


