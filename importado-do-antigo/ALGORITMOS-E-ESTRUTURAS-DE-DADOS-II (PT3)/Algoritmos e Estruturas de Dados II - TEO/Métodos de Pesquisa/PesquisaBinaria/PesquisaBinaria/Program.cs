using System;

namespace PesquisaBinaria{

    class Program{
        public static int pesquisaBinaria(int[] vetor, int chave, int inicio, int fim){
            int meio = (inicio + fim) / 2;
            if (inicio > fim){
                throw new Exception("Chave não localizada!");
            }
            else if (vetor[meio] == chave){
                return vetor[meio];
            }
            else if (vetor[meio] > chave){
                return pesquisaBinaria(vetor, chave, inicio, meio - 1);
            }
            else
            {
                return pesquisaBinaria(vetor, chave, inicio, meio + 1);
            }
        }
        static void Main(string[] args){
            Console.WriteLine("Hello World!");
        }
    }
}
