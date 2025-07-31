import java.util.Scanner;

public class Q8_A1 {
	
	static float leitura() {
		Scanner sc = new Scanner(System.in);
			int i = 1;
			float num, valor = 0;
			
			while (i <= 5) {
				System.out.print("Digite um n�mero: ");
				num = sc.nextFloat();
				
				valor = valor + num;
				i++;
			}
		sc.close();
			return valor;
	}
	
	static float mediaNum(float valor) {
		float media;
		
		media = valor / 5;
		
		return media;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Utilizando pelo menos um método com retorno, 
		//faça um programa que leia 5 números e mostre a média entre eles.
			float valor, media;
			
			valor = leitura();
			
			media = mediaNum(valor);
			
			System.out.printf("O valor da média deste números é %.2f", media);
		
	}

}
