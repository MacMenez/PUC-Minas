import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /*
            Em JAVA números flutuantes são inseridos com ","
            Agora, caso queira usar em cálculos ou atribuições usar o "."

            Cálculo = 1.5 + 0
            Inserir = 1,5
        */
        
        Scanner teclado = new Scanner(System.in);           
            boolean loop;
            int flag = 0;
            double saque, saldoConta = 0, deposito = 0, trasferencia = 0;
            do {           
                System.out.println(
                    "\n" +
                    "1 - Saque \n" +
                    "2 - Depósito \n" +
                    "3 - Trasferência Bancária \n" +
                    "4 - Saldo \n" +
                    "5 - Encerrar Operação"
                );
                int opcao = teclado.nextInt();

                if (opcao == 1) {
                    System.out.print("Valor do Saque: R$");
                    saque = teclado.nextDouble();
                
                    if (saldoConta < saque) {
                        System.out.println("\nSALDO INSUFICIENTE! \n");
                
                        System.out.println("Deseja realizar outra operação? \n1 - Sim   2 - Não");
                        flag = teclado.nextInt();
                    } else {
                        saldoConta = saldoConta - saque;
                        
                        System.out.printf("\n Valor Saque: %.2f \n SALDO CONTA: %.2f \n\n", saque, saldoConta);
                        
                        System.out.println("Deseja realizar outra operação? \n1 - Sim   2 - Não");
                        flag = teclado.nextInt();
                    }
                }

                if (opcao == 2) {
                    System.out.print("Valor do Depósito: R$");
                    deposito = teclado.nextDouble();
                
                    saldoConta = saldoConta + deposito;
                
                    System.out.printf("saldo Atual: R$%.2f \n\n", saldoConta);
                
                    System.out.println("Deseja realizar outra operação? \n1 - Sim   2 - Não");
                    flag = teclado.nextInt();
                }

                if (opcao == 3) {
                    System.out.print("\n\nInforme o valor da trasferência: R$");
                    trasferencia = teclado.nextDouble();
                    
                    if (saldoConta < trasferencia) {
                        System.out.println("\nSALDO INSUFICIENTE! \n");
                
                        System.out.println("Deseja realizar outra operação? \n1 - Sim   2 - Não");
                        flag = teclado.nextInt();
                    } else {
                        System.out.printf("Saldo Conta: R$%.2f \n",saldoConta);

                        saldoConta = saldoConta - trasferencia;

                        System.out.printf("Valor da Trasferência: %.2f \n", trasferencia);
                        System.out.printf("Saldo Final: R$%.2f \n\n",saldoConta);

                        System.out.println("Deseja realizar outra operação? \n1 - Sim   2 - Não");
                        flag = teclado.nextInt();
                    }
                }
                
                if (opcao == 4) {
                    System.out.printf("\n\nSALDO ATUAL: R$%.2f \n", saldoConta);

                    System.out.println("Deseja realizar outra operação? \n1 - Sim   2 - Não");
                    flag = teclado.nextInt();
                }

                if (opcao == 5 || flag == 2) {
                    System.out.println("OPERAÇÃO ENCERRADA! \nVOLTE SEMPRE!");
                    loop = false;
                } else {
                    loop = true;
                }
            } while (loop == true);
        teclado.close();
    }
}