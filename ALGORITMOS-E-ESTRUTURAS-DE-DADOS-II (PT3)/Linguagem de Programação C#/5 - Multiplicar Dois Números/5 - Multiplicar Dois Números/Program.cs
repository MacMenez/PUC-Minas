using System;

namespace _5___Multiplicar_Dois_Números{
    class Program{
        static void Main(string[] args){
            //Declaracao de variáveis.
            int numero1, numero2, multiplicacao;

            /*Leitura do primeiro numero.*/
            Console.WriteLine("Digite um número:");
            numero1 = int.Parse(Console.ReadLine());

            //Leitura do segundo numero.
            Console.WriteLine("Digite outro número:");
            numero2 = int.Parse(Console.ReadLine());

            //Multiplicar os dois números
            multiplicacao = numero1 * numero2;

            //Imprimir na tela o resultado da soma.
            Console.WriteLine("Multiplicação:" + multiplicacao);
        }
    }
}
