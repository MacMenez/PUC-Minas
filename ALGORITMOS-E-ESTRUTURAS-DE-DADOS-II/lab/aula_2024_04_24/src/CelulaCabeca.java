/**
 * Pilha dinamica
 * 
 * @author Davi Carneiro Menez
 * @version 2024/04/24
 */

public class CelulaCabeca {
    public int elemento; // Elemento inserido na celula.
	public CelulaCabeca prox; // Aponta a celula prox.


	/**
	 * Construtor da classe.
	 */
	public CelulaCabeca() { this(0); }

	/**
	 * Construtor da classe.
	 * @param elemento int inserido na celula.
	 */
	public CelulaCabeca(int elemento) {
      this.elemento = elemento;
      this.prox = null;
	}
}
