import java.util.Random;

public class Matriz {
    private int[][] matriz;
    private int linhas;
    private int colunas;
    
    // Construtor da classe Matriz
    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        matriz = new int[linhas][colunas];
        Random random = new Random();
        
        // Loop para inicializar a matriz aleatoriamente
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
    }
    
    // Método para verificar se a matriz é quadrada
    public boolean ehQuadrada() {
        return linhas == colunas;
    }
    
    // Método para calcular a soma de cada coluna da matriz
    public int[] somaColunas() {
        int[] soma = new int[colunas];
        
        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                soma[j] += matriz[i][j];
            }
        }
        
        return soma;
    }
    
    // Restante do código aqui...
    public int[] somaLinhas() {
        int[] soma = new int[linhas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma[i] += matriz[i][j];
            }
        }
        return soma;
    }
    
    public int somaImpares() {
        int soma = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] % 2 != 0) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }
    
    public int determinante() {
        if (linhas == 3 && colunas == 3) {
            return matriz[0][0] * matriz[1][1] * matriz[2][2] + matriz[0][1] * matriz[1][2] * matriz[2][0]
                + matriz[0][2] * matriz[1][0] * matriz[2][1] - matriz[0][2] * matriz[1][1] * matriz[2][0]
                - matriz[0][1] * matriz[1][0] * matriz[2][2] - matriz[0][0] * matriz[1][2] * matriz[2][1];
        } else {
            return -1;
        }
    }
    
}
