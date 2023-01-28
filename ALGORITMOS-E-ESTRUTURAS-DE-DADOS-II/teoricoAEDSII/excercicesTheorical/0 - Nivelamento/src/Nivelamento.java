import java.util.Scanner;

public class Nivelamento {
    public static void main(String[] args) throws Exception {
        String digitoUsusario;

        Scanner entrada = new Scanner(System.in);
            System.out.println("Informe um símbolo do seu teclado!");
            digitoUsusario = entrada.next();

            switch (digitoUsusario) {
                case digitoUsusario = '>':
                    System.out.println("Sinal de Maior");
                break;
                
                case digitoUsusario = '<':
                    System.out.println("Sinal de Menor");
                break;

                case digitoUsusario = '=':
                    System.out.println("Sinal de Igual");
                break;
            
                default:
                    System.out.println("Outro Sinal");
                break;
            }
        entrada.close();
    }
}
