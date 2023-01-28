import java.util.Scanner;

public class Q2_ATVD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //2 - Faça um programa para ler 3 números diferentes quaisquer e após mostre o valor do maior e o valor do menor entre os três.
		  Scanner sc = new Scanner(System.in);
	      
		  int n1, n2,n3, maior, menor;

	      System.out.print("Informe o 1° numero: ");
	      n1 = sc.nextInt();

	      System.out.print("Informe o 2° numero: ");
	      n2 = sc.nextInt();
	      
	      System.out.print("Informe o 3° numero: ");
	      n3 = sc.nextInt();
	      
	      if( n1 > n2 && n2 > n3) {
	    	  maior = n1;
	    	  menor = n3;
	    	  System.out.printf("O maior número digitado foi %d e o menor número digitado foi %d", maior, menor);
	      }
	      
	      else if( n1 > n2 && n2 < n3) {
	    	  maior = n1;
	    	  menor = n2;
	    	  System.out.printf("O maior número digitado foi %d e o menor número digitado foi %d", maior, menor);
	      }

	      else if( n2 > n3 && n3 > n1) {
	    	  maior = n2;
	    	  menor = n1;
	    	  System.out.printf("O maior número digitado foi %d e o menor número digitado foi %d", maior, menor);
	      }
	      
	      else if( n2 > n3 && n3 < n1) {
	    	  maior = n2;
	    	  menor = n3;
	    	  System.out.printf("O maior número digitado foi %d e o menor número digitado foi %d", maior, menor);
	      }
	      
	      else if( n3 > n1 && n1 > n2) {
	    	  maior = n3;
	    	  menor = n2;
	    	  System.out.printf("O maior número digitado foi %d e o menor número digitado foi %d", maior, menor);
	      }
	      
	      else if(n3 > n2 && n2 > n1){
	    	  maior = n3;
	    	  menor = n1;
	    	  System.out.printf("O maior número digitado foi %d e o menor número digitado foi %d", maior, menor);
	      }
	      
	      else {
	    	  System.out.print("Houve um erro, verifique os números novamente!");
	      }
	      
	      sc.close();
	}

}
