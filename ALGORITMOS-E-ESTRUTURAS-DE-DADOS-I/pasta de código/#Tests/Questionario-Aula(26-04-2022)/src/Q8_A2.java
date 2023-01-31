import java.util.Scanner;

public class Q8_A2 {
	
	static float pesoH() {
		Scanner sc = new Scanner(System.in);
			float pm;
			
			System.out.print("Informe seu peso(Kg): ");
			pm = sc.nextFloat();

			return pm;
	}
	
	static float pesoM() {
		Scanner sc = new Scanner(System.in);
			float pf;
			
			System.out.print("Informe seu peso(Kg): ");
			pf = sc.nextFloat();

			return pf;
	}
	
	static float mediaH(float totpH, float totH) {
		float media;
		
		media = totpH / totH;
		
		return media;
	}
	
	static float mediaM(float totpM, float totM) {
		float media;
		
		media = totpM / totM;
		
		return media;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int op, i = 0;
			float pm, totpH = 0, pf, totpM = 0, totH = 0, totM = 0;
			
			do {
				// Colhendo Dados
				System.out.print("Digite 1 - Homem | ");
				System.out.print("Digite 2 - Mulher \n");
			
				System.out.print("Digite seu sexo: ");
				op = sc.nextInt();
				
				
				//Tratamento de Dados
				switch(op) {
					case 1:
						pesoH();
						pm = pesoH();
						totpH = totpH + pm;
						totH = totH + 1;
					case 2: 
						pesoM();
						pf = pesoM();
						totpM = totpM + pf;
						totM = totM + 1;
					default: 
						System.out.print("Opção inválida! \n");
				}
				i++;
			}
			while (i <= 10);
			
			//Exibindo tratamento de Daodos
			pm = mediaH(totpH, totH);
			pf = mediaM(totpM, totM);
			
			System.out.printf("A média de peso masculino é %.2fKg", pm);
			System.out.printf("A média de peso feminino é %.2fKg", pf);
		sc.close();
	}
}