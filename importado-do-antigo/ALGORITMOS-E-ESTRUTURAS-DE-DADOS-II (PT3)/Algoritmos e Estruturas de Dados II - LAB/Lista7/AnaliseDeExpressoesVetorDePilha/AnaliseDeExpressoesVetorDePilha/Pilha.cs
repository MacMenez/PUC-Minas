using System;
using System.Collections.Generic;
using System.Text;

namespace AnaliseDeExpressoesVetorDePilha
{
    class Pilha<T>{
        private T[] array;
        private int tamanho;
        private int capacidade;

        public Pilha(int capacidade){
            this.capacidade = capacidade;
            this.array = new T[capacidade];
            this.tamanho = 0;
        }

        public void Empilhar(T item){
            if (tamanho < capacidade){
                array[tamanho] = item;
                tamanho++;
            }
            else{Console.WriteLine("Pilha cheia, não é possível empilhar.");}
        }

        public T Desempilhar(){
            if (tamanho > 0){
                tamanho--;
                return array[tamanho];
            }
            else{
                Console.WriteLine("Pilha vazia, não é possível desempilhar.");
                return default(T);
            }
        }

        public bool Vazia(){return tamanho == 0;}
    }
}
