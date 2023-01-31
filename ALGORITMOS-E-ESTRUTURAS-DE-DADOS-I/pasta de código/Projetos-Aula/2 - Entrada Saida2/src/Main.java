import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tipos de Variáveis e Saídas
			int a = 20;
			double b = 23.456;
			char letra = 'A';
			String nome = "Davi";
		//Formatos de Saída
			System.out.println("Abaixo as Saídas: \n");
			System.out.printf("Inteiros: a = %d \n", a);
			System.out.printf("Reais: b = %.2f \n", b);
			System.out.printf("Caractere \n Letra: %c \n",letra);
			System.out.printf("Palavras \n Nome: %s \n", nome);
			Locale.setDefault(Locale.US);
			System.out.println("\n Utilizando o Locale: ");
			System.out.printf("Reais: b = %.2f \n", b);
	}

}
