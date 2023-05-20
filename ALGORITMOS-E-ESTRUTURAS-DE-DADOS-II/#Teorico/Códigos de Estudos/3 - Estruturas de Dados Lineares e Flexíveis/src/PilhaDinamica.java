public class PilhaDinamica {
    private CelulaPilha sentinela;
    private CelulaPilha topo;

    public PilhaDinamica() {
        this.sentinela = new CelulaPilha();
        this.topo = this.sentinela;
    }

    public void push(int valor) {
        CelulaPilha nova = new CelulaPilha(valor);
        nova.setAnterior(this.topo);
        this.topo = nova;
    }

    public int pop() {
        if (!this.isVazia()) {
            CelulaPilha celula = this.topo;

            this.topo = this.topo.getAnterior();

            celula.setAnterior(null);
            return celula.getValor();
        } else {
            System.out.println("Pilha vazia");
        }
        return Integer.MIN_VALUE;
    }

    public boolean isVazia() {
        return (this.topo == this.sentinela);
    }

    public void imprimir() {
        CelulaPilha indice = this.topo;
        while (indice != this.sentinela) {
            System.out.print(indice.getValor() + ", ");
            indice = indice.getAnterior();
        }
        System.out.println();
    }
}