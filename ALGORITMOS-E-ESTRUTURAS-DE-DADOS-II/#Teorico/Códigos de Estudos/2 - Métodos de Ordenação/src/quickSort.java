public class quickSort {
    public static void main(String[] args) throws Exception {
        System.out.println("Este é o código de ordenação QuickSort");

        // É necessário enviar um vetor que será ordenado
        int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        //Chamada do método QuickSort
        quickSort(vetor, 6);
    }

    public static void quickSort(int[] array, int n) {
        quicksort(array, 0, n - 1);
    }
    
    /**
    * Algoritmo de ordenação Quicksort.
    * @param int esq: início da partição a ser ordenada
    * @param int dir: fim da partição a ser ordenada
    */
    private static void quicksort(int[] array, int esq, int dir) {
                
        int part;
        if (esq < dir){
            part = particao(array, esq, dir);
            quicksort(array, esq, part - 1);
            quicksort(array, part + 1, dir);
        }
    }
                    
    private static int particao(int[] array, int inicio, int fim) {
            
        int pivot = array[fim];
        int part = inicio - 1;
        for (int i = inicio; i < fim; i++) {
            if (array[i] < pivot) {
                part++;
                swap(array, part, i);
            }
        }
        part++;
        swap(array, part, fim);
        return (part);
    }
        
    private static void swap(int[] array, int i, int j) {
              
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}