public class App {
    public static void main(String[] args) {
        /*
        Jogo game = new Jogo("Real Madri", "Barcelona", 2, 2);
        game.setPlacarTime1(5);
        System.out.println(jogo.getTime1());
        System.out.println(jogo.getPlacarTime1);

        Jogo cl = game.clone();
        game.setPlacarTime2(4);

        System.out.println(game);
        System.out.println(cl);
        */

        Jogo game = new Jogo();

        String linha = MyIO.readLine();
        String[] info = linha.split("#");

        game.setTime1(info[0]);
        game.setTime2(info[1]);
        game.setPlacarTime1(Integer.parseInt(info[2]));
        game.setPlacarTime2(Integer.parseInt(info[3]));

        System.out.println(game);

        /*
            Jogo[] jogos = new Jogo[1000];
            Jogo[] jogo = new Jogo[1000];
            jogo[i] = new Jogo
        */
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

        if (placarTime1 >= 0) {
            this.placarTime1 = p1;
        }
        else{
            this.placarTime1 = 0;
        }

        if (placarTime2 >= 0) {
            this.placarTime2 = p2;
        }
        else{
            this.placarTime2 = 0;
        }
    }
        public String getTime1() {
            return time1;
        }

        public void setTime1(String time1) {
            this.time1 = time1;
        }

        public String getTime2() {
            return time2;
        }

        public void setTime2(String time2) {
            this.time2 = time2;
        }

        public int getPlacarTime1() {
            return placarTime1;
        }

        public void setPlacarTime1(int placarTime1) {
            if (placarTime1 >= 0) {
                this.placarTime1 = placarTime1;
            }
            else{
                this.placarTime1 = 0;
            }
        }

        public int getPlacarTime2() {
            return placarTime2;
        }

        public void setPlacarTime2(int placarTime2) {
            if (placarTime2 >= 0) {
                this.placarTime2 = placarTime2;
            }
        }

        public String toString() {
            return (this.getTime1() + "" + this.getPlacarTime1() + " X " + this.getPlacarTime2() + "" + this.getPlacarTime2());
        }

        public Jogo clone() {
            Jogo clone = new Jogo();
            clone.placarTime1 = this.placarTime1;
            clone.placarTime2 = this.placarTime2;
            clone.time1 = this.time1;
            clone.time2 = this.time2;

            return clone;
        }
}