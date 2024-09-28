import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pokemon {
    private int id;
    private int generation;
    private String name;
    private String description;
    private Lista types;
    private Lista abilities;
    private double weight;
    private double height;
    private int captureRate;
    private Boolean isLegendary;
    private Date captureDate;
    
    /* CONSTRUTORES */
    public Pokemon() {}

    public Pokemon(int id, int generation, String name, String description, Lista types, Lista abilities, double weight,
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

    public Lista getTypes() { return types; }
    public void setTypes(Lista types) { this.types = types; }

    public Lista getAbilities() { return abilities; }
    public void setAbilities(Lista abilities) { this.abilities = abilities; }

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
    public String toString() {

        return "[#" + this.id + " -> " + 
        this.name + ": " + 
        this.description + " - [" + 
        this.types + "] - [" + 
        this.abilities + "] - " + 
        this.weight + " - "+ 
        this.height + " - " + 
        this.captureRate + " - " + 
        this.isLegendary + " - " + 
        this.generation + "] - " + 
        this.captureDate + "]";

        // return super.toString(); 
    }

    /* MÉTODO CLONE */
    public Pokemon Clone(){
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
        String[] pokeInfo = informacao.split(informacao);

        this.id = Integer.parseInt(pokeInfo[0]);
        this.generation = Integer.parseInt(pokeInfo[1]);
        this.name = pokeInfo[2];
        this.description = pokeInfo[3];
        this.types = new Lista(pokeInfo[4]);
        this.abilities = new Lista(pokeInfo[5]);
        this.weight = Double.parseDouble(pokeInfo[6]);
        this.height = Double.parseDouble(pokeInfo[7]);
        this.captureRate = Integer.parseInt(pokeInfo[8]);
        this.isLegendary = Boolean.parseBoolean(pokeInfo[9]);
        this.captureDate = new Date();
    }

    private Date ConverterStringParaData(String dataString) {
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy"); // Ler os dados da String

        SimpleDateFormat formatoSaida = new SimpleDateFormat("dd/MM/yyyy"); // Formato de data do CSV

        try {
            Date dataConvertida = formatoEntrada.parse(dataString); // Converte a String em formato de Data

            // Após formatar a data para o formato desejado, retorna ela como String
            String dataFormatada = formatoSaida.format(dataConvertida);

            return dataConvertida; // Retornar a data no formato Date para armazenar no objeto, se der erado, trocar para String
        } catch (ParseException e) { System.err.println("Erro ao converter a data:" + e.getMessage()); }
    }

    /* MÉTODO IMPRIMIR */
    public void imprimir() { toString(); }
    
    /*
     * Estrutura da saída padrão
     * [#id -> name: description - [types] - [abilities] - weight - height - captureRate - isLegendary - generation] - captureDate]
     * Exemplo: [#181 -> Ampharos: Light Pokémon - ['electric'] - ['Static', 'Plus'] - 61.5kg - 1.4m - 45% - false - 2 gen] - 25/05/1999
    */

}