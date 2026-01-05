import java.util.Scanner;

public class Q2_ATVD6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i = 1, numero;
		
		while(i <= 5) {
			System.out.print("Informe um número positivo: ");
			numero = sc.nextInt();
			
			if((numero % 2) == 0) {
				System.out.print("O número informado é PAR! \n");
			}
			else {
				System.out.print("O número informado NÃO é ÍMPAR! \n");
			}
			
			i = i + 1;
		}
		sc.close();
	}

}
