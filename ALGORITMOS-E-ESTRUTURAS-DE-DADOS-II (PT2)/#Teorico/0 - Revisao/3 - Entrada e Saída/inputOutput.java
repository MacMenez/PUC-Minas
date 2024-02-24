import java.util.Scanner; //Tem que importar a iblioteca que for utilizada

public class inputOutput {
    public static void main(String[] args) {
        System.out.print(""); //Saída Padrão
        System.out.println(""); //Saída Padrão + Pula 1 linha

        //Deve-se instanciar um objeto, no caso teclado
        Scanner teclado = new Scanner(System.in);
            String s = teclado.nextLine();
            int num = teclado.nextInt();
            float num2 = teclado.nextFloat();
        teclado.close();

        //Exemplo
        String nome;
        int idade;
        float altura;

        Scanner entrada = new Scanner(System.in);
            System.out.print("Digite seu primeiro nome: ");
            nome = entrada.nextLine();

            System.out.print("Digite sua idade: ");
            idade = entrada.nextInt();

            System.out.print("Digite sua altura: ");
            altura = entrada.nextFloat();

            System.out.print("\n" + nome + " tem " + idade + " anoes de idade e mede " + altura + "m.");
        entrada.close();

    }
}
