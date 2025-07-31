
public class Q7_ATVD4 {
	
	static void fracao() {
		int x = 0, y = 0;
		
		for(int i = 0; i <= 15; i++) {
			if(i == 0) {
				x = 1;
				y = 1;
				System.out.printf("%d/%d + ", x, y);
			}
			
			if(i > 0 && i < 14) {
				x = x + 2;
				y = y + 1;
				System.out.printf("%d/%d + ", x, y);
			}
			
			if(i == 15) {
				x = x + 2;
				y = y + 1;
				System.out.printf("%d/%d", x, y);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Utilizando a estrutura de repetição, implemente um programa em Java que calcule e escreva a  
		//soma das 15 primeiras frações da série abaixo.
		//soma = (1/1 + 3/2 + 5/3 + 7/4 + ... )
		//Crie pelo menos um método dentro do seu programa.
		fracao();
	}

}
