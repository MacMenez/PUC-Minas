import java.util.Scanner;

public class noPassingReturn_physicsCalculations_Function {
	static double mvel(){
		Scanner sc=new Scanner(System.in);
		
		double v1,d1,t1;
		
		System.out.print("Entre com o valor da distancia: ");
		d1=sc.nextDouble();
		
		System.out.print("Entre com o valor do tempo: ");
		t1=sc.nextDouble();
		
		v1=d1/t1;
		
		return v1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			O terceiro tipo de método é representado por aqueles que não recebem valor 
			no momento em que são chamados (parâmetros) e retornam valor para quem os chamou (retorno).
		*/
		
		//		#	Exemplo 1	#
		//- Faça um programa para calcular a velocidade de um móvel, onde velocidade = distancia / tempo.
		
		// Método sem passagem de parâmetro e com retorno
		double vel;
		
		vel=mvel();
		
		System.out.printf ("Velocidade = %.2f %n",vel);
	}

}
