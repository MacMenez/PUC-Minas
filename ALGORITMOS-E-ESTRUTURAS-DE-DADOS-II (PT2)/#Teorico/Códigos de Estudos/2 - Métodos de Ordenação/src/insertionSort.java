public class insertionSort {
    public static void main(String[] args) throws Exception {
        System.out.println("Este é o código de ordenação InsertionSort ou Ordenação por Inserção");

        // É necessário enviar um vetor que será ordenado
        int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Chamada do método InsertionSort
        insertionSort(vetor, 6);
    }

    static void insertionSort(int[] array, int n) {
        for (int i = 1; i < n; i++) {
            int tmp = array[i];
            int j = i - 1;

            while ((j >= 0) && (array[j] > tmp)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
    }
}