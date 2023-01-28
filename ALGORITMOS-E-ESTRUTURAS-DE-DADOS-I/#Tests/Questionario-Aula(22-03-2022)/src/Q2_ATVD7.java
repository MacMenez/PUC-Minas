
public class Q2_ATVD7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			Faça um programa para calcular e mostrar a soma da série abaixo: 
			S = (1 + 2 +3 + 4 +.................. + 50)
		*/
		int i = 1, num = 1, nTotal = 0;
		
		while(i <= 49) {
			System.out.printf("%d + ", num);
			num = num + 1;
			
			nTotal = nTotal + num;
			
			i = i + 1;
		}
		
		nTotal = nTotal + 50;
		System.out.printf("50 \n");
		System.out.printf("A soma dos 50 números equivale a: %d", nTotal);
	}

}
