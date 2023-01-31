
public class Q2_ATVD4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Utilizando a estrutura de repetição DO-WHILE, implemente um programa em Java que calcule e escreva 
		a seguinte soma:soma = (1/1 + 1/2 + 1/3 + 1/4 + ... + 1/40)
		*/
		int denominador = 1;
		do {
			System.out.printf("1 / %d \n", denominador);
			denominador = denominador + 1;
		}
		while(denominador <= 40);
		
		
	}

}
