using System;
using System.Collections.Generic;
using System.Text;

namespace arvoreBinariaDeBusca{
    class No{

        private Inteiro item;
        public Inteiro Item{
            get { return item; }
            set { item = value; }
        }

        private No esquerda;
        public No Esquerda{
            get { return esquerda; }
            set { esquerda = value; }
        }

        private No direita;
        public No Direita{
            get { return direita; }
            set { direita = value; }
        }

        public No(){
            item = new Inteiro();
            esquerda = null;
            direita = null;
        }

        public No(Inteiro registro){
            item = registro;
            esquerda = null;
            direita = null;
        }
    }
}
