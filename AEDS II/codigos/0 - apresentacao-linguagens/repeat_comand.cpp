#include <iostream>

using namespace std;

int main(int argc, char const *argv[]){
    float base, altura, area;

    do{
        cout << "Digite a base do retângulo: ";
        cin >> base;

        if (base > 0){
            cout << "Digite a altura do retângulo: ";
            cin >> altura;

            area = base * altura;

            cout << "A área do retângulo = " << area << endl;
        }
        
    } while (base > 0);
    
    return 0;
}