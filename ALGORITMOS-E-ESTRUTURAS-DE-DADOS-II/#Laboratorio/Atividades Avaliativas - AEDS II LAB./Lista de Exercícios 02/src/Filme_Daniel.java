import java.io.IOException;


public class Filme_Daniel {
	private int ID;
	private String Titulo;
	private String Diretor;
	private String Ator1;
	private String Ator2;
	private int Duracao;
	private String Categoria;
	private String Pais_Origem;
	private int Ano;
	private String Filmes;

	
	

	public String getFilme() {
		return Filmes;
	}

	public void setFilme(String filme) {
		this.Filmes = filme;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		this.Ano = ano;
	}

	public int getId() {
		return ID;
	}

	public void setId(int id) {
		this.ID = id;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public String getDiretor() {
		return Diretor;
	}

	public void setDiretor(String diteror) {
		this.Diretor = diteror;
	}

	public String getAtor1() {
		return Ator1;
	}

	public void setAtor1(String ator1) {
		this.Ator1 = ator1;
	}

	public String getAtor2() {
		return Ator2;
	}

	public void setAtor2(String ator2) {
		this.Ator2 = ator2;
	}

	public int getDuracao() {
		return Duracao;
	}

	public void setDuracao(int duracao) {
		this.Duracao = duracao;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		this.Categoria = categoria;
	}

	public String getPais_origem() {
		return Pais_Origem;
	}

	public void setPais_origem(String pais_origem) {
		this.Pais_Origem = pais_origem;
	}

	public Filme clone() {
		Filme clone = new Filme(Filmes, Ator1, Ator2, Diretor, Categoria, Pais_Origem, Titulo, Ano, ID, Duracao);
		clone.Filmes = this.Filmes;
		clone.ID = this.ID;
		clone.Titulo = this.Titulo;
		clone.Diretor = this.Diretor;
		clone.Ator1 = this.Ator1;
		clone.Ator2 = this.Ator2;
		clone.Duracao = this.Duracao;
		clone.Categoria = this.Categoria;
		clone.Pais_Origem = this.Pais_Origem;

		return clone;

	}

	public static Filme Ler() {

		String linha = MyIO.readLine();
		if (linha.equals("FIM")) {
			return null;
		}

		String[] info = linha.split("#");

		int id = Integer.parseInt(info[0]);

		String titulo = info[1];

		String diretor = info[2];

		String ator1 = info[3];

		String ator2 = info[4];

		int ano = Integer.parseInt(info[5]);

		int duracao = Integer.parseInt(info[6]);

		String categoria = info[7];

		String pais_origem = info[8];

		return new Filme(id, titulo, diretor, ator1, ator2, duracao, categoria, pais_origem, ano);

	}

	public static void Imprimir(Filme[] objeto, String titulo, int ano, int tempo) {
		for (int i = 0; i < objeto.length; i++) {

			if (objeto[i].getTitulo().equals(titulo) && objeto[i].getAno() == ano && objeto[i].getDuracao() == tempo) {

				MyIO.println("[" + objeto[i].getTitulo() + "]" + " [" + objeto[i].getAno() + "]" + " ["
						+ objeto[i].getPais_origem() + "]" + " [" + objeto[i].getCategoria() + "]" + " ["
						+ objeto[i].getDiretor() + "]" + " [" + objeto[i].getAtor1() + objeto[i].getAtor2() + "]" + " ["
						+ objeto[i].getDuracao() + "]" + " [" + objeto[i].getId() + "]");

				return;

			}

		}
	}

	public String toString() {

		return "[" + getTitulo() + "+]" + " [" + getAno() + "]" + " [" + getPais_origem() + "]" + " [" + getCategoria()
				+ "]" + " [" + getDiretor() + "]" + " [" + getAtor1() + getAtor2() + "]" + " [" + getDuracao() + "]"
				+ " [" + getId() + "]";

	}

	public static void main(String[] args) throws IOException {

		Filme[] Objetos = new Filme[2000];

		int i = 0;

		Filme Objeto;

		while ((Objeto = Filme.Ler()) != null)

		{

			Objetos[i++] = Objeto;

		}

		for (int j = 0; j < Objetos.length; j++) {

			if (Objetos[j] != null) {
				MyIO.println(Objetos[j].toString());
			}

		}

		String linha = "";

		while (!linha.equals("FIM")) {
			linha = MyIO.readLine();

			if (!linha.equals("FIM")) {
				String[] info = linha.split(";");

				String titulo = info[0];

				int ano = Integer.parseInt(info[1]);

				int tempo = Integer.parseInt(info[2]);

				Imprimir(Objetos, titulo, ano, tempo);

			}
		}

	}

}