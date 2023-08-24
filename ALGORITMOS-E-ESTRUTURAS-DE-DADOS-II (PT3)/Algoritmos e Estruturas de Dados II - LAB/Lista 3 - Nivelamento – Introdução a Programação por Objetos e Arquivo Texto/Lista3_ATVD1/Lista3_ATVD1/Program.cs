using System;

namespace Lista3_ATVD1{
    class Program{
        static void Main(string[] args){
            int vagaOcupada;
            Estacionamento objEstacionamento = new
           Estacionamento("Estacionamento de AEDs", 10);
            vagaOcupada = objEstacionamento.Estacionar("HKT0098");
            vagaOcupada = objEstacionamento.Estacionar("OLP4290");
            vagaOcupada = objEstacionamento.Estacionar("HJB0495");
            vagaOcupada = objEstacionamento.Estacionar("OWB3904");
            Console.WriteLine("Ocupação do estacionamento após as chegadas de quatro clientes: ");


            objEstacionamento.ExibirOcupacaoEstacionamento(); // HKT0098 OLP4290 HJB0495 OWB3904 vazia vazia vazia vazia vazia vazia
             vagaOcupada = objEstacionamento.ObterVagaOcupada("HKT0098");
            Console.WriteLine("Veículo de placa HKT0098 estacionado na vaga " + vagaOcupada); // 0
            objEstacionamento.RetirarVeiculo("HKT0098");
            Console.WriteLine("Ocupação do estacionamento após a retirada do veículo de placa HKT0098: ");


            objEstacionamento.ExibirOcupacaoEstacionamento(); // vazia OLP4290 HJB0495 OWB3904 vazia vazia vazia vazia vazia vazia
            vagaOcupada = objEstacionamento.Estacionar("HTP5619");
            vagaOcupada = objEstacionamento.Estacionar("BOL4861");
            vagaOcupada = objEstacionamento.Estacionar("HGT9436");
            Console.WriteLine("Ocupação do estacionamento após as chegadas de mais três clientes: ");


            objEstacionamento.ExibirOcupacaoEstacionamento(); // HTP5619 OLP4290 HJB0495 OWB3904 BOL4861 HGT9436 vazia vazia vazia vazia
            Console.WriteLine("Este estacionamento apresenta {0} vagas livres.", objEstacionamento.ObterNumVagasLivres()); // 4 vagas livres
            
            Console.ReadLine();
        }

    }
}
