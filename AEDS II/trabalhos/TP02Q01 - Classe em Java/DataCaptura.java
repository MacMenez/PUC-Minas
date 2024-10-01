import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataCaptura {

    private Date data;

    public DataCaptura(String dataString) {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato da data
        try {
            this.data = formatoData.parse(dataString); // Converte a String para Date
        } catch (ParseException e) {
            System.err.println("Erro ao converter a data: " + e.getMessage());
            this.data = null; // Define a data como null em caso de erro
        }
    }

    public Date getData() {
        return data;
    }

    public void imprimirData() {
        if (data != null) {
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato da data
            String dataFormatada = formatoData.format(data);
            System.out.println("Data de captura: " + dataFormatada);
        } else {
            System.out.println("Data de captura inválida.");
        }
    }
}