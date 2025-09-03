import java.util.Scanner;

public class passingNoReturn_parImpar_Method {
	static void parimpar(int n2){
        if (n2%2 == 0)
        System.out.printf("O numero %d e par!",n2);
        else
        System.out.printf("O numero %d e impar!",n2);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			O segundo tipo de método é representado por aqueles que recebem valor no momento 
			em que são chamados (parâmetros) e não devolvem valor para quem os chamou (retorno).
		*/
		
		//  #   Exemplo 1   #
        //- Faça um programa para analisar se um número é impar ou par.
        
        // Método com passagem de parâmetro e sem retorno
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.printf("Digite um numero: ");
        n = sc.nextInt();
        parimpar(n);
	}

}
