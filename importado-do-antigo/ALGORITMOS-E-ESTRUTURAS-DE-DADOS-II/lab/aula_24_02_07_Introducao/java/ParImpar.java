import java.util.Scanner;

public class ParImpar{
	public static void main(String []args){
		Scanner teclado = new Scanner(System.in);

		int numero;
		System.out.print("Informe o número: ");
		numero = teclado.nextInt();

		if(numero % 2 == 0){
			System.out.print("Par!");			
		}else{
			System.out.print("Ímpar!");			
		}
	}
}
