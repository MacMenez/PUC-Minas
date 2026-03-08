public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        metodo1();  //Obrigatorio que seja estatico
        Main x = new Main();
        x.metodo2(); //Cria um objeto, desobrigando a classe de ser estatica

        Pessoa p = new Pessoa();
        p.setPeso(32.5);
    }

    static void metodo1(){}
    void metodo2(){}
} //Fim classe Main

class Pessoa{
    public int idade;
    private String nome, profissao;
    float peso;
    //Outros atributos

    Pessoa(){}

    Pessoa(int idade){
        this.idade;
    }
}
