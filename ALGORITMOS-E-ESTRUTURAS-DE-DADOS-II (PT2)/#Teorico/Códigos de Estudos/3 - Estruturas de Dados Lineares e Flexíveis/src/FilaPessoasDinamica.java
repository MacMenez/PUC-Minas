import java.time.*;

public class FilaPessoasDinamica {

    public static void main(String[] args) throws InterruptedException {
        Cliente cli;
        FilaDinamica filaLanchonete;

        filaLanchonete = new FilaDinamica();
        cli = new Cliente("Felipe", LocalDateTime.now());
        filaLanchonete.enfileirar(cli);
        System.out.println("Enfileira cliente: " + cli.getNome());
        Thread.sleep(1000);
        cli = new Cliente("João", LocalDateTime.now());
        filaLanchonete.enfileirar(cli);
        System.out.println("Enfileira cliente: " + cli.getNome());
        Thread.sleep(1000);
        cli = new Cliente("Ana", LocalDateTime.now());
        filaLanchonete.enfileirar(cli);
        System.out.println("Enfileira cliente: " + cli.getNome());
        Thread.sleep(1000);

        cli = filaLanchonete.desenfileirar();
        System.out.println("O cliente " + cli.getNome() + " foi atendido."); // Felipe
        Thread.sleep(1000);
        cli = filaLanchonete.desenfileirar();
        System.out.println("O cliente " + cli.getNome() + " foi atendido."); // João
        Thread.sleep(1000);
        cli = filaLanchonete.desenfileirar();
        System.out.println("O cliente " + cli.getNome() + " foi atendido."); // Ana
        Thread.sleep(1000);

        cli = new Cliente("Joaquim", LocalDateTime.now());
        filaLanchonete.enfileirar(cli);
        System.out.println("Enfileira cliente: " + cli.getNome());
        Thread.sleep(1000);

        cli = filaLanchonete.desenfileirar();
        System.out.println("O cliente " + cli.getNome() + " foi atendido."); // Joaquim
        Thread.sleep(1000);

        cli = filaLanchonete.desenfileirar();
        try {
            System.out.println("O cliente " + cli.getNome() + " foi atendido."); // Joaquim
        } catch (Exception ex) {
            System.out.println("Tentativa de desenfileirar uma fila vazia");
        }
    }
}