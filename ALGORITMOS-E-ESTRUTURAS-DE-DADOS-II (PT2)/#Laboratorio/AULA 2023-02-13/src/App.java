import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*int a = 10;
        System.out.println(a);

        char b = 'x';
        System.out.println(b);
        */

        String str = "Aula do dia 13/02/2023";
        System.out.println(str);
        System.out.println(str.charAt(0)); //Mostra o caractere na posição desejada.
        System.out.println(str.indexOf('o')); //Busca a posição do caractere.

        System.out.println(str.length());//Mostra a quantidade de caracteres.
        String str2 = "Aula do dia 13/02/2023 09:24";
        System.out.println(str2.length());//Mostra a quantidade de caracteres.
        
        //Mostrar a String escrita.
        for (int j = 0; j < args.length; j++) {
            System.out.println(str.charAt(j));   
        }

        str += " 09:24 ";
        System.out.println(str);

        //Pós-fixado
        /*a = 10;
        b = a++;
        System.out.println(a);
        System.out.println(b);*/
        
        
        //Pré-fixado
        /*a = 10;
        c = ++a;
        System.out.println(a);
        System.out.println(c);*/

        //Conversão automática
        double doub;
        int inteiro = 10;


        doub = inteiro;
        System.out.println(doub);

        //inteiro = doub;//Erro pois não pode converter. Usar o Casting (int) antes da variável.
        inteiro = (int)doub;
        System.out.println(inteiro);

        int var = 10, var1 = 5, var2 = 3;
        if (var > var1 && var1 > var2) {
            System.out.println("Verdadeiro!");
        }
        else{
            
        }

        if (var > var1) {
            if (var1 > var2) {
                System.out.println("Verdadeiro!");
            }
            else{
                System.out.println("Falso!");
            }
        }

        char opcao = 'x';

        switch (opcao) {
            case 'a':
                System.out.println("Mensagem A!");
            break;
            
            case 'b':
                System.out.println("Mensagem B!");
            break;

            default:
                System.out.println("mensagem X!");
            break;
        }

        //Ler valor do teclado
        Scanner teclado = new Scanner(System.in); //Classe Scanner.
        
        int valor;

        System.out.print("Digite um valor: ");
        //valor = teclado.nextInt();
        //System.out.println(valor);

        String valor2;

        System.out.print("Digite outro valor: ");
        //valor2 = teclado.nextLine();
        //System.out.println("Valor Digitado: " + valor2);

        MyIO.print("Mensagem de Teste!");

        int valorMyIo;

        MyIO.print("Digite um valor: ");
        valorMyIo = MyIO.readInt();
        MyIO.println(valorMyIo);

        MyIO.println("Valor Digitado: " + valorMyIo);

    }
}
