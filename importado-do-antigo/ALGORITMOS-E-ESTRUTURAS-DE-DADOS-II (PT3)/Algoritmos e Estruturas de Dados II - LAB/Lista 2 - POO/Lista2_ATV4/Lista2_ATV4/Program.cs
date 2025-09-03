using System;

namespace Lista2_ATV4{
    class Program{
        static void Main(string[] args){
            Console.WriteLine("------------------------------------");
            Console.WriteLine("           AGENDA TELEFÔNICA        ");
            Console.WriteLine("------------------------------------");

            AgendaTelefonica agenda = new AgendaTelefonica(100);

            int digito = 0;

            while (digito != 4){
                Console.WriteLine("Selecione Qual Opção Deseja: \n" +
                    "1 - Inserir um Novo Contato \n" +
                    "2 - Buscar um Contato Pelo Nome \n" +
                    "3 - Imprimir Todos os Dados de Todos os Contatos da Agenda Telefônica \n" +
                    "4 - Encerrar Programa"
                );

                digito = int.Parse(Console.ReadLine());

                switch (digito){
                    case 1:
                        Console.Write("NOME: ");
                        String nome = Console.ReadLine();

                        Console.Write("CELULAR: ");
                        String celular = Console.ReadLine();

                        Console.Write("E-MAIL: ");
                        String email = Console.ReadLine();

                        Console.WriteLine("ANIVERSÁRIO");

                        Console.Write("DIA:");
                        int dia = int.Parse(Console.ReadLine());

                        Console.Write("MÊS (Apenas Número): ");
                        int mes = int.Parse(Console.ReadLine());
                        /*
                         Data data = new Data(dia, mes);
                        agenda.InserirNovoContato(new Contato(nome, celular, email, data));
                        */
                        agenda.InserirNovoContato(new Contato(nome, celular, email, dia, mes));

                        Console.WriteLine("\n Cadastro Inserido Com Sucesso! \n");
                        break;

                    case 2:
                        Console.Write("Informe o Nome: ");
                        String nomePesquisa = Console.ReadLine();
                        agenda.BuscarContatoNome(nomePesquisa);
                        break;

                    case 3:
                        Console.WriteLine("AGENDA TELEFÔNICA");
                        agenda.ImprimirAgenda();
                        break;

                    case 4:
                        Console.WriteLine("Fechando Agenda");
                        break;

                    default:
                        Console.WriteLine("Opção Inválida!");
                        break;
                }
            }
        }
    }
}