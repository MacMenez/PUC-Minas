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
	
	//id - titulo - diretor - atorPrincipal - atorCoadjuvante - anoPublicacao - duracao - categoria - paisOrigem
	
	//CONSTRUTOR 1
	Filme(){
		
	}
	
	
	//CONSTRUTOR 2
	public Filme(int id, String titulo, String diretor, String atorPrincipal, String atorCoadjuvante, int anoPublicacao,
			int duracao, String categoria, String paisOrigem) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.diretor = diretor;
		this.atorPrincipal = atorPrincipal;
		this.atorCoadjuvante = atorCoadjuvante;
		this.anoPublicacao = anoPublicacao;
		this.duracao = duracao;
		this.categoria = categoria;
		this.paisOrigem = paisOrigem;
	}
	
	//PESQUISAR INFORMAÇÕES POR PARAMETROS
	public void Pesquisar(String linha) {
		String[] infoPesquisa = linha.split(";");
		
		//INFORMAÇÕES DA PESQUISA: titulo, anoPublicacao, duracao
		this.titulo = infoPesquisa[0];
		this.anoPublicacao = Integer.parseInt(infoPesquisa[1]);
		this.duracao = Integer.parseInt(infoPesquisa[2]);
		
		if(
			(this.titulo == infoPesquisa[0]) && 
			(this.anoPublicacao == Integer.parseInt(infoPesquisa[2])) && 
			(this.duracao == Integer.parseInt(infoPesquisa[2]))
		) {
			Imprimir();
		}
	}
	
	//PROCESSO DE LEITURA DOS DADOS LOCALIZADOS EM PUB.IN
	public void Ler(String linha) {
		String[] infoFilme = linha.split("#");
		
		this.id = Integer.parseInt(infoFilme[0]);

		this.titulo = infoFilme[1];

		this.diretor = infoFilme[2];

		this.atorPrincipal = infoFilme[3];

		this.atorCoadjuvante = infoFilme[4];

		this.anoPublicacao = Integer.parseInt(infoFilme[5]);

		this.duracao = Integer.parseInt(infoFilme[6]);

		this.categoria = infoFilme[7];

		this.paisOrigem = infoFilme[8];
	}
	
	//EXIBIR ATRIBUTOS DO OBJETO FILME
	public void Imprimir(){
		System.out.println(this.toString());
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
		clone.titulo = this.titulo;
		clone.diretor = this.diretor;
		clone.atorPrincipal = this.atorPrincipal;
		clone.atorCoadjuvante = this.atorCoadjuvante;
		clone.anoPublicacao = this.anoPublicacao;
		clone.duracao = this.duracao;
		clone.categoria = this.categoria;
		clone.paisOrigem = this.paisOrigem;
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