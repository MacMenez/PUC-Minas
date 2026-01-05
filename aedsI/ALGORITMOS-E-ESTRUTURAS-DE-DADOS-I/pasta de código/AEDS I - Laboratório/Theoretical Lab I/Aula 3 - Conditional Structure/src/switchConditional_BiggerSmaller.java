import java.util.Scanner;

public class switchConditional_BiggerSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			// #    Exemplo 2   #
	        /*
	            - Faça um programa que leia dois números inteiros quaisquer e ao final indique o valor do maior e do menor.
	            - Caso sejam iguais, mostre os dois e dê a mensagem que são iguais.
	            - Utilize o comando switch-case para informar os resultados. 
	        */
	
	        // Ler 2 numeros e indicar o maior e o menor com s-case
			
	        int x, y, a = 0, maior, menor;
	        String R = "Iguais !!!";
	        
	        System.out.print("Entre com o primeiro numero :");
	        x = sc.nextInt();
	        
	        System.out.print("Entre com o segundo numero :");
	        y = sc.nextInt();
	        
	        if (x>y){
	            a=1;
	        }
	        if (y>x){
	            a=2;
	        }
	        if (x==y){
	            a=3;
	        }
	        
	        switch(a) {
	            case 1: 
	                maior=x; 
	                menor=y;
	            break;
	
	            case 2: 
	                maior=y; 
	                menor=x;
	            break;
	
	            default: 
	                maior=x;
	                menor=y;
	            break; 
	        }
	
	        if (x!=y){
	            System.out.printf ("Maior = %d %nMenor = %d ",maior,menor);
	        }
	        else{
	            System.out.println("Resultado = " + R);
	        }
		sc.close();        
	}

}
