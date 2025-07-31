using System;

namespace Lista2_ATV4{
    /*
     Classe Contato, com atributos nome, celular, email, aniversario (tipo Data). Crie um método construtor
    que receberá como parâmetro: nome, celular, email dia do aniversário e mês do aniversário. Crie um outro
    método construtor que receberá como parâmetro: nome, celular, data do aniversário (tipo Data). Crie os
    métodos Get e Set
     */
    class Contato{
        private String nome;
        private String celular;
        private String email;
        private Data aniversario;

        public Contato(String nome, String celular, String email, int dia, int mes) {
            this.nome = nome;
            this.celular = celular;
            this.email = email;
            aniversario = new Data(dia, mes);
        }

        public Contato(String nome, String celular, String email, Data aniversario) {
            this.nome = nome;
            this.celular = celular;
            this.email = email;
            this.aniversario = aniversario;
        }

        public String Nome{
            get { return nome; }
            set { nome = value; }
        }

        public String Celular{
            get { return celular; }
            set { celular = value; }
        }

        public String Email{
            get { return email; }
            set { email = value; }
        }

        public Data Aniversario{
            get { return aniversario; }
            set { aniversario = value; }
        }
    }
}
