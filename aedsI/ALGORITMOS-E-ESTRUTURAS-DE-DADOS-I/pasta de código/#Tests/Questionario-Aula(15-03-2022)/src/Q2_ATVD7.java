import java.util.Scanner;

public class Q2_ATVD7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // 7 - Faça um programa que permita o cálculo de qualquer uma das grandezas físicas abaixo
		  Scanner sc = new Scanner(System.in);
	      
		  float n1, n2, resultado;
	      int op;
	      
	      System.out.print("Selecione uma opção! \n");
	      System.out.print("1 - Calcular Distância Percorrida \n");
	      System.out.print("2 - Tempo Percorrido \n");
	      System.out.print("3 - Velocidade \n");
	      op = sc.nextInt();
	      
	      System.out.print("Informe o 2° valor: ");
	      n2 = sc.nextFloat();
	      
	      switch (op) {
	        case 1:
	          System.out.print("Informe a velocidade: ");
	          n1 = sc.nextFloat();
	          
	          System.out.print("Informe o tempo percorrido: ");
	          n2 = sc.nextFloat();
	          
	          resultado = n1 * n2;
	          
	          System.out.printf("A distância percorrida foi de: %.2f", resultado);
	        break;
	        
	        case 2:
	          System.out.print("Informe a distãncia: ");
	          n1 = sc.nextFloat();
	          
	          System.out.print("Informe a velocidade: ");
	          n2 = sc.nextFloat();
	          
	          resultado = n1 / n2;
	          
	          System.out.printf("O tempo percorrido foi de: %.2f", resultado);
	        break;
	        
	        case 3:
	          System.out.print("Informe a distãncia: ");
	          n1 = sc.nextFloat();
	          
	          System.out.print("Informe o tempo: ");
	          n2 = sc.nextFloat();
	          
	          resultado = n1 / n2;
	          
	          System.out.printf("A velocidade atigida foi de: %.2f", resultado);
	        break;
	      }

	      sc.close();
	}

}
