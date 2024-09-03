import java.util.Scanner;

public class AquecimentoIterativo {
    private static int contadorLetras(String informacao) {
        int totalLetras = 0;
        for (int i = 0; i < informacao.length(); i++) {
            char letra = informacao.charAt(i);
            if (Character.isUpperCase(letra)) { totalLetras++; }
        }
        return totalLetras;
    }

    public static void contadorMaiusculas(String informacao) { System.out.println(contadorLetras(informacao)); }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            
            String informacao = teclado.nextLine();

            while (!informacao.equals("FIM")) {
                contadorMaiusculas(informacao);
                informacao = teclado.nextLine();
            }
        teclado.close();
    }
}
