import java.util.Scanner;

class Palindromo{
  public static void palindromo(String palavra){
    int tamanho = palavra.length();
    boolean ePalindromo = true;

    for(int i=0; i < tamanho/2; i++){
      if(palavra.charAt(i) != palavra.charAt(tamanho-1-i)){
        ePalindromo = false;
        i = tamanho;
      }
    }

    if(ePalindromo){ System.out.println("SIM"); }
    else{ System.out.println("NAO"); }
   // System.out.println(palavra);
  }
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
      String palavra = teclado.nextLine();
      while(!palavra.equals("FIM")){
        palindromo(palavra);
        palavra = teclado.nextLine();
      }
    teclado.close();
  }
}
