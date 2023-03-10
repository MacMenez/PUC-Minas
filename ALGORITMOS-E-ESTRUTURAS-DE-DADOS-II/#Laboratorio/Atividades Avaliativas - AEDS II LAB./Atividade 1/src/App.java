import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random geradorDeNumeros = new Random(20); //Sorteio de número entre 0 e 20.
        int linha = 3, coluna = 3;
        //Exercício 4
        Exercicio4 alterandoMatriz = new Exercicio4(linha, coluna); // cria uma matriz 3x2

        boolean ehQuadrada = alterandoMatriz.ehQuadrada(); // verifica se a matriz é quadrada
        int[] somaColunas = alterandoMatriz.somaColunas(); // calcula a soma de cada coluna
        int[] somaLinhas = alterandoMatriz.somaLinhas(); // calcula a soma de cada linha
        int somaImpares = alterandoMatriz.somaImpares(); // calcula a soma de todos os elementos ímpares
        int determinante = alterandoMatriz.determinante(); // calcula o determinante (se a matriz for 3x3)

        System.out.println("A matriz é quadrada? " + ehQuadrada);
        System.out.println("A soma de cada coluna é: " + Arrays.toString(somaColunas));
        System.out.println("A soma de cada linha é: " + Arrays.toString(somaLinhas));
        System.out.println("A soma dos elementos ímpares é: " + somaImpares);
        System.out.println("O determinante é: " + determinante);
    }
}
