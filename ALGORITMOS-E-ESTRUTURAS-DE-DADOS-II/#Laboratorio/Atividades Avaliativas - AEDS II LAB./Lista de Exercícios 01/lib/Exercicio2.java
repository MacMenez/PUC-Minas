import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(Random geradorDeNumeros) throws Exception{
        Scanner teclado = new Scanner(System.in);
        int numeroUsuario; // = 4
            boolean opcao = false;
            int vetorA2 [] = new int[10]; //{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int vetorB2 [] = new int[10];

            //Solicitar um número ao usuário
            do {
                System.out.print("Informe um número entre 1 e 5: ");
                numeroUsuario = teclado.nextInt();

                if (1 <= numeroUsuario && numeroUsuario <= 5) {
                    opcao = true;
                } else {
                    System.out.println("Opção Inválida! \nDigite outro número. \n");
                }
            }while (opcao == false);
        teclado.close();
        
        //Alterando Vetor A. Número aleatórios de 0 a 20
        for (int i = 0; i < vetorA2.length; i++) {
            vetorA2[i] = geradorDeNumeros.nextInt(21);
        }

        // Preenche o vetor B com os elementos do vetor A
        for (int i = 0; i < vetorA2.length; i++) {
            int index = (i + numeroUsuario) % 10; // Calcula o índice em que o elemento i deve ser colocado
            if (vetorB2[index] == 0) {
                vetorB2[index] = vetorA2[i]; // Se o índice estiver vazio, coloca o elemento i lá
            } else {
                // Caso contrário, procura a primeira posição vazia a partir do índice e insere o elemento i lá
                for (int j = index + 1; j != index; j = (j + 1) % 10) {
                    if (vetorB2[j] == 0) {
                        vetorB2[j] = vetorA2[i];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(vetorA2));
        System.out.println(Arrays.toString(vetorB2));
    }
}
