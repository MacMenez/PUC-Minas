public class ListaDuplamenteEncadeada {
    private Celula primeiro;
    private Celula ultimo;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        Celula sentinela = new Celula();

        this.primeiro = sentinela;
        this.ultimo = sentinela;
        this.tamanho = 0;
    }

    public boolean listaVazia() {
        return (this.primeiro == this.ultimo);
    }

    public void inserirFinal(Inteiro novo) {
        Celula novaCelula = new Celula(novo);

        this.ultimo.setProximo(novaCelula);
        novaCelula.setAnterior(this.ultimo);

        this.ultimo = novaCelula;
        this.tamanho++;
    }

    public Inteiro removerFinal() throws Exception {
        Celula removida, penultima;

        if (!listaVazia()) {
            removida = this.ultimo;

            penultima = this.ultimo.getAnterior();
            penultima.setProximo(null);
            removida.setAnterior(null);

            this.ultimo = penultima;
            this.tamanho--;

            return (removida.getItem());
        } else
            throw new Exception("Não foi possível remover o último item da lista: a lista está vazia!");
    }

    public void imprimir() throws Exception {
        Celula aux;

        if (!listaVazia()) {
            System.out.println("Conteúdo da lista:");
            aux = this.primeiro.getProximo();
            while (aux != null) {
                aux.getItem().imprimir();
                aux = aux.getProximo();
            }
        } else
            throw new Exception("Não foi possível imprimir o conteúdo da lista: a lista está vazia!");
    }
}