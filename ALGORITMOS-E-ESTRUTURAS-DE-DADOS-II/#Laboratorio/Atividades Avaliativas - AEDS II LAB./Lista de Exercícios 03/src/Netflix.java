import java.io.*;

public class Netflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyIO.setCharset("UTF-8");

		//Procedimento para encontrar e utilizar o arquivo do programa
		//ArquivoTextoLeitura infoArquivo = new ArquivoTextoLeitura(getPathArquivo()); //Linha de código para o VERDE
		ArquivoTextoLeitura infoArquivo = new ArquivoTextoLeitura("filmes.txt"); //Linha de código para teste Local
		
		//Procedimento de leitura das informações do arquivo
		String linha = infoArquivo.ler(); //Dado a ser coletado

		// PARTE 1 - ARMAZENANDO INFORMAÇÕES NO VETOR
		Filme[] vetorFilme = new Filme[2000]; //Vetor estático com o total de posições do arquivo

		linha = MyIO.readLine(); //Lendo o dado do arquivo PUB.in

		int contadorVetor = 0; //Indice de referência do objeto vetorFilme, cada i equivale a 1 vetorFilme.

		//CRIANDO E PREENCHENDO O VETOR COM FILMES DO ARQUIVO PUB.IN
		while(!linha.equals("FIM")) { //Criando flag conforme orientação no enunciado da atividade
			vetorFilme[contadorVetor] = new Filme(); //Criando um objeto vetorFilme através da classe Filme.
			vetorFilme[contadorVetor].Ler(linha);
			contadorVetor++; //Aumentando contagem
			linha = MyIO.readLine(); //Lendo o dado do arquivo PUB.in
		}
		
		infoArquivo.fecharArquivo();//Encerramento da leitura dos arquivos

		linha = MyIO.readLine(); 

		//PESQUISAR INFORMAÇÕES DOS FILMES NO VETOR CRIADO
		int contadorPesquisa = 0;
		while (!linha.equals("FIM")) {
			
			//VERIFICAÇÃO: INFORMAÇÕES LIDAS DA LINHA SÃO IGUAIS AS DO VETOR
			String[] infoPesquisa = linha.split(";");
			
			//Contando linhas à partir do FIM da etapa 1
			for(int i = 0; i < contadorVetor; i++) {
				// Pesquisando o valor + Lendo o dado do vetor que será mostrado na tela
				if((vetorFilme[i].getTitulo().equals(infoPesquisa[0])) && 
				(vetorFilme[i].getAnoPublicacao() == Integer.parseInt(infoPesquisa[1])) && 
				(vetorFilme[i].getDuracao() == Integer.parseInt(infoPesquisa[2]))){
					System.out.println(vetorFilme[i].toString());
				}
			} 
			contadorPesquisa++; 
			linha = MyIO.readLine();
		}
	}
	//Procedimento de Leitura do Arquivo
	public static String getPathArquivo() {
		String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
			return "files\\filmes.txt";
		} else {
			return "/tmp/filmes.txt";
		}
	}
}

//CÓDIGO PARA LER ARQUIVOS EXTERNOS
class ArquivoTextoLeitura {
	private BufferedReader entrada;
	ArquivoTextoLeitura(String nomeArquivo) {
		try {
			entrada = new BufferedReader(new InputStreamReader(new
					FileInputStream(nomeArquivo), "UTF-8"));
		} catch (UnsupportedEncodingException excecao) {
			System.out.println(excecao.getMessage());
		} catch (FileNotFoundException excecao) {
			System.out.println("Arquivo nao encontrado");
		}
	}
	public void fecharArquivo() {
		try {
			entrada.close();
		}
		catch (IOException excecao) {
			System.out.println("Erro no fechamento do arquivo de leitura: " +
					excecao);
		}
	}
	@SuppressWarnings("finally")
	public String ler() {
		String textoEntrada = null;
		try {
			textoEntrada = entrada.readLine();
		}
		catch (EOFException excecao) { //Excecao de final de arquivo.
			textoEntrada = null;
		}
		catch (IOException excecao) {
			System.out.println("Erro de leitura: " + excecao);
			textoEntrada = null;
		}
		finally {
			return textoEntrada;
		}
	}
}

//CÓDIGO PARA MODIFICAR ARQUIVOS EXTERNOS
class ArquivoTextoEscrita {
	private BufferedWriter saida;
	ArquivoTextoEscrita(String nomeArquivo) {
		try {
			saida = new BufferedWriter(new OutputStreamWriter(new
					FileOutputStream(nomeArquivo), "UTF-8"));
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
		}
		catch (IOException excecao) {
			System.out.println("Erro no fechamento do arquivo de escrita: " +
					excecao);
		}
	}
	public void escrever(String textoEntrada) {
		try {
			saida.write(textoEntrada);
			saida.newLine();
		}
		catch (IOException excecao){
			System.out.println("Erro de entrada/saída " + excecao);
		}
	}
}
