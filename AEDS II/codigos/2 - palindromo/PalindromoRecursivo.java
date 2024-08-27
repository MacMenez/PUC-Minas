import java.util.Scanner;

public class PalindromoRecursivo {
    private static boolean palindromoRecursivo(String palavra, int inicio, int fim) {
        boolean ePalindromo = true;

        if (inicio < fim) { 
            if (palavra.charAt(inicio) != palavra.charAt(fim)){ ePalindromo = false; }
            else{ ePalindromo = palindromoRecursivo(palavra, inicio+1, fim-1);  }
        }
        return ePalindromo;
    }
    public static void palindromo(String palavra) {
        int tamanho = palavra.length();
        if (palindromoRecursivo(palavra, 0, tamanho-1)) { System.out.println("SIM"); }
        else{ System.out.println("NAO"); }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            String palavra = teclado.nextLine();
            while (!palavra.equals("FIM")) {
                palindromo(palavra);
                palavra = teclado.nextLine();
            }
        teclado.close();
    }
}
