using System;

namespace Lista4_ATVD2{
    class Program{
        static void Main(string[] args){
            /*ATIVIDADE 2*/
            //Console.WriteLine(SomaNumeroIntervalo(4, 7));
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
    }
}
