public class ListaEncadeada {
    private Celula primeiro;
    private Celula ultimo;
    private int tamanho;

    public ListaEncadeada() {
        Celula sentinela = new Celula();

        this.primeiro = sentinela;
        this.ultimo = sentinela;
        this.tamanho = 0;
    }

    public boolean listaVazia() {
        return (this.primeiro == this.ultimo);
    }

    public void inserir(Inteiro novo, int posicao) throws Exception {
        Celula anterior, novaCelula, proximaCelula;

        if ((posicao >= 0) && (posicao <= this.tamanho)) {
            anterior = this.primeiro;
            for (int i = 0; i < posicao; i++)
                anterior = anterior.getProximo();

            novaCelula = new Celula(novo);
            proximaCelula = anterior.getProximo();

            anterior.setProximo(novaCelula);
            novaCelula.setProximo(proximaCelula);

            if (posicao == this.tamanho) // a inserção ocorreu na última posição da lista
                this.ultimo = novaCelula;

            this.tamanho++;

        } else
            throw new Exception("Não foi possível inserir o item na lista: a posição informada é inválida!");
    }

    public Inteiro remover(int posicao) throws Exception {
        Celula anterior, celulaRemovida, proximaCelula;

        if (!listaVazia()) {
            if ((posicao >= 0) && (posicao < this.tamanho)) {
                anterior = this.primeiro;
                for (int i = 0; i < posicao; i++)
                    anterior = anterior.getProximo();

                celulaRemovida = anterior.getProximo();

                proximaCelula = celulaRemovida.getProximo();

                anterior.setProximo(proximaCelula);
                celulaRemovida.setProximo(null);

                if (celulaRemovida == this.ultimo)
                    this.ultimo = anterior;

                this.tamanho--;

                return (celulaRemovida.getItem());
            } else
                throw new Exception("Não foi possível remover o item da lista: a posição informada é inválida!");
        } else
            throw new Exception("Não foi possível remover o item da lista: a lista está vazia!");
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
