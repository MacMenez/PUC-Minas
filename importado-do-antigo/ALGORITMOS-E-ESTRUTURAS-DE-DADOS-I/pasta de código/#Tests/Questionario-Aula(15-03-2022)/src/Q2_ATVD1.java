import java.util.Scanner;

public class Q2_ATVD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			1 - Faça um programa para ler 2 números diferentes quaisquer e após 
			mostre o valor do maior e o valor do menor entre os dois.
		*/
		Scanner sc = new Scanner(System.in);
	    
	      int n1, n2, maior, menor;
	  
	      System.out.print("Informe o 1° numero: ");
	  
	      n1 = sc.nextInt();
	  
	      System.out.print("Informe o 2° numero: ");
	  
	      n2 = sc.nextInt();

	      if(n1 > n2) {
	  
	      maior = n1;
	  
	      menor = n2;
	  
	      }
	  
	      else { 
	  
	      maior = n2;
	  
	      menor = n1;
	  
	      }
	  
	      System.out.printf("O número %d",maior," é maior que o número %d", menor);
	      sc.close();
	}

}
