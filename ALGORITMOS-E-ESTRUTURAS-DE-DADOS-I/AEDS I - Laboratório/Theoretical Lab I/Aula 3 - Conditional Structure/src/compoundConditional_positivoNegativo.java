import java.util.Scanner;

public class compoundConditional_positivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Estrutura de condição SE/SENÃO
        /*
            se (condição)
            | então { comando 1 }
            | senão { comando 2 }
            fim se 
        */

        // #    Exemplo 2   #
        /*
            - Faça um programa que leia um número inteiro qualquer.
            - Se o número lido for maior ou igual a zero, diga que ele é positivo, senão diga que é negativo.
        */
        
        // Estruturas Condicionais Compostas
        Scanner sc=new Scanner(System.in);
            int n;
            System.out.print("Entre com um número inteiro: ");
            n=sc.nextInt();
            if (n >= 0){
                System.out.println("Número positivo!"); 
            }
            else {
                System.out.println("Numero negativo!"); 
            }
        sc.close();
	}

}
