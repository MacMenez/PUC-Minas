public class App {
    public static void main(String[] args) throws Exception {
        int a = 0, n = 0;

        /*  #   Número de Multiplicações do Código  #*/

        for (int i = 0; i < n; i++)
        for (int j = 0; j < n - 3; j++)
        a *= 2;
        //n * (n-3) multiplicações

        for (int i = n - 7; i >= 1; i--)
        for (int j = 0; j < n; j++)
        a *= 2;
        //(n-7) * n multiplicações

        for (int i = n - 7; i >= 1; i--)
        for (int j = n - 7; j >= 1; j--)
        a *= 2;
        //(n-7) * (n-7) multiplicações

        for (int i = n; i > 0; i /= 2)
        a *= 2;
        //Para um valor qualquer de n, temos lg(n) + 1 multiplicações


    }
}
