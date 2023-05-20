public class listaDuplamenteEncadeadaCelula {
    private Inteiro item;
    private listaDuplamenteEncadeadaCelula anterior;
    private listaDuplamenteEncadeadaCelula proximo;

    public listaDuplamenteEncadeadaCelula(Inteiro novo) {

        item = novo;
        anterior = null;
        proximo = null;
    }

    public listaDuplamenteEncadeadaCelula() {

        item = new Inteiro();
        anterior = null;
        proximo = null;
    }

    public Inteiro getItem() {
        return item;
    }

    public void setItem(Inteiro item) {
        this.item = item;
    }

    public listaDuplamenteEncadeadaCelula getProximo() {
        return proximo;
    }

    public void setProximo(listaDuplamenteEncadeadaCelula proximo) {
        this.proximo = proximo;
    }

    public listaDuplamenteEncadeadaCelula getAnterior() {
        return anterior;
    }

    public void setAnterior(listaDuplamenteEncadeadaCelula anterior) {
        this.anterior = anterior;
    }
}