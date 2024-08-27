/**
 * @author Davi Carneiro Menez
 * @version 1 08/2024
 * 
 * Sequência Espelho em Java - Imprimir números em sequência é uma tarefa relativamente
 * simples. Mas, e quando se trata de uma sequência espelho? Trata-se de uma sequência que
 * possui um número de inı́cio e um número de fim, e todos os números entre estes, inclusive estes,
 * são dispostos em uma sequência crescente, sem espaços e, em seguida, esta sequência é projetada
 * de forma invertida, como um reflexo no espelho. Por exemplo, se a sequência for de 7 a 12, o
 * resultado ficaria 789101112211101987
*/

import java.util.Scanner;

class Espelhamento{
  public static void espelhamento(int inicio, int fim){
    String sequencia = "";
    for(int i = inicio; i <= fim; i++){
      sequencia += i;
    }
    for(int i = sequencia.length()-1; i >= 0; i--){
      sequencia += sequencia.charAt(i);
    }
    System.out.println(sequencia);
  }
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int inicio, fim;

    while(teclado.hasNext()){
      inicio = teclado.nextInt();
      fim = teclado.nextInt();
      espelhamento(inicio, fim);
      //System.out.println("Token: " + teclado.next());
    }
    teclado.close();
  }
}
