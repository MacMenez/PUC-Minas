using System;
using System.Collections.Generic;
using System.Text;

namespace ListaEncadeada{
	class ListaEncadeada{

		private Celula primeiro;
		private Celula ultimo;
		private int tamanho;

		public ListaEncadeada(){

			Celula sentinela = new Celula();

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

		public void inserir(Inteiro novo, int posicao){

			Celula anterior, novaCelula, proximaCelula;

			if ((posicao >= 0) && (posicao <= tamanho)){
				anterior = primeiro;
				for (int i = 0; i < posicao; i++)
					anterior = anterior.Proximo;

				novaCelula = new Celula(novo);

				proximaCelula = anterior.Proximo;

				anterior.Proximo = novaCelula;
				novaCelula.Proximo = proximaCelula;

				if (posicao == tamanho)  // a inserção ocorreu na última posição da lista
					ultimo = novaCelula;

				tamanho++;

			}
			else
				throw new Exception("Não foi possível inserir o item na lista: a posição informada é inválida!");
		}

		public Inteiro remover(int posicao){

			Celula anterior, celulaRemovida, proximaCelula;

			if (!listaVazia()){
				if ((posicao >= 0) && (posicao < tamanho)){
					anterior = primeiro;
					for (int i = 0; i < posicao; i++)
						anterior = anterior.Proximo;

					celulaRemovida = anterior.Proximo;

					proximaCelula = celulaRemovida.Proximo;

					anterior.Proximo = proximaCelula;
					celulaRemovida.Proximo = null;

					if (celulaRemovida == ultimo)
						ultimo = anterior;

					tamanho--;

					return (celulaRemovida.Item);
				}
				else
					throw new Exception("Não foi possível remover o item da lista: a posição informada é inválida!");
			}
			else
				throw new Exception("Não foi possível remover o item da lista: a lista está vazia!");
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
