public class OrdenacaoParcial {
    int[] array;

    public int[] getArray() { return array; }

    public void setArray(int[] array) { this.array = array; }

    public OrdenacaoParcial(int[] array) { this.array = array; }

    public void imprimirVetor(int[] array){
        // Exibe o vetor
        System.out.print("Elementos do vetor: ");
        for (int valor : array) { System.out.print(valor + " "); }
    }

    private static void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

    public static void selectionSort(int k, int[] array) {
        for (int i = 0; i < k; i++) {
            int menor = i;
            for (int j = (i + 1); j < n; j++) {
                if (array[menor] > array[j]) { menor = j; }
            }
            swap(menor, i);
        }
    }

    public static void insertionSort(int k, int[] array) {
        for (int i = 1; i < n; i++) {
            int tmp = array[i];
            int j = (i < k) ? i - 1 : k - 1;
            while ((j >= 0) && (array[j] > tmp)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
    }

    public static void quickSort() { quickSort(0, n - 1); }

    /**
     * Algoritmo de ordenacao Quicksort.
     * 
     * @param int esq inicio do array a ser ordenado
     * @param int dir fim do array a ser ordenado
     */
    private void quickSort(int esq, int dir) {
        int i = esq, j = dir, pivo = array[(esq + dir) / 2];
        while (i <= j) {
            while (array[i] < pivo)
                i++;
            while (array[j] > pivo)
                j--;
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (esq < j){ quickSort(esq, j); }
        if (i < k && i < dir){ quickSort(i, dir); }
    }

    public void heapSort() {
        // Alterar o vetor ignorando a posicao zero
        int[] tmp = new int[n + 1];
        for (int i = 0; i < n; i++) { tmp[i + 1] = array[i]; }
        array = tmp;

        // Contrucao do heap
        for (int tamHeap = 2; tamHeap <= n; tamHeap++) { construir(tamHeap); }

        // Ordenacao propriamente dita
        int tamHeap = n;
        while (tamHeap > 1) {
            swap(1, tamHeap--);
            reconstruir(tamHeap);
        }

        // Alterar o vetor para voltar a posicao zero
        tmp = array;
        array = new int[n];
        for (int i = 0; i < n; i++) { array[i] = tmp[i + 1]; }
    }

    private static void construir(int tamHeap) {
        for (int i = tamHeap; i > 1 && array[i] > array[i / 2]; i /= 2) { swap(i, i / 2); }
    }

    private void reconstruir(int tamHeap) {
        int i = 1;
        while (i <= (tamHeap / 2)) {
            int filho = getMaiorFilho(i, tamHeap);
            if (array[i] < array[filho]) {
                swap(i, filho);
                i = filho;
            } else { i = tamHeap; }
        }
    }

    private int getMaiorFilho(int i, int tamHeap) {
        int filho;
        if (2 * i == tamHeap || array[2 * i] > array[2 * i + 1]) { filho = 2 * i; } 
        else { filho = 2 * i + 1; }
        return filho;
    }
}