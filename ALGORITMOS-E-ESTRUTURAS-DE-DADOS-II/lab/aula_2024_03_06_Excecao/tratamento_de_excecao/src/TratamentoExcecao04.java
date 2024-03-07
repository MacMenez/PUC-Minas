
public class TratamentoExcecao04 {
    public static void m1(String s) throws NumberFormatException, ArrayIndexOutOfBoundsException {
        Integer i = new Integer(s);
        if (i >= 100) {
            throw new MinhaExcecao();
        }
        MyIO.println("A variável i vale " + i);
    }

    public static void m2(String s) throws NumberFormatException {
        Integer i = new Integer(s);
        MyIO.println("A variável i vale " + i);
    }

    public static void main(String[] args) /*throws MinhaExcecao*/{
        try {
            m1(args[0]);
        } catch (NumberFormatException e) {
            MyIO.println("Erro!!!");
        } /*catch (ArrayIndexOutOfBoundsException e) {
            MyIO.println("Erro!!!");
        }*/ /*catch (MinhaExcecao e){
            MyIO.print("Erro Minha Exceção!");
        }*/ catch (Exception e){}

        MyIO.println("--- >>>>> <<<<< -----");
        try {
            m2(args[0]);
        } catch (NumberFormatException e) {
            MyIO.println("Erro!!! ");
        }
        MyIO.println("--- >>>>> <<<<< -----");
    }
}
