import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random geradorDeNumeros = new Random(20);

        //Questão 1

        int vetorA [] = new int[10];

        for (int i = 0; i < 9; i++) {
            vetorA[i] = geradorDeNumeros.nextInt(21);
        }

        int vetorB [] = new int [10];

        for (int i = 0; i < 9; i++) {
            if (i != 0) {
                vetorB[i] = vetorA[i - 1];
            }
            else{
                vetorB[i] = vetorA[vetorA.length - 1];
            }
        }
        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));

        //Questão 2
        Scanner teclado = new Scanner(System.in);
            int x;

            boolean opcao = false;
            while (opcao == false) {
                System.out.print("Informe um valor entre 1 e 5: ");
                x = teclado.nextInt();

                if (1 <= x && x <= 5) {
                    opcao = true;
                } else {
                    System.out.println("Opção Inválida! \nDigite outro número. \n");
                }
            }

            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = geradorDeNumeros.nextInt(21);
            }

            for (int i = 0; i < vetorB.length; i++) {
                vetorB[i + x] = vetorA[i];
            }
        teclado.close();
    }
}
