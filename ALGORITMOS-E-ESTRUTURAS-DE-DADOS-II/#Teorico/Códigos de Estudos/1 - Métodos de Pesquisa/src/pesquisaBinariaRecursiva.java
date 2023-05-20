public class pesquisaBinariaRecursiva {
    public static void main(String[] args) throws Exception {
        System.out.println("Este é o código de Pesquisa Binária Recursiva");

        //É necessário enviar um vetor que será a base de pesquisa e uma chave(valor a ser pesquisado)
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        pesquisaBinariaRecursiva(vetor, 6);
    }

    //Inserindo posições de início e fim para a pesquisa no vetor
    public static boolean pesquisaBinariaRecursiva(int[] vet, int x) {
        return pesquisaBinariaRecursiva(vet, x, 0, (vet.length - 1));
    }

    //Pesquisa Binária Recursiva com parâmetros de posições de início e fim para localizar a chave de pesquisa
    public static boolean pesquisaBinariaRecursiva(int[] vet, int x, int esq, int dir) {
        boolean resp;
        int meio = (esq + dir) / 2;
        if (esq > dir) {
            resp = false;
        } else if (x == vet[meio]) {
            resp = true;
        } else if (x > vet[meio]) {
            resp = pesquisaBinariaRecursiva(vet, x, meio + 1, dir);
        } else {
            resp = pesquisaBinariaRecursiva(vet, x, esq, meio - 1);
        }
        return resp;
    }

}