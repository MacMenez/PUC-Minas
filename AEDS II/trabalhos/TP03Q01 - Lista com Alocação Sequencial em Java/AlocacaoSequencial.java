import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Atributos {
    private int id;
    private int geracao;
    private String nome;
    private String descricao;
    private String[] tipos;
    private String[] habilidades;
    private double peso;
    private double altura;
    private int capRate;
    private boolean lendario;
    private String datacaptura;

    public Atributos(int id, int geracao, String nome, String descricao, String[] tipos, String[] habilidades, double peso, double altura, int capRate, boolean lendario, String datacaptura) {
        this.id = id;
        this.geracao = geracao;
        this.nome = nome;
        this.descricao = descricao;
        this.tipos = tipos;
        this.habilidades = habilidades;
        this.peso = peso;
        this.altura = altura;
        this.capRate = capRate;
        this.lendario = lendario;
        this.datacaptura = datacaptura;
    }

    public Atributos() {
        this.id = 0;
        this.geracao = 0;
        this.nome = "";
        this.descricao = "";
        this.tipos = new String[2];
        this.habilidades = new String[10];
        this.peso = 0.0;
        this.altura = 0.0;
        this.capRate = 0;
        this.lendario = false;
        this.datacaptura = null;
    }

    public int getId() { return id; }
    public int getGeracao() { return geracao; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public String[] getTipos() { return tipos; }
    public String[] getHabilidades() { return habilidades; }
    public double getPeso() { return peso; }
    public double getAltura() { return altura; }
    public int getCapRate() { return capRate; }
    public boolean isLendario() { return lendario; }
    public String getDataCaptura() { return datacaptura; }

    public void setId(int id) { this.id = id; }
    public void setGeracao(int geracao) { this.geracao = geracao; }
    public void setNome(String nome) { this.nome = nome; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setTipos(String tipos1, String tipos2) { this.tipos[0] = tipos1; this.tipos[1] = tipos2; }
    public void setHabilidades(String[] habilidades) { this.habilidades = habilidades; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setAltura(double altura) { this.altura = altura; }
    public void setCapRate(int capRate) { this.capRate = capRate; }
    public void setLendario(boolean lendario) { this.lendario = lendario; }
    public void setDataCaptura(String datacaptura) { this.datacaptura = datacaptura; }

    public Atributos clone() {
        return new Atributos(id, geracao, nome, descricao, tipos.clone(), habilidades.clone(), peso, altura, capRate, lendario, datacaptura);
    }

    public void imprimirAtributos() {
        String saida;
        if (tipos[1] == null) {
            saida = String.format(
                "[#%d -> %s: %s - ['%s'] - %s - %.1fkg - %.1fm - %d%% - %b - %d gen] - %s", id, nome, descricao, tipos[0], Arrays.toString(habilidades), peso, altura, capRate, lendario, geracao, datacaptura
            );
        } 
        else {
            saida = String.format(
                "[#%d -> %s: %s - ['%s', '%s'] - %s - %.1fkg - %.1fm - %d%% - %b - %d gen] - %s", id, nome, descricao, tipos[0], tipos[1], Arrays.toString(habilidades), peso, altura, capRate, lendario, geracao, datacaptura
            );
        }
        System.out.println(saida);
    }
}

public class AlocacaoSequencial {
    
    public static void main(String[] args) throws Exception{
        RandomAccessFile nomearq = new RandomAccessFile("/tmp/pokemon.csv", "r");
        nomearq.readLine();
        
        // Criação de um array para armazenar os Pokémons.
        Atributos[] pokemons = new Atributos[801];

        // Lê os dados do arquivo CSV e carrega no array.
        for (int i = 0; i < 801; i++) {
            String linha = nomearq.readLine();
            linha = new String(linha.getBytes("ISO-8859-1"), "UTF-8");
            String[] split = linha.split(",\"\\[");
            String[] split2 = split[1].split("]\",");
            String[] split3 = split2[0].split(", ");
            String[] split4 = split2[1].split(",");
            String[] split5 = split[0].split(",");
            
            pokemons[i] = new Atributos();
            pokemons[i].setId(Integer.parseInt(split5[0]));
            pokemons[i].setGeracao(Integer.parseInt(split5[1]));
            pokemons[i].setNome(split5[2]);
            pokemons[i].setDescricao(split5[3]);
            
            try {
                pokemons[i].setTipos(split5[4], split5[5]);
            } catch (Exception e) {
                String type = null;
                pokemons[i].setTipos(split5[4], type);
            }
// 1,1,Bulbasaur,Seed Pokémon,grass,poison,"['Overgrow', 'Chlorophyll']",6.9,0.7,45,0,05/01/1996
            pokemons[i].setHabilidades(split3);
            pokemons[i].setPeso(Double.parseDouble(split4[0].isEmpty() ? "0" : split4[0]));
            pokemons[i].setAltura(Double.parseDouble(split4[1].isEmpty() ? "0" : split4[1]));
            pokemons[i].setCapRate(Integer.parseInt(split4[2]));
            pokemons[i].setLendario(split4[3].equals("1"));
            pokemons[i].setDataCaptura(split4[4]);
        }

        // Criando uma lista de Pokémons para realizar as operações.
        PokemonList lista = new PokemonList();
        Scanner leituraTeclado = new Scanner(System.in);
        
        // Lendo IDs de Pokémon e adicionando na lista
        String input = leituraTeclado.nextLine();
        while (!input.equals("FIM")) {
            int id = Integer.parseInt(input) - 1;
            if (id >= 0 && id < 801) {
                lista.inserirFim(pokemons[id]);
            }
            input = leituraTeclado.nextLine();
        }

        // Lendo a quantidade de operações e processando cada uma.
        int n = leituraTeclado.nextInt();
        leituraTeclado.nextLine(); // Consome a nova linha após o número.
        
        for (int i = 0; i < n; i++) {
            String[] command = leituraTeclado.nextLine().split(" ");
            String action = command[0];
            
            switch (action) {
                case "II":
                    int idII = Integer.parseInt(command[1]) - 1;
                    lista.inserirInicio(pokemons[idII]);
                    break;
                case "IF":
                    int idIF = Integer.parseInt(command[1]) - 1;
                    lista.inserirFim(pokemons[idIF]);
                    break;
                case "I*":
                    int posI = Integer.parseInt(command[1]);
                    int idI = Integer.parseInt(command[2]) - 1;
                    lista.inserir(pokemons[idI], posI);
                break;

                case "RI":
                    System.out.println("(R) " + lista.removerInicio().getNome());
                break;

                case "RF":
                    System.out.println("(R) " + lista.removerFim().getNome());
                break;

                case "R*":
                    int posR = Integer.parseInt(command[1]);
                    System.out.println("(R) " + lista.remover(posR).getNome());
                break;
            }
        }
        
        // Imprime a lista final de Pokémons
        lista.mostrar();
        
        leituraTeclado.close();
        nomearq.close();
    }
}

// Classe PokemonList
class PokemonList {
    /*Classe PokemonList: Implementa uma lista de registros para atributos (Pokémon) com métodos para inserir no início, final e em uma posição específica, e para remover da mesma forma.
Métodos inserirInicio, inserirFim, inserir: Gerenciam a posição para inserir um novo Pokémon.*/
    private List<Atributos> lista;

    public PokemonList() { lista = new ArrayList<>(); }

    // Métodos de inserção e remoção de acordo com os requisitos
    public void inserirInicio(Atributos pokemon) { lista.add(0, pokemon); }

    public void inserir(Atributos pokemon, int posicao) {
        if (posicao >= 0 && posicao <= lista.size()) { lista.add(posicao, pokemon); }
    }

    public void inserirFim(Atributos pokemon) { lista.add(pokemon); }

    public Atributos removerInicio() { return lista.size() > 0 ? lista.remove(0) : null; }

    public Atributos remover(int posicao) { return (posicao >= 0 && posicao < lista.size()) ? lista.remove(posicao) : null; }

    public Atributos removerFim() { return lista.size() > 0 ? lista.remove(lista.size() - 1) : null; }

    // Exibição Final da Lista: os registros restantes na lista são exibidos no formato especificado.
    public void mostrar() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("[" + i + "] ");
            lista.get(i).imprimirAtributos();
        }
    }
}