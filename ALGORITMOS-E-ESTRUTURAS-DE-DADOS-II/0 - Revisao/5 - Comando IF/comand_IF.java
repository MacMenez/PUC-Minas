import java.util.Scanner;

public class comand_IF {
    public static void main(String[] args) {
        int num;

        Scanner teclado = new Scanner(System.in);
            System.out.print("Digite um número: ");
            num = teclado.nextInt();

            if (num < 0) {
                System.out.printf("\nO número %d é negativo!", num);
            }
            else{
                //Considerar 0 como nulo.
                if (num == 0) {
                    System.out.printf("\nO número %d é nulo!", num);
                }
                else{
                    System.out.printf("\nO número %d é positivo!", num);
                }
            }
        teclado.close();
    }
}
