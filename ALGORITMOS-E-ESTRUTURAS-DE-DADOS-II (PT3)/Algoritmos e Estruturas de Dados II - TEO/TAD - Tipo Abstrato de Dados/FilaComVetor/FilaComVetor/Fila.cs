using System;
using System.Collections.Generic;
using System.Text;

namespace FilaComVetor{
	class Fila{
		private Inteiro[] fila;
		private int frente;
		private int tras;
		private int tamanho;

		public Fila(int tamanho){
			fila = new Inteiro[tamanho];
			frente = 0;
			tras = 0;
			this.tamanho = tamanho;
		}

		public Boolean filaVazia(){
			Boolean resp;

			if (frente == tras)
				resp = true;
			else
				resp = false;

			return resp;
		}

		public Boolean filaCheia(){
			Boolean resp;

			if (((tras + 1) % tamanho) == (frente % tamanho))
				resp = true;
			else
				resp = false;

			return resp;
		}

		public void enfileirar(Inteiro novo){
			int posicao;

			if (!filaCheia()){
				posicao = tras % tamanho;
				fila[posicao] = novo;
				tras++;
			}
			else
				throw new Exception("Não foi possível enfileirar o novo elemento: a fila está cheia!");
		}

		public Inteiro desenfileirar(){
			Inteiro desenfileirado;
			int posicao;

			if (!filaVazia()){
				posicao = frente % tamanho;
				desenfileirado = fila[posicao];
				frente++;
				return desenfileirado;
			}
			else
				throw new Exception("Não foi possível desenfileirar nenhum elemento: a fila está vazia!");
		}

		public void imprimir(){
			int posicao;
			if (!filaVazia()){
				Console.WriteLine("Conteúdo da fila:");
				for (int i = frente; i < tras; i++){
					posicao = i % tamanho;
					Console.WriteLine("Posição: " + posicao + ": ");
					fila[posicao].imprimir();
				}
			}
			else
				throw new Exception("Não foi possível mostrar o conteúdo da fila: a fila está vazia!");
		}
	}
}
