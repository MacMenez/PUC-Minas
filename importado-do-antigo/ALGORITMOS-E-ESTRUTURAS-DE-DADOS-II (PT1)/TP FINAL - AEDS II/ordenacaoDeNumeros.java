import java.util.Random;
import java.util.Arrays;

public class ordenacaoDeNumeros {
    private static int tamHeap;
    private static int[] vetorHeapSort;
    public static void main(String[] args) {
        //Obtendo Vetor de X unidades numéricas tipo inteiro
        Long tempoInicial_vetor_random = System.currentTimeMillis();
            int tamanhoVetor = 1000000; //1.000.000
            int [] vetorNumeroAleatorio = vetorRandom(tamanhoVetor);
        Long tempoFinal_vetor_random = System.currentTimeMillis();
        
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.printf("Vetor Aleatório Original - Tempo total em Segundos: %.5f segundos \n", (tempoFinal_vetor_random - tempoInicial_vetor_random)/1000.0);
        //System.out.println(Arrays.toString(vetorNumeroAleatorio));
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("\n\n");
        
        //Bubblesort
        Long tempoInicial_bubble = System.currentTimeMillis();
            int [] vetorBubbleSort = ordenarBubbleSort(vetorNumeroAleatorio);
        Long tempoFinal_bubble = System.currentTimeMillis();

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.printf("Vetor Bubblesort - Tempo total em Segundos: %.5f segundos \n", (tempoFinal_bubble - tempoInicial_bubble)/1000.0);
        //.out.println(Arrays.toString(vetorBubbleSort));
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("\n\n");

        //Selectionsort
        Long tempoInicial_selection = System.currentTimeMillis();
            int [] vetorSelectionSort = ordenarSelectionSort(vetorNumeroAleatorio);
        Long tempoFinal_selection = System.currentTimeMillis();

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.printf("Vetor SelectionSort - Tempo total em Segundos: %.5f segundos \n", (tempoFinal_selection - tempoInicial_selection)/1000.0);
        //System.out.println(Arrays.toString(vetorSelectionSort));
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("\n\n");

        //InsertionSort
        Long tempoInicial_insetion = System.currentTimeMillis();
            int [] vetorInsertionSort = ordenarInsertionSort(vetorNumeroAleatorio);
        Long tempoFinal_insetion = System.currentTimeMillis();

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.printf("Vetor InsertionSort - Tempo total em Segundos: %.5f segundos \n", (tempoFinal_insetion - tempoInicial_insetion)/1000.0);
        //System.out.println(Arrays.toString(vetorInsertionSort));
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("\n\n");

        //Heapsort
        Long tempoInicial_heap = System.currentTimeMillis();
            int [] vetorHeapSort = ordenarHeapSort(vetorNumeroAleatorio);
        Long tempoFinal_heap = System.currentTimeMillis();

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.printf("Vetor HeapSort - Tempo total em Segundos: %.5f segundos \n", (tempoFinal_heap - tempoInicial_heap)/1000.0);
        //System.out.println(Arrays.toString(vetorHeapSort));
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("\n\n");
        
        //Mergesort
        Long tempoInicial_merge = System.currentTimeMillis();
            int [] vetorMerge = ordenarMergeSort(vetorNumeroAleatorio, vetorNumeroAleatorio.length);
        Long tempoFinal_merge = System.currentTimeMillis();

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.printf("Vetor MergeSort - Tempo total em Segundos: %.5f segundos \n", (tempoFinal_merge - tempoInicial_merge)/1000.0);
        //System.out.println(Arrays.toString(vetorMerge));
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("\n\n");

        //Quicksort
        Long tempoInicial_quick = System.currentTimeMillis();
            int [] vetorQuickSort = ordenarQuickSort(vetorNumeroAleatorio, 0, vetorNumeroAleatorio.length-1);
        Long tempoFinal_quick = System.currentTimeMillis();

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.printf("Vetor Quicksort - Tempo total em Segundos: %.5f segundos \n", (tempoFinal_quick - tempoInicial_quick)/1000.0);
        //System.out.println(Arrays.toString(vetorQuickSort));
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("\n\n");

        //Counting sort
    }

    public static int [] vetorRandom(int tamanhoVetor) {
        int [] vetorNumeroAleatorio;
        vetorNumeroAleatorio = new  int [tamanhoVetor];

        Random numeroAleatorio = new Random();

        for (int i = 0; i < vetorNumeroAleatorio.length; i++) {
            vetorNumeroAleatorio[i] = numeroAleatorio.nextInt();
        }
        return vetorNumeroAleatorio;
    }
    //-----------------------------------------------------------------------------------------
    public static int [] ordenarBubbleSort(int[] vetorNumeroAleatorio) {
        int [] vetorBubbleSort = vetorNumeroAleatorio;
        int aux;
        for(int i = 0; i < vetorBubbleSort.length-1; i++){
            for(int j = i + 1; j < vetorBubbleSort.length; j++){
                if(vetorBubbleSort[i] > vetorBubbleSort[j]){
                    aux = vetorBubbleSort[i];
                    vetorBubbleSort[i] = vetorBubbleSort[j];
                    vetorBubbleSort[j] = aux;
                }
            }
        }
        return vetorBubbleSort;
    }
    //-----------------------------------------------------------------------------------------
    private static int[] ordenarInsertionSort(int[] vetorNumeroAleatorio) {
        int vetorInsertionSort [] = vetorNumeroAleatorio;
        int aux;
        int j;
        for(int i = 1; i < vetorInsertionSort.length; i++){
            aux = vetorInsertionSort[i];
            
            for(j = i - 1; j >= 0 && aux < vetorInsertionSort[j]; j--){
                vetorInsertionSort[j+1] = vetorInsertionSort[j];
            }
            
            vetorInsertionSort[j+1] = aux;
        }
        return vetorInsertionSort;
    }
    //-----------------------------------------------------------------------------------------
    private static int[] ordenarSelectionSort(int[] vetorNumeroAleatorio) {
        int[] vetorSelectionSort = vetorNumeroAleatorio;
        int aux;
        for(int i = 0; i < vetorSelectionSort.length-1; i++){
            int maior = i;
            int j;
            for(j = i + 1; j < vetorSelectionSort.length; j++){
                if(vetorSelectionSort[maior] > vetorSelectionSort[j]){
                    maior = j;
                }
            }
            if(i != maior){
                aux = vetorSelectionSort[i];
                vetorSelectionSort[i] = vetorSelectionSort[maior];
                vetorSelectionSort[maior] = aux;
            }
        }
        return vetorSelectionSort;
    }
    //-----------------------------------------------------------------------------------------
    public static int[] ordenarHeapSort(int[] vetorNumeroAleatorio) {
        vetorHeapSort = vetorNumeroAleatorio;
        tamHeap = vetorHeapSort.length - 1;
        
        
        constroiHeap();
        

        for (int i = tamHeap; i > 0; i--) {
            trocaDoHeap(0, tamHeap);      // Troca a posição
            tamHeap -= 1;           // Diminui 'tam' para não alterar a posição do maior valor nas próximas iterações
            maxHeapifica(0);    // Como existe um valor menor no topo, é necessário heapificar novamente a árvore inteira
        }
        return vetorHeapSort;
    }

    private static void constroiHeap() {
        int meio = (int) (tamHeap/2);
        
        for (int i = meio - 1; i >= 0; i--) {
            maxHeapifica(i);
        }
    }

    private static void trocaDoHeap(int i, int j) {
        int aux;

        aux = vetorHeapSort[i];
        vetorHeapSort[i] = vetorHeapSort[j];
        vetorHeapSort[j] = aux;
    }

    private static void maxHeapifica(int pai) {
        int maior = pai, esquerda = 2 * pai + 1, direita = 2 * pai + 2;
        
        if (esquerda <= tamHeap && vetorHeapSort[esquerda] > vetorHeapSort[maior])
            maior = esquerda;
        
        if (direita <= tamHeap && vetorHeapSort[direita] > vetorHeapSort[maior])
            maior = direita;
        
        if (maior != pai) {
            trocaDoHeap(pai, maior);      // Faz a troca de posições
            maxHeapifica(maior);    // Continua heapificando com o valor que foi trocado
        }
    }
    //-----------------------------------------------------------------------------------------
    private static int[] ordenarMergeSort(int[] vetorMergeSort, int tamanho) {
        int elementos = 1;
        
        int inicio, meio, fim;
        
        /* Percorre os elementos do vetor até chegar no fim do vetor. */
        while(elementos < tamanho) {
          /* Aponta o inicio do vetor. */
          inicio = 0;
          
          while(inicio + elementos < tamanho) {
            /* Guarda a posição do meio do vetor que será ordenado. */
            meio = inicio + elementos;
            /* Guarda a posição final do vetor que será ordenado. */
            fim = inicio + 2 * elementos;
            
            if(fim > tamanho)
              fim = tamanho;
            
            intercala(vetorMergeSort, inicio, meio, fim);
            
            /* Faz o inicio do vetor ser igual ao fim. */
            inicio = fim;
          }
          
          /* Percorre o vetor dobrando a quantidade de itens ja ordenados. */
          elementos = elementos * 2;
        }
        return vetorMergeSort;
    }

    private static void intercala(int[] vetorMergeSort, int inicio, int meio, int fim) {
        int novoVetorMergeSort[] = new int[fim - inicio];
        
        int i = inicio;
        int m = meio;
        int pos = 0;
        
        while(i < meio && m < fim) {
            if(vetorMergeSort[i] <= vetorMergeSort[m]) {
                novoVetorMergeSort[pos] = vetorMergeSort[i];
                pos = pos + 1;
                i = i + 1;
          
            } else {
                novoVetorMergeSort[pos] = vetorMergeSort[m];
                pos = pos + 1;
                m = m + 1;
            }
        }
        
        while(i < meio) {
            novoVetorMergeSort[pos] = vetorMergeSort[i];
          pos = pos + 1;
          i = i + 1;
        }
        
        while(m < fim) {
            novoVetorMergeSort[pos] = vetorMergeSort[m];
          pos = pos + 1;
          m = m + 1;
        }
        
        // Coloca no vetor os valores já ordenados.
        for(pos = 0, i = inicio; i < fim; i++, pos++) {
            vetorMergeSort[i] = novoVetorMergeSort[pos];
        }
    }
    //-----------------------------------------------------------------------------------------
    private static int [] ordenarQuickSort(int[] vetorNumeroAleatorio, int inicio, int fim) {
        if(fim > inicio) {
            //Chamada da rotina que ira dividir o vetor em 3 partes.
            int indexPivo = dividirQuickSort(vetorNumeroAleatorio, inicio, fim);
            /* Chamada recursiva para redivisao do vetor de elementos menores que o pivô. */
            ordenarQuickSort(vetorNumeroAleatorio, inicio, indexPivo - 1);
            /* Chamada recursiva para redivisao do vetor de elementos maiores que o pivô. */
            ordenarQuickSort(vetorNumeroAleatorio, indexPivo + 1, fim);
        }
        return vetorNumeroAleatorio;
    }

    private static int dividirQuickSort(int[] vetorNumeroAleatorio, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetorNumeroAleatorio[inicio];
    
        while(pontEsq <= pontDir) {
            while(pontEsq <= pontDir && vetorNumeroAleatorio[pontEsq] <= pivo) {
                pontEsq++;
            }

            while(pontDir >= pontEsq && vetorNumeroAleatorio[pontDir] > pivo) {
                pontDir--;
            }

            if(pontEsq < pontDir) {
                trocarQuickSort(vetorNumeroAleatorio, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }
    
        trocarQuickSort(vetorNumeroAleatorio, inicio, pontDir);
        return pontDir;
    }

    private static void trocarQuickSort(int[] vetorNumeroAleatorio, int i, int j) {
        int temp = vetorNumeroAleatorio[i];
        vetorNumeroAleatorio[i] = vetorNumeroAleatorio[j];
        vetorNumeroAleatorio[j] = temp;
    }
}