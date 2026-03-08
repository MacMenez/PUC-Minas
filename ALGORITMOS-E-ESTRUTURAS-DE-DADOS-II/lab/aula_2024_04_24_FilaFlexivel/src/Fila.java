/**
 * Fila dinamica
 * 
 * @author Davi Carneiro Menez
 * @version 2024/04/24
 */
public class Fila {
	private Celulacabeca primeiro;
	private Celulacabeca ultimo;

	/**
	 * Construtor da classe que cria uma fila sem elementos (somente no cabeca).
	 */
	public Fila() {
		primeiro = new Celulacabeca();
		ultimo = primeiro;
	}

	/**
	 * Insere elemento na fila (politica FIFO).
	 * 
	 * @param x int elemento a inserir.
	 */
	public void inserir(int x) {
		ultimo.prox = new Celulacabeca(x);
		ultimo = ultimo.prox;
	}

	/**
	 * Remove elemento da fila (politica FIFO).
	 * 
	 * @return Elemento removido.
	 * @trhows Exception Se a fila nao tiver elementos.
	 */
	public int remover() throws Exception {
		if (primeiro == ultimo) { throw new Exception("Erro ao remover! Fila Vazia."); }

		Celulacabeca tmp = primeiro.prox;
		primeiro.prox = primeiro.prox.prox;
		int resp = tmp.elemento;
		tmp.prox = null;
		tmp = null;
		return resp;
	}

	/**
	 * Mostra os elementos separados por espacos.
	 */
	public void mostrar() {
		System.out.print("[ ");

		for (Celulacabeca i = primeiro.prox; i != null; i = i.prox) { System.out.print(i.elemento + " "); }

		System.out.println("] ");
	}
}
