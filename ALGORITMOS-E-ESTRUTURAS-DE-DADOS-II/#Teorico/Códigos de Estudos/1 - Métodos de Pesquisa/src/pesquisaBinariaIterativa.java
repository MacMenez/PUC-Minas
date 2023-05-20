public class pesquisaBinariaIterativa {
    public static void main(String[] args) throws Exception {
        System.out.println("Este é o código de Pesquisa Binária Iterativa");

        //É necessário enviar um vetor que será a base de pesquisa e uma chave(valor a ser pesquisado)
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        pesquisaBinaria(vetor, 6); //Chamada do método de Pesquisa Binária Iterativa
    }

    static boolean pesquisaBinaria(int[] vet, int x) {
        boolean resp = false;
        int dir = (vet.length - 1), esq = 0, meio;
        while (esq <= dir) {
            meio = (esq + dir) / 2;
            if (x == vet[meio]) {
                resp = true;
                esq = dir + 1;
            } else if (x > vet[meio]) {
                esq = meio + 1;
            } else {
                dir = meio - 1;
            }
        }
        return resp;
    }

}