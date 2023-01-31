
public class Q3_ATVD9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			Faça um programa para calcular e mostrar a soma da série abaixo: 

			S = (1 + 3 +5 + 7 +.................. + 49)
		*/
		int num = 1, nTotal = 0;
		
		while(num <= 48) {
			System.out.printf("%d + ", num);
			num = num + 2;
			
			nTotal = nTotal + num;
		}
		
		nTotal = nTotal + 49;
		System.out.printf("49 \n");
		System.out.printf("A soma de todos os números equivale a: %d", nTotal);
	}

}
