import java.util.Scanner;

public class Q1_ATVD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Faça um programa para calcular e mostrar a área de um quadrado.
		Scanner sc = new Scanner(System.in);
		
        //Faça um programa para calcular e mostrar a área de um quadrado.
            double lado, area;
            System.out.print("Informe a altura ou largura do quadrado: \n");
            lado = sc.nextDouble();
            
            area = Math. pow(lado, 2);
            
            System.out.printf("A área do quadrado é: %.2f", area);
            
        sc.close();
	}

}
