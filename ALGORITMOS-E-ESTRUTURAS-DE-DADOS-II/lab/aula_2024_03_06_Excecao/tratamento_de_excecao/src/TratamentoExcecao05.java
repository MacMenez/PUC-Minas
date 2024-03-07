public class TratamentoExcecao05 {
    public static void metodo(int i) throws Exception {
        if (i % 2 == 1) {
            throw new Exception("Valor impar");
        }
    }

    public static void main(String[] args) throws Exception {
        int i = 2;
        MyIO.println("-------------->>>>>>>> <<<<<<<<--------------");
        metodo(i);
        MyIO.println("-------------->>>>>>>> <<<<<<<<--------------");
        metodo(++i);
        MyIO.println("-------------->>>>>>>> <<<<<<<<--------------");
    }
}
