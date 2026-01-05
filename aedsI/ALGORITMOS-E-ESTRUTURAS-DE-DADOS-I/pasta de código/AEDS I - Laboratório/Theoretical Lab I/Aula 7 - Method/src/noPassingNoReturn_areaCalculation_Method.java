import java.util.Scanner;

public class noPassingNoReturn_areaCalculation_Method {
	static void retangulo(){
        Scanner sc=new Scanner(System.in);
        double lma,lme,area;

        System.out.print("Entre com o lado maior do retangulo: ");
        lma = sc.nextDouble();
        System.out.print("Entre com o lado menor do retangulo: ");
        lme = sc.nextDouble();
        area = lma * lme;
        System.out.printf("Area do retangulo = %.2f",area);
        sc.close();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	#	Exemplo 2	#
		// Faça um programa para calcular a área de um retângulo;
		
		// Calculo da área do retângulo sem passagem de parâmetro e sem retorno, apenas chama a função
        retangulo();
	}

}
