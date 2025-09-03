using System;
    class Program{
        static void Main(string[] args){
            int numero;
            int sequenciaAtual = 1;
            int maiorSequencia = 1;

            Console.WriteLine("Digite uma sequência de números inteiros positivos (digite -1 para encerrar):");

            while (true){
                numero = int.Parse(Console.ReadLine());

                if (numero == -1)
                    break;

                if (numero > 0){
                    if (numero > sequenciaAtual){
                        sequenciaAtual++;
                        if (sequenciaAtual > maiorSequencia)
                            maiorSequencia = sequenciaAtual;
                    }
                    else{
                        sequenciaAtual = 1;
                    }
                }
                else{
                    Console.WriteLine("Digite -1 para encerrar.");
                }
            }

            Console.WriteLine($"Tamanho da maior sequência crescente recebida: {maiorSequencia}");
        }
    }
