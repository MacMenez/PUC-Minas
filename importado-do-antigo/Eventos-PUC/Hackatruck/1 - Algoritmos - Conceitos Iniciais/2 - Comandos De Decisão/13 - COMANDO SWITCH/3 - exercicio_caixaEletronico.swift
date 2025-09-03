/*
    ********************
        ENUNCIADO
    ********************
    Vamos treinar? Faça um caixa eletrônico!  Vamos fazer um depósito, 
    crie um switch que imprima qual nota foi inserida, sua variável pode ser uma String ou um Int.

*/


/*
    ********************
        RESOLUÇÃO
    ********************
*/

var nota = 3


switch nota {
case 1:
    print("Nota de 1 real")
case 2:
    print("Nota de 2 reais")
case 5:
    print("Nota de 5 reais")
case 10:
    print("Nota de 10 reais")
case 20:
    print("Nota de 20 reais")
case 50:
    print("Nota de 50 reais")
case 100:
    print("Nota de 100 reais")
default:
    print("Nota inválida")
}