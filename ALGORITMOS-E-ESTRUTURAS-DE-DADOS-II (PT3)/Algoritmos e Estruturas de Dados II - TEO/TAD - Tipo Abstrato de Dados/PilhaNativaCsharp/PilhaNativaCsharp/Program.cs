using System;
using System.Collections.Generic;

namespace PilhaNativaCsharp{
    class Program{
        static void Main(string[] args){
            Stack<String> numbers = new Stack<String>();
            numbers.Push("one");
            numbers.Push("two");
            numbers.Push("three");
            numbers.Push("four");
            numbers.Push("five");

            Console.WriteLine("Desempilhando: '{0}'", numbers.Pop());
            Console.WriteLine("Topo da pilha: '{0}'", numbers.Peek());
            Console.WriteLine("Desempilhando: '{0}'", numbers.Pop());

            Stack<String> stack2 = new Stack<String>(numbers.ToArray());

            Console.WriteLine("A segunda pilha contém o elemento \"four\"? = {0}", stack2.Contains("four"));

            Console.WriteLine("Removendo todos os elementos da segunda pilha");
            stack2.Clear();

            Console.WriteLine("Número de elementos da segunda pilha = {0}", stack2.Count);
        }
    }
}
