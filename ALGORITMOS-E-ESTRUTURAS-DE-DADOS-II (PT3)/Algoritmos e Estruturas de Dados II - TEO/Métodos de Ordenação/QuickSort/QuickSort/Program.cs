using System;

namespace QuickSort{
    class Program{
        public static void quicksort(int[] array, int n){
            quicksort(array, 0, n - 1);


        }

        /**
		* Algoritmo de ordenação Quicksort.
		* @param int esq: início da partição a ser ordenada
		* @param int dir: fim da partição a ser ordenada
*/
        private static void quicksort(int[] array, int esq, int dir){

            int part;
            if (esq < dir){
                part = particao(array, esq, dir);
                quicksort(array, esq, part - 1);
                quicksort(array, part + 1, dir);
            }
        }

        private static int particao(int[] array, int inicio, int fim){

            int pivot = array[fim];
            int part = inicio - 1;

            for (int i = inicio; i < fim; i++){
                if (array[i] < pivot){
                    part++;
                    swap(array, part, i);
                }
            }
            part++;
            swap(array, part, fim);
            return (part);
        }

        private static void swap(int[] array, int i, int j){

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        static void Main(string[] args){
            int[] array = new int[5] { 80, 16, 10, 26, 28 };

            foreach (int item in array){
                Console.Write(item + " - ");
            }
          
            Console.WriteLine("\nVetor Ordenado com o Método de Ordenação QuickSort!");
            quicksort(array, 5);

            foreach (int item in array){
                Console.Write(item + " - ");
            }
        }
    }
}
