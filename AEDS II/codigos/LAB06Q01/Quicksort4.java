/**
 * Algoritmo de ordenacao Quicksort
 * @author Max do Val Machado
 * @version 3 08/2020
 * 
 * Versão utiliza o cáluclo da mediana para definir o pivô do método Quicksort
 */
class Quicksort4 extends Geracao{

	/**
	 * Construtor.
	 */
   public Quicksort4(){ super(); }


	/**
	 * Construtor.
	 * @param int tamanho do array de numeros inteiros.
	 */
   public Quicksort4(int tamanho){ super(tamanho); }


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
    private void swap(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
    private int mediana(int inicio, int fim, int meio) {
        int[] vetorMediana = {inicio, meio, fim};
        
        for (int i = 0; i < vetorMediana.length - 1; i++) {
            int menor = i;
            for (int j = i+1; j < vetorMediana.length; j++) {
                if (vetorMediana[j] < vetorMediana[menor]) {
                    menor = j;
                }
            }
            swap(i, menor, vetorMediana);
        }
        return vetorMediana[1];
    }
    private void quicksort(int esq, int dir) {
        int i = esq, j = dir, meio = (dir+esq)/2;
        int pivo = array[mediana(esq, dir, meio)];
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
