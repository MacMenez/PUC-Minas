import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			
			
			double lma, lme, area;
			System.out.print("Qual o maior lado do retângulo: ");
			lma = sc.nextDouble();
			System.out.print("Qual o menor lado do retângulo: ");
			lme = sc.nextDouble();
			
			area = lma * lme;
			
			System.out.printf("Área do Retângulo: %.2f", area);
			
			sc.close();
	}

}
