import java.util.Random;

/**
 * Algoritmo de ordenacao Quicksort
 * @author Max do Val Machado
 * @version 3 08/2020
 * 
 * Neste cenário a estratégia do pivo será feita utilizando elemento aleatórios
 */
class Quicksort3 extends Geracao{

	/**
	 * Construtor.
	 */
   public Quicksort3(){ super(); }


	/**
	 * Construtor.
	 * @param int tamanho do array de numeros inteiros.
	 */
   public Quicksort3(int tamanho){ super(tamanho); }


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
        Random random = new Random();
        int valor = (int)random.nextInt((dir - esq) + 1) + esq;
        System.out.println("Valor Sorteado: " + valor);
        int i = esq, j = dir;
        int pivo = array[valor];
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
