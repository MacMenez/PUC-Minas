using System;
    class Program{
        static void Main(string[] args){
            Random random = new Random(); //Random em C# = Random JAVA

            int[,] vendas = new int[12, 4]; //Definição de matriz em C#
            
            // Montando Matriz
            for (int mes = 0; mes < 12; mes++){
                for (int semana = 0; semana < 4; semana++){
                    vendas[mes, semana] = random.Next(5000, 15001); //Inserir valores aleatórios
                }
            }

            //Definições de contagem solicitadas no enunciado
            int totalAnual = 0;
            int melhorSemana = 0;
            int maiorVendaSemanal = 0;

            // Calculos de mês,semana e ano
            for (int mes = 0; mes < 12; mes++){
                int totalMes = 0;
                for (int semana = 0; semana < 4; semana++){
                    totalMes += vendas[mes, semana];
                    totalAnual += vendas[mes, semana];

                    if (vendas[mes, semana] > maiorVendaSemanal){
                        maiorVendaSemanal = vendas[mes, semana];
                        melhorSemana = semana + 1;
                    }
                }

                //Concatenações são feitas entre {} e $. Olha no StackOverFlow
                Console.WriteLine($"Total vendido no mês {mes + 1}: {totalMes}");
            }

            Console.WriteLine($"Total vendido no ano:{totalAnual}");
            Console.WriteLine($"Melhor semana para vender carros: {melhorSemana}ª semana");
        }
    }