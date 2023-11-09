using System;

namespace BubbleSort{
    class Program{
        public static void bubblesort(int[] array, int n){
            for (int i = (n - 1); i > 0; i--){
                for (int j = 0; j < i; j++){
                    if (array[j] > array[j + 1]){

                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
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
            bubblesort(array, 5);
        }
    }
}
