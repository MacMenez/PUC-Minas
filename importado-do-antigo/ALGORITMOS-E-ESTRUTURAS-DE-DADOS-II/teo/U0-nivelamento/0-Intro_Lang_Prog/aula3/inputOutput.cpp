#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {
    int x;
    std::cin >> x; //Entrada

    std::cout << "Hello World!\n"; //Saída

    //Exemplo
    char nome[20];
    int idade;
    float altura;

    cout << "Digite seu primeiro nome: ";
    cin >> nome;

    cout >> "Digite sua idade: ";
    cin >> idade;

    cout << "Digite sua altura: ";
    cin >> altura;

    cout << nome << " tem " << idade << " anos e mede" << altura "m.";
    return 0;
}