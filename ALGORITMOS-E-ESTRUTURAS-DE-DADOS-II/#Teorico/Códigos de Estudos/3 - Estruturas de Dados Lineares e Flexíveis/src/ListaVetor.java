public class ListaVetor {
    private static final int TAMANHO_LISTA = 11;

    private int tam_lista;
    public Inteiro[] itens;
    private int primeiro;
    private int ultimo;

    public ListaVetor(int tam_lista) {
        this.primeiro = 0;
        this.ultimo = 0;

        this.tam_lista = tam_lista;

        this.itens = new Inteiro[this.tam_lista];
    }

    public ListaVetor() {
        this(TAMANHO_LISTA);
    }

    private boolean isVazia() {
        return (this.primeiro == this.ultimo);
    }

    private boolean isCheia() {
        return ((this.ultimo + 1) == this.tam_lista);
    }

    public void inserirInicio(Inteiro item) throws Exception {
        this.inserir(item, this.primeiro);
    }

    public void inserir(Inteiro item, int posicao) throws Exception {
        if (!this.isCheia()) {
            if (posicao <= this.ultimo && posicao >= 0) {
                for (int i = this.ultimo; i > posicao; i--) {
                    this.itens[i] = this.itens[i - 1];
                }

                this.itens[posicao] = item;
                this.ultimo++;
            } else {
                throw new Exception("Não é possível inserir um elemento nesta posição!");
            }
        }
    }

    public void inserirFim(Inteiro item) {
        if (!this.isCheia()) {
            this.itens[this.ultimo++] = item;
        }
    }

    public Inteiro removerInicio() throws Exception {
        return this.remover(this.primeiro);
    }

    public Inteiro remover(int posicao) throws Exception {
        if (!this.isVazia()) {
            if (posicao < this.ultimo && posicao >= 0) {
                Inteiro item = this.itens[posicao];
                this.ultimo--;

                for (int i = posicao; i < this.ultimo; i++) {
                    this.itens[i] = this.itens[i + 1];
                }

                itens[ultimo] = null;

                return item;
            } else {
                throw new Exception("Não é possível remover um elemento nesta posição!");
            }
        }

        return null;
    }

    public Inteiro removerFim() {
        if (!this.isVazia()) {
            Inteiro item = this.itens[this.ultimo - 1];
            this.itens[--this.ultimo] = null;

            return item;
        }
        return null;
    }

    public void imprimir() {
        if (!this.isVazia()) {
            for (int i = this.primeiro; i < this.ultimo; i++) {
                System.out.println("[" + i + "] " + this.itens[i]);
            }
        }
    }
}