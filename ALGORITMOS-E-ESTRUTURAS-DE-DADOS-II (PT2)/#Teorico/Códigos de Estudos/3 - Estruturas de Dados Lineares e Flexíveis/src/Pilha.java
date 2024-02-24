
public class Pilha {
    private Pessoa[] vetor;
    private int topo;
    // private int fim;

    public Pilha(int n) {
        this.vetor = new Pessoa[n];
        this.topo = 0;
        // this.fim = n;
    }

    public void push(Pessoa valor) { // throws Exception {
        if (!this.isCheia()) {
            this.vetor[this.topo] = valor;
            this.topo++;
        } else {
            System.out.println("Pilha cheia");
            // throw new Exception("Pilha cheia");
        }
    }

    public Pessoa pop() { // throws Exception {
        if (!this.isVazia()) {
            this.topo--;
            return this.vetor[this.topo];
        } else {
            System.out.println("Pilha vazia");
            // throw new Exception("Pilha vazia");
        }
        return null;
    }

    public boolean isCheia() {
        // return (this.topo == this.fim);
        return (this.topo == this.vetor.length);
    }

    public boolean isVazia() {
        return (this.topo == 0);
    }

    public void imprimir() {
        for (int i = 0; i < this.topo; i++) {
            System.out.print(this.vetor[i] + ", ");
        }
        System.out.println();
    }
}