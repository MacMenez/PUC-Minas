using System;

namespace SomatorioDeN{
    class Program{
        static void Main(string[] args){
            Console.WriteLine(SomatorioDeN(5));
        }

        public static int SomatorioDeN(int n){
            if (n > 0){
                n = n + SomatorioDeN(n - 1);
            }
            return n;
        }
    }
}
