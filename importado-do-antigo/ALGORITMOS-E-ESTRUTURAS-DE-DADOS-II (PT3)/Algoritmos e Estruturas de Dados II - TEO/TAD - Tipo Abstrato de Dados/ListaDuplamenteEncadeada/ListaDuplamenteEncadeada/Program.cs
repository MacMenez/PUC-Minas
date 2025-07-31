using System;

namespace ListaDuplamenteEncadeada{
    class Program{
		public static void Main(string[] args){
			ListaDuplamenteEncadeada minhaLista;
			Inteiro novo, removido;

			minhaLista = new ListaDuplamenteEncadeada();

			try{
				novo = new Inteiro(1);
				minhaLista.inserirFinal(novo);  // 1

				novo = new Inteiro(11);
				minhaLista.inserirFinal(novo);  // 1 - 11

				novo = new Inteiro(21);
				minhaLista.inserirFinal(novo);  // 1 - 11 - 21

				novo = new Inteiro(4);
				minhaLista.inserirFinal(novo);  // 1 - 11 - 21 - 4

				novo = new Inteiro(20);
				minhaLista.inserirFinal(novo);  // 1 - 1 - 21 - 4 - 20
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);
			}

			try{
				minhaLista.imprimir();  // 1 - 11 - 21 - 4 - 20
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);
			}

			try{
				removido = minhaLista.removerFinal();
				Console.WriteLine("Item removido: ");  // 20
				removido.imprimir();
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);
			}

			try{
				minhaLista.imprimir();  // 1 - 11 - 21 - 4
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);
			}
		}
	}
}
