import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    static int[] funcaoVetorFiboniacci(int tamanhoVetorInformado){
        //Criar um vetor
        int vetorFibonacci[];
        vetorFibonacci = new int[tamanhoVetorInformado];

        //Calcular Fibonacci
        int digito1 = 0, digito2= 1, novoDigitoFibonacci = 0;
        
        for (int i = 0; i < vetorFibonacci.length; i++) {
            novoDigitoFibonacci = digito1 + digito2;
            digito1 = digito2;
            digito2 = novoDigitoFibonacci;
            vetorFibonacci[i] = novoDigitoFibonacci;
        }
        //Exibir o resultado
        System.out.println(Arrays.toString(vetorFibonacci));

        return vetorFibonacci;
    }

    static void funcaoSomaVetor(int[] vetorFobinacci, int tamanhoSomatorio, int condicaoFuncao) {
        int somaLacoRepeticao = 0;
        if (condicaoFuncao == 1) {
            for (int i = 0; i < tamanhoSomatorio; i++) {
                somaLacoRepeticao = somaLacoRepeticao + vetorFobinacci[i];
            }
            System.out.printf("O somatorio dos %d dígitos equivale: %d", tamanhoSomatorio, somaLacoRepeticao);
        } 
        
        if (condicaoFuncao == 2) {
            System.out.printf("A Sequência Fibonacci possui menos de %d digitos! \n", tamanhoSomatorio);
            for (int i = 0; i < vetorFobinacci.length; i++) {
                somaLacoRepeticao = somaLacoRepeticao + vetorFobinacci[i];
            }
            System.out.printf("O somatorio de todos os dígitos equivale: %d", somaLacoRepeticao);  
        }
        
    }

    static void metodoModulo(int[] vetorFobinacci, int digitoModulo) {
        int somaModulo = 0;
        for (int i = 0; i < vetorFobinacci.length; i++) {
            if (vetorFobinacci[i] %digitoModulo == 0) {
                somaModulo++;
            }
        }

        int vetorModulo[];
        vetorModulo = new int[somaModulo];

        for (int i = 0; i < vetorFobinacci.length; i++) {
            if (vetorFobinacci[i] %digitoModulo == 0) {
                vetorModulo[i] = vetorFobinacci[i];
                
            }
        }
        //Retorna o novo vetor com os elementos dos multiplos do número informado
        System.out.println("Vetor com os módulos dos dígitos Fibonacci:");
        System.out.println(Arrays.toString(vetorModulo));
    }
        
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            //PARTE 1
            //-----------------------------------------------------------------------------
            //Saber o tamanho do vetor
            int tamanhoVetor;
            System.out.print("Informe quantos dígitos terá a Sequência Fibonacci: ");
            tamanhoVetor = sc.nextInt();

            //Inserir os digitos Fibonacci no vetor através de uma função
            int vetorFobinacci[];
            vetorFobinacci = new int[tamanhoVetor];
            vetorFobinacci = funcaoVetorFiboniacci(tamanhoVetor);
            
            //PARTE 2 - Somatório das N primeiras posições do vetor
            int tamanhoSomatorio;
            System.out.print("Informe quantos dígitos estarão no somatório: ");
            tamanhoSomatorio = sc.nextInt();
            
            //somatorioVetor();
            int condicaoFuncao;
            if (tamanhoSomatorio <= tamanhoVetor) {
                condicaoFuncao = 1;
            } else {
                condicaoFuncao = 2;
            }
            funcaoSomaVetor(vetorFobinacci, tamanhoSomatorio, condicaoFuncao);

            //PARTE 3
            //Metodo que recebe um vetor e um valor
            int digitoModulo;
            System.out.print("\nInforme o dígito que irá usar para montar o vetor de módulos: ");
            digitoModulo = sc.nextInt();
            //Criar um vetor alternativo para realizar o módulo. use a imaginação
            //verificar a estrutura de condições do metodo
            metodoModulo(vetorFobinacci, digitoModulo);
            
        sc.close();
        

    }
}
