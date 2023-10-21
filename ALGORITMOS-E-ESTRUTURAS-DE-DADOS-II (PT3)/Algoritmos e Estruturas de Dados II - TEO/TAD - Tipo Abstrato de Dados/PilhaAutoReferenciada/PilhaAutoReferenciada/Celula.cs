using System;
using System.Collections.Generic;
using System.Text;

namespace PilhaAutoReferenciada{
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

		public Celula(Inteiro novo){
			item = novo;
			proximo = null;
		}

		public Celula(){

			item = new Inteiro();
			proximo = null;
		}
	}
}
