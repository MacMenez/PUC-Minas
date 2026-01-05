import java.util.Scanner;

public class matrziTransposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		#	Exemplo 3	#
		//Faça um programa para ler uma matriz A(2,3) e após gerar a matriz B(3,2), transposta de A.
		// Matriz Transposta
		Scanner sc=new Scanner(System.in);
			int a[][]; int b[][];
			a=new int[2][3]; b=new int[3][2];
			
			// Lendo a matriz a(2,3)
			for (int i=0;i<2;i++) {
				for (int j=0;j<3;j++){ 
					System.out.printf("Entre com a[%d][%d]",i,j);
					a[i][j]=sc.nextInt();
				} 
			}
			
			// Mostra a matriz a(2,3)
			System.out.printf ("%n Matriz A %n");
			for (int i=0;i<2;i++) {
				for (int j=0;j<3;j++){ 
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%n"); 
			}
			
			// Cria a matriz B(3,2) transposta de A(2,3)
			for (int i=0;i<3;i++) {
				for (int j=0;j<2;j++){ 
					b[i][j]=a[j][i]; 
				}
			}
			
			// Mostra a matriz B(3,2)
			System.out.printf ("%n Matriz B %n");
			for (int i=0;i<3;i++) {
				for (int j=0;j<2;j++){ 
					System.out.printf("%d ",b[i][j]);
				}
				System.out.printf("%n");
			}
		sc.close();
	}

}
