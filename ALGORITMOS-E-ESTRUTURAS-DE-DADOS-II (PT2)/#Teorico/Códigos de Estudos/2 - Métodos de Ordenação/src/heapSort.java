public class heapSort {
    public static void main(String[] args) throws Exception {
        System.out.println("Este é o código de ordenação HeapSort");

        // É necessário enviar um vetor que será ordenado
        int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Chamada do método HeapSort
        heapSort(vetor, 6);
    }

    static void heapSort(int[] array, int n) {

        // Criando outro vetor, com todos os elementos do vetor anterior reposicionados
        // (uma posição a frente)
        // de forma a ignorar a posição zero
        int[] tmp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            tmp[i + 1] = array[i];
        }

        // Contrução do heap
        for (int tamHeap = 2; tamHeap <= n; tamHeap++) {
            constroi(tmp, tamHeap);
        }

        // Ordenação propriamente dita
        int tamHeap = n;
        while (tamHeap > 1) {
            troca(tmp, 1, tamHeap--);
            reconstroi(tmp, tamHeap);
        }

        // Alterar o vetor para voltar à posição zero
        for (int i = 0; i < n; i++) {
            array[i] = tmp[i + 1];
        }
    }

    static void constroi(int[] array, int tamHeap) {

        for (int i = tamHeap; i > 1 && array[i] > array[i / 2]; i /= 2) {
            troca(array, i, i / 2);
        }
    }

    static void reconstroi(int[] array, int tamHeap) {

        int i = 1;

        while (i <= (tamHeap / 2)) {
            int filho = getMaiorFilho(array, i, tamHeap);
            if (array[i] < array[filho]) {
                troca(array, i, filho);
                i = filho;
            } else {
                i = tamHeap;
            }
        }
    }

    static int getMaiorFilho(int[] array, int i, int tamHeap) {

        int filho;

        if (2 * i == tamHeap || array[2 * i] > array[2 * i + 1]) {
            filho = 2 * i;
        } else {
            filho = 2 * i + 1;
        }
        return filho;
    }

    static void troca(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}