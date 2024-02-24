public class operadoresAritmedicos {
    public static void main(String[] args) {
        int a = 5, b = 3;
        int soma, subt, mult, quoc, resto, increm, decrem;
        float div; //Divisão exata

        soma = a + b;
        System.out.println(a + " + " + b + " = " + soma);

        subt = a - b;
        System.out.println(a + " - " + b + " = " + subt);

        mult = a * b;
        System.out.println(a + " * " + b + " = " + mult);
        
        //Divisão exata entre a e b, isto inclui as casas decimais, por isso da conversão feita abaixo
        div = (float)a / b; //Variavel a foi convertida para Ponto Flutuante
        System.out.println(a + " / " + b + " = " + div);

        //Mantem o valor inteiro e deixa o resto. Calcula a divisão "inteira"
        quoc = a / b;
        System.out.println(a + " / " + b + " = " + quoc);

        //Resto da divisão inteira
        resto = a % b;
        System.out.println(a + " % " + b + " = " + resto);

        increm = a;
        System.out.println("Antes do incrimento, o valor da variavel increm = " + increm);
        increm++;
        System.out.println("Após o incrimento, o valor da variavel increm = " + increm);

        decrem = b;
        System.out.println("Antes do decremento, o valor da variavel increm = " + decrem);
        decrem--;
        System.out.println("Após o decremento, o valor da variavel increm = " + decrem);
    }
}
