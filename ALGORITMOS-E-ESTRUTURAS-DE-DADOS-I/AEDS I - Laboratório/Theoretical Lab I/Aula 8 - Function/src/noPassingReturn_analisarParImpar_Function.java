import java.util.Scanner;

public class noPassingReturn_analisarParImpar_Function {
	static int parimpar(){
	Scanner sc=new Scanner(System.in);
		int n,r1;
		
		System.out.print("Entre com o numero: ");
		
		n=sc.nextInt();
		
		if (n%2==0)
			r1=1;
		else
			r1=2;
		
		return r1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		#	Exemplo 2	#
		// - Faça um programa para analisar se um número é impar ou par.
		
		// Método sem passagem de parâmetro e com retorno
		int r;
		
		r=parimpar();
		
		if (r==1)
			System.out.println("Numero par !");
		else
			System.out.println("Numero impar !");
	}

}