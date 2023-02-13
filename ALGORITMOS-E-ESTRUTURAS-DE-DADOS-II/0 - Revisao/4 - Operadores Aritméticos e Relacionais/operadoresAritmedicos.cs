using System;

class operadoresAritmedicos{
    public static void Main(string[] args){
        int a = 5, b = 3;
        int soma, subt, mult, quoc, resto, increm, decrem;
        float div; //Divisão exata

        soma = a + b;
        Console.WriteLine(a + " + " + b + " = " + soma);

        subt = a - b;
        Console.WriteLine(a + " - " + b + " = " + subt);

        mult = a * b;
        Console.WriteLine(a + " * " + b + " = " + mult);
        
        //Divisão exata entre a e b, isto inclui as casas decimais, por isso da conversão feita abaixo
        div = (float)a / b; //Variavel a foi convertida para Ponto Flutuante
        Console.WriteLine(a + " / " + b + " = " + div);

        //Mantem o valor inteiro e deixa o resto. Calcula a divisão "inteira"
        quoc = a / b;
        Console.WriteLine(a + " / " + b + " = " + quoc);

        //Resto da divisão inteira
        resto = a % b;
        Console.WriteLine(a + " % " + b + " = " + resto);

        increm = a;
        Console.WriteLine("Antes do incrimento, o valor da variavel increm = " + increm);
        increm++;
        Console.WriteLine("Após o incrimento, o valor da variavel increm = " + increm);

        decrem = b;
        Console.WriteLine("Antes do decremento, o valor da variavel increm = " + decrem);
        decrem--;
        Console.WriteLine("Após o decremento, o valor da variavel increm = " + decrem);
    }
}

