import java.util.Scanner;
public class Q6_ATVD4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			float num;
			int par = 0, impar = 0;
			
			for(int i = 0; i < 10; i = i + 1) {
				System.out.print("Informe o numero: ");
				num = sc.nextFloat();
				
				if(num % 2 == 0) {
					par = par + 1;
				}
				else {
					impar = impar + 1;
				}
			}
			System.out.printf("Foram informados %d números pares e %d numeros ímpares.", par, impar);
		sc.close();		
	}

}
