import java.util.Scanner;

public class Q1_ATVD6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6 - Faça um programa para calcular e mostrar  o tempo de deslocamento de um móvel.
			Scanner sc = new Scanner(System.in);
        
            //Fórmula T = D / V
    
            double distancia, velocidade, tempo;
            
            System.out.printf("Informe a distância em Km: ");
            distancia = sc.nextDouble();
            
            System.out.printf("Informe a velocidade em KM/h: ");
            velocidade = sc.nextDouble();
            
            tempo = (velocidade / distancia);
            
            System.out.printf("O tempo de deslocamento foi de: %.2f", tempo);
            
            sc.close();
	}

}
