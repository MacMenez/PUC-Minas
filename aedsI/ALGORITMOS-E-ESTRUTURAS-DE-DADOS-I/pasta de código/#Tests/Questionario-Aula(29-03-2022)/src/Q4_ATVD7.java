import java.util.Scanner;

public class Q4_ATVD7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 7- Faça um programa para ler a idade, o gênero (masc=1/fem=2) e o peso de 5 pessoas.
		Scanner sc = new Scanner(System.in);
		
			int i = 1, resp, tMasc = 0, tFem = 0, iFem = 0, tiFem = 0, miFem = 0, mIdade = 0;
			float pMasc = 0, tpMasc = 0, mpMasc = 0, mPeso = 0;
			
			while(i <= 5) {
				System.out.print("Como você se identifica: \n 1 - Masculino   |   2 - Feminino \n");
				resp = sc.nextInt();
				
				//Informar: O número de homens e o número de mulheres
				if(resp == 1) {
					tMasc = tMasc + 1;
					
					System.out.print("Qual o seu peso? Informar separar as gramas com o '.'(Ponto Final). \n");
					pMasc = sc.nextFloat();
					
					//Informar: A média dos pesos dos homens
					tpMasc = tpMasc + pMasc;
					
					mpMasc = tpMasc / tMasc;
				}
				
				else {
					tFem = tFem + 1;
					
					System.out.print("Informe a sua idade: ");
					iFem = sc.nextInt();
					
					//Informar: A média das idades das mulheres
					tiFem = tiFem + iFem;
					
					miFem = tiFem / tFem;
				}
				
				//Informar: A média do peso e das idades do grupo
			}
			System.out.printf("Foram identificados %d homens e %d mulheres!", tMasc, tFem);
			System.out.printf("A média de peso dos homens identificado equivale a: %.2f Kg.", mpMasc);
			System.out.printf("A média da idade das mulheres identificadas equivale a: %d anos.", miFem);
			System.out.printf("Identificamos que a média do grupo equivale a %.2f Kg e %d anos.", mPeso, mIdade);
		sc.close();
		
	}

}
