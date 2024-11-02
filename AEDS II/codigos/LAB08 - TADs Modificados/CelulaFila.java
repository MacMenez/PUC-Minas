/**
 * Celula (pilha, lista e fila dinamica)
 * @author Max do Val Machado
 * @version 2 01/2015
 */
class CelulaFila {
	public int elemento; // Elemento inserido na celula.
	public CelulaFila prox; // Aponta a celula prox.


	/**
	 * Construtor da classe.
	 */
	public CelulaFila() {
		this(0);
	}

	/**
	 * Construtor da classe.
	 * @param elemento int inserido na celula.
	 */
	public CelulaFila(int elemento) {
      this.elemento = elemento;
      this.prox = null;
	}
}
