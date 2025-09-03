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

        public Time(String nome){
            this.nome = nome;
            this.quantTitulares = 0;
            this.quantReservas = 0;

            this.titulares = new Jogador[11];
            this.reservas = new Jogador[12];
        }

        public String GetNome() { return this.nome; }
        
        public void SetNome(String nome) { this.nome = nome;}

        public Boolean AdicionarTitular(Jogador jogador){
            Boolean adicionar = false;
            if (quantTitulares < titulares.Length)
            {
                titulares[quantTitulares] = jogador;
                quantTitulares++;
                adicionar = true;
            }
               
            return adicionar;
        }

        public Boolean AdicionarReserva(Jogador jogador) {
            Boolean adicionar = false;
            if (quantReservas < reservas.Length)
            {
                reservas[quantReservas] = jogador;
                quantReservas++;
                adicionar = true;
            }

            return adicionar;
        }
        public Boolean SubstituirTitular(String nomeTitular, Jogador jogador) {

            Boolean substituicao = false;

            for (int i = 0; i < titulares.Length; i++){

                if (titulares[i].GetNome() == nomeTitular){
                    titulares[i] = jogador;
                    substituicao = true;
                    //i = titulares.Length; //Encerrar o Loop e evitar ter que diditar null em tudo
                }
            }

            return substituicao;
        }
        public Boolean SubstituirReserva(String nomeReserva, Jogador jogador) {
            Boolean substituicao = false;

            for (int i = 0; i < reservas.Length; i++){
                if (reservas[i].GetNome() == nomeReserva){
                    reservas[i] = jogador;
                    substituicao = true;
                    //i = reservas.Length; //Encerrar o Loop e evitar ter que diditar null em tudo
                }
            }
            return substituicao;
        }
        public Boolean ConsultarTitular(String nomeTitular) {
            Boolean localizado = false;

            for (int i = 0; i < titulares.Length; i++){
                if (titulares[i].GetNome() == nomeTitular){
                    localizado = true;
                }
            }
            return localizado;
        }
        public Boolean ConsultarReserva(String nomeReserva) {
            Boolean localizado = false;

            for (int i = 0; i < reservas.Length; i++){
                if (reservas[i].GetNome() == nomeReserva){
                    localizado = true;
                }
            }
            return localizado;
        }
        public void ExcluirTitular(String nomeTitular) {

            for (int i = 0; i < quantTitulares; i++){
                if (titulares[i].GetNome() == nomeTitular){
                    titulares[i] = null;
                    quantTitulares--;
                    Console.WriteLine("Jogador Excluído do Time Com Sucesso!");
                    for (int j = i; j < quantTitulares; j++){
                        if (titulares[j] == null){
                            titulares[j] = titulares[j + 1];
                        }
                    }
                }
            }
        }
        public void ExcluirReserva(String nomeReserva) {
            for (int i = 0; i < quantReservas; i++){
                if (reservas[i].GetNome() == nomeReserva){
                    reservas[i] = null;
                    quantReservas--;
                    Console.WriteLine("Jogador Excluído do Time Com Sucesso!");

                    for (int j = i; j < quantReservas; j++){
                        if (reservas[j] == null){
                            reservas[j] = reservas[j + 1];
                        }
                    }
                }
            }
        }
        public void GerarArqTime(String escalacao) {
            try{
                //Cria ou abre um arquivo 
                StreamWriter arq = new StreamWriter("Escalação - "+ escalacao + "", true, Encoding.UTF8);
                arq.WriteLine(GetNome());
                arq.WriteLine("---------------------------------------------------");

                arq.WriteLine("\n\nESCALAÇÃO - TIME TITULAR \n");
                arq.WriteLine("--------------------------------- \n");
                arq.WriteLine("| -------- | -------| -----| --------|");
                arq.WriteLine("| REGISTRO | CAMISA | NOME | POSIÇÃO |");
                arq.WriteLine("| -------- | -------| -----| --------|");
                for (int i = 0; i < titulares.Length; i++){
                    //Escreve no arquivo
                    arq.Write(" | " + i + " | " + titulares[i].GetNumero() + " | " + titulares[i].GetNome() +" | " + titulares[i].GetPosicao() + " | \n");
                }

                arq.WriteLine("\n\nESCALAÇÃO - TIME RESERVA");
                arq.WriteLine("--------------------------------- \n");
                arq.WriteLine("| -------- | -------| -----| --------|");
                arq.WriteLine("| REGISTRO | CAMISA | NOME | POSIÇÃO |");
                arq.WriteLine("| -------- | -------| -----| --------|");
                for (int i = 0; i < reservas.Length; i++){
                    //Escreve no arquivo
                    arq.Write(" | " + i + " | " + reservas[i].GetNumero() + " | " + reservas[i].GetNome() + " | " + reservas[i].GetPosicao() + " | \n");
                }
                //Fecha o arquivo
                arq.Close();
                Console.WriteLine("FIM");

                Console.WriteLine("Arquivo de Escalação Gerados Com Sucesso!");
            }
            catch (Exception e){
                Console.WriteLine("Exception: " + e.Message);
            }
            Console.ReadLine();
        }
    }
}
