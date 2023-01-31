import java.util.Scanner;

public class CondicionaisDeEscolha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Uso estrutura switch-case 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entre com o dia da semana (1) Domingo ...(7) Sádado :");
		
		int x=sc.nextInt();
		String dia;
		
		switch(x) { 
		   case 1: dia="domingo"; 
		   break; 
		   case 2: dia="segunda"; 
		   break; 
		   case 3: dia="terça"; 
		   break; 
		   case 4: dia="quarta"; 
		   break; 
		   case 5: dia="quinta"; 
		   break; 
		   case 6: dia="sexta"; 
		   break; 
		   case 7: dia="sabado"; 
		   break; 
		   default: dia="Valor Inválido !!"; 
		   break;
		  }
		
		System.out.println("Dia da semana digitado = "+dia);
		
		sc.close();
	}

}
