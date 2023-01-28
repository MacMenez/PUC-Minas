/*
    OBSERVAÇÕES: 
    1 - HeapSort - apresentando erro, segui o código do professor. Em teste isolado, ele apresentou o vetor em forma decrescente
    não soube o porque. Neste programa ele deu erro com variáveis que não consegui resolver.

    2 - QuickSort - apesar de usar o código do professor Diego e da porfessora Marta, em testes isolados o da porfessora Marta
    não funcionou e  o do professor Diego, ordenava os vetores mas no estilo "número sim/número não"

    3 - A questão 5 tem como resposta os IF utilizados no final do main.

    4 - Ao usar números muito grandes, o programa da erro de quantidade me memória e não é executado
*/

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        //Calcular Tempo de Execução
        Long gerar_dados_tempoInicial = System.currentTimeMillis();
            //Função que gere 1 milhão de dados
            int tamanhoVetor = 1000000; //1.000.000
            double [] vetorNumeroAleatorio = vetorRandom(tamanhoVetor);
        Long gerar_dados_tempoFinal = System.currentTimeMillis();

        System.out.println(Arrays.toString(vetorNumeroAleatorio));
        System.out.printf("Vetor Aleatório - Tempo total em Segundos: %.5f segundos \n\n", (gerar_dados_tempoFinal - gerar_dados_tempoInicial)/1000.0);

        vetorNumeroAleatorio = vetorRandom(tamanhoVetor);
        Long quickSort_tempoInicial = System.currentTimeMillis();
            //Parametro do vetorNumeroAleatorio para fazer QuickSort
            int esq = 0, dir = vetorNumeroAleatorio.length-1;
            
            //Ordenação do vetor com QuickSort           
            ordenarQuickSort(vetorNumeroAleatorio, esq, dir);
        Long quickSort_tempoFinal = System.currentTimeMillis();

        System.out.println(Arrays.toString(vetorNumeroAleatorio));
        System.out.printf("QuickSort - Tempo total em Segundos: %.5f segundos \n\n", (quickSort_tempoFinal - quickSort_tempoInicial)/1000.0);

        vetorNumeroAleatorio = vetorRandom(tamanhoVetor);
        Long heapSort_tempoInicial = System.currentTimeMillis();            
            //Ordenação do vetor com HeapSort
            ordenarHeapSort(vetorNumeroAleatorio, vetorNumeroAleatorio.length-1);
        Long heapSort_tempoFinal = System.currentTimeMillis();

        System.out.println(Arrays.toString(vetorNumeroAleatorio)); 
        System.out.printf("HeapSort - Tempo total em Segundos: %.5f segundos \n\n", (heapSort_tempoFinal - heapSort_tempoInicial)/1000.0);
        
        //Comparativo de Algoritmos de Ordenações
        vetorNumeroAleatorio = vetorRandom(tamanhoVetor);
        Long tempoComparacao_inicioQuickSort = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                System.out.printf("Total de Execuções do QuickSort: %d \n", i);
                ordenarQuickSort(vetorNumeroAleatorio, esq, dir);
            }
        Long tempoComparacao_fimQuickSort = System.currentTimeMillis();
 
        System.out.println(Arrays.toString(vetorNumeroAleatorio));
        double tempoQuick;
        System.out.printf("Tempo total em Segundos: %.5f segundos \n\n", tempoQuick = ((tempoComparacao_fimQuickSort - tempoComparacao_inicioQuickSort)/1000.0));

        vetorNumeroAleatorio = vetorRandom(tamanhoVetor);
        Long tempoComparacao_inicioHeapSort = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                System.out.printf("Total de Execuções do HeapSort: %d \n", i);
                ordenarHeapSort(vetorNumeroAleatorio, vetorNumeroAleatorio.length-1);
            }
        Long tempoComparacao_fimHeapSort = System.currentTimeMillis();

        System.out.println(Arrays.toString(vetorNumeroAleatorio));
        double tempoHeap;
        System.out.printf("Tempo total em Segundos: %.5f segundos \n", tempoHeap = ((tempoComparacao_fimHeapSort - tempoComparacao_inicioHeapSort)/1000.0));

        if (tempoQuick > tempoHeap) {
            System.out.println("O método QuickSort realizou o procedimento em menor tempo, mostrando - se o melhor método.");
            System.out.printf("\nTempo QuickSort: %d", tempoQuick);
            System.out.printf("\nTempo HeapSort: %d", tempoHeap);
        }
        if (tempoQuick < tempoHeap) {
            System.out.println("O método HeapSort realizou o procedimento em menor tempo, mostrando - se o melhor método.");
            System.out.printf("\nTempo HeapSort: %d", tempoHeap);
            System.out.printf("\nTempo QuickSort: %d", tempoQuick);
        }
    }

    public static double [] vetorRandom(int tamanhoVetor) {
        double [] vetorNumeroAleatorio;
        vetorNumeroAleatorio = new  double [tamanhoVetor];

        Random numeroAleatorio = new Random();

        for (int i = 0; i < vetorNumeroAleatorio.length; i++) {
            vetorNumeroAleatorio[i] = numeroAleatorio.nextDouble();
        }
        return vetorNumeroAleatorio;
    }

    public static double [] ordenarQuickSort (double[] vetorNumeroAleatorio, int esquerda, int direita) {
        int esq = esquerda, dir = direita;
        double pivo = vetorNumeroAleatorio[(esq+dir)/2];
        double swap;

        while (esq <= dir) {
            while (vetorNumeroAleatorio[esq] < pivo){
                esq++;
            }
                
            while (vetorNumeroAleatorio[dir] > pivo){
                dir--;
            }
            
            if (esq <= dir){
                swap = vetorNumeroAleatorio[esq];
                vetorNumeroAleatorio[esq] = vetorNumeroAleatorio[dir];
                vetorNumeroAleatorio[dir] = swap;
                esq++;
                dir--; 
            }
        }
        if (dir > esquerda)
            ordenarQuickSort(vetorNumeroAleatorio, esquerda, dir);
        if (esq < direita)
            ordenarQuickSort(vetorNumeroAleatorio, esquerda, dir);
        
        return vetorNumeroAleatorio;
    }
    
    public static double ordenarHeapSort (double vetorNumeroAleatorio[], int n) {
        int i = n / 2, pai, filho;
        double t;
        
        while (true) {
            if (i > 0 ) {
                i--;
                t = vetorNumeroAleatorio[i];
            } else {
                n--;
                if (n <= 0)
                    t = vetorNumeroAleatorio[n];
                    vetorNumeroAleatorio[n] = vetorNumeroAleatorio[0];
            }

            pai = i;
            filho = (i * 2) + 1;

            while (filho < n) {
                if ((filho + 1 < n) && (vetorNumeroAleatorio[filho + 1] > vetorNumeroAleatorio[filho])) {
                    filho++;
                    if (vetorNumeroAleatorio[filho] > t) {
                        vetorNumeroAleatorio[pai] = vetorNumeroAleatorio[filho];
                        pai = filho;
                        filho = (pai * 2) + 1;
                    }
                } else {
                    break;
                }
            }
            return vetorNumeroAleatorio[pai] = t;
        }
    }
}