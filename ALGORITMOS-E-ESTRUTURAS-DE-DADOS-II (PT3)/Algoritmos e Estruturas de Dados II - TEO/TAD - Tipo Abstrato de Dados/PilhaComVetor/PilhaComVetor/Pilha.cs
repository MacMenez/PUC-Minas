using System;
using System.Collections.Generic;
using System.Text;

namespace PilhaComVetor{
	class Pilha{

		private Inteiro[] pilha;
		private int topo;

		public Pilha(int tamanho){

			pilha = new Inteiro[tamanho];
			topo = 0;
		}

		public Boolean pilhaCheia(){

			Boolean resp;

			if (topo == pilha.Length)
				resp = true;
			else
				resp = false;

			return resp;
		}

		public Boolean pilhaVazia(){

			Boolean resp;

			if (topo == 0)
				resp = true;
			else
				resp = false;

			return resp;
		}

		public Inteiro desempilhar(){

			Inteiro desempilhado;

			if (!pilhaVazia()){
				topo--;
				desempilhado = pilha[topo];
				return desempilhado;
			}
			else
				throw new Exception("Não foi possível desempilhar: a pilha está vazia!");
		}

		public void empilhar(Inteiro novo){

			if (!pilhaCheia()){
				pilha[topo] = novo;
				topo++;
			}
			else
				throw new Exception("Não foi possível empilhar: a pilha está cheia!");
		}

		public Inteiro consultarTopo(){

			if (!pilhaVazia()){
				return (pilha[topo - 1]);
			}
			else
				throw new Exception("Não foi possível consultar o elemento do topo da pilha: a pilha está vazia!");
		}
	}
}
