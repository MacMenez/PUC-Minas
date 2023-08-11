#include <iostream>

using namespace std;

int main(int argc, char const *argv[]){
    int num;
    
    cout << "Digite um número: ";
    cin num;

    if (num < 0){
        cout << "O número " << num << " é negativo!";
    }
    else{       
        //Considerar que 0 é nulo.
        if (num == 0){
            cout << "O número " << num << " é positivo!";
        }
        else{
            cout << "O número " << num << " é positivo!";
        }
        
    }
    
    
    return 0;
}
