import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Entrada de Dados 2
			Scanner sc = new Scanner(System.in); //Habilita o Teclado
			
			String nome, sobrenome;
			System.out.print("Digite seu Primeiro Nome: ");
			nome = sc.next();
			System.out.print("Digite seu Sobrenome: ");
			sobrenome=sc.next();
			
		//Saída de Dados
			System.out.println("\n\n");
			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome:" + sobrenome);
			
			sc.close(); //Desabilita o Teclado
	}

}
