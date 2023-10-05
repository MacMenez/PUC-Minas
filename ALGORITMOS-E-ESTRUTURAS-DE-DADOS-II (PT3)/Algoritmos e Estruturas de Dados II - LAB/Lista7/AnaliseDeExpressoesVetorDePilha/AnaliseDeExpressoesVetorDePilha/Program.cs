using System;

namespace AnaliseDeExpressoesVetorDePilha{
    class Program{
        static void Main(){
            Console.WriteLine("Informe a sequência que deseja:");
            string sequencia = Console.ReadLine();

            //Criar casos para situação da expressão correta e incoreta
            if (VerificarSequenciaBemFormada(sequencia)){Console.WriteLine("A sequência está bem-formada.");}

            else{Console.WriteLine("A sequência está malformada.");}
        }

        /*
            REGRA
            ( ( ) [ ( ) ] ) a sequência está bem-formada
            ( [ ) ] a sequência está malformada
            ( ) ] a sequência está malformada
            ( ) ( a sequência está malformada

            Dica: os abre parênteses e abre colchetes devem ser empilhados. Quando vier um fecha parênteses deve ser
            desempilhado um caractere da pilha.

         */

        static bool VerificarSequenciaBemFormada(string sequencia){

            //Criar classe "Pilha" e criar um objeto "pilha"
            Pilha<char> pilha = new Pilha<char>(sequencia.Length);

            foreach (char caractere in sequencia){
                if (caractere == '(' || caractere == '['){pilha.Empilhar(caractere);}

                else if (caractere == ')' || caractere == ']'){

                    // Situação para quando não tiver um fechamento de uma expressão informada
                    if (pilha.Vazia()){return false;}

                    char topoDaPilha = pilha.Desempilhar();

                    //Regra para comparação de opções informadas no enunciado do exercício
                    if ((caractere == ')' && topoDaPilha != '(') || (caractere == ']' && topoDaPilha != '[')){
                        return false;
                    }
                }
            }

            // A sequência correta se a pilha estiver vazia no final
            return pilha.Vazia();
        }
    }
}
