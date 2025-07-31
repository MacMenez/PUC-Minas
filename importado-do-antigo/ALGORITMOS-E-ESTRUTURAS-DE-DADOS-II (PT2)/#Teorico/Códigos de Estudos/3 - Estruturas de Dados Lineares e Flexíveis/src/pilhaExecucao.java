public class pilhaExecucao {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);

        for (int i = 0; i < 8; i++) {
            pilha.push(new Pessoa("A", String.valueOf(i)));
        }

        pilha.imprimir();

        pilha.push(new Pessoa("A", String.valueOf(8)));
        pilha.push(new Pessoa("A", String.valueOf(9)));

        pilha.imprimir();

        pilha.push(new Pessoa("A", String.valueOf(11)));
        pilha.imprimir();

        pilha.pop();
        pilha.imprimir();

        pilha.push(new Pessoa("A", String.valueOf(11)));
        pilha.imprimir();

        for (int i = 0; i < 10; i++) {
            pilha.pop();
        }
        pilha.imprimir();
        pilha.pop();
    }
}