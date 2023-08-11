public class Pessoa {
    public String CPF;
    public String nome;
    public int idade;

    Pessoa(){
        this.nome = "AEDS";
        this.idade = 2;
        System.out.println("Bem Vindo ao Sistema!");
    }

    Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa clone() {
        Pessoa clone = new Pessoa();
        clone.CPF = this.CPF;
        clone.nome = this.nome;
        clone.idade = this.idade;
        
        return clone;
    }

    public static String obterCaminhoArquivo() {
        return "C:\\Windows\\arquivo.txt";
    }
}

class main{
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

//Vetor de Classes
class vetor{
    public static void main() {
        int [] valores = new int [10];
        Pessoa[] pessoas = new Pessoa[10];
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = 2*i;
            System.out.println(valores[i] + ", ");
        }
        
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            pessoas[i].nome = "Joao " + i;
            //pessoas[i].CPF = "" + 1;

        }
        
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i] + ", "); //Recebe null, pq esta vazio
            System.out.println(pessoas[i].nome + ", ");
        }
    }
}