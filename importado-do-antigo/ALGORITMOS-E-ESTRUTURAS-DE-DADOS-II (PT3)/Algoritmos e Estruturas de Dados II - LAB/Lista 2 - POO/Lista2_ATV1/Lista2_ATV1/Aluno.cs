using System;

namespace Lista2_ATV1{
    class Aluno {
        private String nome;
        private int idade;
        private double peso;
        private Boolean formando;
        private char sexo;

        public Aluno (String nome, int idade, double peso, Boolean formando, char sexo){
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.formando = false;
            this.sexo = sexo;
        }

        public String Nome { get; set; }
        public int Idade { get; set; }
        public double Peso { get; set; }
        public Boolean Formando { get; set; }
        public char Sexo { get; set; }

    }
}
