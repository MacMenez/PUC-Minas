import java.util.Arrays;
import java.util.Random;

public class Exercicio3 {

    public Exercicio3(Random geradorDeNumeros) {
        int linhaMatriz3 = 3; //geradorDeNumeros.nextInt(6);
        int colunaMatriz3 = 3; //geradorDeNumeros.nextInt(6);
        int [][] matriz3 = new int [linhaMatriz3][colunaMatriz3];

        System.out.println("Matriz Original");
        System.out.println("----------------");
        for (int linha = 0; linha < linhaMatriz3; linha++) {
            for (int coluna = 0; coluna < colunaMatriz3; coluna++) {
                matriz3[linha][coluna] = geradorDeNumeros.nextInt(21);
                System.out.print(matriz3[linha][coluna] + " ");
            }
            System.out.println("\n");
        }
        
        //System.out.println(Arrays.deepToString(matriz3));
        System.out.println("----------------");
        System.out.println("----------------");
        
        //Opção A
        System.out.println("Soma das Colunas");
        System.out.println(Arrays.toString(somaDeColuna(matriz3)));
        System.out.println("----------------");

        //Opção B
        System.out.println("Soma das Linhas");
        System.out.println(Arrays.toString(somaLinha(matriz3)));
        System.out.println("----------------");

        //Opção C
        System.out.println("Números Pares");
        System.out.println(Arrays.toString(numerosPares(matriz3)));
        System.out.println("----------------");

        //Opção D
        System.out.println("Soma Números Ímpares: " + somaImpares(matriz3));
        System.out.println("----------------");

        //Opção E
        System.out.println("Soma Diagonal Principal: " + somaDiagonalPrincipal(matriz3));
        System.out.println("----------------");
    }

    public static int somaDiagonalPrincipal(int[][] matriz3) {
        int comparar = matriz3.length; //Representa o número de linhas, pegando o ultimo valor de posição da linha
        int somaDiagonal = 0;
        
        if (comparar != matriz3[0].length) {
            return -1; //Matriz não é quadrada, pois n (total linhas) é diferente de coluna
        } else {
            for (int i = 0; i < matriz3.length; i++) {
                somaDiagonal += matriz3[i][i]; //Posições iguais serão somados os valores das posições
            }    
        }
        return somaDiagonal;
    }

    public static int somaImpares(int[][] matriz3) {
        int somaImpar = 0;

        for (int linha = 0; linha < matriz3.length; linha++) {
            for (int coluna = 0; coluna < matriz3.length; coluna++) {
                if (matriz3[linha][coluna] % 2 == 1) {
                    somaImpar += matriz3[linha][coluna];
                }
            }
        }
        return somaImpar;
    }

    public static int[] numerosPares(int[][] matriz3) {
        //Definindo parametros máximos que a matriz pode armazenar linha * coluna
        int linha = matriz3.length; //total que o vetor sera percorrido
        int coluna = matriz3[0].length; //define a posição de i iniciando em 0 e a coluna até o total
        int [] vetorNumerosPares = new int [linha * coluna]; //Total de elementos que o vetor terá
        int indicieReferencia = 0; //Ponto de referencia para se iniciar o vetorNumerosPares[]

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz3[i][j] % 2 == 0) {
                    vetorNumerosPares[indicieReferencia] = matriz3[i][j];
                    indicieReferencia++;
                }
            }
        }
        return vetorNumerosPares;
    }

    public static int[] somaLinha(int[][] matriz3) {
        //Iniciando matriz em 0(menor número) até o tamanho aleatório criado
        int [] vetorSomaLinha = new int[matriz3.length]; //Vetor para armazenar a soma de cada coluna

        for (int linha = 0; linha < matriz3.length; linha++) {

            int somaLinha = 0; //Somador da linha atual
            for (int coluna = 0; coluna < matriz3.length; coluna++) {
                somaLinha += matriz3[linha][coluna];
            }

            vetorSomaLinha[linha] = somaLinha; //Armazenar somas da coluna na posição inicial até acabar
        }
        return vetorSomaLinha;
    }

    public static int[] somaDeColuna(int[][] matriz3) {
        //Iniciando matriz em 0(menor número) até o tamanho aleatório criado
        int [] VetorSomaColuna = new int[matriz3[0].length]; //Vetor para armazenar a soma de cada coluna

        for (int coluna = 0; coluna < matriz3.length; coluna++) {

            int somaColuna = 0; //Somador da coluna atual
            for (int linha = 0; linha < matriz3.length; linha++) {
                somaColuna += matriz3[linha][coluna];
            }

            VetorSomaColuna[coluna] = somaColuna; //Armazenar somas da coluna na posição inicial até acabar
        }
        return VetorSomaColuna;
    }
}