using System;

namespace Lista3_ATVD3{
    class Program{
        static void Main(string[] args){
            
            //Titulares
            Jogador jogador1 = new Jogador(1, "Félix", "Goleiro");
            Jogador jogador2 = new Jogador(2, "Carlos Alberto Torres", "Zagueiro");
            Jogador jogador3 = new Jogador(3, "Britto", "Zagueiro");
            Jogador jogador4 = new Jogador(4, "Piazza", "Meio-campista");
            Jogador jogador5 = new Jogador(5, "Clodoaldo", "Meio-campista");
            Jogador jogador6 = new Jogador(6, "Marco Antônio", "Meio-campista");
            Jogador jogador7 = new Jogador(7, "Jairzinho", "Atacante");
            Jogador jogador8 = new Jogador(8, "Gérson", "Meio-campista");
            Jogador jogador9 = new Jogador(9, "Tostão", "Atacante");
            Jogador jogador10 = new Jogador(10, "Pelé", "Atacante");
            Jogador jogador11 = new Jogador(11, "Rivelino", "Meio-campista");

            //Reservas
            Jogador reserva1 = new Jogador(12, "Carlos Alberto", "Goleiro");
            Jogador reserva2 = new Jogador(13, "Djalma Santos", "Zagueiro");
            Jogador reserva3 = new Jogador(14, "Brito", "Zagueiro");
            Jogador reserva4 = new Jogador(15, "Fontana", "Zagueiro");
            Jogador reserva5 = new Jogador(16, "Everaldo", "Zagueiro");
            Jogador reserva6 = new Jogador(17, "Joel Camargo", "Zagueiro");
            Jogador reserva7 = new Jogador(18, "Zé Maria", "Lateral");
            Jogador reserva8 = new Jogador(19, "Rildo", "Lateral");
            Jogador reserva9 = new Jogador(20, "Félix Miéli Venerando", "Lateral");
            Jogador reserva10 = new Jogador(21, "Zé Roberto", "Meio-campista");
            Jogador reserva11 = new Jogador(22, "Roberto Miranda", "Atacante");
            Jogador reserva12 = new Jogador(23, "Evaldo", "Atacante");

            //Teste de Jogador Extra
            Jogador jogadorTeste = new Jogador(0, "Jogador Teste", "Teste");

            //Instancie um time e utilize todos os métodos da classe Time
            Time time = new Time("Não Informado!");
            

            time.SetNome("Seleção Brasileira de 1970");
            Console.WriteLine(time.GetNome());

            Console.WriteLine("Adicionando Time Titular");
            Console.WriteLine(time.AdicionarTitular(jogador1));
            Console.WriteLine(time.AdicionarTitular(jogador2));
            Console.WriteLine(time.AdicionarTitular(jogador3));
            Console.WriteLine(time.AdicionarTitular(jogador4));
            Console.WriteLine(time.AdicionarTitular(jogador5));
            Console.WriteLine(time.AdicionarTitular(jogador6));
            Console.WriteLine(time.AdicionarTitular(jogador7));
            Console.WriteLine(time.AdicionarTitular(jogador8));
            Console.WriteLine(time.AdicionarTitular(jogador9));
            Console.WriteLine(time.AdicionarTitular(jogador10));
            Console.WriteLine(time.AdicionarTitular(jogador11));

            Console.WriteLine("Adicionando Time Reserva");
            Console.WriteLine(time.AdicionarReserva(reserva1));
            Console.WriteLine(time.AdicionarReserva(reserva2));
            Console.WriteLine(time.AdicionarReserva(reserva3));
            Console.WriteLine(time.AdicionarReserva(reserva4));
            Console.WriteLine(time.AdicionarReserva(reserva5));
            Console.WriteLine(time.AdicionarReserva(reserva6));
            Console.WriteLine(time.AdicionarReserva(reserva7));
            Console.WriteLine(time.AdicionarReserva(reserva8));
            Console.WriteLine(time.AdicionarReserva(reserva9));
            Console.WriteLine(time.AdicionarReserva(reserva10));
            Console.WriteLine(time.AdicionarReserva(reserva11));
            Console.WriteLine(time.AdicionarReserva(reserva12));

            Console.WriteLine("GERAR ARQUIVO DE ESCALAÇÃO");
            time.GerarArqTime(time.GetNome() + ".txt");


            //Verificar se regra está conforme especificado no enunciado
            Console.WriteLine("Quebrar a Regra - Adicionando um Titular a mais. \nRetornar FALSE");
            Console.WriteLine(time.AdicionarTitular(jogadorTeste));

            
            //Verificar se regra está conforme especificado no enunciado
            Console.WriteLine("Quebrar a Regra - Adicionando um Reserva a mais. \nRetornar FALSE");
            Console.WriteLine(time.AdicionarReserva(jogadorTeste));

            Console.WriteLine(time.SubstituirTitular("Pelé", reserva1));
            Console.WriteLine(time.SubstituirReserva("Carlos Alberto", jogador10));

            
            Console.WriteLine(time.ConsultarTitular("Pelé"));
            Console.WriteLine(time.ConsultarReserva("Zé Maria"));

            time.ExcluirTitular("Pelé");
            time.ExcluirReserva("Zé Maria");
            

        }
    }
}

/*
    public Get() { return; }
    public void Set() { }
 */