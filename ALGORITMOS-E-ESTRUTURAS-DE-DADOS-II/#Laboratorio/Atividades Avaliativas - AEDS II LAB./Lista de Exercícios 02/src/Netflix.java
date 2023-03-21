import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) throws Exception {
        MyIO.setCharset("UTF-8");

        Filme[] vetorFilmes = new Filme[2000];

        String linha = MyIO.readLine();

        while (!linha.equals("FIM")) {
            int i = 0;
            vetorFilmes[i].ler(linha);
            linha = MyIO.readLine();
            i++;
        }

        //Filme[] pesquisar = new Filme[2000];
        Scanner teclado = new Scanner(System.in);
            String pesquisarTitulo;

            System.out.print("Informe o Titulo do filme que deseja pesquisar: ");
            pesquisarTitulo = teclado.nextLine();

            for (int i = 0; i < vetorFilmes.length; i++) {
                if (vetorFilmes[i].getTitulo() == pesquisarTitulo) {
                    vetorFilmes.toString();
                }
            }
        teclado.close();

    }
}
