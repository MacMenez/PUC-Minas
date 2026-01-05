import java.util.Scanner;

public class forStructure_informandoNumerosLidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  #   Exemplo 2   #
	        /*
	            Faça um programa para ler uma série de 5 números e ao término informe a soma dos
	            números lidos.
	        */
	        // Uso do For - exemplo 2
	        Scanner sc=new Scanner(System.in);
		        int n = 0, soma = 0;
		        for (int i = 1; i <= 5; i++){
		            System.out.printf("Entre com um numero: ");
		            n = sc.nextInt();
		            soma = soma + n;
		        }
		        System.out.println("Soma = "+soma);
	        sc.close();
	}

}
