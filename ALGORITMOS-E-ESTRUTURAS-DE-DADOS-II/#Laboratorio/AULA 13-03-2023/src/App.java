public class App {
    public static void main(String[] args) {
        Jogo game = new Jogo("Real Madri", "Barcelona", 2, 2);
        jogo.setPlacarTime1(5);

        System.out.println(game);

        Jogo cl = game.clone();
        System.out.println(game);
    }


    public String toString() {
        return this.gettime1() + "" + this.getplacarTime1() + " X " + this.getplacarTime1() + 
    }

    public Jogo clone() {
        Jogo clone = new Jogo();
        clone.placarTime1 = this.placarTime1;
        clone.placarTime2 = this.placarTime2;
        clone.time1 = this.time1;
        clone.time2 = this.time 2;
        return clone;
    }
}

class Jogo {
    
    private String time1;
    private String time2;
    private int placarTime1;
    private int placarTime2;
    

    // Opção Padrão
    public Jogo() {
        this.placarTime1 = 0;
        this.placarTime2 = 0;
    }

    //Opção Parametrizada
    public Jogo(String t1, String t2, int p1, int p2){
        this.time1 = t1;
        this.time2 = t2;
        this.placarTime1 = p1;
        this.placarTime2 = p2;
    }
}