
public class Q4_ATVD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			Fa�a um programa para somar e mostrar o resultado da soma abaixo:
 			S = (2 + 4 +6 + 8 +..................) a soma dos 15 primeiros;
		*/
		int i = 1, soma = 2, tSoma = 0;
		while(i <= 14) {
			System.out.printf("%d + ", soma);
			tSoma = (tSoma + (soma + 2));
			soma = soma + 2;
			i = i + 1;
		}
		tSoma = tSoma + 2;
		System.out.printf("%d = %d", soma, tSoma);
	}

}
