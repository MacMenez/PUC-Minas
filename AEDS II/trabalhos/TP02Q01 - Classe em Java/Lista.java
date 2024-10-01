import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Lista estatica
 * @author Max do Val Machado
 * @version 2 01/2015
 */
class Lista {
    private String[] array;
    private int n;

    /**
     * Construtor da classe.
     */
    public Lista () {
        this(6);
    }

    /**
     * Construtor da classe.
     * @param tamanho Tamanho da lista.
     */
    public Lista (int tamanho){
        array = new String[tamanho];
        n = 0;
    }

    /**
     * Insere um elemento na primeira posicao da lista e move os demais
     * elementos para o fim da lista.
     * @param x String elemento a ser inserido.
     * @throws Exception Se a lista estiver cheia.
     */
    public void inserirInicio(String x) throws Exception {

        //validar insercao
        if(n >= array.length){
            throw new Exception("Erro ao inserir!");
        }

        //levar elementos para o fim do array
        for(int i = n; i > 0; i--){
            array[i] = array[i-1];
        }

        array[0] = x;
        n++;
    }

    /**
     * Insere um elemento na ultima posicao da lista.
     * @param x String elemento a ser inserido.
     * @throws Exception Se a lista estiver cheia.
     */
    public void inserirFim(String x) throws Exception {

        //validar insercao
        if(n >= array.length){
            throw new Exception("Erro ao inserir!");
        }

        array[n] = x;
        n++;
    }

    /**
     * Insere um elemento em uma posicao especifica e move os demais
     * elementos para o fim da lista.
     * @param x String elemento a ser inserido.
     * @param pos Posicao de insercao.
     * @throws Exception Se a lista estiver cheia ou a posicao invalida.
     */
    public void inserir(String x, int pos) throws Exception {

        //validar insercao
        if(n >= array.length || pos < 0 || pos > n){
            throw new Exception("Erro ao inserir!");
        }

        //levar elementos para o fim do array
        for(int i = n; i > pos; i--){
            array[i] = array[i-1];
        }

        array[pos] = x;
        n++;
    }

    /**
     * Remove um elemento da primeira posicao da lista e movimenta
     * os demais elementos para o inicio da mesma.
     * @return resp String elemento a ser removido.
     * @throws Exception Se a lista estiver vazia.
     */
    public String removerInicio() throws Exception {

        //validar remocao
        if (n == 0) {
            throw new Exception("Erro ao remover!");
        }

        String resp = array[0];
        n--;

        for(int i = 0; i < n; i++){
            array[i] = array[i+1];
        }

        return resp;
    }

    /**
     * Remove um elemento da ultima posicao da lista.
     * @return resp String elemento a ser removido.
     * @throws Exception Se a lista estiver vazia.
     */
    public String removerFim() throws Exception {

        //validar remocao
        if (n == 0) {
            throw new Exception("Erro ao remover!");
        }

        return array[--n];
    }

    /**
     * Remove um elemento de uma posicao especifica da lista e
     * movimenta os demais elementos para o inicio da mesma.
     * @param pos Posicao de remocao.
     * @return resp String elemento a ser removido.
     * @throws Exception Se a lista estiver vazia ou a posicao for invalida.
     */
    public String remover(int pos) throws Exception {

        //validar remocao
        if (n == 0 || pos < 0 || pos >= n) {
            throw new Exception("Erro ao remover!");
        }

        String resp = array[pos];
        n--;

        for(int i = pos; i < n; i++){
            array[i] = array[i+1];
        }

        return resp;
    }

    /**
     * Mostra os elementos da lista separados por espacos.
     */
    public void mostrar (){
        System.out.print("[ ");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    /**
     * Procura um elemento e retorna se ele existe.
     * @param x String elemento a ser pesquisado.
     * @return <code>true</code> se o array existir,
     * <code>false</code> em caso contrario.
     */
    public boolean pesquisar(String x) {
        boolean retorno = false;
        for (int i = 0; i < n && retorno == false; i++) {
            retorno = (array[i].equals(x));
        }
        return retorno;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < n; i++) {
            str += array[i] + " ";
        }
        return str.trim() + "]";
    }
}