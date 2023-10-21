using System;

namespace PilhaComVetor{
    class Program{
        static void Main(string[] args){
			Pilha minhaPilha;
			Inteiro novo;
			Inteiro topo;
			Inteiro desempilhado;

			minhaPilha = new Pilha(4);

			novo = new Inteiro(25);
			try{
				minhaPilha.empilhar(novo);
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);
			}

			novo = new Inteiro(10);
			try{
				minhaPilha.empilhar(novo);
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);
			}

			novo = new Inteiro(21);
			try{
				minhaPilha.empilhar(novo);
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);
			}

			novo = new Inteiro(3);
			try{
				minhaPilha.empilhar(novo);
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);
			}

			novo = new Inteiro(20);
			try{
				minhaPilha.empilhar(novo);
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);  // Essa mensagem deve ser exibida.
			}

			try{
				topo = minhaPilha.consultarTopo();
				Console.WriteLine("Elemento do topo da pilha: ");
				topo.imprimir();  // 3
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);
			}

			try{
				desempilhado = minhaPilha.desempilhar();
				Console.WriteLine("Elemento desempilhado: ");
				desempilhado.imprimir();  // 3
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);
			}

			try{
				topo = minhaPilha.consultarTopo();
				Console.WriteLine("Elemento do topo da pilha: ");
				topo.imprimir();  // 21
			}
			catch (Exception erro){
				Console.WriteLine(erro.Message);
			}
		}
    }
}
