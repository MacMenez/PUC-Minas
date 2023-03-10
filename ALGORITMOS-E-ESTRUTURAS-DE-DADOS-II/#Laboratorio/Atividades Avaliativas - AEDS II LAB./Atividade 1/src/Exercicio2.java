import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

    public int[] Exercicio2(Random geradorDeNumeros) {
        Scanner teclado = new Scanner(System.in);
            int x;
            boolean opcao = false;
            //int vetorA [] = new int[10];
            //int vetorB [] = new int[10];

            //Solicitar um número ao usuário
            do {
                System.out.print("Informe um número entre 1 e 5: ");
                x = teclado.nextInt();

                if (1 <= x && x <= 5) {
                    opcao = true;
                } else {
                    System.out.println("Opção Inválida! \nDigite outro número. \n");
                }
            }while (opcao == false);

            //Alterando Vetor A. Número aleatórios de 0 a 20
            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = geradorDeNumeros.nextInt(21);
            }

            alterarVetorB(vetorA, vetorB, x);
        teclado.close();

        return vetorA;
    }

    public int[] alterarVetorB(int[] vetorA, int[] vetorB, int x) {
        // Preenche o vetor B com os elementos do vetor A
        for (int i = 0; i < vetorA.length; i++) {
            int index = (i + x) % 10; // Calcula o índice em que o elemento i deve ser colocado
            if (vetorB[index] == 0) {
                vetorB[index] = vetorA[i]; // Se o índice estiver vazio, coloca o elemento i lá
            } else {
                // Caso contrário, procura a primeira posição vazia a partir do índice e insere o elemento i lá
                for (int j = index + 1; j != index; j = (j + 1) % 10) {
                    if (vetorB[j] == 0) {
                        vetorB[j] = vetorA[i];
                        break;
                    }
                }
            }
        }
        return vetorB;
    }
}
