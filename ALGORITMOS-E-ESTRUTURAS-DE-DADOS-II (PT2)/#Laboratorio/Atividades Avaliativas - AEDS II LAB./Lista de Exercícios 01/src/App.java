import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random geradorDeNumeros = new Random(20); //Sorteio de número entre 0 e 20.
        
        //Exercício 1: vetorCircular
        int vetorA1 [] = new int[10];
        for (int i = 0; i < vetorA1.length; i++) {
            //Número aleatório vai de 0 até um número menor que 21, logo 20.
            vetorA1[i] = geradorDeNumeros.nextInt(21); 
        }
        int vetorB1 [] = new int [10];
        for (int i = 0; i < vetorB1.length; i++) {
            //Índice do vetor A para identificar as posições do Vetor A.
            int indiceA = (i + vetorA1.length - 1) % vetorA1.length;
            vetorB1[i] = vetorA1[indiceA];
        }
        System.out.println(Arrays.toString(vetorA1));
        System.out.println(Arrays.toString(vetorB1));

        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

        //Exercício 2: vetorCircular com Posição Definida
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

        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

        //Exercício 3: Gerando Matrizes
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

        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

        //Exercício 4: Classes Com Matriz
        
        classeMatriz matrizParametro = new classeMatriz(geradorDeNumeros.nextInt(4), geradorDeNumeros.nextInt(4));
        matrizParametro.imprimirMatriz();

        
        /*
            Individualmente este exercício funcionou, quando acicionei a classe JAVA ao final do código,
            quando testei apresentou erro. 

            Não sei se n seu teste terá erros também, caso consiga resolver, me informe para corrigir por favor.
        */
        System.out.println("A matriz é quadrada? : " + matrizParametro.matrizQuadrada());
        
        int [] vetor4 = matrizParametro.somaDeColuna();
        System.out.println("Soma dos elementos de cada coluna: " + Arrays.toString(vetor4));

        vetor4 = matrizParametro.somaDeLinha();
        System.out.println("Soma dos elementos de cada linha: " + Arrays.toString(vetor4));

        System.out.println("Soma de todos os elementos ímpares da matriz: " + matrizParametro.somaImpares());
        
        System.out.println("Determinante: " + matrizParametro.determinante());

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

class classeMatriz {
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


    //Soma Coluna
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
