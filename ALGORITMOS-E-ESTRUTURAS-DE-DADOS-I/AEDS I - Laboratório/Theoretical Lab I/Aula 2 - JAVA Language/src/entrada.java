import java.util.Scanner;

public class entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
			//# ENTRADA DE DADOS#
	        int A, B, C;
	
	        A = sc.nextInt(); //Na linguagem Java, o leia será escrito pelo comando scanner 
	        B = sc.nextInt(); //Na linguagem Java, o leia será escrito pelo comando scanner 
	
	        //# SAÍDA DE DADOS#
	        C = A + B;
	
	        System.out.printf ("Soma = %d", C); //Na linguagem Java, o escreva será escrito pelo comando System.out.printf();
        sc.close();
	}

}
