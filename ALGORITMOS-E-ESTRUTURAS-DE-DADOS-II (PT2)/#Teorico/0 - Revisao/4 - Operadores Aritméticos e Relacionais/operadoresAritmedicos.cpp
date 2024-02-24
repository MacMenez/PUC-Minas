#include <iostream>

using namespace std;
 
int main(int argc, char const *argv[]) {
    int a = 5, b = 3;
    int soma, subt, mult, quoc, resto, increm, decrem;
    float div; //Divisão exata

    soma = a + b;
    cout << a << " + " << b << " = " << soma << "\n";

    subt = a - b;
    cout << a << " - " << b << " = " << subt << "\n";

    mult = a * b;
    cout << a << " * " << b << " = " << mult << "\n";
    
    //Divisão exata entre a e b, isto inclui as casas decimais, por isso da conversão feita abaixo
    div = (float)a / b; //Variavel a foi convertida para Ponto Flutuante
    cout << a << " / " << b << " = " << soma << "\n";

    //Mantem o valor inteiro e deixa o resto. Calcula a divisão "inteira"
    quoc = a / b;
    cout << a << " / " << b << " = " << quoc << "\n";

    //Resto da divisão inteira
    resto = a % b;
    cout << a << " % " << b << " = " << resto << "\n";

    increm = a;
    cout << "Antes do incrimento, o valor da variavel increm = " << increm << ". \n";
    increm++;
    cout << "Após o incrimento, o valor da variavel increm = " << increm << ". \n";

    decrem = b;
    cout << "Antes do decremento, o valor da variavel increm = " << decrem << ". \n";
    decrem--;
    cout << "Após o decremento, o valor da variavel increm = " << decrem << ". \n";

    return 0;
}
