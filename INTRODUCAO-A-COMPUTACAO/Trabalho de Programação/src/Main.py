# Programa consegue ler opções mas não as considera para entrar nos IF/ELSE ou SWITCH.
# Sempre que se digita a opção do menu, o loop sobressai e não executa o resto.
# Não consegui resolver o problema dentro do prazo.
loop = True
flag = 0
opcao = 0
saque = 0.00
saldoConta = 0.00
deposito = 0.00
trasferencia = 0.00

while (loop == True):
    print("1 - Saque")
    print("2 - Depósito")
    print("3 - Trasferência Bancária")
    print("4 - Saldo")
    print("5 - Encerrar Operação")
    opcao = input()

    if (opcao == 1):
        print("Valor do Saque: R$")
        saque = input()
        
        if (saldoConta < saque):
            print("SALDO INSUFICIENTE! \n\n")
            print("Deseja realizar outra operação? \n1 - Sim   2 - Não -> ")
            flag = input()
        else:
            saldoConta = saldoConta - saque
            print("Valor Saque: R$", saque)
            print("SALDO CONTA: R$", saldoConta)
            print("Deseja realizar outra operação? \n1 - Sim   2 - Não -> ")
            flag = input()
            
    if (opcao == 2):
        print("Valor do Depósito: R$")
        deposito = input()
        saldoConta = saldoConta + deposito
        print("Saldo Atual: R$", saldoConta)
        
        print("Deseja realizar outra operação? \n1 - Sim   2 - Não -> ")
        flag = input()
    
    if (opcao == 3):
        print("Informe o valor da trasferência: R$")
        trasferencia = input()
        
        if (saldoConta < trasferencia):
            print("SALDO INSUFICIENTE!")
            print("Saldo Conta: R$")
            print("Deseja realizar outra operação? \n1 - Sim   2 - Não -> ")
            flag = input()
        else:
            print("Saldo Conta: R$", saldoConta)
            saldoConta = saldoConta - trasferencia
            print("Valor da Trasferência:", trasferencia)
            print("Saldo Final: R$", saldoConta)
            
            print("Deseja realizar outra operação? \n1 - Sim   2 - Não -> ")
            flag = input()
        
        if (opcao == 4):
            print("SALDO ATUAL: R$")
            print("Deseja realizar outra operação? \n1 - Sim   2 - Não -> ")
            flag = input()
            
    if (opcao == 5 or flag == 2):
        print("OPERAÇÃO ENCERRADA! \nVOLTE SEMPRE!")
        break