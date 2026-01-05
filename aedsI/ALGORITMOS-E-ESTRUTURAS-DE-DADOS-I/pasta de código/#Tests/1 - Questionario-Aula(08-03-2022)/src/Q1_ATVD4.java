import java.util.Scanner;

public class Q1_ATVD4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4 - Faça um programa para calcular e mostrar a área de um cubo.
			Scanner sc = new Scanner(System.in);
            
			double aT, aresta, area;
            
			System.out.printf("Informe o valor da aresta do cubo: \n");
            aresta = sc.nextDouble();

            //Área do Cubo tema Fórmula 
            area = 6*aresta;
            aT = Math. pow(area, 2);
            
            System.out.printf("A área total do cubo, equivale a: %f", aT);
            
            sc.close();
	}

}
