import java.util.Scanner;

public class switchConditional_WeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sintaxe do switch-case
        /*
            switch ( expressão ) {
                case valor1:
                    comando1
                    comando2
                break;
                
                case valor2:
                    comando3
                    comando4
                break;

                default:
                    comando5
                    comando6
                break; 
            } 
        */
     
        Scanner sc=new Scanner(System.in);
            // #    Exemplo 1   #
            /*
                Faça um programa que leia um número inteiro no intervalo de (1 a 7) onde:
                - (1) representa domingo, 
                - (2) segunda e assim por diante até (7) que é o sábado. 
                - Para qualquer número fora do intervalo, diga dia inválido.
            */
            System.out.print("Entre com o dia da semana (1) Domingo ...(7) Sádado: ");
            
            int x = sc.nextInt();
            String dia;
            
            switch(x) {
            case 1: dia="Domingo";
            break;
            case 2: dia="Segunda";
            break;
            case 3: dia="Terça";
            break;
            case 4: dia="Quarta";
            break;
            case 5: dia="Quinta";
            break;
            case 6: dia="Sexta";
            break;
            case 7: dia="Sábado";
            break;
            default: dia="Valor Inválido !!";
            break; }
            System.out.println("Dia da semana digitado = " + dia);
        sc.close();
	}

}
