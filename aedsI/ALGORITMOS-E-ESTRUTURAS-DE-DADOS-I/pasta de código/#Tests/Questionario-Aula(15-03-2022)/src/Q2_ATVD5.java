import java.util.Scanner;

public class Q2_ATVD5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // 5 - Faça um programa que funcione como uma calculadora entre dois números quaisquer, que permita escolher calcular a soma, subtração, divisão ou multiplicação entre eles.
			Scanner sc = new Scanner(System.in);
			float n1, n2, resultado;
			int op;
	            
	            System.out.print("Selecione uma opção! \n");
	            System.out.print("1 - Somar 2 números \n");
	            System.out.print("2 - Subtrair 2 números \n");
	            System.out.print("3 - Multiplicar 2 números \n");
	            System.out.print("4 - Dividir 2 números \n");
	            op = sc.nextInt();
	            
	            System.out.print("Informe o 1° valor: ");
	            n1 = sc.nextFloat();
	            
	            System.out.print("Informe o 2° valor: ");
	            n2 = sc.nextFloat();
	            
	            switch (op) {
	              case 1:
	                resultado = n1 + n2;
	                System.out.printf("O resultado da soma é: %.2f", resultado);
	              break;
	              
	              case 2:
	                resultado = n1 - n2;
	                System.out.printf("O resultado da subtração é: %.2f", resultado);
	              break;
	              
	              case 3:
	                resultado = n1 * n2;
	                System.out.printf("O resultado da multiplicação é: %.2f", resultado);
	              break;
	              
	              case 4:
	                resultado = n1 / n2;
	                System.out.printf("O resultado da divisão é: %.2f", resultado);
	              break;
	            }
	      sc.close();
	}

}
