using System;

class comand_IF{
    public static void Main (string[] args){
        int num;

        Console.WriteLine("Digite um número: ");
        num = int.Parse(Console.Readline());

        if (num < 0){
            Console.WriteLine("O número " + num + " é negativo!");
        }
        else{
            //Considerar que 0 é nulo.
            if (num == 0){
                Console.WriteLine("O número " + num + " é positivo!");
            }
            else{
                Console.WriteLine("O número " + num + " é positivo!");
            }
            
        }
    }
}