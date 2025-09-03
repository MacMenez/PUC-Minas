public class repeat_comand {
    public static void main(String[] args) {
        int area, cont = 1;

        for (int base = 1; base <= 5; base++) {
            for (int altura = 2; altura <= 10; altura += 2, cont++){
                area = base * altura;

                System.out.println(cont+ "º retângulo");
                System.out.println("====================");
                System.out.println("Base = " + base + " e altura = " + altura);
                System.out.println("Área = " + area + "\n");
            }
        }
    }    
}
