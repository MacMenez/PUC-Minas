import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Random geradorDeNumeros = new Random(20); //Sorteio de número entre 0 e 20.
        int m, n;
        
        //Questão 1
        Exercicio1 vetoresAleatorios = new Exercicio1(geradorDeNumeros);
        System.out.println(vetoresAleatorios);
        //Questão 2
        Exercicio2 vetorCircular = new Exercicio2();

        //Questão 3
        Exercicio3 manipulacaoMatriz = new Exercicio3(geradorDeNumeros);
        
        //Questão 4
        Exercicio4 alterandoMatriz = new Exercicio4(n, m);

    }

    
}
/*
    //Exercício 4: Classes Com Matriz
        
        classeMatriz matrizParametro = new classeMatriz(geradorDeNumeros.nextInt(4), geradorDeNumeros.nextInt(4));
        matrizParametro.imprimirMatriz();

        System.out.println("A matriz é quadrada? : " + matrizParametro.matrizQuadrada());
        
        int [] vetor4 = matrizParametro.somaDeColuna();
        System.out.println("Soma dos elementos de cada coluna: " + Arrays.toString(vetor4));

        vetor4 = matrizParametro.somaDeLinha();
        System.out.println("Soma dos elementos de cada linha: " + Arrays.toString(vetor4));

        System.out.println("Soma de todos os elementos ímpares da matriz: " + matrizParametro.somaImpares());
        
        System.out.println("Determinante: " + matrizParametro.determinante());
*/