#include <stdio.h>
/*Não consegue ler números decimal. Quando se digita os valores, 
o mesmo entra em loop e apresenta erros. 
Não consegui resolver o problema dentro do prazo.*/
int main() {
    int flag = 0, opcao, loop = 1;
    float saque, saldoConta = 0, deposito = 0, trasferencia = 0;

    do
    {
        printf(
            "1 - Saque \n"
            "2 - Depósito \n"
            "3 - Trasferência Bancária \n"
            "4 - Saldo \n"
            "5 - Encerrar Operação \n"
            "---> "
        );
        scanf("%d", &opcao);

        switch (opcao){
            case 1:
                printf("Valor do Saque: R$");
                scanf("%f", &saque);
                
                if (saldoConta < saque){
                    printf("\nSALDO INSUFICIENTE! \n");
                    
                    printf("Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->");
                    scanf("%d", &flag);
                }
                else{
                    printf("\n Valor Saque: %.2f \n", saque);

                    saldoConta = saldoConta - saque;

                    printf("SALDO CONTA: %.2f \n\n", saldoConta);
                    
                    printf("Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->");
                    scanf("%d", &flag);
                }
                
            break;

            case 2:
                printf("Valor do Depósito: R$");
                scanf("%f", &deposito);

                saldoConta = saldoConta + deposito;

                printf("Saldo Atual: R$%.2f \n\n", saldoConta);

                printf("Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->");
                scanf("%d", &flag);
            break;

            case 3:
                printf("\n\nInforme o valor da trasferência: R$");
                scanf("%f", &trasferencia);

                if (saldoConta < trasferencia){
                    printf("\nSALDO INSUFICIENTE! \n");
                    
                    printf("Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->");
                    scanf("%d", &flag);
                }
                else{
                    printf("Saldo Conta: R$%.2f \n",saldoConta);

                    saldoConta = saldoConta - trasferencia;

                    printf("Valor da Trasferência: %.2f \n", trasferencia);
                    printf("Saldo Final: R$%.2f \n\n",saldoConta);

                    printf("Deseja realizar outra operação? \n1 - Sim   2 - Não \n --->");
                    scanf("%d", &flag);
                }
            break;

            case 4:
                printf("\n\nSALDO ATUAL: R$%.2f \n", saldoConta);
            break;

            case 5:
                printf("OPERAÇÃO ENCERRADA! \nVOLTE SEMPRE!");
                loop = 0;
            break;
            
            default:
                printf("Opção Inválida!");
            break;

            if (flag == 2){
                printf("OPERAÇÃO ENCERRADA! \nVOLTE SEMPRE!");
                loop = 0;
            }
            
        }
    } while (loop == 1);
    
    return 0;
}
  