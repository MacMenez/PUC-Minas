public class selectionSort {
    public static void main(String[] args) throws Exception {
        System.out.println("Este é o código de ordenação SelectionSort ou Ordenação por Seleção");

        // É necessário enviar um vetor que será ordenado
        int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Chamada do método SelectionSort
        selectionSort(vetor, 6);
    }

    static void selectionSort(int[] array, int n) {
        for (int i = 0; i < (n - 1); i++) {
            int menor = i;
            for (int j = (i + 1); j < n; j++) {
                if (array[menor] > array[j]) {
                    menor = j;
                }
            }
            int temp = array[i];
            array[i] = array[menor];
            array[menor] = temp;
        }
    }
}