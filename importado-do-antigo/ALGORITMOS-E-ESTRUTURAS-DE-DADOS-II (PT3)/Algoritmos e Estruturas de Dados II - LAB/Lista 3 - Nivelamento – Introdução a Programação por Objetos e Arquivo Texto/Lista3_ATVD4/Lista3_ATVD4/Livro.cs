using System;
using System.Collections.Generic;
using System.Text;

namespace Lista3_ATVD4{
    class Livro{
        private String titulo;
        private String autores;
        private String editora;

        public Livro(String titulo, String autores, String editora){
            this.titulo = titulo;
            this.autores = autores;
            this.editora = editora;
        }

        public String GetTitulo() { return this.titulo; }
        public void SetTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String GetAutores() { return this.autores; }
        public void SetAutores(String autores) {
            this.autores = autores;
        }

        public String GetEditora() { return this.editora; }
        public void SetEditora(String editora) {
            this.editora = editora;
        }
    }
}
