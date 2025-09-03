import java.util.Scanner;

public class Q1_ATVD5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5 - Faça um programa para calcular e mostrar a distancia percorrida por um móvel.
			Scanner sc = new Scanner(System.in);
        
            //Fórmula D = V x T
            double distancia, velocidade, tempo;
            
            System.out.printf("Informe a velocidade Km/h: ");
            velocidade = sc.nextDouble();
            
            System.out.printf("Informe a tempo em minutos: ");
            tempo = sc.nextDouble();
            
            distancia = (velocidade * tempo);
            
            System.out.printf("A distância percorrida foi de: %.1f", distancia);
            
            sc.close();
	}
}