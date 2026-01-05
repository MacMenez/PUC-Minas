import java.util.Scanner;

public class noPassingNoReturn_parImpar_Method {
	// o tipo void abaixo, não retorna nenhum valor para o programa principal e o nome da função é parimpar
    static void parimpar(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Digite um numero: ");
        n = sc.nextInt();
        if (n%2 == 0){
            System.out.printf("%nO numero %d e par !",n);
        }
        else{
            System.out.printf("%nO numero %d e impar !",n);
        }
    }
    // Abaixo o corpo do programa principal
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	        - Este tipo de método não recebe e nem devolve nenhuma informação para quem o chamou. 
	        - Basicamente é um módulo autônomo dentro do programa;
	    */
	
	    //  #   Exemplo 1   #
	    //- Faça um programa para analisar se um número é impar ou par.
	
	    // Método sem passagem de parâmetro e sem retorno, apenas chama a função
	    parimpar();
	}

}
