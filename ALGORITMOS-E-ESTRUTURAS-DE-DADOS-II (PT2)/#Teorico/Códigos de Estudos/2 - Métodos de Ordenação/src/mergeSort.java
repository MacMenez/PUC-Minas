public class mergeSort {
    public static void main(String[] args) throws Exception {
        System.out.println("Este é o código de ordenação MergeSort");

        // É necessário enviar um vetor que será ordenado
        int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Chamada do método MergeSort
        mergesort(vetor, 0, 6);
    }

    /**
     * Algoritmo de ordenação Mergesort.
     * 
     * @param int esq: início do array a ser ordenado
     * @param int dir: fim do array a ser ordenado
     */
    // 1.a chamada do método mergesort: esq: 0; dir: array.length - 1
    private static void mergesort(int[] array, int esq, int dir) {
        if (esq < dir) {
            int meio = (esq + dir) / 2;
            mergesort(array, esq, meio);
            mergesort(array, meio + 1, dir);
            intercalar(array, esq, meio, dir);
        }
    }

    /**
     * Algoritmo que intercala os elementos localizados entre as posições esq e dir
     * 
     * @param int esq: início do array a ser ordenado
     * @param int meio: posição do meio do array a ser ordenado
     * @param int dir: fim do array a ser ordenado
     */
    private static void intercalar(int[] array, int esq, int meio, int dir) {

        int n1, n2, i, j, k;

        // Definir tamanho dos dois subarrays
        n1 = meio - esq + 1;
        n2 = dir - meio;

        int[] a1 = new int[n1];
        int[] a2 = new int[n2];

        // Inicializar primeiro subarray
        for (i = 0; i < n1; i++) {
            a1[i] = array[esq + i];
        }

        // Inicializar segundo subarray
        for (j = 0; j < n2; j++) {
            a2[j] = array[meio + j + 1];
        }

        // Intercalação propriamente dita
        for (i = j = 0, k = esq; (i < n1 && j < n2); k++) {
            if (a1[i] <= a2[j])
                array[k] = a1[i++];
            else
                array[k] = a2[j++];
        }

        if (i == n1)
            for (; k <= dir; k++) {
                array[k] = a2[j++];
            }
        else
            for (; k <= dir; k++) {
                array[k] = a1[i++];
            }
    }
}