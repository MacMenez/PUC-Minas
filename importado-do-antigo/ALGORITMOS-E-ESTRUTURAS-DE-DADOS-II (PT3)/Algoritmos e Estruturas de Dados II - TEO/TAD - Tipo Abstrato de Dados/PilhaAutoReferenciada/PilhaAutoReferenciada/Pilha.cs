using System;
using System.Collections.Generic;
using System.Text;

namespace PilhaAutoReferenciada{
	class Pilha{

		private Celula fundo;
		private Celula topo;

		public Pilha(){

			Celula sentinela;

			sentinela = new Celula();
			fundo = sentinela;
			topo = sentinela;
		}

		public Boolean pilhaVazia(){

			Boolean resp;

			if (topo == fundo)
				resp = true;
			else
				resp = false;

			return resp;
		}

		public void empilhar(Inteiro novo){

			Celula novaCelula;

			novaCelula = new Celula(novo);
			novaCelula.Proximo = topo;
			topo = novaCelula;
		}

		public Inteiro desempilhar(){

			Celula desempilhado;

			if (!pilhaVazia()){
				desempilhado = topo;
				topo = topo.Proximo;
				desempilhado.Proximo = null;
				return (desempilhado.Item);
			}
			else
				throw new Exception("Não foi possível desempilhar: a pilha está vazia!");
		}

		public Inteiro consultarTopo(){

			if (!pilhaVazia()){
				return (topo.Item);
			}
			else
				throw new Exception("Não foi possível consultar o topo da pilha: a pilha está vazia!");
		}
	}
}
