import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Estruturas Condicionais Simples 
		 
		Scanner sc=new Scanner(System.in); 
		int n;
		
		System.out.println("Entre com um número inteiro: "); 
		n=sc.nextInt();
		 
		if (n>=0) { 
			System.out.println ("Número positivo !"); 
		} 
		 
		sc.close(); 
	}

}
