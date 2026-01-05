import java.util.Scanner;

public class Q7_ATVD5 {
	
	static void somatorio(int N) {
		int x = 2, S = 0;
		
		if (N == 0) {
			System.out.printf("%d ", N);
			System.out.printf("Somatório de %d é S = %d", N, N);
		}
		
		else if(N%2 == 0) {
			while(x <= N) {
				S = S + x;
				System.out.printf("%d ", x);
				x = x + 2;
			}
			System.out.printf("\nSomatório de %d é S = %d", N, S);
		}
		
		if(N%2 != 0) {		
			while(x <= N) {
				S = S + x;
				System.out.printf("%d ", x);
				x = x + 2;				
			}
			System.out.printf("%d ", N);
			System.out.printf("\nSomatório de %d é S = %d", N, S);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implemente um método para calcular 
		//o somatório de todos números pares de 2 a N (onde N deve ser fornecido pelo usuário).
		//A função deve receber como parâmetro de entrada o valor de N e mostrar o resultado do somatório.
		//S = (2 + 4 + 6 + ... + N)
		Scanner sc = new Scanner(System.in);
			int N;
			System.out.print("Informe um número: ");
				N = sc.nextInt();
				somatorio(N);
			sc.close();
	}

}
