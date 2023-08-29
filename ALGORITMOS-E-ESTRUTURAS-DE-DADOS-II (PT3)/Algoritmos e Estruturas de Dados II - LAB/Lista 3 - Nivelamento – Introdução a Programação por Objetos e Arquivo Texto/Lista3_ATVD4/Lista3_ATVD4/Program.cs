using System;

namespace Lista3_ATVD4{
    class Program{
        //Sistema Para Controle da Biblioteca Pessoal
        static void Main(string[] args){
            Biblioteca biblioteca = new Biblioteca();
            biblioteca.AdicionarLivro();
            biblioteca.AdicionarLivro();
            biblioteca.AdicionarLivro();
            biblioteca.AdicionarLivro();

            biblioteca.LocalizarLivro("Livro1");
        }
    }
}
