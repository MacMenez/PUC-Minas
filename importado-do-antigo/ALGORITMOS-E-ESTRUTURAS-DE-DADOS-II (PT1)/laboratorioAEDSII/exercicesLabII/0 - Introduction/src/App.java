import java.util.Random;
import java.util.Scanner;

//https://www.techiedelight.com/pt/generate-random-character-java/

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        
        char vetorLetra [];
        vetorLetra = new char[80];

        //Montando o Vetor
        vetorLetra[0] = 'A';
        vetorLetra[1] = 'E';
        vetorLetra[2] = 'D';
        vetorLetra[3] = 'I';
        vetorLetra[4] = 'I';
        vetorLetra[5] = '\0';

        //Mostrar Vetor
        for (int i = 0; i != '\0'; i++) {
            System.out.println(vetorLetra[i]);
        }
    }
}

/*
    private static char randomChar() {
        int rand = new Random().nextInt(52);
        char start = (rand < 26) ? 'A' : 'a';
        return (char) (start + rand % 26);
    }

    public static void main(String[] args) {
        char c = randomChar();
        System.out.println(c);
    }
*/