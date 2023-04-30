public class Filme {
	private int id;
	private String titulo;
	private String diretor;
	private String atorPrincipal;
	private String atorCoadjuvante;
	private int anoLancamento;
	private int duracao;
	private String categoria;
	private String paisOrigem;
	private String Filme;

	Filme() {

	}

	public Filme(int id, String titulo, String diretor, String atorPrincipal, String atorCoadjuvante, int duracao,
			String categoria, String paisOrigem, int anoLancamento) {
		this.id = id;
		this.titulo = titulo;
		this.diretor = diretor;
		this.atorPrincipal = atorPrincipal;
		this.atorCoadjuvante = atorCoadjuvante;
		this.duracao = duracao;
		this.categoria = categoria;
		this.paisOrigem = paisOrigem;
		this.anoLancamento = anoLancamento;
	}

	public Filme(String filmes, int id, String titulo, String diretor, String atorPrincipal, String atorCoadjuvante, int duracao,
			String categoria, String paisOrigem, int anoLancamento) {

		this.Filme = Filme;
		this.id = id;
		this.titulo = titulo;
		this.diretor = diretor;
		this.atorPrincipal = atorPrincipal;
		this.atorCoadjuvante = atorCoadjuvante;
		this.duracao = duracao;
		this.categoria = categoria;
		this.paisOrigem = paisOrigem;
		this.anoLancamento = anoLancamento;
	}

	public Filme clone() {
		Filme clone = new Filme();
		clone.Filme = this.Filme;
		clone.id = this.id;
		clone.titulo = this.titulo;

		clone.diretor = this.diretor;
		clone.atorPrincipal = this.atorPrincipal;
		clone.atorCoadjuvante = this.atorCoadjuvante;
		clone.anoLancamento = this.anoLancamento;
		clone.duracao = this.duracao;
		clone.categoria = this.categoria;
		clone.paisOrigem = this.paisOrigem;

		return clone;
	}

	// Leitura
	public static Filme ler(String linha) {
		String[] infoFilme = linha.split("#");
		
		int id = Integer.parseInt(infoFilme[0]);

		String titulo = infoFilme[1];

		String diretor = infoFilme[2];

		String atorPrincipal = infoFilme[3];

		String atorCoadjuvante = infoFilme[4];

		int anoLancamento = Integer.parseInt(infoFilme[5]);

		int duracao = Integer.parseInt(infoFilme[6]);

		String categoria = infoFilme[7];

		String paisOrigem = infoFilme[8];

		return new Filme(id, titulo, diretor, atorPrincipal, atorCoadjuvante, duracao, categoria, paisOrigem, anoLancamento);
	}

	// Pesquisar: titulo, ano e duração. Imprimir o resto das informações
	public static void imprimir(Filme[] filme, String titulo, int ano, int duracao) {
        //Percorrer vetor de objeto Filme para localizar o que foi solicitado e informações extras das posições.
		for (int i = 0; i < filme.length; i++) {
			if (filme[i].getTitulo().equals(titulo) && filme[i].getAnoLancamento() == ano && filme[i].getDuracao() == duracao) {
				MyIO.println(
					"[" + filme[i].getTitulo() + "]" +
					"[" + filme[i].getAnoLancamento() + "]" +
					"[" + filme[i].getPaisOrigem() + "]" +
					"[" + filme[i].getCategoria() + "]" +
					"[" + filme[i].getDiretor() + "]" +
					"[" + filme[i].getAtorPrincipal() + "]" +
					"[" + filme[i].getAtorCoadjuvante() + "]" +
					"[" + filme[i].getDuracao() + "]" +
					"[" + filme[i].getId() + "]"
				);
				return;
			}
		}
    }

	// Formatação de Dados para Saída
	public String toString() {
		return (
			"[" + this.getTitulo() + "]" +
			"[" + this.getAnoLancamento() + "]" +
			"[" + this.getPaisOrigem() + "]" +
			"[" + this.getCategoria() + "]" +
			"[" + this.getDiretor() + "]" +
			"[" + this.getAtorPrincipal() + "]" +
			"[" + this.getAtorCoadjuvante() + "]" +
			"[" + this.getDuracao() + "]" +
			"[" + this.getId() + "]"
		);
	}
	
	public String getFilme() {
		return Filme;
	}

	public void setFilme(String filme) {
		Filme = filme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getAtorPrincipal() {
		return atorPrincipal;
	}

	public void setAtorPrincipal(String atorPrincipal) {
		this.atorPrincipal = atorPrincipal;
	}

	public String getAtorCoadjuvante() {
		return atorCoadjuvante;
	}

	public void setAtorCoadjuvante(String atorCoadjuvante) {
		this.atorCoadjuvante = atorCoadjuvante;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
}