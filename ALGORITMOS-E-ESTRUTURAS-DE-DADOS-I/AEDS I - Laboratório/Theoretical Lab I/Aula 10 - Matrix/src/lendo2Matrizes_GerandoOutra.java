import java.util.Scanner;

public class lendo2Matrizes_GerandoOutra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exemplo 2:
		/*
			Faça um programa para ler duas matrizes A e B, ambas (2,3) e após a leitura, 
			calcule e mostre a matriz C = A + B.
		*/
		// Ler 2 matrizes A e B e calcular a matriz C=A+B
		Scanner sc=new Scanner(System.in);
			int a[][]; int b[][]; int c[][];
			a=new int[2][3]; b=new int[2][3]; c=new int[2][3];
			
			// Lendo a matriz a(2,3)
			int i=0,j=0;
			
			// Le a matriz a
			for (i=0;i<2;i++) {
				for (j=0;j<3;j++){ 
					System.out.printf("Entre com a[%d][%d]",i,j);
					a[i][j]=sc.nextInt();
				} 
			}
			
			
			// Le a matriz b
			for (i=0;i<2;i++) {
				for (j=0;j<3;j++){ 
					System.out.printf("Entre com b[%d][%d]",i,j);
					b[i][j]=sc.nextInt();
				} 
			}
			// Calcula e Mostra a matriz c(2,3)
			for (i=0;i<2;i++) {
				for (j=0;j<3;j++){ 
					c[i][j]=a[i][j]+b[i][j];
					System.out.printf("%nc[%d][%d]=%d",i,j,c[i][j]);
				} 
			}
		sc.close();
	}

}
