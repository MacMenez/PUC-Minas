using System;

namespace _3___Operadores_Aritméticos{
    class Program{
        static void Main(string[] args){
            Console.WriteLine("Hello World!");

            /*
                Operadores binários: dois operandos
                • +, -, *, / e %
             */

            int x = 32, y = 3, z;
            z = x + y; // 35
            z = x - y; // 29
            z = x * y; // 96
            z = x / y; // 10, se x fosse real: 10,67.
            z = x % y; // 2 (retorna o resto da divisão entre inteiros)

            /*
              / resultado inteiro para dois número inteiros. Para que o resultado seja real, pelo menos um dos números deve ser real
             */

        }
    }
}
