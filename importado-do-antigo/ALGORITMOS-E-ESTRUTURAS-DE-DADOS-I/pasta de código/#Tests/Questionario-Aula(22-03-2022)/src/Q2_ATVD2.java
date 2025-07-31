import java.util.Scanner;

public class Q2_ATVD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ler o peso e o gênero (masculino=1 / feminino=2) de um grupo de 5 pessoas
		Scanner sc=new Scanner(System.in);
		
		float peso = 0, Tpeso = 0, Mpeso;
		int genero, i = 1, generoM = 0, generoF = 0;
		
		while (i <= 5) {
			System.out.print("Infome seu peso atual em Kg: ");
			peso = sc.nextFloat();
			
			Tpeso = Tpeso + peso;
			
			System.out.print("Como você se identifica: \n 1 - Masculino \n 2 - Feminino \n");
			genero = sc.nextInt();
			
			//o número de homens e o número de mulheres do grupo
			if (genero == 1) {
				generoM = generoM + 1;
			}
			else {
				generoF = generoF + 1;
			}
			
			i = i+1;
		}
		
		//a média dos pesos do grupo
		Mpeso = Tpeso / 5;
		System.out.printf("A média de peso do grupo analisado equivale a: %.2f Kg", Mpeso);
		
		//indicar o gênero que teve a maior ocorrência (homens ou mulheres)
		if (generoM > generoF) {
			System.out.print("\nA pesquisa foi repondida por uma quantidade maior de homens que mulheres.");
		}
		else {
			System.out.print("\nA pesquisa foi repondida por uma quantidade maior de mulheres que homens.");
		}
		
		System.out.printf("\nResponderam a esta pesquisa %d homens e %d mulheres", generoM,generoF);

		sc.close();
	}

}