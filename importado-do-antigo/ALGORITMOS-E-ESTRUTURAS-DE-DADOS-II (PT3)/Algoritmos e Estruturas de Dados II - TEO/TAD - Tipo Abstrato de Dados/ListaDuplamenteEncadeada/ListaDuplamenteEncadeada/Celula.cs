using System;
using System.Collections.Generic;
using System.Text;

namespace ListaDuplamenteEncadeada{
	class Celula{
		private Inteiro item;
		public Inteiro Item{
			get { return item; }
			set { item = value; }
		}

		private Celula proximo;
		public Celula Proximo{
			get { return proximo; }
			set { proximo = value; }
		}

		private Celula anterior;
		public Celula Anterior{
			get { return anterior; }
			set { anterior = value; }
		}

		public Celula(Inteiro novo){
			item = novo;
			anterior = null;
			proximo = null;
		}

		public Celula(){
			item = new Inteiro();
			anterior = null;
			proximo = null;
		}
	}
}
