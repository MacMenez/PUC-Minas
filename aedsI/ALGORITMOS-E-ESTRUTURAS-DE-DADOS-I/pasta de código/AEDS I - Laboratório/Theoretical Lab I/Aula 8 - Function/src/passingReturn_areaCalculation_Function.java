import java.util.Scanner;

public class passingReturn_areaCalculation_Function {
	static double retangulo(double ma,double me){ 
		double ar;
		
		ar=ma*me;
		
		return ar; 
	}
	
	static double triangulo(double b1, double h1){ 
		double ar;
		ar=(b1*h1)/2;
		return ar; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	#	Exemplo 3	#
		// - Faça um programa para calcular a área de um retângulo ou a área de triângulo retângulo.
		
		// Método com passagem de parâmetro e com retorno
		Scanner sc=new Scanner(System.in);
			double area,lma,lme,base,altura;
			int op;
			
			System.out.println("Área de quem ? Retangulo=1 Triangulo Retangulo=2 ");
			op=sc.nextInt();
			
			if (op==1){
				System.out.println("Entre com o lado maior e com o lado menor: ");
				lma=sc.nextDouble();
				lme=sc.nextDouble();
				
				area=retangulo(lma,lme);
				
				System.out.printf("Area do retangulo = %.2f %n",area);
			}
			if (op==2){
				System.out.println("Entre com a base e a altura: ");
				base=sc.nextDouble();
				altura=sc.nextDouble();
				
				area=triangulo(base,altura);
				
				System.out.printf("Area do Triangulo = %.2f %n",area);
			}
		sc.close();
	}

}
