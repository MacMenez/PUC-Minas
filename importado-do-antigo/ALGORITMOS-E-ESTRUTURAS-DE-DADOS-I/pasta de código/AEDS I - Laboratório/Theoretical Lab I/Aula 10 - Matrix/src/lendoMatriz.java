import java.util.Scanner;

public class lendoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		#	Exemplo 1	#
		
		/*
			Faça um programa para ler uma matriz A(2,3) e após a leitura mostre a matriz lida.
		*/
		Scanner sc=new Scanner(System.in);
			int a[][];
			a=new int[2][3];
			
			// Lendo a matriz a(2,3)
			int i=0,j=0;
			
			while (i<2){
				j=0;
				while (j<3){
					System.out.printf("Entre com a[%d][%d]",i,j);
					a[i][j]=sc.nextInt();
					
					j=j+1;
				}
				i=i+1;
			}
			
			// Mostra a matriz a(2,3)
			i=0;
			
			while (i<2){
				j=0;
				while (j<3){
					System.out.printf("%n a[%d][%d]=%d",i,j,a[i][j]);
					
					j=j+1;
				}
				i=i+1;
			}
		sc.close();
	}

}
