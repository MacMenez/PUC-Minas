
/*
   Professor, sigo tendo algumas dificuldades, mas estou avançando aos poucos.
   Alguns erros ainda persistem e irei estudá-los para melhorar.
*/
import java.io.*;
import java.nio.charset.*;

public class arquivoFinal {
   public static void main(String[] args) throws Exception {
      MyIO.setCharset("UTF-8");

      // Procedimento para encontrar e utilizar o arquivo do programa
      ArquivoTextoLeitura infoArquivo = new ArquivoTextoLeitura(getPathArquivo());

      // Procedimento de leitura das informações do arquivo
      String linha = infoArquivo.ler();

      // Vetor de armazenamento das informações
      Filme[] vetorFilmes = new Filme[2000];
      // Referências no vetor
      int indiceDeLocalizacao = 0;
      // Criando uma referencia filme
      Filme filme;

      // Leitura dos dados do arquivo
      while (linha != null) {
         filme = Filme.ler(linha);
         vetorFilmes[indiceDeLocalizacao++] = filme;
         linha = infoArquivo.ler();
      }

      infoArquivo.fecharArquivo();
      // Encerramento da leitura dos arquivos

      // Leitura e tratamento dos dados
      String fimLinha = "";
      while (!fimLinha.equals("FIM")) {
         fimLinha = MyIO.readLine();

         if (!fimLinha.equals("FIM")) {
            String[] infoFilme = fimLinha.split(";");
            String titulo = infoFilme[0];
            int anoLancamento = Integer.parseInt(infoFilme[1]);
            int duracao = Integer.parseInt(infoFilme[2]);
            Filme.imprimir(vetorFilmes, titulo, anoLancamento, duracao);
         }
      }
      // Fim da leitura e tratamento dos dados
      for (int i = 0; i < indiceDeLocalizacao; i++) {
         System.out.println(vetorFilmes[i]);
      }
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

class Filme {
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

   public Filme(String filmes, int id, String titulo, String diretor, String atorPrincipal, String atorCoadjuvante,
         int duracao,
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

      return new Filme(id, titulo, diretor, atorPrincipal, atorCoadjuvante, duracao, categoria, paisOrigem,
            anoLancamento);
   }

   // Pesquisar: titulo, ano e duração. Imprimir o resto das informações
   public static void imprimir(Filme[] filme, String titulo, int ano, int duracao) {
      // Percorrer vetor de objeto Filme para localizar o que foi solicitado e
      // informações extras das posições.
      for (int i = 0; i < filme.length; i++) {
         if (filme[i].getTitulo().equals(titulo) && filme[i].getAnoLancamento() == ano
               && filme[i].getDuracao() == duracao) {
            MyIO.println(
                  "[" + filme[i].getTitulo() + "]" +
                        "[" + filme[i].getAnoLancamento() + "]" +
                        "[" + filme[i].getPaisOrigem() + "]" +
                        "[" + filme[i].getCategoria() + "]" +
                        "[" + filme[i].getDiretor() + "]" +
                        "[" + filme[i].getAtorPrincipal() + "]" +
                        "[" + filme[i].getAtorCoadjuvante() + "]" +
                        "[" + filme[i].getDuracao() + "]" +
                        "[" + filme[i].getId() + "]");
            return;
         }
      }
   }

   // Formatação de Dados para Saída
   public String toString() {
      return ("[" + this.getTitulo() + "]" +
            "[" + this.getAnoLancamento() + "]" +
            "[" + this.getPaisOrigem() + "]" +
            "[" + this.getCategoria() + "]" +
            "[" + this.getDiretor() + "]" +
            "[" + this.getAtorPrincipal() + "]" +
            "[" + this.getAtorCoadjuvante() + "]" +
            "[" + this.getDuracao() + "]" +
            "[" + this.getId() + "]");
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

class MyIO {

   private static BufferedReader in = new BufferedReader(
         new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
   private static String charset = "ISO-8859-1";

   public static void setCharset(String charset_) {
      charset = charset_;
      in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
   }

   public static void print() {
   }

   public static void print(int x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(double x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(String x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(boolean x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(char x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println() {
   }

   public static void println(int x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(double x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(String x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(boolean x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(char x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void printf(String formato, double x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.printf(formato, x);// "%.2f"
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static double readDouble() {
      double d = -1;
      try {
         d = Double.parseDouble(readString().trim().replace(",", "."));
      } catch (Exception e) {
      }
      return d;
   }

   public static double readDouble(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readDouble();
   }

   public static float readFloat() {
      return (float) readDouble();
   }

   public static float readFloat(String str) {
      return (float) readDouble(str);
   }

   public static int readInt() {
      int i = -1;
      try {
         i = Integer.parseInt(readString().trim());
      } catch (Exception e) {
      }
      return i;
   }

   public static int readInt(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readInt();
   }

   public static String readString() {
      String s = "";
      char tmp;
      try {
         do {
            tmp = (char) in.read();
            if (tmp != '\n' && tmp != ' ' && tmp != 13) {
               s += tmp;
            }
         } while (tmp != '\n' && tmp != ' ');
      } catch (IOException ioe) {
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readString(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readString();
   }

   public static String readLine() {
      String s = "";
      char tmp;
      try {
         do {
            tmp = (char) in.read();
            if (tmp != '\n' && tmp != 13) {
               s += tmp;
            }
         } while (tmp != '\n');
      } catch (IOException ioe) {
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readLine(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readLine();
   }

   public static char readChar() {
      char resp = ' ';
      try {
         resp = (char) in.read();
      } catch (Exception e) {
      }
      return resp;
   }

   public static char readChar(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readChar();
   }

   public static boolean readBoolean() {
      boolean resp = false;
      String str = "";

      try {
         str = readString();
      } catch (Exception e) {
      }

      if (str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") ||
            str.equals("verdadeiro") || str.equals("VERDADEIRO") || str.equals("V")) {
         resp = true;
      }

      return resp;
   }

   public static boolean readBoolean(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readBoolean();
   }

   public static void pause() {
      try {
         in.read();
      } catch (Exception e) {
      }
   }

   public static void pause(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      pause();
   }
}
