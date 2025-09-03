using System;

namespace _1___Comando_de_Saida{
    class Program{
        static void Main(string[] args){
            Console.WriteLine("Hello World!");

            //Comando de Saída
            int dia = 17;
            int mes = 2;
            Console.WriteLine("Data: " + dia + "/" + mes);
            Console.Write("Data: " + dia + "/" + mes);

            //Comando de Saída
            int d = 14;
            int m = 4;
            Console.WriteLine("Hoje é dia {0} do mês {1}", d, m);
            //Console.ReadLine();

            //Comando de Saída
            int dias = 22;
            int meses = 6;
            int ano = 2023;
            Console.WriteLine($"Data de hoje: {dias}/{meses}/{ano}");
            Console.WriteLine($"Ano atual: {ano}");
            //Console.ReadLine();

            //Comando de Saída – Limitar Casas Decimais
            double num = 3.12345679;
            Console.WriteLine("3 casas decimais " + num.ToString("N3"));
            Console.WriteLine("2 casas decimais " + num.ToString("N2"));
            Console.WriteLine("Sem casas decimais " + num.ToString("N0"));
            Console.ReadLine();
        }
    }
}
