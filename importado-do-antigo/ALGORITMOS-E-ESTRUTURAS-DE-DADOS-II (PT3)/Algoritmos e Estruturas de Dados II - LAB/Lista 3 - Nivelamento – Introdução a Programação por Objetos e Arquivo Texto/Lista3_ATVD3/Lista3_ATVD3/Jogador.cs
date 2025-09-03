using System;
using System.Collections.Generic;
using System.Text;

namespace Lista3_ATVD3{
    class Jogador{
        private int numero;
        private String nome;
        private String posicao;

        public Jogador(int numero, String nome, String posicao){
            this.numero = numero;
            this.nome = nome;
            this.posicao = posicao;
        }

        public int GetNumero(){ return this.numero; }

        public void SetNumero(int numero){ this.numero = numero;}

        public String GetNome(){ return this.nome;}

        public void SetNome(String nome){ this.nome = nome;}

        public String GetPosicao(){ return this.posicao;}

        public void SetPosicao(String posicao){ this.posicao = posicao;}

    }
}
