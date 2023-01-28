import java.util.Scanner;

public class passingReturn_parImpar_Function {
	static int parimpar(int n1){
		int r1;
		
		if (n1%2 == 0)
			r1=1;
		else
			r1=2;
		return r1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	#	Exemplo 2	#
		// - Faça um programa para analisar se um número é impar ou par.
		
		// Método com passagem de parâmetro e com retorno
		Scanner sc=new Scanner(System.in);
			
			int n,r;
			
			System.out.println("Entre com o numero: ");
			n=sc.nextInt();
			
			r = parimpar(n);
			
			if (r==1)
				System.out.printf("O numero %d é par !",n);
			else
				System.out.printf("O numero %d é impar !",n);
		sc.close();
	}

}
