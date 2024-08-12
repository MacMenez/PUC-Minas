import java.util.Scanner;

public class ParImpar{
  public static void imprimirParImpar(int valor){
    if(valor % 2 == 0){ System.out.println("1");}
    else{ System.out.println("2");}
  }

  public static void main(String[] args){
    int valor, valorDigitado;
    
    Scanner teclado = new Scanner(System.in);
    
    valor = teclado.nextInt();

    for(int i = 0; i < valor; i++){
      valorDigitado = teclado.nextInt();
      imprimirParImpar(valorDigitado);
    }
  }
}
