import java.util.Arrays;
import java.util.Random;

public class Exercicio1 {

    public Exercicio1(Random geradorDeNumeros) {
        int vetorA [] = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            //Número aleatório vai de 0 até um número menor que 21, logo 20.
            vetorA[i] = geradorDeNumeros.nextInt(21); 
        }

        int vetorB [] = new int [10];
        
        for (int i = 0; i < vetorB.length; i++) {
            //Índice do vetor A para identificar as posições do Vetor A.
            int indiceA = (i + vetorA.length - 1) % vetorA.length;
            /*
                O índice correspondente no vetor vetorA é obtido por meio da expressão (i + vetorA.length - 1) % vetorA.length
                Então calcula-se:

                Soma o índice i atual ao tamanho do vetor vetorA (vetorA.length) e subtrai 1. 
                Isso garante que o primeiro elemento de vetorA seja o último elemento de vetorB.
                
                Calcula o resto da divisão da expressão pelo tamanho do vetor vetorA. 
                Assim garantir que o índice obtido esteja dentro dos limites do vetor vetorA. 
                Por exemplo, se o valor de i for 9 e o tamanho de vetorA for 10, 
                a expressão (i + vetorA.length - 1) % vetorA.length resultará em 8, que é o índice correto 
                do último elemento do vetor vetorA.
            */
            vetorB[i] = vetorA[indiceA];
        }

        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
    }

}
