using System;

namespace Lista3_ATVD2
{
    class Program{
        static void Main(string[] args){

            Calendario calendario = new Calendario(28, 08, 2023);

            Pessoa pessoa = new Pessoa(23, 75.10, 1.75);

            pessoa.CalcularIMC;
            pessoa.InformarIdade;
        }
    }
}
