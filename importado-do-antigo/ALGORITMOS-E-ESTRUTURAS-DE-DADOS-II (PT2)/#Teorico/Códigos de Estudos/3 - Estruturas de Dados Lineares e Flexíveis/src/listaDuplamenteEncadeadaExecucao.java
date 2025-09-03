public class listaDuplamenteEncadeadaExecucao {
    public static void main(String[] args) {
        Inteiro novo, removido;
        ListaDuplamenteEncadeada minhaLista;

        minhaLista = new ListaDuplamenteEncadeada();

        novo = new Inteiro(4);
        minhaLista.inserirFinal(novo);

        novo = new Inteiro(11);
        minhaLista.inserirFinal(novo);

        novo = new Inteiro(21);
        minhaLista.inserirFinal(novo);

        novo = new Inteiro(5);
        minhaLista.inserirFinal(novo);

        try {
            minhaLista.imprimir(); // 4 - 11 - 21 - 5
            System.out.println();
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        try {
            removido = minhaLista.removerFinal();
            System.out.print("Removido: ");
            removido.imprimir(); // 5
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        try {
            removido = minhaLista.removerFinal();
            System.out.print("Removido: ");
            removido.imprimir(); // 21
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        try {
            System.out.println();
            minhaLista.imprimir(); // 4 - 11
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
}