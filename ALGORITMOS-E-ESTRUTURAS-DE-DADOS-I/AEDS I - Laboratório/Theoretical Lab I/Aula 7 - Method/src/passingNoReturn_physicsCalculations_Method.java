import java.util.Scanner;

public class passingNoReturn_physicsCalculations_Method {
	static void mdist(double v1, double t1){ 
        System.out.printf("%n Distancia = %.2f",v1*t1); 
    }

    static void mvel(double d1, double t1){ 
        System.out.printf("%n Velocidade = %.2f",d1/t1); 
    }

    static void mtemp(double d1, double v1){ 
        System.out.printf("%n Tempo = %.2f",d1/v1); 
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  #   Exemplo 3   #
        //- Faça um programa que permita calcular a distância, velocidade ou o tempo de um móvel.
        Scanner sc=new Scanner(System.in);
        int op;
        double vel,dist,temp;
        System.out.print("Opção? dist=1/veloc=2/tempo=3 ");
        op = sc.nextInt();
        if (op == 1){
            System.out.println("Entre com a velocidade e com o tempo: ");
            vel=sc.nextDouble();
            temp=sc.nextDouble();
            mdist(vel,temp);
        }
        if (op==2){
            System.out.println("Entre com a distancia e com o tempo: ");
            dist=sc.nextDouble();
            temp=sc.nextDouble();
            mvel(dist,temp);
        }
        if (op==3){
            System.out.println("Entre com a distancia e com a velocidade: ");
            dist=sc.nextDouble();
            vel=sc.nextDouble();
            mtemp(dist,vel);
        }
	}

}
