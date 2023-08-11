class Celula {

    private Inteiro item;
    private Celula proximo;

    public Celula(Inteiro novo) {
        this.item = novo;
        this.proximo = null;
    }

    public Celula() {
        this.item = new Inteiro();
        this.proximo = null;
    }

    public Inteiro getItem() {
        return this.item;
    }

    public void setItem(Inteiro item) {
        this.item = item;
    }

    public Celula getProximo() {
        return this.proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(Object object) {
    }

    public Celula getAnterior() {
        return null;
    }
}