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

    public Filme clone() {
		Filme clone = new Filme();
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

    public static Filme ler() {
		String linha = MyIO.readLine();
		if (linha.equals("FIM")) {
			return null;
		}

        String[] infoFilme = linha.split("#");
		return new Filme();
    }

	//Pesquisar: titulo, ano e duração. Imprimir o resto das informações
    public static void imprimir(Filme[] vetorFilmes, String titulo, int ano, int duracao) {
        //Percorrer vetor de objeto Filme para localizar o que foi solicitado e informações extras das posições.
		for (int i = 0; i < vetorFilmes.length; i++) {
			if (vetorFilmes[i].getTitulo().equals(titulo) && vetorFilmes[i].getAnoLancamento() == ano && vetorFilmes[i].getDuracao() == duracao) {
				MyIO.println(
					vetorFilmes[i].getTitulo() + "\n" +
					vetorFilmes[i].getAnoLancamento() + "\n" +
					vetorFilmes[i].getDuracao() + "\n" +
					vetorFilmes[i].getId() + "\n" +
					vetorFilmes[i].getDiretor() + "\n" +
					vetorFilmes[i].getAtorPrincipal() + "\n" +
					vetorFilmes[i].getAtorCoadjuvante() + "\n" +
					vetorFilmes[i].getCategoria() + "\n" +
					vetorFilmes[i].getPaisOrigem() + "\n"
				);
			}
		}
    }

	//Conforme atividade prática de laboratório. Apenas chamar método Get.
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