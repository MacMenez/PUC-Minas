public class Filme {
	private int id;
	private String titulo;
	private String diretor;
	private String atorPrincipal;
	private String atorCoadjuvante;
	private int anoPublicacao;
	private int duracao;
	private String categoria;
	private String paisOrigem;
	
	//CONSTRUTOR 1
	Filme(){
		
	}
	
	//CONSTRUTOR 2
	Filme(){
		
	}
	
	//PROCESSO DE LEITURA DOS DADOS LOCALIZADOS EM PUB.IN
	public void Ler() {
		
	}
	
	//EXIBIR ATRIBUTOS DO OBJETO FILME
	public void Imprimir(){
		"[" + Filme[i].getTitulo() + "]" +
		"[" + Filme[i].getAnoLancamento() + "]" +
		"[" + Filme[i].getPaisOrigem() + "]" +
		"[" + Filme[i].getCategoria() + "]" +
		"[" + Filme[i].getDiretor() + "]" +
		"[" + Filme[i].getAtorPrincipal() + "]" +
		"[" + Filme[i].getAtorCoadjuvante() + "]" +
		"[" + Filme[i].getDuracao() + "]" +
		"[" + Filme[i].getId() + "]";
	}
	
	
	//IMPRESSÃO DA CLASSE SEM USAR O IMPRIMIR
	@Override
	public String toString() {
		return "[" + titulo  + "] "
				+ "[" + anoPublicacao + "] "
				+ "[" + paisOrigem + "] "
				+ "[" + categoria + "] "
				+ "[" + diretor + "] "
				+ "[" + atorPrincipal + ", " + atorCoadjuvante + "] "
				+ "[" + duracao + "] "
				+ "[" + id + "]";
	}
	
	//MÉTODO CLONE PARA "DUPLICAR RESULTADOS"
	public Filme Clone() {
		Filme clone = new Filme();
		clone.id = this.id;
		
		return Clone();
	}
	
	// MÉTODOS GET E SET
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

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
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
