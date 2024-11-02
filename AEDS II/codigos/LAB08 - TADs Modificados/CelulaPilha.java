/**
 * Celula (pilha, lista e fila dinamica)
 * @author Max do Val Machado
 * @version 2 01/2015
 */
class CelulaPilha {
	public int elemento; // Elemento inserido na celula.
	public CelulaPilha prox; // Aponta a celula prox.


	/**
	 * Construtor da classe.
	 */
	public CelulaPilha() {
		this(0);
	}

	/**
	 * Construtor da classe.
	 * @param elemento int inserido na celula.
	 */
	public CelulaPilha(int elemento) {
      this.elemento = elemento;
      this.prox = null;
	}
}
