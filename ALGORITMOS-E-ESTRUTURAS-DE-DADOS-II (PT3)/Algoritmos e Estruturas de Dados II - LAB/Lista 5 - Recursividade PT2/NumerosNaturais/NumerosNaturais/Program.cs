using System;

namespace NumerosNaturais{
    class Program{
        static void Main(string[] args){
            Console.WriteLine(NumerosNaturais(5));
        }

        public static int NumerosNaturais(int n){
            if (n <= 0){
                n = 1 + NumerosNaturais(n - 1);
            }
            return n;
        }
    }
}
