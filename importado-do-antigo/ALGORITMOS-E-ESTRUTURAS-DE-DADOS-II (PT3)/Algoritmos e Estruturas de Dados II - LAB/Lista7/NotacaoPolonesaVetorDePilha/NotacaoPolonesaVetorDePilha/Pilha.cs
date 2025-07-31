using System;
using System.Collections.Generic;
using System.Text;

namespace NotacaoPolonesaVetorDePilha{
    class Pilha{
        
        private double[] vetor;

        private int tamanho;

        public int Tamanho{
            get { return tamanho; }
            set { tamanho = value; }
        }


        public Pilha(int capacidade){
            tamanho = 0;
            vetor = new double[capacidade];
        }

        public void Empilhar(double valor){
            if (tamanho < vetor.Length){
                vetor[tamanho] = valor;
                tamanho++;
            }
            else{
                Console.WriteLine("Erro: Pilha cheia.");
            }
        }

        public double Desempilhar(){
            if (tamanho > 0){
                tamanho--;
                return vetor[tamanho];
            }
            else{
                Console.WriteLine("Erro: Pilha vazia.");
                return double.NaN;
            }
        }

        public bool EstaVazia(){
            return tamanho == 0;
        }
    }
}
