import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pokemon {
    private int id;
    private int generation;
    private String name;
    private String description;
    private ArrayList<String> types;
    private ArrayList<String> abilities;
    private double weight;
    private double height;
    private int captureRate;
    private Boolean isLegendary;
    private Date captureDate;

    private static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy"); // Formatação de tipos Data
    
    // CONSTRUTORES
    public Pokemon() {
        this.id = 0;
        this.generation = 0;
        this.name = "";
        this.description = "";
        this.types = new ArrayList<String>();
        this.abilities = new ArrayList<String>();
        this.weight = 0.0;
        this.height = 0.0;
        this.captureRate = 0;
        this.isLegendary = false;
        this.captureDate = null;
    }

    public Pokemon(int id, int generation, String name, String description, ArrayList<String> types, ArrayList<String> abilities, double weight,
            double height, int captureRate, Boolean isLegendary, Date captureDate) {
        this.id = id;
        this.generation = generation;
        this.name = name;
        this.description = description;
        this.types = types;
        this.abilities = abilities;
        this.weight = weight;
        this.height = height;
        this.captureRate = captureRate;
        this.isLegendary = isLegendary;
        this.captureDate = captureDate;
    }

    /* MÉTODOS GET E SET */
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public int getGeneration() { return generation; }
    public void setGeneration(int generation) { this.generation = generation; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public ArrayList<String> getTypes() { return types; }
    public void setTypes(String types) { 
        String[] vetorTipos = types.split(",", 2);
        for (int i = 0; i < vetorTipos.length; i++) {
            if (vetorTipos[i].compareTo("") != 0) {
                this.types.add(vetorTipos[i]);
            }
        }
    }

    public ArrayList<String> getAbilities() { return abilities; }
    public void setAbilities(String abilities) { 
        String[] vetorHabilidades = abilities.split("'");
        for (int i = 0; i < vetorHabilidades.length; i++) {
            if (vetorHabilidades[i].compareTo("[") != 0 && vetorHabilidades[i].compareTo(", ") != 0) {
                this.abilities.add(vetorHabilidades[i]);
            }
        }
    }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public int getCaptureRate() { return captureRate; }
    public void setCaptureRate(int captureRate) { this.captureRate = captureRate; }

    public Boolean getIsLegendary() { return isLegendary; }
    public void setIsLegendary(Boolean isLegendary) { this.isLegendary = isLegendary; }

    public Date getCaptureDate() { return captureDate; }
    public void setCaptureDate(Date captureDate) { this.captureDate = captureDate; }
    
    /* MÉTODO TOSTRING */
    @Override
    public String toString() { return super.toString();  }

    /*
     * Estrutura da saída padrão
     * [#id -> name: description - [types] - [abilities] - weight - height - captureRate - isLegendary - generation] - captureDate]
     * Exemplo: [#181 -> Ampharos: Light Pokémon - ['electric'] - ['Static', 'Plus'] - 61.5kg - 1.4m - 45% - false - 2 gen] - 25/05/1999
    */

    /* MÉTODO IMPRIMIR */
    private void imprimirLista(ArrayList<String> lista){
        System.out.print("[");
        for (int i = 0; i < lista.size(); i++) {
            if(i == lista.size()-1){ System.out.printf("'%s'", lista.get(i)); }
            else { System.out.printf("'%s', ", lista.get(i)); }
        }
        System.out.print("] - ");
    }
    
    public void imprimir(){
        System.out.print(
            "[#" + getId()
            + " -> "
            + getName() + ": " +
            getDescription() + " - "
        );

        imprimirLista(getTypes());
        imprimirLista(getAbilities());

        System.out.println(
            getWeight() + "kg - " +
            getHeight() + "m - " +
            getCaptureRate() + "% - " +
            getIsLegendary() + " - " +
            getGeneration() + " gen] - " +
            dataFormatada.format(getCaptureDate())
        );
    }
    
    /* MÉTODO CLONE */
    public void Clone(){
        Pokemon clone = new Pokemon();
        clone.id = this.id;
        clone.generation = this.generation;
        clone.name = this.name;
        clone.description = this.description;
        clone.types = this.types;
        clone.abilities = this.abilities;
        clone.weight = this.weight;
        clone.height = this.height;
        clone.captureRate = this.captureRate;
        clone.isLegendary = this.isLegendary;
        clone.captureDate = this.captureDate;
    }

    /* MÉTODO LER */
    public void lerDados(String informacao){
        // Função split deu errado, tentar com indexOf
        int inicio = 0, fim = 0;

        // ID
        fim = informacao.indexOf(",", inicio);
        setId(Integer.valueOf(informacao.substring(inicio, fim)));

        //Geração
        inicio = fim + 1;
        fim = informacao.indexOf(",", inicio);
        setGeneration(Integer.valueOf(informacao.substring(inicio, fim)));

        //Nome
        inicio = fim+1;
        fim = informacao.indexOf(",", inicio);
        setName(informacao.substring(inicio, fim));

        //Descrição
        inicio = fim+1;
        fim = informacao.indexOf(",", inicio);
        setDescription(informacao.substring(inicio, fim));

        //Tipos
        inicio = fim+1;
        fim = informacao.indexOf(",\"", inicio);
        setTypes(informacao.substring(inicio, fim));

        //Habilidades
        inicio = fim+2; // Soma-se 2 para pular caracteres
        fim = informacao.indexOf("]", inicio);
        setAbilities(informacao.substring(inicio, fim));
        
        //Peso
        inicio = fim+3;
        fim = informacao.indexOf(",", inicio);

        //Tratar casos em que não há informação
        try { this.setWeight(Double.valueOf(informacao.substring(inicio, fim))); } 
        catch (Exception e) { this.setWeight(0.0); }

        //Altura
        inicio = fim+1;
        fim = informacao.indexOf(",", inicio);
        try { setHeight(Double.valueOf(informacao.substring(inicio, fim))); } 
        catch (Exception e) { setHeight(0.0); }

        //Capture Rate
        inicio = fim+1;
        fim = informacao.indexOf(",", inicio);
        setCaptureRate(Integer.valueOf(informacao.substring(inicio, fim)));

        //Lendário
        inicio = fim+1;
        fim = informacao.indexOf(",", inicio);
        setIsLegendary(informacao.substring(inicio, fim).compareTo("0") == 0 ? false : true); // Tratar caso de falta de informação

        //Data
        inicio = fim+1;
        try { setCaptureDate(dataFormatada.parse(informacao.substring(inicio, informacao.length()))); } 
        catch (Exception e) { setCaptureDate(null); }
    }
}