import java.util.Scanner;

public class Q1_ATVD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa para calcular e mostrar a área de triangulo retângulo.
			Scanner sc = new Scanner(System.in);
        
            double b, h, area;
            
            System.out.print("Informe o valor da base do triangulo retângulo: \n");
            b = sc.nextDouble();
            
            System.out.print("Informe o valor da altura do triangulo retângulo: \n");
            h = sc.nextDouble();
            
            area = (b*h)/2;
            
            System.out.printf("A área do triangulo retângulo é: %.2f", area);
            
            sc.close();
	}

}
