import java.util.Scanner;

public class App {
    public static Boolean palindromo(String palavra){}

    public static Boolean fimLeitura(String palavra){ return palavra.equals("FIM"); }

    public static String lerLinha(){
        Scanner infoTeclado = new Scanner(System.in);
            String linha = infoTeclado.nextLine();
        infoTeclado.close();

        return linha;
    }

    public static void main(String[] args) throws Exception {
        String linha = lerLinha();

        while(!fimLeitura(linha)){
            if(palindromo(linha)){ System.out.println("SIM"); }
            else{ System.out.println("NAO"); }

            lerLinha();
        }
    }
}
