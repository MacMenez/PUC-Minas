/*
    ********************
        ENUNCIADO
    ********************
    Vamos treinar? Faça um caixa eletrônico!  Vamos fazer um depósito, 
    crie um switch que imprima qual nota foi inserida, sua variável pode ser uma String ou um Int.

*/

    
print("********************")
print(" CAIXA ELETRÔNICO   ")
print("********************")

var valorDeposito: Int = 100

switch valorDeposito {
    case 1:
        print("Valor de R$ \(valorDeposito) depositado com sucesso! Operação finalizada.")
    case 2:
        print("Valor de R$ \(valorDeposito) depositado com sucesso! Operação finalizada.")
    case 5:
        print("Valor de R$ \(valorDeposito) depositado com sucesso! Operação finalizada.")
    case 10:
        print("Valor de R$ \(valorDeposito) depositado com sucesso! Operação finalizada.")
    case 20:
        print("Valor de R$ \(valorDeposito) depositado com sucesso! Operação finalizada.")
    case 50:
        print("Valor de R$ \(valorDeposito) depositado com sucesso! Operação finalizada.")
    case 100:
        print("Valor de R$ \(valorDeposito) depositado com sucesso! Operação finalizada.")
    default:
        print("Valor inválido! Operação Cancelada")
    
}