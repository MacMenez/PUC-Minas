class Pessoa {
	int cpf;
	String nome;

	public Pessoa() {
		this.cpf = 0;
		this.nome = "";
	}

	public Pessoa(String string, String nome) {
		this.cpf = string;
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + "]";
	}
}

public class FilaPessoa {
	int frente;
	int tras;
	Pessoa[] vetor;
	int n;

	FilaPessoa(int n) {
		this.frente = 0;
		this.tras = 0;
		this.n = n;
		this.vetor = new Pessoa[n];
	}

	void enfileirar(Pessoa item) {
		if (this.isCheia() == false) {
			this.vetor[tras] = item;
			this.tras = (this.tras + 1) % this.n;
		}
	}

	Pessoa desenfileirar() {
		if (this.isVazia() == false) {
			Pessoa valor = this.vetor[this.frente];
			this.frente = (this.frente + 1) % this.n;
			return valor;
		}
		return null;
	}

	boolean isVazia() {
		if (this.tras == this.frente) {
			System.out.println("Fila vazia");
			return true;
		}
		return false;
	}

	boolean isCheia() {
		if (((this.tras + 1) % this.n) == this.frente) {
			System.out.println("Fila cheia");
			return true;
		}
		return false;
	}

	void imprimir() {
		int ini = this.frente;
		int fim = this.tras;
		while (ini != fim) {
			System.out.print(vetor[ini] + ", ");
			ini = (ini + 1) % this.n;
		}
	}

	public static void main(String[] args) {
		FilaPessoa fila = new FilaPessoa(10);
		Pessoa felipe = new Pessoa(123, "Felipe");
		Pessoa davi = new Pessoa(111, "Davi");
		Pessoa daniel = new Pessoa(222, "Daniel");
		Pessoa marcio = new Pessoa(333, "Marcio");

		fila.enfileirar(felipe);
		fila.enfileirar(davi);
		fila.enfileirar(daniel);
		fila.enfileirar(marcio);
		fila.imprimir();

		System.out.println();
		fila.desenfileirar();
		fila.desenfileirar();
		fila.imprimir();
	}
}
