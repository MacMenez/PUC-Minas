import java.util.Scanner;

public class Q3_ATVD5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Ler uma sequência de 5 números inteiros positivos e verificar se cada um deles é divisível por 3, 
		escrevendo mensagem adequada.
		*/
		Scanner sc = new Scanner(System.in);
		int i = 1, numero;
		
		while(i <= 5) {
			System.out.print("Informe um número positivo: ");
			numero = sc.nextInt();
			
			if((numero %3) == 0) {
				System.out.print("O número informado é divisível por 3! \n");
			}
			else {
				System.out.print("O número informado NÃO é divisível por 3! \n");
			}
			
			i = i + 1;
		}
		sc.close();
	}

}
