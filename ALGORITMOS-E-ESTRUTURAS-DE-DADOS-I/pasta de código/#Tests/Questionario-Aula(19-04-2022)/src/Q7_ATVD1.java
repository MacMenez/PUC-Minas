import java.util.Scanner;

public class Q7_ATVD1 {
	static void parImpar() {
		Scanner sc = new Scanner(System.in);
			int n, i = 1, par = 0, impar = 0, totN = 0;
			float media;
			
			while( i <= 10) {
				System.out.print("Digite o número: ");
				n = sc.nextInt();
				
				totN = totN + n;
				
				if (n % 2 == 0) {
					par = par + 1;
				}
				
				else {
					impar = impar + 1;
				}
				
				i = i + 1;
			}
			System.out.printf("Foram digitados %d números PAR e %d números IMPAR.", par, impar);
			
			media = totN / 10;
			
			System.out.printf("A média dos números digitádos é %d", media);
			
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parImpar();
	}
}