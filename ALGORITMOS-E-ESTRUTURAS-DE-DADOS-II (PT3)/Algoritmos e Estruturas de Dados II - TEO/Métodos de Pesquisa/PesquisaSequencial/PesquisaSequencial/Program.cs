using System;

namespace PesquisaSequencial{
    class Program{
        public static Boolean pesquisaSequencial(int[] vet, int x){
            Boolean resp = false;
            int n = vet.Length;

            for (int i = 0; i < n; i++){
                if (vet[i] == x){
                    resp = true;
                    i = n;
                }
            }
            return resp;
        }

        static void Main(string[] args){
            Console.WriteLine("Hello World!");
        }
    }
}
