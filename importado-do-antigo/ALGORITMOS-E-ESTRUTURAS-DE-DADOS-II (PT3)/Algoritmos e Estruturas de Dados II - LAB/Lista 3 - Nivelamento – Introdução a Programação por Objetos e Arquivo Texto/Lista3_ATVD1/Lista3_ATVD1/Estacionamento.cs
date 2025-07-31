using System;

namespace Lista3_ATVD1{
    class Estacionamento{
        private String nome; // nome do estacionamento.
        private int numTotalVagas; // número total de vagas que o estacionamento apresenta.
        private int numVagasLivres; // número de vagas livres no estacionamento.
        private String[] vaga; // vetor que armazena cada uma das vagas do estacionamento.Caso a vaga esteja ocupada, este vetor indica a placa do veículo que a ocupa.
        
        public Estacionamento(String nome, int numTotalVagas){
            this.nome = nome;
            this.numTotalVagas = numTotalVagas;
            this.numVagasLivres = numTotalVagas;
            vaga = new String[numTotalVagas];
        }

        public int Estacionar(String placa){
            int posicao = -1;
            for (int i = 0; i < vaga.Length; i++){
                if (vaga[i] == null){
                    vaga[i] = placa;
                    posicao = i; //Posição que o carro foi estacionado
                    i = vaga.Length;
                }
            }
            return posicao;
        }
        public int ObterVagaOcupada(String placa){
            for (int i = 0; i < vaga.Length; i++){
                if (vaga[i] == placa){
                    return i;
                }
            }
            return -1;
        }
        public void RetirarVeiculo(String placa) {
            for (int i = 0; i < vaga.Length; i++){
                if (vaga[i] == placa){
                    vaga[i] = null;
                }
            }
        }
        public int ObterNumVagasLivres(){
            for (int i = 0; i < vaga.Length; i++){
                if (vaga[i] == null){
                    numVagasLivres++;
                }
            }
            return numVagasLivres;
        }
        public void ExibirOcupacaoEstacionamento(){
            for (int i = 0; i < vaga.Length; i++){
                Console.WriteLine("Vaga {0}: {1}", i, vaga[i]);
            }
        }

    }
}
