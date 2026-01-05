import java.util.Scanner;

public class passingReturn_physicsCalculations_Function {
	static double mvel(double d1, double t1){
		double v1;
		
		v1=d1/t1;
		
		return v1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			O quarto tipo de método é representado por aqueles que recebem valor 
			no momento em que são chamados (parâmetros) e retornam valor para quem os chamou (retorno).
		*/
	
		//		#	Exemplo 1	#
		// - Faça um programa para calcular a velocidade de um móvel, onde velocidade = distancia / tempo.
		// Método com passagem de parâmetro e com retorno
		Scanner sc=new Scanner(System.in);
			double vel,dist,temp;
			
			System.out.print("Entre com o valor da distancia: ");
			dist=sc.nextDouble();
			
			System.out.print("Entre com o valor do tempo: ");
			temp=sc.nextDouble();
			
			vel=mvel(dist,temp);
			
			System.out.printf("Velocidade = %.2f %n",vel);
		sc.close();
	}

}
