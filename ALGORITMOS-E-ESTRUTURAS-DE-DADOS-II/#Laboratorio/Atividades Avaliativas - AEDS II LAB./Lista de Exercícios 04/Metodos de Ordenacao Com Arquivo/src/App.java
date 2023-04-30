public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public void BubbleSort(int[] array, int n) {
        int qtdComparacao = 0;
        int qtdMovimentacao = 0;

        for (int i = (n-1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void InsertionSort(int[] array, int n) {
        int qtdComparacao = 0;
        int qtdMovimentacao = 0;

        for (int i = 1; i < n; i++) {
            int temp = array[i];
            int j = i -1;

            while ((j >= 0) && (array[j] > temp)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public void SelectionSort(int[] array, int n) {
        int qtdComparacao = 0;
        int qtdMovimentacao = 0;

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
