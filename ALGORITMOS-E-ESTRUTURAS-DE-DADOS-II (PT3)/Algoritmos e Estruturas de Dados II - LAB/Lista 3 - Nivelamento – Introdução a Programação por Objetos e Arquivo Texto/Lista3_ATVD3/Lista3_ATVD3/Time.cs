using System;
using System.IO;
using System.Text;

namespace Lista3_ATVD3
{
    class Time{
        private String nome;
        private Jogador[] titulares;
        private int quantTitulares;
        private Jogador[] reservas;
        private int quantReservas;

        public Time(String nome, Jogador[] titulares, Jogador[] reservas){
            this.nome = nome;
            this.titulares = titulares;
            this.quantTitulares = 0;
            this.reservas = reservas;
            this.quantReservas = 0;

            this.titulares = new Jogador[11];
            this.reservas = new Jogador[12];
        }

        public String GetNome() { return this.nome; }
        
        public void SetNome(String nome) { this.nome = nome;}

        public Boolean AdicionarTitular(Jogador jogador){
            Boolean adicionar = false;
            for (int i = 0; i < titulares.Length; i++){
                if (titulares[i] == null){
                    titulares[i] = jogador;
                    quantTitulares++;
                    adicionar = true;
                    //i = titulares.Length;
                }
                else{
                    Console.WriteLine("Tentativa {0}", i);

                    Console.WriteLine("Não há vagas!");
                }
            }
            return adicionar;
        }

        public Boolean AdicionarReserva(Jogador jogador) {
            Boolean adicionar = false;
            for (int i = 0; i < reservas.Length; i++){
                if (reservas[i] == null){
                    reservas[i] = jogador;
                    quantReservas++;
                    adicionar = true;
                    //i = reservas.Length;
                }
                else{
                    Console.WriteLine("Tentativa {0}", i);

                    Console.WriteLine("Não há vagas!");
                }
            }
            return adicionar;
        }
        public Boolean SubstituirTitular(String nomeTitular, Jogador jogador) {

            Boolean substituicao = false;

            for (int i = 0; i < titulares.Length; i++){

                if (titulares[i].GetNome == nomeTitular){
                    titulares[i] = jogador;
                    substituicao = true;
                }
            }

            return substituicao;
        }
        public Boolean SubstituirReserva(String nomeReserva, Jogador jogador) {
            Boolean substituicao = false;

            for (int i = 0; i < reservas.Length; i++){
                if (reservas[i] == nomeReserva){
                    reservas[i] = jogador;
                    substituicao = true;
                }
            }
            return substituicao;
        }
        public Boolean ConsultarTitular(String nomeTitular) {
            Boolean localizado = false;

            for (int i = 0; i < reservas.Length; i++){
                if (titulares[i] == nomeTitular){
                    localizado = true;
                }
            }
            return localizado;
        }
        public Boolean ConsultarReserva(String nomeReserva) {
            Boolean localizado = false;

            for (int i = 0; i < reservas.Length; i++){
                if (reservas[i] == nomeReserva){
                    localizado = true;
                }
            }
            return localizado;
        }
        public void ExcluirTitular(String nomeTitular) {

            for (int i = 0; i < titulares.Length; i++){
                if (titulares[i] == nomeTitular){
                    titulares[i] = null;
                    quantTitulares--;
                    Console.WriteLine("Jogador Excluído do Time Com Sucesso!");
                    for (int j = i; j < titulares.Length; j++){
                        if (titulares[j] == null){
                            titulares[j] = titulares[j + 1];
                        }
                    }
                }
            }
            //Solução para evitar nomes duplicados
            //titulares[titulares.Length] = null;
        }
        public void ExcluirReserva(String nomeReserva) {
            for (int i = 0; i < reservas.Length; i++){
                if (titulares[i] == nomeReserva){
                    titulares[i] = null;
                    quantReservas--;
                    Console.WriteLine("Jogador Excluído do Time Com Sucesso!");

                    for (int j = i; j < titulares.Length; j++){
                        if (titulares[j] == null){
                            titulares[j] = titulares[j + 1];
                        }
                    }
                }
            }
            //Solução para evitar nomes duplicados
            //titulares[titulares.Length] = null;

        }
        public void GerarArqTime(String escalacao) {
            try{
                //Cria ou abre um arquivo 
                StreamWriter arq = new StreamWriter("Escalação - "+ escalacao + "", true, Encoding.UTF8);
                arq.WriteLine("SELEÇÃO BRASILEIRA - FIFA 1970");
                arq.WriteLine("---------------------------------------------------");

                arq.WriteLine("ESCALAÇÃO - TIME TITULAR \n");
                for (int i = 0; i < titulares.Length; i++){
                    //Escreve no arquivo
                    arq.Write(" | " + titulares[i] + " | " + titulares[i].GetNumero + " | " + titulares[i].GetNome +" | " + titulares[i].GetPosicao + " | ");
                    arq.WriteLine("|------- | ------- | ------- |  ------- |");
                }

                arq.WriteLine("ESCALAÇÃO - TIME RESERVA");
                arq.WriteLine("---------------------------------------------------");
                for (int i = 0; i < reservas.Length; i++){
                    //Escreve no arquivo
                    arq.Write(" | " + reservas[i] + " | " + reservas[i].GetNumero + " | " + reservas[i].GetNome + " | " + reservas[i].GetPosicao + " | ");
                    arq.WriteLine("|------- | ------- | ------- |  ------- |");
                }
                //Fecha o arquivo
                arq.Close();
                Console.WriteLine("FIM");
            }
            catch (Exception e){
                Console.WriteLine("Exception: " + e.Message);
            }
            Console.ReadLine();
        }
    }
}
