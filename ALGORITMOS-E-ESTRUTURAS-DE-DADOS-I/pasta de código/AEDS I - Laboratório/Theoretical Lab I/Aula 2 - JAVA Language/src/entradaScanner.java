import java.util.Scanner;

public class entradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  #ENTRADA DE DADOS#
		    Scanner sc = new Scanner(System.in);// Habilita o teclado
		        String nome, sobrenome;
		        
		        System.out.print("Entre com o seu primeiro nome: ");
		        nome = sc.next();
	
		        System.out.print("Entre com o seu sobrenome: ");
		        sobrenome = sc.next();
	
		        //  #SAÍDA DE DADOS#
		            System.out.print("\n");
		            System.out.print("Nome: " + nome);
		            System.out.print("\nSobrenome: " + sobrenome);
		    sc.close();//Desabilita teclado
	}

}
