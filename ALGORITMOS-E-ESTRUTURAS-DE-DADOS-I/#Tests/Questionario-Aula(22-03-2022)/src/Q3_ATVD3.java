
public class Q3_ATVD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			Utilizando a estrutura de repetição WHILE, implemente um programa em Java que calcule e escreva 
			a seguinte soma: soma = (1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50)
		*/
		int numerador = 1, denominador = 1;
		
		while((numerador <= 99) || (denominador <= 50)) {
			System.out.printf("%d / %d \n",numerador, denominador);
			numerador = numerador + 2;
			denominador = denominador + 1;
		}
	}

}
