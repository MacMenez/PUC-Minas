import java.util.Scanner;

public class Q7_ATVD3 {
	
	static void pesquisa() {
		Scanner sc = new Scanner(System.in);
			int filhos, tFilhos = 0, cidadao = 0, laco;
			float salario, mFilhos, medSalario, tSalario = 0, mSalario = 0, smMil = 0, psmMil;
				
				laco = 1;
				
				while(laco ==1) {
					
					System.out.print("Informe seu sálario: R$");
					salario = sc.nextFloat();
					
					if(salario > 0) {
						tSalario = tSalario + salario;
						
						if (salario > mSalario) {
							mSalario = salario;
						}
						
						if (salario > smMil) {
							smMil = smMil + 1;
						}
						
						System.out.print("Informe o número de filhas(os): ");
						filhos = sc.nextInt();
						
						tFilhos = tFilhos + filhos;
						
						cidadao++;
					}
					
					else {
						laco = 0;
					}
				}
				
			//média do número de filhos;
			mFilhos = tFilhos / cidadao;
			System.out.printf("A média de filhas(os) na cidade é: %.2f \n", mFilhos);
			
			//média do salário da população;
			medSalario = tSalario / cidadao;
			System.out.printf("A média de sálario é: R$%.2f \n", medSalario);
			
			//maior salário;
			System.out.printf("O maior sálario é: R$%.2f \n", mSalario);
			
			//percentual de pessoas com salário até R$1.000,00
			psmMil = smMil / 100;
			System.out.printf("Média de pessoas que recebem salario superior a R$1.000: %.2f%", psmMil);
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//O final da leitura de dados se dará com a entrada de um salário negativo.
		
		//Crie pelo menos um método dentro do seu programa.	
		pesquisa();
		
	}

}
