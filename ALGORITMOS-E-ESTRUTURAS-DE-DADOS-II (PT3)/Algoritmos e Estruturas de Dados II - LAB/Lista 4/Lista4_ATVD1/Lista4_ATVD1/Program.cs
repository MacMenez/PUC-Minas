using System;

namespace Lista4_ATVD1{
    class Program{
        static void Main(string[] args){
            /*ATIVIDADE 1*/
            //Console.WriteLine(Recursividade(2, 5));

            /*ATIVIDADE 2*/
            //Console.WriteLine(SomaNumeroIntervalo(4, 7));

            /*ATIVIDADE 3*/
            //Console.WriteLine(ConverterParaBinario(12));
            //Console.WriteLine(ConverterParaBinario(8));

            /*ATIVIDADE 4*/
            //Console.WriteLine(MDC(10, 6));
        }

        public static int MDC(int x, int y){
            return 1;
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

        public static int SomaNumeroIntervalo(int m, int n){
            if (m <= n){
                m++;
                return SomaNumeroIntervalo(m, n);
            }
            else{
                return -1;
            }
            
        }

        public static int Recursividade(int a, int n){
            /* a = 2
             * n = 5
             */
            if (n >= 0){
                n--;
            }
            return Recursividade(a * a, n--);
        }
    }
}
