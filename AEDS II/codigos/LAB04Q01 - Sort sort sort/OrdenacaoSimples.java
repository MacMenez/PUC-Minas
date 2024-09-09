import java.util.*;

public class OrdenacaoSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            String informacao = teclado.nextLine();
            String[] valores = informacao.split(" ");
            int totalNumeros = Integer.parseInt(valores[0]);
            int valorModulo = Integer.parseInt(valores[1]);
            while (informacao.equals("0 0")) {
                informacao = teclado.nextLine();
                
            }
        teclado.close();
    }
}
