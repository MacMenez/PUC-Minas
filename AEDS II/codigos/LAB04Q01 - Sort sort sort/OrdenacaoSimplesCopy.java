import java.util.*;

public class OrdenacaoSimplesCopy {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            String informacao = teclado.nextLine();
            String[] valores = informacao.split(" ");

            // Verificar se a entrada é "0 0" para sair do loop
            if (valores[0].equals("0") && valores[1].equals("0")) {
                System.out.println("0 0"); // Imprimir os dois zeros para finalizar a saída
                break;
            }

            // Ler N e M
            int totalNumeros = Integer.parseInt(valores[0]);
            int valorModulo = Integer.parseInt(valores[1]);

            // Ler os números
            int[] numeros = new int[totalNumeros];
            for (int i = 0; i < totalNumeros; i++) {
                numeros[i] = Integer.parseInt(teclado.nextLine());
            }

            // Ordenar os números manualmente
            ordenar(numeros, valorModulo);

            System.out.println(totalNumeros + " " + valorModulo);
            for (int numero : numeros) {
                System.out.println(numero);
            }
        }

        teclado.close();
    }
    
    private static void ordenar(int[] numeros, int valorModulo) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                // Calcular o módulo de ambos os números
                int modulo1 = (numeros[i] % valorModulo + valorModulo) % valorModulo;
                int modulo2 = (numeros[j] % valorModulo + valorModulo) % valorModulo;

                // Comparar os módulos
                if (modulo1 > modulo2) {
                    // Se o módulo do segundo número é menor, troca os números
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                } else if (modulo1 == modulo2) {
                    // Se os módulos são iguais, aplicar as regras de empate
                    if (numeros[i] % 2 == 1 && numeros[j] % 2 == 0) {
                        // Se o primeiro é ímpar e o segundo é par, não precisa trocar
                    } else if (numeros[i] % 2 == 0 && numeros[j] % 2 == 1) {
                        // Se o primeiro é par e o segundo é ímpar, trocar
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    } else if (numeros[i] % 2 == 1 && numeros[j] % 2 == 1) {
                        // Se ambos são ímpares, o maior vem primeiro
                        if (numeros[i] < numeros[j]) {
                            int temp = numeros[i];
                            numeros[i] = numeros[j];
                            numeros[j] = temp;
                        }
                    } else {
                        // Se ambos são pares, o menor vem primeiro
                        if (numeros[i] > numeros[j]) {
                            int temp = numeros[i];
                            numeros[i] = numeros[j];
                            numeros[j] = temp;
                        }
                    }
                }
            }
        }
    }
}