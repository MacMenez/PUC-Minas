using System;

namespace ListaComVetor{
    class Program{
        static void Main(string[] args){
            ListaLinear minhaLista;
            Inteiro novo, removido;

            minhaLista = new ListaLinear(4);

            try{
                novo = new Inteiro(1);
                minhaLista.inserir(novo, 0);  // 1

                novo = new Inteiro(11);
                minhaLista.inserir(novo, 0);  // 11 - 1

                novo = new Inteiro(21);
                minhaLista.inserir(novo, 2);  // 11 - 1 - 21

                novo = new Inteiro(4);
                minhaLista.inserir(novo, 2);  // 11 - 1 - 4 - 21

                novo = new Inteiro(20);
                minhaLista.inserir(novo, 3);  // 11 - 1 - 4 - 21
            }
            catch (Exception erro){
                Console.WriteLine(erro.Message);  // Essa mensagem de erro deve ser exibida.
            }

            try{
                minhaLista.imprimir();  // 11 - 1 - 4 - 21
            }
            catch (Exception erro){
                Console.WriteLine(erro.Message);
            }

            try{
                removido = minhaLista.remover(1);
                Console.WriteLine("Item removido: ");  // 1
                removido.imprimir();
            }
            catch (Exception erro){
                Console.WriteLine(erro.Message);
            }

            try{
                minhaLista.imprimir();  // 11 - 4 - 21
            }
            catch (Exception erro){
                Console.WriteLine(erro.Message);
            }

            try{
                removido = minhaLista.remover(3);
                Console.WriteLine("Item removido: ");
                removido.imprimir();
            }
            catch (Exception erro){
                Console.WriteLine(erro.Message);  // Essa mensagem deve ser exibida.
            }
        }
    }
}