public class bubbleSort {
    public static void main(String[] args) throws Exception {
        System.out.println("Este é o código de ordenação BubbleSort ou método Bolha");

        // É necessário enviar um vetor que será ordenado
        int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        //Chamada do método BubbleSort
        bubbleSort(vetor, 6);
    }

    static void bubbleSort(int[] array, int n) {
        for (int i = (n - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
