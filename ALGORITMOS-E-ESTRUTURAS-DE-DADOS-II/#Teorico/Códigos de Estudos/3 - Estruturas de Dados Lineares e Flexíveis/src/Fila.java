public class Fila {
    int frente;
    int tras;
    int[] vetor;
    int n;

    Fila(int n) {
        this.frente = 0;
        this.tras = 0;
        this.n = n;
        this.vetor = new int[n];
    }

    void enfileirar(int item) {
        if (this.isCheia() == false) {
            this.vetor[tras] = item;
            this.tras = (this.tras + 1) % this.n;
        }
    }

    int desenfileirar() {
        if (this.isVazia() == false) {
            int valor = this.vetor[this.frente];
            this.frente = (this.frente + 1) % this.n;
            return valor;
        }
        return -1;
    }

    boolean isVazia() {
        if (this.tras == this.frente) {
            System.out.println("Fila vazia");
            return true;
        }
        return false;
    }

    boolean isCheia() {
        if (((this.tras + 1) % this.n) == this.frente) {
            System.out.println("Fila cheia");
            return true;
        }
        return false;
    }

    void imprimir() {
        int ini = this.frente;
        int fim = this.tras;
        while (ini != fim) {
            System.out.print(vetor[ini] + ", ");
            ini = (ini + 1) % this.n;
        }
    }

    public static void main(String[] args) {
        Fila fila = new Fila(10);
        fila.enfileirar(3);
        fila.enfileirar(5);
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(4);
        fila.imprimir();

        System.out.println();
        fila.desenfileirar();
        fila.desenfileirar();
        fila.imprimir();

        System.out.println();
        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();

        for (int i = 0; i < 9; i++) {
            fila.enfileirar(i * 2);
        }
        fila.imprimir();
        fila.enfileirar(18);
    }
}