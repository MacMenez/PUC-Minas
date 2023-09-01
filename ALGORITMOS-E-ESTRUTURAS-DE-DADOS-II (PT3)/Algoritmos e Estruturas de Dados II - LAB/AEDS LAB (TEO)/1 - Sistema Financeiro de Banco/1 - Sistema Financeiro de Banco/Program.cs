using System;

namespace _1___Sistema_Financeiro_de_Banco{
    class Program{
        static void Main(string[] args){
            ContaCorrente c1 = new ContaCorrente("1234-5", 500.00);
            ContaCorrente c2 = new ContaCorrente("5555-6", 100.00);
            c1.Sacar(100);
            c2.Depositar(400);

            Conta teste = new Conta();
            Console.WriteLine(teste.Numero);
            teste.Numero = 1234;
            Console.ReadLine();
        }
    }
}
