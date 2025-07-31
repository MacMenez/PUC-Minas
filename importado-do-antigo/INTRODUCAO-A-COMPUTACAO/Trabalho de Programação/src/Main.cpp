/*Apresentou erros no reconhecimentos das variáveis
tipo float e não mostrou os valores corretamente. 
Não consegui resolver o problema dentro do prazo.*/
#include <iostream>

using std::cout;
using std::endl;

int main() {
    bool loop = true;
    int flag = 0, opcao;
    float saque, saldoConta = 0, deposito = 0, trasferencia = 0;

    do
    {
        std::cout <<
            "1 - Saque \n"
            "2 - Depósito \n"
            "3 - Trasferência Bancária \n"
            "4 - Saldo \n"
            "5 - Encerrar Operação \n"
            "---> "
        ;
        std::cin >> opcao;

        switch (opcao){
            case 1:
                std::cout << "Valor do Saque: R$";
                std::cin >>  saque;
                
                if (saldoConta < saque){
                    std::cout << "\nSALDO INSUFICIENTE! \n";
                    
                    std::cout << "Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->";
                    std::cin >>  flag;
                }
                else{
                    std::cout << "\n Valor Saque: %.2f \n", saque;

                    saldoConta = saldoConta - saque;

                    std::cout << "SALDO CONTA: %.2f \n\n", saldoConta;
                    
                    std::cout << "Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->";
                    std::cin >>  flag;
                }
                
            break;

            case 2:
                std::cout << "Valor do Depósito: R$";
                std::cin >> deposito;

                saldoConta = saldoConta + deposito;

                std::cout << "Saldo Atual: R$%.2f \n\n", saldoConta;

                std::cout << "Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->";
                std::cin >> flag;
            break;

            case 3:
                std::cout << "\n\nInforme o valor da trasferência: R$";
                std::cin >> trasferencia;

                if (saldoConta < trasferencia){
                    std::cout << "\nSALDO INSUFICIENTE! \n";
                    
                    std::cout << "Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->";
                    std::cin >> flag;
                }
                else{
                    std::cout << "Saldo Conta: R$%.2f \n",saldoConta;

                    saldoConta = saldoConta - trasferencia;

                    std::cout << "Valor da Trasferência: %.2f \n", trasferencia;
                    std::cout << "Saldo Final: R$%.2f \n\n",saldoConta;

                    std::cout << "Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->";
                    std::cin >> flag;
                }
            break;

            case 4:
                std::cout <<"\n\nSALDO ATUAL: R$%.2f \n", saldoConta;
            break;

            case 5:
                std::cout << "OPERAÇÃO ENCERRADA! \nVOLTE SEMPRE!";
                loop = false;
            break;
            
            default:
                std::cout << "Opção Inválida!";
            break;

            if (flag == 2){
                std::cout << "OPERAÇÃO ENCERRADA! \nVOLTE SEMPRE!";
                loop = false;
            }
            
        }
    } while (loop == true);

    return 0;
}