import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			//7 - Faça um programa para calcular e mostrar a velocidade de um móvel.
				//Fórmula V = D / T
		
				double distancia, velocidade, tempo;
				
				System.out.printf("Informe a distância em Km: ");
				distancia = sc.nextDouble();
				
				System.out.printf("Informe o tempo em minutos: ");
				tempo = sc.nextDouble();
				
				 velocidade = (distancia / tempo);
				
				System.out.printf("A velocidade atingida foi de: %.2f", tempo);
		sc.close();
	}

}
/*
//4 - Faça um programa para calcular e mostrar a área de um cubo.
			double aT, aresta, area;
			System.out.printf("Informe o valor da aresta do cubo: \n");
			aresta = sc.nextDouble();

			//Área do Cubo tema Fórmula 
			aT = 6*aresta;
			area = Math. pow(aT, 2);
			
			System.out.printf("A área total do cubo, equivale a: %f", aT);
*/

/*
//5 - Faça um programa para calcular e mostrar a distancia percorrida por um móvel.
				//Fórmula D = V x T
				double distancia, velocidade, tempo;
				
				System.out.printf("Informe a velocidade Km/h: ");
				velocidade = sc.nextDouble();
				
				System.out.printf("Informe a tempo em minutos: ");
				tempo = sc.nextDouble();
				
				distancia = (velocidade * tempo);
				
				System.out.printf("A distância percorrida foi de: %.1f", distancia);
*/

/*
//6 - Faça um programa para calcular e mostrar  o tempo de deslocamento de um móvel.
				//Fórmula T = D / V
		
				double distancia, velocidade, tempo;
				
				System.out.printf("Informe a distância em Km: ");
				distancia = sc.nextDouble();
				
				System.out.printf("Informe a velocidade em KM/h: ");
				velocidade = sc.nextDouble();
				
				tempo = (velocidade / distancia);
				
				System.out.printf("O tempo de deslocamento foi de: %.2f", tempo);
*/