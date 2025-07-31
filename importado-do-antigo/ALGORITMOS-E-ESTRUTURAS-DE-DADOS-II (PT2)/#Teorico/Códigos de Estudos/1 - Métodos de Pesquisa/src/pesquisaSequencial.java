public class pesquisaSequencial {
    public static void main(String[] args) throws Exception {
        System.out.println("Este é o código de Pesquisa Sequencial");

        //É necessário enviar um vetor que será a base de pesquisa e uma chave(valor a ser pesquisado)
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        pesquisaSequencial(vetor, 6); //Chamada do método Pesquisa Sequencial
        

    }

    //Código da Pesquisa Sequêncial
    static boolean pesquisaSequencial(int[] vet, int x) {
        boolean resp = false;
        int n = vet.length;
        for (int i = 0; i < n; i++) {
            if (vet[i] == x) {
                resp = true;
                i = n;
            }
        }
        return resp;
    }
}
