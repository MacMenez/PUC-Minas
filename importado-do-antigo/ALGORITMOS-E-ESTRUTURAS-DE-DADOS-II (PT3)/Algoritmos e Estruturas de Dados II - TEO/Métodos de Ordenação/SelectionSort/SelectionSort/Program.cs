using System;

namespace SelectionSort{
    class Program{
        public static void selectionSort(int[] array, int n){
            for (int i = 0; i < (n - 1); i++){
                int menor = i;
                for (int j = (i + 1); j < n; j++){
                    if (array[menor] > array[j]){
                        menor = j;
                    }
                }
                int temp = array[i];
                array[i] = array[menor];
                array[menor] = temp;
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

            Console.WriteLine("\nVetor Ordenado com o Método de Ordenação BubbleSort!");
            selectionSort(array, 5);
        }
    }
}
