import java.util.Scanner;

public class Q8_A3 {
	
	static float conversaoD(float Dolar, float Real) {
		float conversao;
		conversao = Real / Dolar;
		return conversao;
	}
	
	static float conversaoE(float Euro, float Real) {
		float conversao;
			conversao = Real / Euro;
		return conversao;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int i = 1;
			float Dolar, Euro, Real, valD, valE;
			
			System.out.print("Informe o valor do Dolar: ");
			Dolar = sc.nextFloat();
			
			System.out.print("Informe o valor do Euro: ");
			Euro = sc.nextFloat();
			
			while (i <= 5) {
				System.out.print("Informe o valor do produto R$ ");
				Real = sc.nextFloat();
				
				valD = conversaoD(Dolar, Real);
				valE = conversaoE(Euro, Real);
				
				System.out.printf("O produto custa(na cotação atual) US$%.2f e €%.2f \n\n", valD, valE);
				
				i++;
			}
		sc.close();
	}

}
