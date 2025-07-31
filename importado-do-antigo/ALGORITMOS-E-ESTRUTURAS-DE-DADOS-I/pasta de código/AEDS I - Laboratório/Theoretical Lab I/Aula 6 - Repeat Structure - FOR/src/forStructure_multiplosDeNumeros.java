import java.util.Scanner;

public class forStructure_multiplosDeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  #   Exemplo 3   #
	        //Faça um programa para ler um número e após mostre os 7 primeiros múltiplos deste número.
	        // Uso do For - exemplo 3
	        Scanner sc = new Scanner(System.in);
		        int n = 0, res = 0;
		        System.out.printf("Entre com um numero: ");
		        n = sc.nextInt();
		        for (int mult=1; mult<=7; mult++){
		            res = mult * n;
		            System.out.printf("Multiplo %d = %d %n",mult,res);
		        }
	        sc.close();
	}

}
