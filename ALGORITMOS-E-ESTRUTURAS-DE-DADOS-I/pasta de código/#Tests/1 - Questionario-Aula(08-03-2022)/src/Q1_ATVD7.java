import java.util.Scanner;

public class Q1_ATVD7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7 - Faça um programa para calcular e mostrar a velocidade de um móvel.
		Scanner sc = new Scanner(System.in);
            //Fórmula V = D / T
    
            double distancia, velocidade, tempo;
            
            System.out.printf("Informe a distância em Km: ");
            distancia = sc.nextDouble();
            
            System.out.printf("Informe o tempo em minutos: ");
            tempo = sc.nextDouble();
            
            velocidade = (distancia / tempo);
            
            System.out.printf("A velocidade atingida foi de: %.2f", velocidade);
            
            sc.close();
	}

}
