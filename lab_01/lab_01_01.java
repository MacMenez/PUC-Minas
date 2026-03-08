public class lab_01_01 {
    public static double calcularAliquota(String tempo_dias) {
        double aliquota = 0;
        int valorConvertido = Integer.parseInt(tempo_dias);
        
        if (valorConvertido < 181) {
            aliquota = 22.5;
        }
        else if (valorConvertido > 180 && valorConvertido < 361) {
            aliquota = 20.0;
        }
        else if (valorConvertido > 360 && valorConvertido < 720) {
            aliquota = 17.5;
        }
        else if (valorConvertido > 720) {
            aliquota = 15.0;
        }
        else{
            MyIO.println("Valor fora da regra analisada!");
        }

        return aliquota;
    }
    public static void main(String[] args) {
        MyIO.println("QUESTÃO 1");
        
        String tempo_dias = MyIO.readLine();
        
        while (!tempo_dias.equals("FIM")) {
            MyIO.println(calcularAliquota(tempo_dias) + "%");
            tempo_dias = MyIO.readLine();
        }
    }
}
