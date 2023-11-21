using System;
using System.Collections.Generic;
using System.Text;

namespace arvoreAVL{
    class ABB{
        private No raiz;

        public ABB(){ raiz = null; }

        // chave: 19
        public Inteiro pesquisar(int chave){ return pesquisar(this.raiz, chave); }

        // 1.a execução:
        // raizSubarvore: 16
        // chave: 19
        // retorna o resultado da 2.a execução do método pesquisar: 19
        // 2.a execução:
        // raizSubarvore: 23
        // chave: 19
        // retorna o resultado da 3.a execução do método pesquisar: 19
        // 3.a execução:
        // raizSubarvore: 19
        // chave: 19
        // retorna: 19
        private Inteiro pesquisar(No raizSubarvore, int chave){

            if (raizSubarvore == null)
                return null;
            else if (chave == raizSubarvore.Item.Valor)
                return raizSubarvore.Item;
            else if (chave > raizSubarvore.Item.Valor)
                return pesquisar(raizSubarvore.Direita, chave);
            else
                return pesquisar(raizSubarvore.Esquerda, chave);
        }

        // novo: 11
        // atribuir à raiz da árvore o retorno da 1.a execução do método inserir: 16
        public void inserir(Inteiro novo){ this.raiz = inserir(this.raiz, novo); }

        // 1.a execução:
        // raizSubarvore: 16
        // novo: 11
        // atribuir à subárvore esquerda do 16 o retorno da 2.a execução do método inserir: 8
        // retorno: 16
        // 2.a execução:
        // raizSubarvore: 8
        // novo: 11
        // atribuir à subárvore direita do 8 o retorno da 3.a execução do método inserir: 11
        // retorno: 8
        // 3.a execução:
        // raizSubarvore: null
        // novo: 11
        // retorno: 11
        private No inserir(No raizSubarvore, Inteiro novo){

            if (raizSubarvore == null)
                raizSubarvore = new No(novo);
            else if (novo.Valor == raizSubarvore.Item.Valor)
                throw new Exception("Não foi possível inserir o item na árvore: chave já inseriada anteriormente!");
            else if (novo.Valor < raizSubarvore.Item.Valor)
                raizSubarvore.Esquerda = inserir(raizSubarvore.Esquerda, novo);
            else
                raizSubarvore.Direita = inserir(raizSubarvore.Direita, novo);

            return balancear(raizSubarvore);
        }

        private No balancear(No raizSubarvore){

            int fatorBalanceamento;
            int fatorBalanceamentoFilho;

            fatorBalanceamento = raizSubarvore.getFatorBalanceamento();

            if (fatorBalanceamento == 2){
                // árvore desbalanceada para a esquerda.
                fatorBalanceamentoFilho = raizSubarvore.Esquerda.getFatorBalanceamento();
                if (fatorBalanceamentoFilho == -1){
                    // rotação dupla.
                    // rotação do filho à esquerda.
                    raizSubarvore.Esquerda = rotacionarEsquerda(raizSubarvore.Esquerda);
                }
                // rotação à direita.
                raizSubarvore = rotacionarDireita(raizSubarvore);
            }
            else if (fatorBalanceamento == -2){
                // árvore desbalanceada para a direita.
                fatorBalanceamentoFilho = raizSubarvore.Direita.getFatorBalanceamento();
                if (fatorBalanceamentoFilho == 1){
                    // rotação dupla.
                    // rotação do filho à direita.
                    raizSubarvore.Direita = rotacionarDireita(raizSubarvore.Direita);
                }
                // rotação à esquerda.
                raizSubarvore = rotacionarEsquerda(raizSubarvore);
            }
            else
                raizSubarvore.setAltura();

            return raizSubarvore;
        }

        private No rotacionarDireita(No p){

            No u = p.Esquerda;
            No filhoEsquerdaDireita = u.Direita;  // triângulo vermelho

            u.Direita = p;
            p.Esquerda = filhoEsquerdaDireita;

            p.setAltura();
            u.setAltura();

            return u;
        }

        private No rotacionarEsquerda(No p){

            No z = p.Direita;
            No filhoDireitaEsquerda = z.Esquerda;  // triângulo vermelho

            z.Esquerda = p;
            p.Direita = filhoDireitaEsquerda;

            p.setAltura();
            z.setAltura();

            return z;
        }

        // chaveRemover: 19
        // raiz = retorno da 1.a execução do método remover --> 16
        public void remover(int chaveRemover){ this.raiz = remover(this.raiz, chaveRemover); }

        // 1.a execução:
        // raizSubarvore: 16
        // chaveRemover: 19
        // subárvore à direita do 16 = retorno da 2.a execução do método remover --> 23
        // retorna: 16
        // 2.a execução:
        // raizSubarvore: 23
        // chaveRemover: 19
        // subárvore à esquerda do 23 = retorno da 3.a execução do método remover --> null
        // retorna: 23
        // 3.a execução:
        // raizSubarvore: 19
        // chaveRemover: 19
        // retorna: null
        private No remover(No raizSubarvore, int chaveRemover){

            if (raizSubarvore == null)
                throw new Exception("Não foi possível remover o item da árvore: chave não encontrada!");
            else if (chaveRemover == raizSubarvore.Item.Valor){
                if (raizSubarvore.Esquerda == null)
                    raizSubarvore = raizSubarvore.Direita;
                else if (raizSubarvore.Direita == null)
                    raizSubarvore = raizSubarvore.Esquerda;
                else
                    raizSubarvore.Esquerda = antecessor(raizSubarvore, raizSubarvore.Esquerda);
            }
            else if (chaveRemover > raizSubarvore.Item.Valor)
                raizSubarvore.Direita = remover(raizSubarvore.Direita, chaveRemover);
            else
                raizSubarvore.Esquerda = remover(raizSubarvore.Esquerda, chaveRemover);

            return balancear(raizSubarvore);
        }

        private No antecessor(No noRetirar, No raizSubarvore){

            if (raizSubarvore.Direita != null)
                raizSubarvore.Direita = antecessor(noRetirar, raizSubarvore.Direita);
            else{
                noRetirar.Item = raizSubarvore.Item;
                raizSubarvore = raizSubarvore.Esquerda;
            }

            return balancear(raizSubarvore);
        }

        public void caminhamentoEmOrdem(){ caminhamentoEmOrdem(this.raiz); }

        private void caminhamentoEmOrdem(No raizSubarvore){

            if (raizSubarvore != null){
                caminhamentoEmOrdem(raizSubarvore.Esquerda);
                raizSubarvore.Item.imprimir();
                caminhamentoEmOrdem(raizSubarvore.Direita);
            }
        }
    }
}
