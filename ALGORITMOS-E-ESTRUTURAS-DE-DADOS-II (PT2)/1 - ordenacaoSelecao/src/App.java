import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int n; //Tamanho do vetor
        
        int[] vetor = new int[n];
        int idx_menor = 0;

        for (int i = 0; i < n - 1; i++) { //indice do 1° numero
            idx_menor = i; //Valor do 1° numero

            for (int j = i + 1; j < n; j++) { //Percorrer o vetor
                if (vetor[j] < vetor[idx_menor]) { //Comparar conteudo
                    idx_menor = i;
                }
            }
            troca(vetor[i], vetor[idx_menor]);
        }
    }
}
