import java.util.Scanner;

public class doStructure_leituraEmedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #    Exemplo 2   #
        //Faça um programa para ler 5 números inteiros e mostrar a média entre os cinco.
        
        // Estrutura de Repetição Exemplo 3
        Scanner sc = new Scanner(System.in);
	        int soma=0, media=0;
	        int x=1, n=0;
	        do{
	            System.out.printf("Entre o valor do %d numero: ",x);
	            n=sc.nextInt();
	            soma = soma+n;
	            x=x+1;
	        }
	        while (x<=5);
	        
	        media=soma/5;
	        
	        System.out.print("Media = "+media);
        sc.close();
	}

}
