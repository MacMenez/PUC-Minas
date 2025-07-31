using System;
using System.Collections.Generic;

namespace NotacaoPolonesaPilhaNativa{

    class Program{
        static void Main(){

            //Informar a expressão e salvar ela como String
            Console.WriteLine("Digite a expressão na notação polonesa reversa:");
            String expressao = Console.ReadLine();

            //Exibir o resultado da pilha como resultado final
            Console.WriteLine("Resultado: " + NotacaoPolonesaReversa(expressao));
        }

        static double NotacaoPolonesaReversa(String expressao){

            //Criar pilha nativa, pegar da internet
            Stack<double> pilha = new Stack<double>();

            //Pesquisar como reconhecer os digitos em um laço de reptição para avaliar a expressão
            foreach (char caractere in expressao){
                //Identificar o que é numeroe empilhar, identificar o que é operador e executar a operação necessária
                if (char.IsDigit(caractere)){
                    //Converter o numero de String para o numero de int/double
                    int numero = (int)char.GetNumericValue(caractere);
                    pilha.Push((double)numero);
                }

                //Identificar qual tipo de operação será feita
                else if (caractere == '+' || caractere == '-' || caractere == '*' || caractere == '/'){
                    //Pensar. Se conseguir colocar situação para quando há mais sinais operadores que digitos ou em excesso
                    if (pilha.Count < 2){
                        Console.WriteLine("Expressão inválida: não há operandos suficientes.");
                        return double.NaN;
                    }

                    //Armazenar valroes em variaveis para trabalhar as operações, evitar usar o pop para não dar erro
                    double valor2 = pilha.Pop();
                    double valor1 = pilha.Pop();

                    //Fazer operação conforme os resultados dos IF anteriores
                    double resultado = RealizarOperacao(valor1, valor2, caractere);
                    pilha.Push(resultado);
                }
                //Criar situação para quando inserir expressões inválidas ou caracteres inválidos
                else{
                    Console.WriteLine("Caractere inválido na expressão: " + caractere);
                    return double.NaN;
                }
            }

            //Condição para verificar se a pilha está vazia ou não. vazia, utilizou todos os valores, não vazia está com algo a mais ou a menos
            if (pilha.Count == 1){return pilha.Pop();}

            else{
                Console.WriteLine("Expressão inválida: operandos não utilizados.");
                return double.NaN;
            }
        }

        static double RealizarOperacao(double valor1, double valor2, char operador){
            switch (operador){
                case '+':
                    return valor1 + valor2;
                case '-':
                    return valor1 - valor2;
                case '*':
                    return valor1 * valor2;
                case '/':
                    if (valor2 == 0){
                        Console.WriteLine("Erro: Divisão por zero.");
                        return double.NaN;
                    }
                    return valor1 / valor2;
                default:
                    return double.NaN;
            }
        }
    }

}
