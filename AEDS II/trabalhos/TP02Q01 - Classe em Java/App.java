import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            String informacaoLida = teclado.nextLine(); // Ler cabeçalho
            Pokemon pokemon = new Pokemon();

            informacaoLida = teclado.nextLine(); // Ler primeira linha de informação
            while (!informacaoLida.equals("FIM")) {
                pokemon.lerDados(informacaoLida);
                informacaoLida = teclado.nextLine();
            }
        teclado.close();
    }
}
