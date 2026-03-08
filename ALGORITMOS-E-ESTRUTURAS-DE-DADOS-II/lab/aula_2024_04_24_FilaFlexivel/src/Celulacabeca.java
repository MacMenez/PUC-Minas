public class Celulacabeca {
    public int elemento; // Elemento inserido na celula.
	public Celulacabeca prox; // Aponta a celula prox.


	/**
	 * Construtor da classe.
	 */
	public Celulacabeca() {
		this(0);
	}

	/**
	 * Construtor da classe.
	 * @param elemento int inserido na celula.
	 */
	public Celulacabeca(int elemento) {
      this.elemento = elemento;
      this.prox = null;
	}
}
