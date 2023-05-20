public class listaExecucao {
    public static void main(String[] args) {
        ListaVetor minhaLista;
        Inteiro novo, removido;

        minhaLista = new ListaVetor();

        novo = new Inteiro(1);
        try {
            minhaLista.inserir(novo, 0); // 1
            System.out.println("Item inserido com sucesso.");
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        novo = new Inteiro(11);
        try {
            minhaLista.inserir(novo, 0); // 11 - 1
            System.out.println("Item inserido com sucesso.");
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        novo = new Inteiro(21);
        try {
            minhaLista.inserir(novo, 3); // 11 - 1
            System.out.println("Item inserido com sucesso.");
        } catch (Exception erro) {
            System.out.println(erro.getMessage()); // Esta mensagem de erro deve ser exibida.
        }

        novo = new Inteiro(21);
        try {
            minhaLista.inserir(novo, 2); // 11 - 1 - 21
            System.out.println("Item inserido com sucesso.");
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        novo = new Inteiro(4);
        try {
            minhaLista.inserir(novo, 2); // 11 - 1 - 4 - 21
            System.out.println("Item inserido com sucesso.");
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        try {
            System.out.println();
            minhaLista.imprimir(); // 11 - 1 - 4 - 21
            System.out.println();
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        try {
            removido = minhaLista.remover(1);
            System.out.print("Item removido: "); // 1
            removido.imprimir();
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        try {
            System.out.println();
            minhaLista.imprimir(); // 11 - 4 - 21
            System.out.println();
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        try {
            removido = minhaLista.remover(3);
            System.out.print("Item removido: ");
            removido.imprimir();
        } catch (Exception erro) {
            System.out.println(erro.getMessage()); // Esta mensagem deve ser exibida.
        }

        try {
            removido = minhaLista.remover(1);
            System.out.print("Item removido: "); // 4
            removido.imprimir();
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        try {
            System.out.println();
            minhaLista.imprimir(); // 11 - 21
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
}