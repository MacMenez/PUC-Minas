import java.util.Scanner;

public class AquecimentoIterativoRec {
    private static int contadorLetras(String informacao, int posicao) {
        // Caso base: se o índice é igual ao comprimento da string, retorne 0
        if (posicao >= informacao.length()) { return 0; }

        // Verifique se o caractere atual é maiúsculo e conte-o
        int incremento = Character.isUpperCase(informacao.charAt(posicao)) ? 1 : 0;

        // Retorne a soma do incremento e o resultado da chamada recursiva para o próximo índice
        return incremento + contadorLetras(informacao, posicao + 1);
    }

    public static void contadorMaiusculas(String informacao) { System.out.println(contadorLetras(informacao, 0)); }
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
