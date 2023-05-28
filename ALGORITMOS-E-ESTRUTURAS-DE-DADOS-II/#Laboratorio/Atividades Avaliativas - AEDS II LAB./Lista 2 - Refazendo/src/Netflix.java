public class Netflix {
	public static void main(String[] args) {
		//Parte 1: Armazenamento de informações em vetor

		Filme[] vetorFilme = new Filme[2000]; //Vetor estático com o total de posições do arquivo

		String linha; //Dado a ser coletado

		linha = MyIO.readLine(); //Lendo o dado do arquivo PUB.in

		int i = 0; //Indice de referência do objeto vetorFilme, cada i equivale a 1 vetorFilme.

		while(!linha.equals("FIM")) { //Criando flag conforme orientação no enunciado da atividade

			vetorFilme[i] = new Filme(); //Criando um objeto vetorFilme através da classe Filme.
			vetorFilme[i].Ler(linha);
			i++; //Aumentando contagem
			linha = MyIO.readLine(); //Lendo o dado do arquivo PUB.in
		}

		//Parte 2: Pesquisa de informações armazenadas no vetor criado na parte 1.
		int j = 0;

		while(!linha.equals("FIM")) { //Criando flag conforme orientação no enunciado da atividade

			//INFORMAÇÕES DA PESQUISA: titulo, anoPublicacao, duracao
			vetorFilme[j].Pesquisar(linha);

			j++; //Aumentando contagem
		}
		
		/*RESULTADO DE SAÍDA NA TELA
		[titulo] [ano] [pais_origem] [categoria] [diretor] [ator1, ator2] [tempo] [id]*/
		System.out.println("Qualquerr coisa!");
		for(int i1 = 0; i1 < vetorFilme.length; i1++) {
			vetorFilme[i1].Imprimir();
		}
	}
}