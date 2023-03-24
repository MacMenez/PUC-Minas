/*
Não consegui terminar o exercício. 
Por algum motivo ainda tenho e dificuldade em traspor a lógica em código.
Enviarei mesmo que fora do prazo para avaliação e até onde consegui desenvolver.
Não consegui realizar teste para saber se deu ou não certo o que fiz até aqui.
Abaixo a resolução de tudo
*/
import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) throws Exception {
        MyIO.setCharset("UTF-8");

        Filme[] vetorFilmes = new Filme[2000];

        int indiceDeLocalizacao = 0;

        String linha = MyIO.readLine();

        while (!linha.equals("FIM")) {
            int i = 0;
            vetorFilmes[i].ler(linha);
            linha = MyIO.readLine();
            i++;
        }

    }
}
