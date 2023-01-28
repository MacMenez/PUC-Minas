import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Estruturas Condicionais  
		Scanner sc=new Scanner(System.in); 
		
		int ar,lma,lme,al,op; 
		
		System.out.println("Qual a opção de area ? Quadrado = 1  /  Retangulo =2 : "); 
		op = sc.nextInt(); 
		
		if (op == 1) { 
			System.out.println("Entre com a aresta lateral do quadrado: ");
			
			al = sc.nextInt();
			ar = al * al;
			
			System.out.printf("Area do quadrado = %d",ar); 
		}
		
		if (op == 2) {
			
			System.out.println("Entre com lado maior do retangulo: ");
			lma=sc.nextInt();
			
			System.out.println("Entre com lado menor do retangulo: ");
			lme=sc.nextInt();
			
			ar=lma*lme;
			
			System.out.printf ("Area = %d",ar);  
		} 
		
		sc.close();
	}

}