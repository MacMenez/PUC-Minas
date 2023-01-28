import java.util.Scanner;

public class repeatWithFlag_contadorDeNumeroDigitado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Repetição com o uso de “Flag”

        /*
            Quando não sabemos quantas vezes precisamos executar a estrutura de repetição,
            utilizamos do Flag como forma de encerrá-la. 
            
            O Flag pode ser feito com um determinado teste condicional dentro do while (Flag) {...}
            ou pode simplesmente ser uma entrada de dados (uma pergunta) que pode levar ao
            encerramento da mesma.
        */

        //Faça um programa para ler uma série de números positivos e ao término informe quantos números foram lidos.
        // Uso do Flag
        Scanner sc=new Scanner(System.in);
            int cn = 0;
            // Contador de números digitados
            int n = 0;
            while (n >= 0) {// Flag = número ser positivo
                System.out.printf("Entre com um numero inteiro e positivo: ");
                n = sc.nextInt();
                if (n >= 0){
                    cn = cn + 1; 
                }
            }
            System.out.print("Quantidade de números digitados = "+cn);
        sc.close();
	}

}
