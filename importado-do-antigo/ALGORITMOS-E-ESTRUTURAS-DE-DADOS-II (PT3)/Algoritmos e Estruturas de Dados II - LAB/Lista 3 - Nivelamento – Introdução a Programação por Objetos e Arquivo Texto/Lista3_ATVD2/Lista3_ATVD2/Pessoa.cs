using System;

namespace Lista3_ATVD2{
    class Pessoa{
        //private Calendario data_de_nascimento;
        private int data_de_nascimento;
        private float peso;
        private float altura;

        Pessoa (int data_de_nascimento, float peso, float altura){
            this.data_de_nascimento = data_de_nascimento;
            this.peso = peso;
            this.altura = altura;
        }

        public double CalcularIMC(){
            double imc = this.peso / Math.Pow(this.altura, 2);
            return imc;
        }

        public int InformarIdade(int dataAtual){
            return dataAtual - this.data_de_nascimento;

        }
    }
}
            /*public int InformarIdade(Data diaAtual) {

                int idade;

                //PESSOA QUE FEZ ANIVERSÁRIO

                //06/06/2000 - data_de_nascimento
                //28 /08/2023 - diaAtual
                if (diaAtual.Mes >= data_de_nascimento.Mes){
                    if (diaAtual.Dia >= data_de_nascimento.Dia){
                        idade = diaAtual.Ano - data_de_nascimento.Ano;
                        return idade;
                    }
                }

                //PESSOA QUE FARÁ ANIVERSÁRIO
                //06/12/2000 - data_de_nascimento
                //28 /08/2023 - diaAtual
                if (diaAtual.Mes < data_de_nascimento.Mes){
                    idade = (diaAtual.Ano - data_de_nascimento.Ano) - 1;
                    return idade;
                }

            }*/