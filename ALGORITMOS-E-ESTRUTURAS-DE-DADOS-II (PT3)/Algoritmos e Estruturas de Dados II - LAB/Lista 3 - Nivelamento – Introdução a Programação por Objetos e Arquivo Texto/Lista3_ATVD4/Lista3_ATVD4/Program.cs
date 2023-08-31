using System;

namespace Lista3_ATVD4{
    class Program{
        //Sistema Para Controle da Biblioteca Pessoal
        static void Main(string[] args){
            
            
            Biblioteca biblioteca = new Biblioteca();

            Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "Editora ABC");
            Livro livro2 = new Livro("1984", "George Orwell", "Editora XYZ");
            Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Editora PQR");
            Livro livro4 = new Livro("A Revolução dos Bichos", "George Orwell", "Editora XYZ");
            Livro livro5 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", "Editora UVW");

            Console.WriteLine("INSERINDO LIVROS NA BIBLIOTECA");
            Console.WriteLine("Previamente Cadastrados!");
            biblioteca.AdicionarLivro(livro1);
            biblioteca.AdicionarLivro(livro2);
            biblioteca.AdicionarLivro(livro3);
            biblioteca.AdicionarLivro(livro4);
            biblioteca.AdicionarLivro(livro5);

            Console.WriteLine("Manualmente Cadastrados!");
            biblioteca.AdicionarLivro("O Hobbit", "J.R.R. Tolkien", "Editora XYZ");
            biblioteca.AdicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Editora ABC");
            biblioteca.AdicionarLivro("A Menina que Roubava Livros", "Markus Zusak", "Editora PQR");
            biblioteca.AdicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", "Editora XYZ");
            biblioteca.AdicionarLivro("A Culpa é das Estrelas", "John Green", "Editora DEF");

            Console.WriteLine(biblioteca.TotalLivros());
            Console.WriteLine(biblioteca.LocalizarLivro("O Pequeno Príncipe"));
            Console.WriteLine(biblioteca.LocalizarLivro("O Hobbit"));

            biblioteca.ListaLivros();
        }
    }
}
