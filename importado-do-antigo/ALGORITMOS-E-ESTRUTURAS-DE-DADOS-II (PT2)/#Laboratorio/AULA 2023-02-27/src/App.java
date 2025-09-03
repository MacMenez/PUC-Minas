public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula de Operador New!");

        Pessoa heitor = new Pessoa(); //Inicializar como variável

        heitor.nome = "Heitor da Silva";
        System.out.println(heitor.nome);

        Pessoa joao = heitor; //Referenciando o mesmo espaçõ, o que for feito em um, interfere no outro

        heitor.nome = "Heitor de Souza"; //Altera o nome

        System.out.println(heitor.nome); //Mostra no nome de referencia
        System.out.println(joao.nome); //Mostra no nome de referencia

        //Pessoa joao = new Pessoa(); //Cria um novo espaço
        joao.nome = "João da silva"; //Altera o nome da 2° instancia

        heitor = joao; //Um sobrescreve o outro
        heitor.nome = "Heitor de Souza";

        System.out.println(heitor.nome); //Mostra no nome de referencia
        System.out.println(joao.nome); //Mostra no nome de referencia
    }
}