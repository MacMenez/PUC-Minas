using System;
/*Considera todas as opções inválidas, tanto em IF/ELSE quanto em SWITCH. 
Não consegui resolver o problema dentro do prazo.*/
class Program {
    static void Main(string[] args) {
        bool loop = true;
        int flag = 0, opcao;
        decimal saque, saldoConta = 0, deposito = 0, trasferencia = 0;

        do
        {
            Console.Write(
                "1 - Saque \n"
                "2 - Depósito \n"
                "3 - Trasferência Bancária \n"
                "4 - Saldo \n"
                "5 - Encerrar Operação \n"
                "---> "
            );
            opcao = Console.Read();

            switch (opcao){
                case 1:
                    Console.Write("Valor do Saque: R$");
                    saque = Console.Read();
                    
                    if (saldoConta < saque){
                        Console.Write("\nSALDO INSUFICIENTE! \n");
                        
                        Console.Write("Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->");
                        flag = Console.Read();
                    }
                    else{
                        Console.Write("\n Valor Saque: %.2f \n", saque);

                        saldoConta = saldoConta - saque;

                        Console.Write("SALDO CONTA: %.2f \n\n", saldoConta);
                        
                        Console.Write("Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->");
                        flag = Console.Read();
                    }
                break;

                case 2:
                    Console.Write("Valor do Depósito: R$");
                    deposito = Console.Read();

                    saldoConta = saldoConta + deposito;

                    Console.Write("Saldo Atual: R$%.2f \n\n", saldoConta);

                    Console.Write("Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->");
                    flag = Console.Read();
                break;

                case 3:
                    Console.Write("\n\nInforme o valor da trasferência: R$");
                    trasferencia = Console.Read();

                    if (saldoConta < trasferencia){
                        Console.Write("\nSALDO INSUFICIENTE! \n");
                        
                        Console.Write("Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->");
                        flag = Console.Read();
                    }
                    else{
                        Console.Write("Saldo Conta: R$%.2f \n",saldoConta);

                        saldoConta = saldoConta - trasferencia;

                        Console.Write("Valor da Trasferência: %.2f \n", trasferencia);
                        Console.Write("Saldo Final: R$%.2f \n\n",saldoConta);

                        Console.Write("Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->");
                        flag = Console.Read();
                    }
                break;

                case 4:
                    Console.Write("\n\nSALDO ATUAL: R$%.2f \n", saldoConta);
                break;

                case 5:
                    Console.Write("OPERAÇÃO ENCERRADA! \nVOLTE SEMPRE!");
                    loop = false;
                break;
                
                default:
                    Console.Write("Opção Inválida!");
                break;

                if (flag == 2){
                    Console.Write("OPERAÇÃO ENCERRADA! \nVOLTE SEMPRE!");
                    loop = false;
                }
            }
        } while (loop == true);
    }
}