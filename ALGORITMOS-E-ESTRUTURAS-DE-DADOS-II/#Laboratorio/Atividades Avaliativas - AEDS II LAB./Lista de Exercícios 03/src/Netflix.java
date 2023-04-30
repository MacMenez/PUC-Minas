import java.io.*;

public class Netflix {
	public static void main(String[] args) throws Exception {
        MyIO.setCharset("UTF-8");
        
        //Procedimento para encontrar e utilizar o arquivo do programa
        ArquivoTextoLeitura infoArquivo = new ArquivoTextoLeitura(getPathArquivo());
        
        //Procedimento de leitura das informações do arquivo
        String linha = infoArquivo.ler();
        
        //Vetor de armazenamento das informações
        Filme[] vetorFilmes = new Filme[2000];    
        //Referências no vetor
        int indiceDeLocalizacao = 0;
        //Criando uma referencia filme
        Filme filme;
        
        //Leitura dos dados do arquivo
        while (linha != null) {
        	filme = Filme.ler(linha);
            vetorFilmes[indiceDeLocalizacao++] = filme;
            linha = infoArquivo.ler();
        }
        
        infoArquivo.fecharArquivo();
        //Encerramento da leitura dos arquivos
        
        //Leitura e tratamento dos dados
        String fimLinha = "";
        while (!fimLinha.equals("FIM")) {
			fimLinha = MyIO.readLine();
			
			if (!fimLinha.equals("FIM")) {
				String [] infoFilme = fimLinha.split(";");
				String titulo = infoFilme[0];
				int anoLancamento = Integer.parseInt(infoFilme[1]);
				int duracao = Integer.parseInt(infoFilme[2]);
				Filme.imprimir(vetorFilmes, titulo, anoLancamento, duracao);
			}
		}
        //Fim da leitura e tratamento dos dados
        for(int i=0; i<indiceDeLocalizacao; i++) {
        	System.out.println(vetorFilmes[i]);
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
    
class ArquivoTextoEscrita {
    private BufferedWriter saida;

    ArquivoTextoEscrita(String nomeArquivo) {
        try {
            saida = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nomeArquivo), "UTF-8"));
        } catch (UnsupportedEncodingException excecao) {
            System.out.println(excecao.getMessage());
        } catch (IOException excecao) {
            System.out.println("Erro na abertura do arquivo de escrita: " + excecao);
        }
    }

    public void fecharArquivo() {
        try {
            saida.close();
        } catch (IOException excecao) {
            System.out.println("Erro no fechamento do arquivo de escrita: " + excecao);
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


class ArquivoTextoLeitura {
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
            System.out.println("Erro no fechamento do arquivo de leitura: " + excecao);
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