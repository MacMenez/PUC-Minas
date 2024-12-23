import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* CRIAR UMA LISTA DO TIPO OBJETO(POKEMON) */
        ArrayList<Pokemon> listaPokemons = new ArrayList<Pokemon>();

        /* LER ARQUIVOS CSV */
        try {
            RandomAccessFile lerArquivoCSV;
            // CÓDIGO PARA LEITURA DE ARQUVIVOS CSV NO DIRETÓRIO ATUAL
            lerArquivoCSV = new RandomAccessFile("pokemon.csv", "r");

            /* CÓDIGO PARA LEITURA DE ARQUVIVOS CSV NO SOFTWARE VERDE - PUCMINAS */
            
            // lerArquivoCSV = new RandomAccessFile("/tmp/pokemon.csv", "r");

            /* Armazenar informações na classe Pokemon(Que possui uma lista pŕopria) */
            
            // Ignorar o cabeçalho do arquivo CSV
            String dadosPokemon = lerArquivoCSV.readLine();// Variável para ler as linhas do arquivo CSV
            
            /* Condição de parada é a palavra FIM */
            while (!dadosPokemon.equals("FIM")) {
                /* CRIAR OBJETO POKEMON */
                Pokemon pokemon = new Pokemon();

                /* A String é tratada na classe Pokemon para dividir os dados para os atributos específicos */
                pokemon.lerDados(dadosPokemon);

                listaPokemons.add(pokemon); /* Adiciona o objeto pokemon (com seus atributos) na lista de objetos 'listaPokemon' */

                dadosPokemon = lerArquivoCSV.readLine();
            }

            lerArquivoCSV.close();
        } catch (Exception e) { System.out.println("Arquivo não encontrado: " + e.getMessage()); }

        /* LEITURA DO ARQUIVO PUB.IN que contém os ID do que deve ser mostrado */
        Scanner teclado = new Scanner(System.in);
            String idLocalizacao = teclado.nextLine(); // Leitura do arquivo PUB.IN

            while (!idLocalizacao.equals("FIM")) {
                /* Dado o id lido localizá-lo na lista de objetos e mostrar com o métodos do objeto pokemon da lista de objetos Pokemon */
                int id = Integer.valueOf(idLocalizacao);
                for (Pokemon p : listaPokemons) {
                    if (id == p.getId()) { p.imprimir(); } 
                    else { System.out.println("Pokemon não encontrado! Verificar ID"); }
                }
                idLocalizacao = teclado.nextLine();
            }
        teclado.close();
    }
}

/*
String dadosPokemon = "1,1,Bulbasaur,Seed Pokémon,grass,poison,\"['Overgrow', 'Chlorophyll']\",6.9,0.7,45,0,05/01/1996";
        
Pokemon pokemon = new Pokemon(); // CRIAR OBJETO POKEMON

// A String é tratada na classe Pokemon para dividir os dados para os atributos específicos
pokemon.lerDados(dadosPokemon);

listaPokemons.add(pokemon); //Adiciona o objeto pokemon (com seus atributos) na lista de objetos 'listaPokemon'
 */

 