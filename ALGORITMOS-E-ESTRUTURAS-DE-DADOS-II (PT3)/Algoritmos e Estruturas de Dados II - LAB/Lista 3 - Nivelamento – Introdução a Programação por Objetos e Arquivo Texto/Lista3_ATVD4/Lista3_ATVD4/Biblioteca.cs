using System;
using System.Collections.Generic;
using System.Text;

namespace Lista3_ATVD4{
    class Biblioteca{
        private Livro[] vetorLivros;
      private int numLivros;
      private int maxLivros = 50;

        public Biblioteca(){
            this.numLivros = 0;
            vetorLivros = new Livro[maxLivros];
        }

      public void AdicionarLivro(String titulo, String autores, String editora){
        if(numLivros < maxLivros){
          vetorLivros[numLivros] = new Livro(titulo, autores, editora);
          this.numLivros++;
        }
      }

      public void AdicionarLivro(Livro livro){
            if (numLivros < maxLivros){
                vetorLivros[numLivros] = livro;
                this.numLivros++;
            }
      }

      public String LocalizarLivro(String nomeLivro){
        String localizado = null;

        for(int i = 0; i < numLivros; i++){
          if(vetorLivros[i].GetTitulo() == nomeLivro){
            localizado = vetorLivros[i].GetTitulo();
          }
        }

        return localizado;
      }

      public void ListaLivros(){
            for (int i = 0; i < numLivros; i++){
                Console.WriteLine("---------------------------");
                Console.WriteLine(vetorLivros[i].GetTitulo() + "\n" + vetorLivros[i].GetAutores() + "\n" + vetorLivros[i].GetEditora());
            }
        }

      public int TotalLivros(){return numLivros;}
    }
}