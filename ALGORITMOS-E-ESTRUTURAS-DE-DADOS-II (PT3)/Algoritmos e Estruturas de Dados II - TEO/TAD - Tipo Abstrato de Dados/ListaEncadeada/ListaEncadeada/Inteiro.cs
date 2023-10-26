using System;
using System.Collections.Generic;
using System.Text;

namespace ListaEncadeada{
	class Inteiro{

		private int valor;
		public int Valor{
			get { return valor; }
			set { valor = value; }
		}

		public Inteiro(int valor){
			this.valor = valor;
		}

		public Inteiro(){
			valor = 0;
		}

		public void imprimir(){
			Console.WriteLine("Valor -> " + valor);
		}
	}
}
