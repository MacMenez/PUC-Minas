import java.util.Locale;

public class saida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tipos de variáveis e saídas
	    int a = 20;
	    double b = 23.456;
	    char letra = 'A';
	    String nome = "DAVI";

	    //Formatos de Saídas de Dados
	    System.out.println("Abaixo as saídas: \n");
	    System.out.printf("Inteiros: a = %d \n", a);
	    System.out.printf("Reais: b = %.2f \n", b);
	    System.out.printf("Caracteres: Letra %c \n", letra);
	    System.out.printf("Palavras: Nome -> %s \n", nome);
	    Locale.setDefault(Locale.US);
	    System.out.println("\n Utilizando o Locale: ");
	    System.out.printf("Reais: b = %.2f \n", b);
	}

}
