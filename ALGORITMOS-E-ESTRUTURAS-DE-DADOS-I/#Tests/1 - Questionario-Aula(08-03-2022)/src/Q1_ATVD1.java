import java.util.Scanner;

public class Q1_ATVD1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
    	// Faça um programa para  somar 3 números inteiros quaisquer e mostrar o resultado.
        Scanner sc = new Scanner(System.in);
            int n1, n2, n3, resultado;
        
            System.out.print("Digite o 1° número inteiro: \n");
            n1 = sc.nextInt();
            System.out.print("Digite o 2° número inteiro: \n");
            n2 = sc.nextInt();
            System.out.print("Digite o 3° número inteiro: \n");
            n3 = sc.nextInt();
            
            resultado = n1 + n2 + n3;
            
            System.out.printf("A soma dos 3 números inteiros informados tem resultado de:\n %d", resultado);
        sc.close();
    }
}