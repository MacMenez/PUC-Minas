/**
 * Algoritmo de ordenacao Quicksort
 * @author Max do Val Machado
 * @version 3 08/2020
 * 
 * Neste cenário a estratégia do pivo será feita utilizando o úĺtimo elemento elemento
 */
class Quicksort2 extends Geracao{

	/**
	 * Construtor.
	 */
   public Quicksort2(){ super(); }


	/**
	 * Construtor.
	 * @param int tamanho do array de numeros inteiros.
	 */
   public Quicksort2(int tamanho){ super(tamanho); }


	/**
	 * Algoritmo de ordenacao Quicksort.
	 */
   @Override
   public void sort() { quicksort(0, n-1); }

	/**
	 * Algoritmo de ordenacao Quicksort.
    * @param int esq inicio do array a ser ordenado
    * @param int dir fim do array a ser ordenado
	 */
    private void quicksort(int esq, int dir) {
        int i = esq, j = dir;
        int pivo = array[dir];
        while (i <= j) {
            while (array[i] < pivo) i++;
            while (array[j] > pivo) j--;
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (esq < j)  quicksort(esq, j);
        if (i < dir)  quicksort(i, dir);
    }
}
