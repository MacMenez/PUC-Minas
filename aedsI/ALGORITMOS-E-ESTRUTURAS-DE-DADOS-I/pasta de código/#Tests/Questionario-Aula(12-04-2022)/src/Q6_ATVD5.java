import java.util.Scanner;
public class Q6_ATVD5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
			int x, mult;
			
			System.out.print("Informe um número para saber sua tabuada: ");
			x = sc.nextInt();
			
			for(int i = 0; i <= 20; i++) {
				if(i <= 10) {
					mult = x * i;
					System.out.printf("%d X %d = %d \n", x, i, mult);
				}
				if(i > 10 && i <= 20) {
					mult = x * i;
					System.out.printf("%d X %d = %d \n", x, i, mult);
				}
			}
		sc.close();
		
	}

}
