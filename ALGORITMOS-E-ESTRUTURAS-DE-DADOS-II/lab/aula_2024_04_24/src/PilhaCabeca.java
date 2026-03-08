public class PilhaCabeca {
    private CelulaCabeca topo;

	/**
	 * Construtor da classe que cria uma fila sem elementos.
	 */
	public PilhaCabeca() { topo = new CelulaCabeca(); }

	/**
	 * Insere elemento na pilha (politica FILO).
	 * 
	 * @param x int elemento a inserir.
	 */
	public void inserir(int x) {
		CelulaCabeca tmp = new CelulaCabeca(x);
		tmp.prox = topo.prox;
		topo.prox = tmp;
		tmp = null;
	}

	/**
	 * Remove elemento da pilha (politica FILO).
	 * 
	 * @return Elemento removido.
	 * @trhows Exception Se a sequencia nao contiver elementos.
	 */
	public int remover() throws Exception {
		if (topo.prox == null) { throw new Exception("Erro ao remover! Pilha Vazia."); }

		int resp = topo.prox.elemento;
		CelulaCabeca tmp = topo;
		topo.prox = topo.prox.prox;
		tmp.prox = null;
		tmp = null;
		return resp;
	}

	/**
	 * Mostra os elementos separados por espacos, comecando do topo.
	 */
	public void mostrar() {
		System.out.print("[ ");
		for (CelulaCabeca i = topo.prox; i != null; i = i.prox) {
			System.out.print(i.elemento + " ");
		}
		System.out.println("] ");
	}

	// public int getSoma() {
	// 	return getSoma(topo);
	// }

	// private int getSoma(Celula i) {
	// 	int resp = 0;
	// 	if (i != null) {
	// 		resp += i.elemento + getSoma(i.prox);
	// 	}
	// 	return resp;
	// }

	// public int getMax() {
	// 	int max = topo.elemento;
	// 	for (Celula i = topo.prox; i != null; i = i.prox) {
	// 		if (i.elemento > max)
	// 			max = i.elemento;
	// 	}
	// 	return max;
	// }

	// public void mostraPilha() {
	// 	mostraPilha(topo);
	// }

	// private void mostraPilha(Celula i) {
	// 	if (i != null) {
	// 		mostraPilha(i.prox);
	// 		System.out.println("" + i.elemento);
	// 	}
	// }
}
