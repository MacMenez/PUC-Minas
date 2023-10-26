using System;
using System.Collections.Generic;
using System.Text;

namespace ListaDuplamenteEncadeada{
	class ListaDuplamenteEncadeada{
		private Celula primeiro;
		private Celula ultimo;
		private int tamanho;

		public ListaDuplamenteEncadeada(){
			Celula sentinela;

			sentinela = new Celula();

			primeiro = sentinela;
			ultimo = sentinela;

			tamanho = 0;
		}

		public Boolean listaVazia(){

			Boolean resp;

			if (primeiro == ultimo)
				resp = true;
			else
				resp = false;

			return resp;
		}

		public void inserirFinal(Inteiro novo){
			Celula novaCelula;

			novaCelula = new Celula(novo);

			ultimo.Proximo = novaCelula;
			novaCelula.Anterior = ultimo;

			ultimo = novaCelula;

			tamanho++;

		}

		public Inteiro removerFinal(){
			Celula removida, penultima;

			if (!listaVazia()){
				removida = ultimo;

				penultima = ultimo.Anterior;
				penultima.Proximo = null;
				removida.Anterior = null;

				ultimo = penultima;

				tamanho--;

				return (removida.Item);
			}
			else
				throw new Exception("Não foi possível remover o último item da lista: a lista está vazia!");
		}

		public void imprimir(){
			Celula aux;

			if (!listaVazia()){
				Console.WriteLine("Conteúdo da lista:");
				aux = primeiro.Proximo;
				while (aux != null){
					aux.Item.imprimir();
					aux = aux.Proximo;
				}
			}
			else
				throw new Exception("Não foi possível imprimir o conteúdo da lista: a lista está vazia!");
		}
	}
}
