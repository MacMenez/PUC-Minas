using System;
using System.Collections.Generic;

namespace FilaNativaCsharp{
    class Program{
        static void Main(string[] args){
            Queue<String> numbers = new Queue<String>();
            numbers.Enqueue("one");
            numbers.Enqueue("two");
            numbers.Enqueue("three");
            numbers.Enqueue("four");
            numbers.Enqueue("five");

            Console.WriteLine("Desenfileirando: '{0}'", numbers.Dequeue());  // one
            Console.WriteLine("Início da fila: '{0}'", numbers.Peek());  // two
            Console.WriteLine("Desenfileirando: '{0}'", numbers.Dequeue());  // two

            Queue<String> queue2 = new Queue<String>(numbers.ToArray());

            Console.WriteLine("A segunda fila contém o elemento \"four\"? = {0}", queue2.Contains("four"));  // True

            Console.WriteLine("Removendo todos os elementos da segunda fila");
            queue2.Clear();

            Console.WriteLine("Número de elementos da segunda fila = {0}", queue2.Count);  // 0
        }
    }
}
