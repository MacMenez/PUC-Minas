using System;
using System.Collections.Generic;
using System.Text;

namespace Lista3_ATVD4{
    class Biblioteca{
        private Livro[] livros;
      private int numLivros;
      private int maxLivros = 50;

      public void AdicionarLivro(String titulo, String autores, String editora){
        if(numLivros < maxLivros){
          livros[numLivros].SetTitulo(titulo);
          livros[numLivros].SetAutores(autores);
          livros[numLivros].SetEditora(editora);
          numLivros++;
        }
      }

      public void AdicionarLivro(Livro livro){
        livro[numLivros] = livro;
      }

      public LocalizarLivro(String nomeLivro){
        for(int i = 0; i < livros.Length; i++){
          if(livros[i].GetTitulo == nomeLivro){
            return livros[i];
          }else{
            Console.WriteLine("Livro Não Existe!");
            return null;
          }
        }
      }

      public Livro ListaLivros(){return livros;}

      public int TotalLivros(){return numLivros;}
    }
}
