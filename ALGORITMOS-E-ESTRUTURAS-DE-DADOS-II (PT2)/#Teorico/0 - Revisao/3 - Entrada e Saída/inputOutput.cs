using System;

class HelloWorld{
    public static void Main(string[] args){
        
        Console.ReadLine(); //Entrada
        //Sempre retorna um String, se for ler números, tem que converser com Parse()

        Console.WriteLine ("Hello World!"); //Saída + Pula 1 Linha
        Console.Write("Hello World!"); //Saída Padrão

        //Exemplo
        string nome;
        int idade;
        float altura;

        Console.Write("Digite seu primeiro nome: ");
        x = Console.ReadLine();

        Console.Write("Digite sua Idade: ");
        idade = int.Parse(Console.ReadLine());

        Console.Write("Digite sua altura: ");
        altura = float.Parse(Console.ReadLine());

        Console.WriteLine("\n" + nome + " tem " + idade + " anos de idade e mede " + altura + "m.");
    }
}