import java.util.Scanner;

public class armazenarNumerosInteiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		#	Exemplo 1	#
		/*
			Faça um programa para ler e armazenar em um vetor, uma série de 5 números inteiros.
			Após a leitura da série, mostre todos os números que foram lidos.
		*/
		// Vetores - Exemplo 1
		Scanner sc=new Scanner(System.in);
			int a[];
			a=new int[5];
			// Lendo os dados do Vetor
			int i=0;
			
			while (i<5){
				System.out.printf("Entre com o a[%d] = ",i);
				a[i]=sc.nextInt();
				
				i=i+1;
			}
			
			// Mostra os dados do Vetor
			i=0;
			while (i<5){
				System.out.printf("%n a[%d] = %d ",i,a[i]);
				
				i=i+1;
			}
		sc.close();
	}

}
