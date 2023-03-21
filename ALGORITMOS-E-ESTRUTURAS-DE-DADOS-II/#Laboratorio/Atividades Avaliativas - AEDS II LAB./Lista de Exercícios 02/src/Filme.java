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

    /*public void clone() {
        return clone;
    }*/

    public void ler(String linha) {
        String[] vetorFilme = linha.split("#");
    }

    public void imprimir() {
        //Pesquisar: titulo, ano e duração. Imprimir o resto das informações
    }

    public String toString() {
        return (
            this.getId() + "\n" + 
            this.getTitulo() + "\n" +
            this.getDiretor() + "\n" +
            this.getAtorPrincipal() + "\n" +
            this.getAtorCoadjuvante() + "\n" +
            this.getAnoLancamento() + "\n" +
            this.getDuracao() + "\n" +
            this.getCategoria() + "\n" +
            this.getPaisOrigem()
        );
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