import java.util.Scanner;

public class noPassingNoReturn_physicsCalculations_Method {
	static void mdist(){ 
        double vel,dist,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a velocidade e com o tempo: ");
        vel = sc.nextDouble();
        temp = sc.nextDouble();
        System.out.printf("%nDistancia = %.2f",vel*temp);
    }

    static void mvel(){ 
        double vel,dist,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a distancia e com o tempo: ");
        dist = sc.nextDouble();
        temp = sc.nextDouble();
        System.out.printf("%nVelocidade = %.2f",dist/temp);
    }

    static void mtemp(){ 
        double vel,dist,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a distancia e com a velocidade: ");
        dist = sc.nextDouble();
        vel = sc.nextDouble();
        System.out.printf("%nTempo = %.2f",dist/vel);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  #   Exemplo 3   #
        //- Faça um programa que permita calcular a distância, velocidade ou o tempo de um móvel.
        // Metodos para calcular distancia, velocidade ou tempo, sem passagem de parâmetros e sem retorno
        Scanner sc = new Scanner(System.in);
	        int op;
	        System.out.print("Opção? dist=1/veloc=2/tempo=3 ");
	        op = sc.nextInt();
	        if (op == 1){
	            mdist();
	        }
	        if (op == 2){
	            mvel();
	        }
	        if (op == 3){
	            mtemp();
	        }
        sc.close();
	}

}
