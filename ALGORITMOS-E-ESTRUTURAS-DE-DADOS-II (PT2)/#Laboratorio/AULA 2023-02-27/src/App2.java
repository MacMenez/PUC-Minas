public class App2 {
    public static void main(String[] args) {
        Pessoa.obterCaminhoArquivo();
        
        Pessoa heitor = new Pessoa();

        heitor.nome = "Heitor da Silva";
        heitor.CPF = "123456789";
        heitor.idade = 50;

        Pessoa joao = heitor.clone();
        joao.nome = "Joao da Silva";

        System.out.println(heitor.nome);
        System.out.println(joao.nome);
    }
}