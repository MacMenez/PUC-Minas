import java.util.Random;

public class classeMatriz {
    private int[][] matriz;
    private int n, m;

    // Construtor da classe Matriz
    public classeMatriz(int n, int m) {
        // Verifica se n e m estão dentro dos limites permitidos
        if (n <= 3 && m <= 3) {
            this.n = n;
            this.m = m;
            // Cria a matriz com valores aleatórios
            Random geradorDeNumeros = new Random();
            matriz = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matriz[i][j] = geradorDeNumeros.nextInt(21);
                }
            }
        } else {
            System.out.println("Os valores de n e m devem ser menores ou iguais a 3.");
            this.n = -1;
            this.m = -1;
        }
    }

    
    
    
    

    // Método para calcular o determinante da matriz (apenas para matriz 3x3)
    public int determinante() {
        if (n == 3 && m == 3) {
            int det = matriz[0][0] * matriz[1][1] * matriz[2][2]
                    + matriz[0][1] * matriz[1][2] * matriz[2][0]
                    + matriz[0][2] * matriz[1][0] * matriz[2][1]
                    - matriz[0][2] * matriz[1][1] * matriz[2][0]
                    - matriz[0][0] * matriz[1][2] * matriz[2][1]
                    - matriz[0][1] * matriz[1][0] * matriz[2][2];
            return det;
        } else {
            System.out.println("A matriz não é 3x3.");
            return -1;
        }
    }

    

    public int somaImpares() {
        int somaImpar = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (matriz[linha][coluna] % 2 == 1) {
                    somaImpar += matriz[linha][coluna];
                }
            }
        }
        return somaImpar;
    }

    
    //Soma Linha
    public int[] somaDeLinha() {
        int[] somaLinha = new int[this.n];
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                somaLinha[i] += this.matriz[i][j];
            }
        }
        return somaLinha;
    }


    //Soma COluna
    public int[] somaDeColuna() {
        //Iniciando matriz em 0(menor número) até o tamanho aleatório criado
        int [] VetorSomaColuna = new int[matriz[0].length]; //Vetor para armazenar a soma de cada coluna

        for (int coluna = 0; coluna < matriz.length; coluna++) {

            int somaColuna = 0; //Somador da coluna atual
            for (int linha = 0; linha < matriz.length; linha++) {
                somaColuna += matriz[linha][coluna];
            }

            VetorSomaColuna[coluna] = somaColuna; //Armazenar somas da coluna na posição inicial até acabar
        }
        return VetorSomaColuna;
    }

    //Matriz Quadrada
    public boolean matrizQuadrada() {
        return this.n == this.m;
    }
    
    // Método para imprimir a matriz
    public void imprimirMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
