
public class Q4_ATVD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			Fa�a um programa para somar e mostrar a soma abaixo:
	
			S = (-7, -5, -3,  .....................) a soma dos 10 primeiros;
		*/
		int i = 1, soma = -7, tSoma = 0;
		while(i <= 9) {
			if (soma != 0) {
				System.out.printf("%d + ", soma);
				tSoma = (tSoma + (soma + 2));
				soma = soma + 2;
			}
			i = i + 1;
		}
		tSoma = tSoma + 2;
		System.out.printf("%d = %d", soma, tSoma);
	}

}
