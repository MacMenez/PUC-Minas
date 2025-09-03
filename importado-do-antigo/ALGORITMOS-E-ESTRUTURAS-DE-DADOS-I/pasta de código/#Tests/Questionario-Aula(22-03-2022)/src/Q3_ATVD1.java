import java.util.Scanner; 

public class Q3_ATVD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Usar a estrutura WHILE
		//Ler as notas de 10 alunos, calcular e imprimir a média da turma.
		Scanner sc=new Scanner(System.in);
		
	     int soma=0, media=0; 
	     int x=1, n=0;
	     
	     while (x <= 10) {    
	          System.out.printf("Entre o valor do %d numero: ",x); 
	          n = sc.nextInt();
	          
	          soma = soma+n;
	          
	          x=x+1;
	     }
	     
	     media = soma / 10; 
	     
	     System.out.print("Media = "+media); 
	
	     sc.close();
	}

}

