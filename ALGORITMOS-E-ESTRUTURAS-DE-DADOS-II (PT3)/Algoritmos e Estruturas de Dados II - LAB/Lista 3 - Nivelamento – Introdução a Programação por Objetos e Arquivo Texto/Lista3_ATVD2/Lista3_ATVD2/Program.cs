using System;

namespace Lista3_ATVD2
{
    class Program{
        static void Main(string[] args){

            Data diaAtual = new Data(2023);
            //Calendario dataNascimento = new Calendario(06, 06, 2023);

            Pessoa pessoa = new Pessoa(2000, 75.25, 1.75);


            string linha;
            try{
                //Abre arquivo para leitura
                StreamReader arq = new StreamReader("C:\\Arq1.txt", Encoding.UTF8);
                linha = arq.ReadLine(); //Lê a primeira linha do arquivo
                                        //Continue lendo até atingir o final do arquivo
                while (linha != null){
                    Pessoa pessoa = new Pessoa(linha);
                    Console.WriteLine(linha);
                    pessoa.CalcularIMC();
                    pessoa.InformarIdade(diaAtual.Ano);
                    linha = arq.ReadLine(); //Lê a próxima linha
                }
                arq.Close(); //Fecha o arquivo
                Console.ReadLine();
            }
            catch (Exception e){
                Console.WriteLine("Exception: " + e.Message);
            }
        }
    }
}
