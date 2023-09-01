using System;

namespace _3___Cadastro_de_empregados_Empresa
{
    class Program
    {
        static void Main(string[] args)
        {
            Empregado emp1 = new Empregado("Maria", "Silva", 1500);
            Empregado emp2 = new Empregado("João", "José", 3000);
            Console.WriteLine("Salario Anual:");
            Console.WriteLine("Empregado 1: " + emp1.Salario * 12);
            Console.WriteLine("Empregado 1: " + emp2.Salario * 12);
            //Aumentando o salario
            emp1.Salario = emp1.Salario * 1.15;
            emp2.Salario = emp2.Salario * 1.15;
            Console.WriteLine("Empregado 1: " + emp1.Salario * 12);
            Console.WriteLine("Empregado 1: " + emp2.Salario * 12);
            Console.ReadLine();
        }
    }
}
