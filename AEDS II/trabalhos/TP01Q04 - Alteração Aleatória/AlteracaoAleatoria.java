import java.io.*;
import java.nio.charset.*;
import java.util.Scanner;

class AlteracaoAleatoria {

   private static String alteracaoString(String informacao) {
      char letraSorteada1 = 'a';
      char letraSorteada2 = 'b';

      for (int i = 0; i < informacao.length(); i++) {
         if ((informacao.charAt(i)).equals(letraSorteada1)) {
            // code
         }
      }
   }

   public static void alteracao(String informacao) { System.out.println(alteracaoString(informacao)); }

   public static void main(String args[]) {
      Scanner teclado = new Scanner(System.in);
         String informacao = "";

         while (!informacao.equals("FIM")) {
            informacao = teclado.nextLine();
            alteracao(informacao);
         }
      teclado.close();
   }
}