using System;

namespace InsertionSort{
    class Program{
        public static void insertionSort(int[] array, int n){
            for (int i = 1; i < n; i++){
                int tmp = array[i];
                int j = i - 1;

                while ((j >= 0) && (array[j] > tmp)){
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = tmp;
            }

            foreach (int item in array){
                Console.Write(item + " - ");
            }
        }

        static void Main(string[] args){
            int[] array = new int[5] { 80, 16, 10, 26, 28 };

            foreach (int item in array){
                Console.Write(item + " - ");
            }

            Console.WriteLine("\nVetor Ordenado com o Método de Ordenação InsertionSort!");
            insertionSort(array, 5);
        }
    }
}
