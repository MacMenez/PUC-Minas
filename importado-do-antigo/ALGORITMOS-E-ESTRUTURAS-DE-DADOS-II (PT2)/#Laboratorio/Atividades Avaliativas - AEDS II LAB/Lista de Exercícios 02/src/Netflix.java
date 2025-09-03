public class Netflix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyIO.setCharset("UTF-8");

		// PARTE 1 - ARMAZENANDO INFORMAÇÕES NO VETOR
		Filme[] vetorFilme = new Filme[2000]; //Vetor estático com o total de posições do arquivo

		String linha = MyIO.readLine(); //Lendo o dado do arquivo PUB.in

		int contadorVetor = 0; //Indice de referência do objeto vetorFilme, cada i equivale a 1 vetorFilme.

		//CRIANDO E PREENCHENDO O VETOR COM FILMES DO ARQUIVO PUB.IN
		while(!linha.equals("FIM")) { //Criando flag conforme orientação no enunciado da atividade
			vetorFilme[contadorVetor] = new Filme(); //Criando um objeto vetorFilme através da classe Filme.
			vetorFilme[contadorVetor].Ler(linha);
			contadorVetor++; //Aumentando contagem
			linha = MyIO.readLine(); //Lendo o dado do arquivo PUB.in
		}

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
}
