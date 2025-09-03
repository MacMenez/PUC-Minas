using System;

namespace _6___Conversão_de_Tipos{
    class Program{
        static void Main(string[] args){
            /*
              CONVERSÃO IMPLÍCITA
                As conversões implícitas acontecem automaticamente. A conversão sempre é bem sucedida e nenhum dado será perdido.
                • Exemplos incluem conversões de tipos “menores” para “maiores”. 
             */
            int num1 = 2147483647;
            long num2 = num1;

            /*
             CONVERSÃO EXPLÍCITA
                As conversões explícitas exigem uma expressão cast.
                • A conversão é necessária quando as informações podem ser perdidas na conversão ou quando a conversão pode não funcionar por outros motivos.
                • Exemplos típicos incluem a conversão numérica para um tipo que tem menos precisão ou um intervalo menor
             */

            double numDouble = 1234.7;
            int numInt;
            numInt = (int)numDouble;
            Console.WriteLine(numInt);
        }
    }
}
