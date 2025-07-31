using System;
using System.Collections.Generic;
using System.Text;

namespace ListaComVetor{
	class ListaLinear{

		private Inteiro[] lista;
		private int primeiro;
		private int ultimo;
		private int tamanho;

		public ListaLinear(int M){

			lista = new Inteiro[M];
			tamanho = 0;
			primeiro = 0;
			ultimo = 0;
		}

		public Boolean listaVazia(){
			Boolean resp;

			if (primeiro == ultimo)
				resp = true;
			else
				resp = false;

			return resp;
		}

		public Boolean listaCheia(){
			Boolean resp;

			if (ultimo == lista.Length)
				// if (tamanho == lista.Length)
				resp = true;
			else
				resp = false;

			return resp;
		}

		public void inserir(Inteiro novo, int posicao){
			if (!listaCheia()){
				if ((posicao >= 0) && (posicao <= tamanho)){
					for (int i = ultimo; i > posicao; i--)
						lista[i] = lista[i - 1];

					lista[posicao] = novo;

					ultimo++;
					tamanho++;
				}
				else
					throw new Exception("Não foi possível inserir o item na lista: posição informada é inválida!");
			}
			else
				throw new Exception("Não foi possível inserir o item na lista: a lista está cheia!");
		}

		public Inteiro remover(int posicao){
			Inteiro removido;

			if (!listaVazia()){
				if ((posicao >= 0) && (posicao < tamanho)){
					removido = lista[posicao];
					tamanho--;

					for (int i = posicao; i < tamanho; i++){
						lista[i] = lista[i + 1];
					}

					ultimo--;

					return removido;
				}
				else
					throw new Exception("Não foi possível remover o item da lista: posição informada é inválida!");
			}
			else
				throw new Exception("Não foi possível remover o item da lista: a lista está vazia!");
		}

		public void imprimir(){

			if (!listaVazia()){

				for (int i = primeiro; i < ultimo; i++){
					Console.WriteLine("Posição: " + i + ": ");
					lista[i].imprimir();
				}
			}
			else
				throw new Exception("Não foi possível imprimir o conteúdo da lista: a lista está vazia!");
		}
	}
}
