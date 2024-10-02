/**
 * Algoritmo de ordenacao Quicksort
 * 
 * @author Max do Val Machado
 * @version 3 08/2020
 */
class QuickParcial extends Geracao {

    /**
     * Construtor.
     */
    public QuickParcial() {
        super();
    }

    /**
     * Construtor.
     * 
     * @param int tamanho do array de numeros inteiros.
     */
    public QuickParcial(int tamanho) {
        super(tamanho);
    }

    /**
     * Algoritmo de ordenacao Quicksort.
     */
    @Override
    public void sort() {
        quicksort(0, n - 1, ((n-1)*0,1)); // Pegar 10%
    }

    /**
     * Algoritmo de ordenacao Quicksort.
     * 
     * @param int esq inicio do array a ser ordenado
     * @param int dir fim do array a ser ordenado
     */
    void quicksort(int esq, int dir, int k) {
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
        if (esq < j){ quicksort(esq, j, k); }
        if (i < k && i < dir){ quicksort(i, dir, k); }
    }
}
