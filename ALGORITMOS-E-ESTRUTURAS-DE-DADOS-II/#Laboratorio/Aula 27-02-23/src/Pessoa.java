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
}
