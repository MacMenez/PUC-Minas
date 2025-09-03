using System;

namespace FilaComVetor{
    class Program{
		public static void Main(String[] args){
			Fila minhaFila;
			Inteiro novo;
			Inteiro desenfileirado;

			minhaFila = new Fila(4);

			try{
				novo = new Inteiro(14);
				minhaFila.enfileirar(novo);

				novo = new Inteiro(10);
				minhaFila.enfileirar(novo);

				novo = new Inteiro(21);
				minhaFila.enfileirar(novo);

				novo = new Inteiro(3);
				minhaFila.enfileirar(novo);
			}
			catch (Exception e){
				Console.WriteLine(e.Message);   // Exibe essa mensagem ao tentar enfileirar o item 3
			}

			try{
				minhaFila.imprimir();    // 14 - 10 - 21
			}
			catch (Exception e){
				Console.WriteLine(e.Message);
			}

			try{
				desenfileirado = minhaFila.desenfileirar();
				Console.WriteLine("Desenfileirado: ");
				desenfileirado.imprimir();    // 14
			}
			catch (Exception e){
				Console.WriteLine(e.Message);
			}

			try{
				desenfileirado = minhaFila.desenfileirar();
				Console.WriteLine("Desenfileirado: ");
				desenfileirado.imprimir();    // 10
			}
			catch (Exception e){
				Console.WriteLine(e.Message);
			}

			try{
				novo = new Inteiro(3);
				minhaFila.enfileirar(novo);

				novo = new Inteiro(20);
				minhaFila.enfileirar(novo);
			}
			catch (Exception e){
				Console.WriteLine(e.Message);
			}

			try{
				minhaFila.imprimir();    // 21 - 3 - 20
			}
			catch (Exception e){
				Console.WriteLine(e.Message);
			}
		}
	}
}
