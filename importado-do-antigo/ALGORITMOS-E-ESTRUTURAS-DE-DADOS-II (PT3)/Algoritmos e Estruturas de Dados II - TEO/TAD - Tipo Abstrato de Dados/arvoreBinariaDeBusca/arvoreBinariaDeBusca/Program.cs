using System;

namespace arvoreBinariaDeBusca{
    class Program{
        public static void Main(string[] args){

            ABB minhaArvore = new ABB();
            Inteiro novo, pesquisado;

            try{
                novo = new Inteiro(16);
                minhaArvore.inserir(novo);

                novo = new Inteiro(8);
                minhaArvore.inserir(novo);

                novo = new Inteiro(4);
                minhaArvore.inserir(novo);

                novo = new Inteiro(5);
                minhaArvore.inserir(novo);

                novo = new Inteiro(23);
                minhaArvore.inserir(novo);

                novo = new Inteiro(19);
                minhaArvore.inserir(novo);

                novo = new Inteiro(27);
                minhaArvore.inserir(novo);
            }
            catch (Exception erro){ Console.WriteLine(erro.Message); }

            Console.WriteLine("Caminhamento central na árvore:");
            minhaArvore.caminhamentoEmOrdem();   // 4 - 5 - 8 - 16 - 19 - 23 - 27

            try
            {
                novo = new Inteiro(11);
                minhaArvore.inserir(novo);
            }
            catch (Exception erro){ Console.WriteLine(erro.Message); }

            pesquisado = minhaArvore.pesquisar(19);
            if (pesquisado != null){
                Console.WriteLine("Elemento pesquisado: ");  // 19
                pesquisado.imprimir();
            }
            else
                Console.WriteLine("O elemento não foi encontrado na árvore!");

            try{ minhaArvore.remover(19); }
            catch (Exception erro){ Console.WriteLine(erro.Message); }

            Console.WriteLine("Caminhamento central na árvore:");
            minhaArvore.caminhamentoEmOrdem();   // 4 - 5 - 8 - 11 - 16 - 23 - 27

            pesquisado = minhaArvore.pesquisar(19);
            if (pesquisado != null)
            {
                Console.WriteLine("Elemento pesquisado: ");
                pesquisado.imprimir();
            }
            else
                Console.WriteLine("O elemento pesquisado não foi encontrado na árvore!");  // Essa mensagem deve ser exibida.
        }
    }
}
