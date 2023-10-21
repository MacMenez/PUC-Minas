using System;
using System.Collections.Generic;
using System.Text;

namespace FilaAutoReferenciada{
	class Fila{
		private Celula frente;
		private Celula tras;

		public Fila(){

			Celula sentinela;

			sentinela = new Celula();
			frente = sentinela;
			tras = sentinela;
		}

		public Boolean filaVazia(){

			Boolean resp;

			if (frente == tras)
				resp = true;
			else
				resp = false;

			return resp;
		}

		public void enfileirar(Inteiro novo){

			Celula novaCelula;

			novaCelula = new Celula(novo);

			tras.Proximo = novaCelula;
			tras = novaCelula;
		}

		public Inteiro desenfileirar(){

			Celula celulaDesenfileirada;
			Celula proximaCelula;

			if (!filaVazia()){

				celulaDesenfileirada = frente.Proximo;
				proximaCelula = celulaDesenfileirada.Proximo;
				frente.Proximo = proximaCelula;

				if (celulaDesenfileirada == tras) // se a célula retirada for a última célula da fila
					tras = frente;

				return (celulaDesenfileirada.Item);
			}
			else
				throw new Exception("Não foi possível desenfileirar nenhum item: a fila está vazia!");
		}

		public void imprimir(){

			Celula aux;

			if (!filaVazia()){
				Console.WriteLine("Conteúdo da fila:");

				aux = frente.Proximo;

				while (aux != null){
					aux.Item.imprimir();
					aux = aux.Proximo;
				}
			}
			else
				throw new Exception("Não foi possível imprimir o conteúdo da fila: a fila está vazia!");
		}
	}
}
