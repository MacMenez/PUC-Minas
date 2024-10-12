import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Gera o tamanho do vetor entre 5 e 20
        Random rand = new Random();
        int x = rand.nextInt(16) + 5; // Valor entre 5 e 20

        // Cria o vetor com "x" elementos
        int[] vetor = new int[x];

        // Preenche o vetor com valores aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100); // Valores aleatórios entre 0 e 99
        }

        

        OrdenacaoParcial algoritmo = new OrdenacaoParcial();
        int k = rand.nextInt(21);
        algoritmo.selectionsort(k, );

    }
}
