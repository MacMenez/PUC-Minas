import java.util.Scanner;

public class noPassingReturn_areaCalculation_Function {
	static double retangulo(){
		Scanner sc=new Scanner(System.in);
		
		double lma,lme,area;
		
		System.out.println ("Entre com o lado maior do retangulo: ");
		lma=sc.nextDouble();
		
		System.out.println("Entre com o lado menor do retangulo: ");
		lme=sc.nextDouble();
		
		area=lma*lme;
		
		return area;
	}
	static double triangulo(){
		Scanner sc=new Scanner(System.in);
		
		double base,altura,area;
		
		System.out.println ("Entre com o valor da base do retangulo: ");
		base=sc.nextDouble();
		
		System.out.println("Entre com o valor da altura do retangulo: ");
		altura=sc.nextDouble();
		
		area=(base*altura)/2;
		
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		#	Exemplo 3	#
		//- Faça um programa para calcular a área de um retângulo ou a área de triângulo retângulo.
		// Método sem passagem de parâmetro e com retorno
		Scanner sc=new Scanner(System.in);
		
		double ret,trian;
		int op;
		
		System.out.println ("Opção de área ? Retangulo=1 / Triangulo Retangulo=2 ");
		op=sc.nextInt();
		
		if ((op==1)||(op==2)){
			if (op==1){
				ret=retangulo();
				System.out.printf("Area do retangulo = %.2f %n",ret);
			}
			
			if (op==2){
				trian=triangulo();
				System.out.printf ("Area do triangulo retangulo = %.2f %n",trian);
			}
		}
		sc.close();
	}

}
