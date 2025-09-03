using System;

namespace Lista4_ATVD3{
    class Program{
        static void Main(string[] args){
            /*ATIVIDADE 3*/
            //Console.WriteLine(ConverterParaBinario(12));
            //Console.WriteLine(ConverterParaBinario(8));
        }

        public static int ConverterParaBinario(int x){
            if (x / 2 >= 0){
                Console.WriteLine(x % 2);
                return ConverterParaBinario(x / 2);
            }
            else{
                return 1;
            }
        }
    }
}
