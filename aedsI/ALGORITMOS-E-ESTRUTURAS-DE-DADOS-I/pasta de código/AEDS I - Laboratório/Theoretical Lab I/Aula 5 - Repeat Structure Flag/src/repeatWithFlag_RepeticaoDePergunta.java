import java.util.Scanner;

public class repeatWithFlag_RepeticaoDePergunta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Flag utilizando perguntas
        Scanner sc=new Scanner(System.in);
        int cn = 0;
        // Contador de números digitados
        int n = 0,r = 1; // O Flag é a variavel r deixar de valer 1
        while (r==1) {// Flag = enquanto resposta = 1
            System.out.printf("Entre com um numero inteiro e positivo: ");
            n = sc.nextInt();
            
            if (n>0){
                cn = cn + 1;
            }
            System.out.printf("Mais números? (Sim = 1 / Não = 2): ");
            r = sc.nextInt();
        }
        System.out.print("Quantidade de números digitados = "+cn);
        sc.close();
	}

}
