import java.util.Scanner;

public class passingNoReturn_areaCalculations_Method {
	static void retangulo(double lma, double lme){
        double area;
        area = lma*lme;
        System.out.printf("Area do retangulo = %.2f",area);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  #   Exemplo 2   #
	        //- Faça um programa para calcular a área de um retângulo;
	        // Método Retângulo com passagem de parâmetros sem retorno
	        Scanner sc = new Scanner(System.in);
	            double l1,l2;
	            System.out.print("Entre com o lado maior do retangulo: ");
	            l1 = sc.nextDouble();
	            System.out.print("Entre com o lado menor do retangulo: ");
	            l2 = sc.nextDouble();
	            retangulo(l1,l2);
	        sc.close();
	}

}
