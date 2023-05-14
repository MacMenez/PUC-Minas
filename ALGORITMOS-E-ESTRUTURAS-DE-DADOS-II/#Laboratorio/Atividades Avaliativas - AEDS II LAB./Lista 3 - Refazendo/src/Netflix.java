import java.io.*;

public class Netflix {
	public static void main(String[] args) {
		// Procedimento para encontrar e utilizar o arquivo do programa
		ArquivoTextoLeitura infoArquivo = new ArquivoTextoLeitura(getPathArquivo());

		// Parte 1: Armazenamento de informações em vetor

		Filme[] vetorFilme = new Filme[2000]; // Vetor estático com o total de posições do arquivo

		String linha; // Dado a ser coletado

		linha = MyIO.readLine(); // Lendo o dado do arquivo PUB.in

		int i = 0; // Indice de referência do objeto vetorFilme, cada i equivale a 1 vetorFilme.

		while (!linha.equals("FIM")) { // Criando flag conforme orientação no enunciado da atividade

			vetorFilme[i] = new Filme(); // Criabdo um objeto vetorFilme através da classe Filme.
			vetorFilme[i].Ler(linha);
			i++; // Aumentando contagem
			linha = MyIO.readLine(); // Lendo o dado do arquivo PUB.in
		}

		infoArquivo.fecharArquivo();
		// Encerramento da leitura dos arquivos

		// Parte 2: Pesquisa de informações armazenadas no vetor criado na parte 1.
		int j = 0;

		while (!linha.equals("FIM")) { // Criando flag conforme orientação no enunciado da atividade

			// INFORMAÇÕES DA PESQUISA: titulo, anoPublicacao, duracao
			vetorFilme[j].Pesquisar(linha);

			j++; // Aumentando contagem
		}

		/*
		 * RESULTADO DE SAÍDA NA TELA
		 * [titulo] [ano] [pais_origem] [categoria] [diretor] [ator1, ator2] [tempo]
		 * [id]
		 */
	}

	// Procedimento de Leitura do Arquivo
	public static String getPathArquivo() {
		String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
			return "files\\filmes.txt";
		} else {
			return "/tmp/filmes.txt";
		}
	}

	// Classe de Leitura de um Arquivo .txt
	public class ArquivoTextoLeitura {
		private BufferedReader entrada;

		ArquivoTextoLeitura(String nomeArquivo) {
			try {
				entrada = new BufferedReader(new InputStreamReader(new FileInputStream(nomeArquivo), "UTF-8"));
			} catch (UnsupportedEncodingException excecao) {
				System.out.println(excecao.getMessage());
			} catch (FileNotFoundException excecao) {
				System.out.println("Arquivo nao encontrado");
			}
		}

		public void fecharArquivo() {
			try {
				entrada.close();
			} catch (IOException excecao) {
				System.out.println("Erro no fechamento do arquivo de leitura: " +
						excecao);
			}
		}

		@SuppressWarnings("finally")
		public String ler() {
			String textoEntrada = null;
			try {
				textoEntrada = entrada.readLine();
			} catch (EOFException excecao) { // Excecao de final de arquivo.
				textoEntrada = null;
			} catch (IOException excecao) {
				System.out.println("Erro de leitura: " + excecao);
				textoEntrada = null;
			} finally {
				return textoEntrada;
			}
		}
	}

	// Função Para Realizar a Leitura do Arquivo
	public class ArquivoTextoEscrita {
		private BufferedWriter saida;

		ArquivoTextoEscrita(String nomeArquivo) {
			try {
				saida = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nomeArquivo), "UTF-8"));
			} catch (UnsupportedEncodingException excecao) {
				System.out.println(excecao.getMessage());
			} catch (IOException excecao) {
				System.out.println("Erro na abertura do arquivo de escrita: " +
						excecao);
			}
		}

		public void fecharArquivo() {
			try {
				saida.close();
			} catch (IOException excecao) {
				System.out.println("Erro no fechamento do arquivo de escrita: " +
						excecao);
			}
		}

		public void escrever(String textoEntrada) {
			try {
				saida.write(textoEntrada);
				saida.newLine();
			} catch (IOException excecao) {
				System.out.println("Erro de entrada/saída " + excecao);
			}
		}
	}

}
