import java.util.Date;

/**
 * Pokemon
 */
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
    public String toString() { return super.toString(); }

    /* MÉTODO CLONE */

    /* MÉTODO LER */

    /* MÉTODO IMPRIMIR */
    
    /*
     * Estrutura da saída padrão
     * [#id -> name: description - [types] - [abilities] - weight - height - captureRate - isLegendary - generation] - captureDate]
     * Exemplo: [#181 -> Ampharos: Light Pokémon - ['electric'] - ['Static', 'Plus'] - 61.5kg - 1.4m - 45% - false - 2 gen] - 25/05/1999
    */

}