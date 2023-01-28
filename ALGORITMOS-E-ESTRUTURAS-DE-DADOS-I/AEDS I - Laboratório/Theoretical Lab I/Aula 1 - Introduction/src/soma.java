import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
	        int X, Y, Z, resultado;
	
	        System.out.print ("Digite o primeiro número: ");
	        X = entrada.nextInt();
	
	        System.out.print ("Digite o segundo número: ");
	        Y = entrada.nextInt();
	
	        System.out.print ("Digite o terceiro número: ");
	        Z = entrada.nextInt();
	
	        resultado = X + Y + Z;
	        
	        System.out.println ("A soma deles é " + resultado);
        entrada.close();
	}

}
