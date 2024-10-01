import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// public class ConverterStringParaData {
public class TesteData {
    public static void main(String[] args) {
        String dataString = "25/12/2023"; // String de data no formato dd/mm/yyyy

        SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy"); // Formato de entrada
        SimpleDateFormat formatoSaida = new SimpleDateFormat("dd/MM/yyyy"); // Formato de saída

        try {
            Date data = formatoEntrada.parse(dataString); // Converte a String para Date

            // Formata a data novamente para o formato desejado
            String dataFormatada = formatoSaida.format(data);

            System.out.println("Data convertida: " + dataFormatada); // Imprime a data formatada

        } catch (ParseException e) {
            System.err.println("Erro ao converter a data: " + e.getMessage());
        }
    }
}