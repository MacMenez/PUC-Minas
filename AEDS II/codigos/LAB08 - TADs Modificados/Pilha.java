/**
 * Pilha dinamica
 * 
 * @author Max do Val Machado
 * @version 2 01/2015
 */
public class Pilha {
	private CelulaPilha topo;

	/**
	 * Construtor da classe que cria uma fila sem elementos.
	 */
	public Pilha() {
		topo = null;
	}

	/**
	 * Insere elemento na pilha (politica FILO).
	 * 
	 * @param x int elemento a inserir.
	 */
	public void inserir(int x) {
		CelulaPilha tmp = new CelulaPilha(x);
		tmp.prox = topo;
		topo = tmp;
		tmp = null;
	}

	/**
	 * Remove elemento da pilha (politica FILO).
	 * 
	 * @return Elemento removido.
	 * @trhows Exception Se a sequencia nao contiver elementos.
	 */
	public int remover() throws Exception {
		if (topo == null) {
			throw new Exception("Erro ao remover!");
		}
		int resp = topo.elemento;
		CelulaPilha tmp = topo;
		topo = topo.prox;
		tmp.prox = null;
		tmp = null;
		return resp;
	}

	/**
	 * Mostra os elementos separados por espacos, comecando do topo.
	 */
	public void mostrar() {
		System.out.print("[ ");
		for (CelulaPilha i = topo; i != null; i = i.prox) {
			System.out.print(i.elemento + " ");
		}
		System.out.println("] ");
	}

	public int getSoma() {
		return getSoma(topo);
	}

	private int getSoma(CelulaPilha i) {
		int resp = 0;
		if (i != null) {
			resp += i.elemento + getSoma(i.prox);
		}
		return resp;
	}

	public int getMax() {
		int max = topo.elemento;
		for (CelulaPilha i = topo.prox; i != null; i = i.prox) {
			if (i.elemento > max)
				max = i.elemento;
		}
		return max;
	}

	public void mostraPilha() {
		mostraPilha(topo);
	}

	private void mostraPilha(CelulaPilha i) {
		if (i != null) {
			mostraPilha(i.prox);
			System.out.println("" + i.elemento);
		}
	}

	public Fila toFila() {
		Fila pilhaConvertida = new Fila();
		for (CelulaPilha i = topo; i != null; i = i.prox) {
			System.out.println(i.elemento + " capturado da pilha e inserido na fila!");
			pilhaConvertida.inserir(i.elemento);
		}
		return pilhaConvertida;
	}

	public Fila alterarPilha(){
		Fila pilhaAlterada = new Fila();
		
	}

}
