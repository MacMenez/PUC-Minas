import java.util.Scanner;

public class Q2_ATVD6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // 6 - Faça um programa que permita calcular qualquer uma das áreas escolhidas
			Scanner sc = new Scanner(System.in);
	            double n1, n2, resultado;
	            int op;
	            
	            System.out.print("Selecione uma opção! \n");
	            System.out.print("1 - Área do Quadrado \n");
	            System.out.print("2 - Área do Retângulo \n");
	            System.out.print("3 - Área do Cubo \n");
	            System.out.print("4 - Área do Triangulo Retângulo \n");
	            op = sc.nextInt();
	            
	            
	            
	            System.out.print("Informe o 2° valor: ");
	            n2 = sc.nextDouble();
	            
	            switch (op) {
	              case 1:
	                System.out.print("Informe o valor de um dos lados: ");
	                n1 = sc.nextDouble();
	                
	                resultado = Math.pow(n1,2);
	                
	                System.out.printf("O resultado da soma é: %.2f", resultado);
	              break;
	              
	              case 2:
	                System.out.print("Informe o valor da base: ");
	                n1 = sc.nextFloat();
	                
	                System.out.print("Informe o valor da altura: ");
	                n2 = sc.nextFloat();
	                
	                resultado = n1 * n2;
	                System.out.printf("A área do retângulo equivale a: %.2f", resultado);
	              break;
	              
	              case 3:
	                System.out.print("Informe o valor da aresta: ");
	                n1 = sc.nextFloat();
	                
	                //Cálculo da Área Total. N2 equivale a área total
	                n2 = 6 * n1;
	                
	                resultado = Math.pow(n2,2);
	                System.out.printf("A área do cubo equivale a: %.2f", resultado);
	              break;
	              
	              case 4:
	                System.out.print("Informe o valor da base: ");
	                n1 = sc.nextFloat();
	                
	                System.out.print("Informe o valor da altura: ");
	                n2 = sc.nextFloat();
	                
	                resultado = (n1 * n2)/2;
	                System.out.printf("A área do triângulo retângulo equivale a: %.2f: %.2f", resultado);
	              break;
	            }
	      sc.close();
	}

}
