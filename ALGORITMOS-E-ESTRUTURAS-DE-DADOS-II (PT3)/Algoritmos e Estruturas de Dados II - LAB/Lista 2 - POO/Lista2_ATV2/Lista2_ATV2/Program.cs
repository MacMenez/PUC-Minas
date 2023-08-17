using System;

/*
a) Escreva um método construtor para a classe. O construtor deve receber como parâmetro o código
e o nome do cliente. No construtor o atributo limiteCredito deve receber zero, e o atributo
eClienteEspecial deve receber false.
b) Escreva um método GetNome. O método não deve ter parâmetros e deve retornar o atributo nome.
c) Escreva um método AtualizarLimite que atualize o limite de crédito do cliente. O método deverá
receber como parâmetro um valor do tipo double. Caso o cliente seja especial, o seu limite de
crédito deverá ser atualizado com o valor recebido como parâmetro e o método deverá retornar
true, indicando que a operação foi realizada. Caso contrário, o método deverá retornar false.
d) Escreva um método AtualizarCategoria que atualize a categoria do cliente (o seu atributo
eClienteEspecial). O método deverá receber como parâmetro um boolean. Além de atualizar o
referido atributo com o valor recebido como parâmetro, se este valor for false, o atributo
limiteCredito deverá ser atualizado com o valor 0 (zero). Visto que, somente Cliente Especiais
podem ter crédito.
e) Crie uma classe Teste que contenha o método Main. No Main, crie três clientes e utilize todos os
métodos da classe Cliente
 */

namespace Lista2_ATV2{
    class Program{
        static void Main(string[] args){
            Console.WriteLine("Hello World!");
        }
    }
}
