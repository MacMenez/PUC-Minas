public class App {
    public static void main(String[] args) throws Exception {
        // Testar a Pilha com os métodos criados
        try {
            System.out.println(" ==== PILHA FLEXIVEL ====");
            Pilha pilha = new Pilha();
            int x1, x2, x3;

            pilha.inserir(0);
            pilha.inserir(1);
            pilha.inserir(2);
            pilha.inserir(3);
            pilha.inserir(4);
            pilha.inserir(5);

            System.out.print("Apos insercoes: ");
            pilha.mostrar();

            System.out.println("Etapa de conversão de uma pilha em fila!");
            pilha.toFila();

        } catch (Exception erro) { System.out.println(erro.getMessage()); }

        try {
            // Testar a Fila com os métodos criados
            System.out.println("==== FILA FLEXIVEL ====");
            Fila fila = new Fila();
            int x1, x2, x3;

            fila.inserir(5);
            fila.inserir(7);
            fila.inserir(8);
            fila.inserir(9);

            System.out.println("Apos insercoes(5, 7, 8, 9): ");
            fila.mostrar();

            fila.inserir(3);
            fila.inserir(4);

            System.out.println("Apos insercoes(3, 4): ");
            fila.mostrar();

            fila.inserir(4);
            fila.inserir(5);

            System.out.println("Apos insercoes(4, 5): ");
            fila.mostrar();

            fila.inserir(6);
            fila.inserir(7);

            System.out.println("Apos insercoes(6, 7): ");
            fila.mostrar();

            System.out.println("Etapa de conversão de uma fila em pilha!");
            fila.toPilha();
        } catch (Exception erro) { System.out.println(erro.getMessage()); }
    }
}
