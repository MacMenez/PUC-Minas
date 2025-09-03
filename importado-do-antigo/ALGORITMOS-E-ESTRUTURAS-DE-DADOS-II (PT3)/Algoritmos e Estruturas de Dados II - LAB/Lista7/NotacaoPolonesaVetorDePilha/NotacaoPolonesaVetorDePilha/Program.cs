using System;

namespace NotacaoPolonesaVetorDePilha{
    class Program{
        static void Main(){
            //Informar a expressão e salvar ela como String
            Console.WriteLine("Digite a expressão na notação polonesa reversa:");
            String expressao = Console.ReadLine();

            //Exibir o resultado da pilha como resultado final
            Console.WriteLine("Resultado: " + NotacaoPolonesaReversa(expressao));
        }

        static double NotacaoPolonesaReversa(String expressao){
            // Pilha criada com o tamanho de caracteres recohecidos na hora de digitar a expressão
            Pilha pilha = new Pilha(expressao.Length);//Criar pilha de vetor, pegar da internet

            //Pesquisar como reconhecer os digitos em um laço de reptição para avaliar a expressão
            foreach (char caractere in expressao){

                //Identificar o que é numeroe empilhar, identificar o que é operador e executar a operação necessária
                if (char.IsDigit(caractere)){

                    //Converter o numero de String para o numero de int/double
                    int numero = (int)char.GetNumericValue(caractere);
                    pilha.Empilhar((double)numero);
                }
                //Identificar qual tipo de operação será feita
                else if (caractere == '+' || caractere == '-' || caractere == '*' || caractere == '/'){

                    //Pensar. Se conseguir colocar situação para quando há mais sinais operadores que digitos ou em excesso
                    if (pilha.EstaVazia() || pilha.Tamanho < 2){
                        Console.WriteLine("Erro: Expressão malformada.");
                        return double.NaN;
                    }

                    //Armazenar valroes em variaveis para trabalhar as operações, evitar usar o desempilhar para não dar erro
                    double valor2 = pilha.Desempilhar();
                    double valor1 = pilha.Desempilhar();
                    double resultado = RealizarOperacao(valor1, valor2, caractere);
                    pilha.Empilhar(resultado);
                }
                //Criar situação para quando inserir expressões inválidas ou caracteres inválidos
                else{
                    Console.WriteLine("Caractere inválido na expressão: " + caractere);
                    return double.NaN;
                }
            }

            //Condição para verificar se a pilha está vazia ou não. vazia, utilizou todos os valores, não vazia está com algo a mais ou a menos
            if (pilha.Tamanho == 1){
                return pilha.Desempilhar();//Se for 1 retornar o proprio valor
            }
            else{
                Console.WriteLine("Erro: Expressão malformada.");
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
                    Console.WriteLine("Erro: Operador inválido.");
                    return double.NaN;
            }
        }
    }
}
