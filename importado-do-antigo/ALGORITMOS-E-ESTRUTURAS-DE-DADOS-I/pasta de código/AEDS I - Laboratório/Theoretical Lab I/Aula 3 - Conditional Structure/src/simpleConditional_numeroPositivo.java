import java.util.Scanner;

public class simpleConditional_numeroPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Estrutura de condição SE
        /*
            se (condição)
            | então { comando 1
            |
            comando 2 }
            fim se 
        */

        // #    Exemplo 1   #
        /*
            - Faça um programa que leia um número inteiro qualquer.

            - Se o número lido for maior ou igual a zero, diga que ele é positivo. 
        */

        // #    Exemplo 3   #
        //Faça um programa que permita escolher calcular a área de um quadrado ou de um retângulo. 
        
        // Estruturas Condicionais Simples
        Scanner sc=new Scanner(System.in);
            int n;
            System.out.println("Entre com um número inteiro: ");
            n=sc.nextInt();
            if (n >= 0){ 
                System.out.println ("Número positivo !");
            }

            int ar,lma,lme,al,ac,op;
            System.out.print("\nQual a opção de area ? \nQuadrado = 1 / Retangulo = 2 : ");
            op = sc.nextInt();

            if (op == 1){
                System.out.print("Entre com a aresta lateral do quadrado: ");
                al=sc.nextInt();
                ar= al*al;
                System.out.printf("Area do quadrado = %d",ar);
            }
            if (op == 2){
                System.out.print("Entre com lado maior do retangulo: ");
                lma=sc.nextInt();
                System.out.print("Entre com lado menor do retangulo: ");
                lme=sc.nextInt();
                ar=lma*lme;
                System.out.printf ("Area = %d",ar);
            }
        sc.close();
	}

}
