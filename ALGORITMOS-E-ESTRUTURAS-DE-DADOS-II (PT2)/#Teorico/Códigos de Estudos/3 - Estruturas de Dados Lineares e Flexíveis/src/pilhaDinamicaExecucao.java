public class pilhaDinamicaExecucao {
    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();

        for (int i = 0; i < 10; i++) {
            pilha.push(i);
        }

        pilha.imprimir();

        pilha.pop();
        pilha.pop();
        pilha.imprimir();

        pilha.push(8);
        pilha.imprimir();

        for (int i = 0; i < 9; i++) {
            pilha.pop();
        }
        pilha.imprimir();
        pilha.pop();

        pilha.push(50);
        pilha.imprimir();
    }
}