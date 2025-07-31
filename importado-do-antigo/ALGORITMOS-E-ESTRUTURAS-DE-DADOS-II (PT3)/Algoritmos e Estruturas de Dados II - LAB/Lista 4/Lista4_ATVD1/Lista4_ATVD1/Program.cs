using System;

namespace Lista4_ATVD1{
    class Program{
        public static void Main (string[] args) {
    /*ATIVIDADE 1*/
            Console.WriteLine(Recursividade(2, 5));

            /*ATIVIDADE 2*/
            Console.WriteLine(SomaNumeroIntervalo(4, 7));

            /*ATIVIDADE 3*/
            ConverterParaBinario(12);
            Console.WriteLine("\n");
            ConverterParaBinario(8);

            /*ATIVIDADE 4*/
            Console.WriteLine("\n" + MDC(10, 6));
  }
  public static int MDC(int x, int y) {
        // x = y, o MDC é x (ou y. MDC(x, y) = MDC(y, x))
        if (x == y) {
            return x;
        }

        // x > y
        if (x > y) {
            return MDC(x - y, y);
        }

        // y < x
        return MDC(x, y - x);
    }

         public static void ConverterParaBinario(int x) {
        if (x > 0) {
          // Recursiva com x / 2
            ConverterParaBinario(x / 2); 
            Console.Write(x % 2);
        }
    }

        public static int SomaNumeroIntervalo(int m, int n) {
        if (m <= n) {
          //Soma m e chama recursivamente com m incrementado.
            return m + SomaNumeroIntervalo(m + 1, n);
        } else {
          // m > n, retorna 0.
            return 0; 
        }
    }

        public static int Recursividade(int a, int n) {
          // Flag: n = 0, retorna 1.
          if (n == 0) {
            return 1;
        } else if (n > 0) {
            // Recursiva com n decrementado.
            return a * Recursividade(a, n - 1); 
        } else {
            throw new ArgumentException("O valor de n deve ser não negativo.");
        }
    }
}
