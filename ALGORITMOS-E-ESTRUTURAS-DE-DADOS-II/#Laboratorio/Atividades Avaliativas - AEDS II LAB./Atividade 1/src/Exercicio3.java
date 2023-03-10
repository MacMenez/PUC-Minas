import java.util.Arrays;
import java.util.Random;

public class Exercicio3 {

    public Exercicio3(Random geradorDeNumeros) {
        int n = 5; //geradorDeNumeros.nextInt(6);
        int m = 5; //geradorDeNumeros.nextInt(6);
        int [][] matriz = new int [n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = geradorDeNumeros.nextInt(21);
            }
        }

        System.out.println(Arrays.toString(matriz));

        //Opção A
        System.out.println(Arrays.toString(somaDeColuna(matriz)));

        //Opção B
        System.out.println(Arrays.toString(somaLinha(matriz)));

        //Opção C
        System.out.println(Arrays.toString(numerosPares(matriz)));

        //Opção D
        System.out.println(somaImpares(matriz));

        //Opção E
        System.out.println(somaDiagonalPrincipal(matriz));
    }

    public static int somaDiagonalPrincipal(int[][] matriz) {
        int comparar = matriz.length; //Representa o número de linhas, pegando o ultimo valor de posição da linha
        int somaDiagonal = 0;
        
        if (comparar != matriz[0].length) {
            return -1; //Matriz não é quadrada, pois n (total linhas) é diferente de coluna
        } else {
            for (int i = 0; i < matriz.length; i++) {
                somaDiagonal += matriz[i][i]; //Posições iguais serão somados os valores das posições
            }    
        }
        return somaDiagonal;
    }

    public static int somaImpares(int[][] matriz) {
        int somaImpar = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                somaImpar += matriz[coluna][linha];
            }
        }
        return somaImpar;
    }

    public static int[] numerosPares(int[][] matriz) {
        //Definindo parametros máximos que a matriz pode armazenar linha * coluna
        int linha = matriz.length; //total que o vetor sera percorrido
        int coluna = matriz[0].length; //define a posição de i iniciando em 0 e a coluna até o total
        int [] vetorNumerosPares = new int [linha * coluna]; //Total de elementos que o vetor terá
        int indicieReferencia = 0; //Ponto de referencia para se iniciar o vetorNumerosPares[]

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] % 2 == 0) {
                    vetorNumerosPares[indicieReferencia] = matriz[i][j];
                    indicieReferencia++;
                }
            }
        }
        return vetorNumerosPares;
    }

    public static int[] somaLinha(int[][] matriz) {
        //Iniciando matriz em 0(menor número) até o tamanho aleatório criado
        int [] vetorSomaLinha = new int[matriz[0].length]; //Vetor para armazenar a soma de cada coluna

        for (int linha = 0; linha < matriz.length; linha++) {

            int somaLinha = 0; //Somador da linha atual
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                somaLinha += matriz[linha][coluna];
            }

            vetorSomaLinha[linha] = somaLinha; //Armazenar somas da coluna na posição inicial até acabar
        }
        return vetorSomaLinha;
    }

    public static int[] somaDeColuna(int[][] matriz) {
        //Iniciando matriz em 0(menor número) até o tamanho aleatório criado
        int [] VetorSomaColuna = new int[matriz[0].length]; //Vetor para armazenar a soma de cada coluna

        for (int coluna = 0; coluna < matriz.length; coluna++) {

            int somaColuna = 0; //Somador da coluna atual
            for (int linha = 0; linha < matriz.length; linha++) {
                somaColuna += matriz[coluna][linha];
            }

            VetorSomaColuna[coluna] = somaColuna; //Armazenar somas da coluna na posição inicial até acabar
        }
        return VetorSomaColuna;
    }
}
