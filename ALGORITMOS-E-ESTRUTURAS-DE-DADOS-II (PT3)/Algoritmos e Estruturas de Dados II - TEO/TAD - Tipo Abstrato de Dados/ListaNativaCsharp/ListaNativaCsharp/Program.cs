using System;
using System.Collections.Generic;

namespace ListaNativaCsharp{
    class Program{
        static void Main(string[] args){
            List<String> numbers = new List<String>();
            numbers.Add("one");
            numbers.Add("two");
            numbers.Insert(2, "three");
            numbers.Insert(0, "four");
            numbers.Insert(3, "five");

            Console.WriteLine("Removendo \"four\"");
            numbers.Remove("four");

            Console.WriteLine("Removendo elemento da posição 1");
            numbers.RemoveAt(1);

            List<String> list2 = new List<String>(numbers.ToArray());

            Console.WriteLine("A segunda lista contém o elemento \"four\"? = {0}", list2.Contains("four"));  // False

            Console.WriteLine("Índice da primeira ocorrência de \"five\" na segunda lista: {0}", list2.IndexOf("five"));
            list2.Clear();

            Console.WriteLine("Número de elementos da primeira lista = {0}", numbers.Count);  // 3
            Console.WriteLine("Capacidade da primeira lista = {0}", numbers.Capacity);

            Console.WriteLine("Número de elementos da segunda lista = {0}", list2.Count);  // 0
            Console.WriteLine("Capacidade da segunda lista = {0}", list2.Capacity);
        }
    }
}
