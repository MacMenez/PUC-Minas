using System;

class repeat_comand{
    public static void Main (string[] args){
        double base = 0, altura = 0, area = 0;

        for (int i = 0; base >= 0; i++){
            Console.WriteLine("Digite a base do {0}º retângulo: ", i);
            base = double.Parse(Console.ReadLine());

            if (base >= 0){
                Console.WriteLine("Digite a altura do " + i + "º retângulo: ");
                altura = double.Parse(Console.ReadLine());

                area = base * altura;

                Console.WriteLine("A área do {0}º retângulo = {1}. \n", i, area);
            }
        }
    }
}