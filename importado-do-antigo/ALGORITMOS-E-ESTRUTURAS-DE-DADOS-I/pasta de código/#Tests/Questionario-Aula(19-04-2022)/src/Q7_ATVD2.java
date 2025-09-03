import java.util.Scanner;

public class Q7_ATVD2 {
	
	static void preco() {
		Scanner sc = new Scanner(System.in);
			int i = 0;
			float valor = 0, pMaior = 0, pMenor = 0, totV = 0, media = 0;
			
			while(i < 7) {
				System.out.printf("Digite o preço identificado: R$");
				valor = sc.nextFloat();
				i = i + 1;
				
				totV = totV + valor;
				
				if(i == 1) {
					pMaior = valor;
					pMenor = valor;
				}
				
				if(valor > pMaior){
					pMaior = valor;
				}
				
				if(valor < pMenor) {
					pMenor = valor;
				}
			}
			
			media = totV / 7;
			
			System.out.printf("\n O maior preço identificado foi de R$%.2f",pMaior);
			System.out.printf("\n O menor preço identificado foi de R$%.2f",pMenor);
			System.out.printf("\n A média de preço identificada foi de R$%.2f",media);
		sc.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preco();
	}

}
