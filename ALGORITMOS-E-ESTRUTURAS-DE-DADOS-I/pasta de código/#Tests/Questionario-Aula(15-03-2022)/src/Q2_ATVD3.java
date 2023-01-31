import java.util.Scanner;

public class Q2_ATVD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	    //3 - Faça um programa que calcule a idade em anos de qualquer pessoa e após ter calculado mostre a idade
		  Scanner sc = new Scanner(System.in);
	      
		  int idade;

	      System.out.print("Informe sua idade: ");
	      idade = sc.nextInt();
	      
	      // Se idade  <= 10 anos, diga “Criança”;
	      if (idade <= 10) {
	    	  System.out.println("A idade informada é de uma criança!");
	      }
	      
	      // Se idade  > 10 e <= 17 anos, diga “Adolescente”;
	      else if((idade > 10) && (idade <= 17)) {
	    	  System.out.println("A idade informada é de um adolescente!");
	      }
	      
	      //Se idade  >= 18 anos, diga “Adulto”;
	      else {
	    	  System.out.println("A idade informada é de um adulto!");
	      }
	      
	      sc.close();
	}

}
