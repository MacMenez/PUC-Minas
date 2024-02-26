import java.util.Random;

public class App {
    public static boolean localizar(int vetor[], int valor){
        boolean localizado = false;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == valor){
                localizado = true;
            }
        }

        return localizado;
    }

    public static boolean localizarOrdenado(int vetor[], int valor){
        boolean localizado = false;
        int inicio = 0;
        int fim = vetor.length;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (vetor[meio] == valor) {
                localizado = true;
            }
            else if (vetor[meio] < valor) {
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }   
        }

        return localizado;
    }

    public static void main(String[] args) throws Exception {
        Random numeroAleatorio = new Random();

        int[] vetor = new int [5];
        int valor = 6;

        for(int i = 0; i < 5; i++){
            vetor[i] = numeroAleatorio.nextInt(50);
        }

        for(int i = 0; i < 5; i++){
            System.out.print(" " + vetor[i]);
        }
        System.out.println(" ");

        boolean localizado = localizar(vetor, valor);

        if (localizado) {
            System.out.println("O valor " + valor + " foi encontrado no vetor.");
        } 
        else {
            System.out.println("O valor " + valor + " não foi encontrado no vetor.");
        }

        int[] vetorOrdenado = {1, 6, 10, 12, 18};
        int novoValor = 18;

        for(int i = 0; i < 5; i++){
            System.out.print(" " + vetorOrdenado[i]);
        }
        System.out.println(" ");

        boolean localizadoNovamente = localizarOrdenado(vetorOrdenado, novoValor);

        if (localizadoNovamente) {
            System.out.println("O valor " + novoValor + " foi encontrado no vetor.");
        }
        else {
            System.out.println("O valor " + novoValor + " não foi encontrado no vetor.");
        }

        System.out.println(localizadoNovamente);
    }
}
