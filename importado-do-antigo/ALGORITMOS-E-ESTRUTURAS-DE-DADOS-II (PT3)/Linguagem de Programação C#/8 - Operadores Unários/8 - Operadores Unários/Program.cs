using System;

namespace _8___Operadores_Unários{
    class Program{
        static void Main(string[] args){
            /*
             OPERADORES UNITÁRIOS

             Operadores unários: um operando
                • -, --, e ++
             */

            int x = 15;
            x = -x;
            x++; // x = x + 1;
            x--; // x = x - 1;

            int x1 = 0;
            int y1 = 1;
            x1 = y1++; //Atribui primeiro, depois incrementa
            Console.WriteLine("Variável x: " + x1);
            Console.WriteLine("Variável y: " + y1);

            int x2 = 0;
            int y2 = 1;
            x2 = ++y2; //Incrementa primeiro, atribui depois
            Console.WriteLine("Variável x: " + x2);
            Console.WriteLine("Variável y: " + y2);

        }
    }
}
