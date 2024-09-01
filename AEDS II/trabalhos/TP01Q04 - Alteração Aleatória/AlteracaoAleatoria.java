import java.util.Scanner;
import java.util.Random;

public class AlteracaoAleatoria {
	public static String subtituicaoLetra(String args) {
		Random letraSorteada = new Random(4);
		int tamanho = args.length();
		char letraAlterada = (char) ('a' + Math.abs(letraSorteada.nextInt(26)));
		char outraLetraAlterada = (char) ('a' + Math.abs(letraSorteada.nextInt()) % 26);
		StringBuilder stringAlterada = new StringBuilder(args);
		for (int i = 0; i < tamanho; i++) {
			if (args.charAt(i) == letraAlterada) { stringAlterada.setCharAt(i, outraLetraAlterada); }
		}
		return stringAlterada.toString();
	}

	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		String palavra = " ";
		while (!(palavra.equals("FIM"))) {
			palavra = teclado.nextLine();
			if (!(palavra.equals("FIM"))) {
				System.out.println(" " + subtituicaoLetra(palavra));
			}
		}
	}
}