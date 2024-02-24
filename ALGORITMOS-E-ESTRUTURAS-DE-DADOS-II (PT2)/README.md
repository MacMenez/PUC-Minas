# ALGORITMOS E ESTRUTURAS DE DADOS II

## Unidades de ensino

### Unidade 0: Nivelamento
#### Ferramentas
- Verde
- Repl.it

Python Tutor, C Tutor, Java Tutor 

#### Introdução às linguagens C, C++ e Java

**Aula 1 - Introdução**  
- **Hello World em C**
~~~c
#include <stdio.h>

int main(){
    printf("Hello World!\n");
    return 0;
}
~~~
[Link do Arquivo de Teste em C](0%20-%20Revisao/1%20-%20Introducao_Liguagens/HelloWorld.c)

- **Hello World em C++**
~~~c++
#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {
    std::cout << "Hello World!\n";
    return 0;
}
~~~
[Link do Arquivo de Teste em C++](0%20-%20Revisao/1%20-%20Introducao_Liguagens/HelloWorld.cpp)

- **Hello World em C#**
~~~c#
using System;

class HelloWorld{
    public static void Main(string[] args){
        Console.WriteLine ("Hello World!");
    }
}
~~~
[Link do Arquivo de Teste em C#](0%20-%20Revisao/1%20-%20Introducao_Liguagens/HelloWorld.cs)

- **Hello World em JAVA**
~~~java
public class HelloWorld {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
~~~
[Link do Arquivo de Teste em JAVA](0%20-%20Revisao/1%20-%20Introducao_Liguagens/Projeto%20em%20JAVA/src/HelloWorld.java)

- **Hello World em Python**
~~~python
print("Hello World!")
~~~
[Link do Arquivo de Teste em Python](0%20-%20Revisao/1%20-%20Introducao_Liguagens/HelloWorld.py)

**Aula 2 - Tipos de Dados**  
- **Tipos de Dados em C**
~~~c
char //caractere
int //inteiro
float //ponto flutuante
double //ponto flutuante
char[] //cadeia de carcteres(vetor)

//C possue os modificadores de tipos:
short
long
unsigned
signed
~~~
[Link do Arquivo de Teste em C](0%20-%20Revisao/2%20-%20Tipos%20de%20Dados/tiposDeDados.c)

- **Tipos de Dados em C++**  
Acrescentou o tipo **Booleano**.
~~~c++
char //caractere
int //inteiro
float //ponto flutuante
double //ponto flutuante
bool //boleano
char[] //cadeia de carcteres(vetor)

//C possue os modificadores de tipos:
short
long
unsigned
signed
~~~
[Link do Arquivo de Teste em C++](0%20-%20Revisao/2%20-%20Tipos%20de%20Dados/tiposDeDados.cpp)

- **Tipos de Dados em C#**
~~~c#
sbyte, short, int, long //Inteiro com Sinal
byte, ushort, uint, ulong //Inteiro sem Sinal
char //caractere
float, double, decimal //Ponto Flutuante
bool //Boleano
String //cadeia de caracteres(vetor)
~~~
[Link do Arquivo de Teste em C#](0%20-%20Revisao/2%20-%20Tipos%20de%20Dados/tipoDeDados.cs)

- **Tipos de Dados em JAVA**
~~~java
byte, short, int, long //Inteiro
float, double //Ponto flutuante
char //Caractere
boolean //Booleano
class String //Cadeia de Caracteres(vetor)
~~~
[Link do Arquivo de Teste em JAVA](0%20-%20Revisao/2%20-%20Tipos%20de%20Dados/tipoDeDados.java)

- **Tipos de Dados em Python**
~~~python
int #Inteiro
float #Ponto flutuante
bool #Booleano
str #Cadeia de caracteres(vetor)
~~~
[Link do Arquivo de Teste em Pyhton](0%20-%20Revisao/2%20-%20Tipos%20de%20Dados/tipoDeDados.py)

**Aula 3 - Comandos de Entrada e Saída**
- **Comandos de Entrada e Saída em C**
~~~c
#include <stdio.h>

int main(){
    int x;
    scanf(x); //Entrada
    
    printf("Hello World!\n"); //Saída

    return 0;
}
~~~
[Link do Arquivo de Teste em C](0%20-%20Revisao/3%20-%20Entrada%20e%20Sa%C3%ADda/inputOutput.c)

- **Comandos de Entrada e Saída em C++**
~~~c++
#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {
    int x;
    std::cin >> x; //Entrada

    std::cout << "Hello World!\n"; //Saída
    return 0;
}
~~~
[Link do Arquivo de Teste em C++](0%20-%20Revisao/3%20-%20Entrada%20e%20Sa%C3%ADda/inputOutput.cpp)

- **Comandos de Entrada e Saída em C#**
~~~c#
using System;

class HelloWorld{
    public static void Main(string[] args){
       
        Console.ReadLine(); //Entrada
        //Sempre retorna um String, se for ler números, tem que converser com Parse(). Veja o exemplo.

        Console.WriteLine ("Hello World!"); //Saída + Pula 1 Linha
        Console.Write("Hello World!"); //Saída Padrão
    }
}
~~~
[Link do Arquivo de Teste em C#](0%20-%20Revisao/3%20-%20Entrada%20e%20Sa%C3%ADda/inputOutput.cs)

- **Comandos de Entrada e Saída em JAVA**
~~~java
import java.util.Scanner; //Tem que importar a iblioteca que for utilizada

public class inputOutput {
    public static void main(String[] args) {
        System.out.print(""); //Saída Padrão
        System.out.println(""); //Saída Padrão + Pula 1 linha

        //Deve-se instanciar um objeto, no caso teclado
        Scanner teclado = new Scanner(System.in);
            String s = teclado.nextLine();
            int num = teclado.nextInt();
            float num2 = teclado.nextFloat();
        teclado.close();
    }
}
~~~
[Link do Arquivo de Teste em JAVA](0%20-%20Revisao/3%20-%20Entrada%20e%20Sa%C3%ADda/inputOutput.java)

- **Comandos de Entrada e Saída em Python**
~~~python
print() #Saída Padrão

input() #Entrada Padrão
~~~
[Link do Arquivo de Teste em Python](0%20-%20Revisao/3%20-%20Entrada%20e%20Sa%C3%ADda/inputOutput.py)

**Aula 4 - Operadores Aritméticos e Relacionais**
![Operadores Aritméticos e Relacionais](_img/Operadores%20Aritm%C3%A9ticos%20e%20Relacionais.png)

- **Operadores Aritméticos e Relacionais em C**  
[Link do Arquivo de Exemplo em C](0%20-%20Revisao/4%20-%20Operadores%20Aritm%C3%A9ticos%20e%20Relacionais/operadoresAritmedicos.c)

- **Operadores Aritméticos e Relacionais em C++**  
[Link do Arquivo de Exemplo em C++](0%20-%20Revisao/4%20-%20Operadores%20Aritm%C3%A9ticos%20e%20Relacionais/operadoresAritmedicos.cpp)

- **Operadores Aritméticos e Relacionais em C#**  
[Link do Arquivo de Exemplo em C#](0%20-%20Revisao/4%20-%20Operadores%20Aritm%C3%A9ticos%20e%20Relacionais/operadoresAritmedicos.cs)

> Nas linguagens C, C++ e C# a utilização dos **Operadores Aritméticos** são extremamente semelhantes, mudando apenas os comandos de _impressão de saída_ entre as linguagens. Na linguagem JAVA o processo é semelhante, porém em Python a redução e alteração do código, é onde mais haverá divergências.

- **Operadores Aritméticos e Relacionais em JAVA**  
[Link do Arquivo de Exemplo em JAVA](0%20-%20Revisao/4%20-%20Operadores%20Aritm%C3%A9ticos%20e%20Relacionais/operadoresAritmedicos.java)

- **Operadores Aritméticos e Relacionais em Python**  
[Link do Arquivo de Exemplo em Python](0%20-%20Revisao/4%20-%20Operadores%20Aritm%C3%A9ticos%20e%20Relacionais/operadoresAritmedicos.py)

**Aula 5 - Comando IF**  
Como já apresentado em arquivos e exemplos anteriores, as linguagens C, C++, C#, JAVA, possuem semelhanças entre si, como nos códigos e exemplos abaixo, o comando _IF/ELSE_ não é excessão. As mudanças irão ocorrer mesmo na linguagem Python.

![Comparativo do Comando _IF/ELSE_](_img/Comando%20IF-ELSE.png)

>Nas linguagens C, C++, C# e JAVA o fechamento do bloco de comandos do IF **ou** ELSE com _{ }_ é opcional. Caso o bloco de comandos tenha 2 ou mais comandos, as chaves se tornam **obrigatórias**. No caso do Python os _( )_ de condição são opcionais e após definir a condição, inserir os **:**.

A principal diferença entre Pyhton e as demais linguagens, já citadas nos exemplos, no caso dos comando de IF/ELSE, é que para as demais linguagens, os blocos de comandos são agrupados em _chaves ( **{ }** )_, já no Python, este grupo de blocos de código é feito com a **identação**.

Outradiferença entre Python e as demais linguagens são referentes ao **IF aninhado**, onde nas outras linguagens temos um IF dentro de outro IF ou ELSE. Já no Python, para ter-se IF ninhado, usa-se o comando **ELIF**, semelhante ao **ELSE IF** das demais linguagens.

Os exemplos abaixo são apenas com o IF, para ver o código completo, siga os links abaixo dos exemplos.

- **Comando IF - C**  
~~~c
#include <stdio.h>

int main(int argc, char const *argv[]){
    int num;

    printf("Digite um número: ");
    scanf("%d", &num);

    if (num < 0){
        printf("Número %d é negativo!", num);
    }
    
    return 0;
}
~~~
[Link Arquivos de Teste de Comandos IF - C](0%20-%20Revisao/5%20-%20Comando%20IF/comand_IF.c)

- **Comando IF - C++** 
~~~cpp
#include <iostream>

using namespace std;

int main(int argc, char const *argv[]){
    int num;
    
    cout << "Digite um número: ";
    cin num;

    if (num < 0){
        cout << "O número " << num << " é negativo!";
    }
    
    return 0;
}
~~~ 
[Link Arquivos de Teste de Comandos IF - C++](0%20-%20Revisao/5%20-%20Comando%20IF/comand_IF.cpp)

- **Comando IF - C#** 
~~~cs
using System;

class comand_IF{
    public static void Main (string[] args){
        int num;

        Console.WriteLine("Digite um número: ");
        num = int.Parse(Console.Readline());

        if (num < 0){
            Console.WriteLine("O número " + num + " é negativo!");
        }
    }
}
~~~
[Link Arquivos de Teste de Comandos IF - C#](0%20-%20Revisao/5%20-%20Comando%20IF/comand_IF.cs)

- **Comando IF - JAVA**  
~~~java
import java.util.Scanner;

public class comand_IF {
    public static void main(String[] args) {
        int num;

        Scanner teclado = new Scanner(System.in);
            System.out.print("Digite um número: ");
            num = teclado.nextInt();

            if (num < 0) {
                System.out.printf("\nO número %d é negativo!", num);
            }
        teclado.close();
    }
}
~~~
[Link Arquivos de Teste de Comandos IF - JAVA](0%20-%20Revisao/5%20-%20Comando%20IF/comand_IF.java)

- **Comando IF - Python**  
~~~py
num = int(input("Digite um número: "))
if(num < 0):
    print("O número {0} é negativo!".format(num))
~~~
[Link Arquivos de Teste de Comandos IF - Python](0%20-%20Revisao/5%20-%20Comando%20IF/comand_IF.py)

**Aula 6 - Comandos de Repetição**

![Comparativo dos Comandos de Repetição](_img/Comandos%20de%20Repeti%C3%A7%C3%A3o.png)

[Cálculo de Área em C](0%20-%20Revisao/6%20-%20Comandos%20de%20Repeti%C3%A7%C3%A3o/repeat_comand.c)  
[Cálculo de Área em C++](0%20-%20Revisao/6%20-%20Comandos%20de%20Repeti%C3%A7%C3%A3o/repeat_comand.cpp)  
[Cálculo de Área em C#](0%20-%20Revisao/6%20-%20Comandos%20de%20Repeti%C3%A7%C3%A3o/repeat_comand.cs)  
[Cálculo de Área em JAVA](0%20-%20Revisao/6%20-%20Comandos%20de%20Repeti%C3%A7%C3%A3o/repeat_comand.java)  
[Cálculo de Área em Python](0%20-%20Revisao/6%20-%20Comandos%20de%20Repeti%C3%A7%C3%A3o/repeat_comand.py)  

**Recursividade**

**Ponteiros e Alocação Dinâmica de Memória**  

---

### Unidade 1: Noções de complexidade
Introdução à análise de complexidade de algoritmos

## Aulas práticas
### Introdução à Programação Orientada a Objetos
Introdução à Programação Orientada a Objetos

### Cursos de Java
- [Curso de Java - Dev DOJO](https://www.youtube.com/watch?v=kkOSweUhGZM&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL)
- [Curso de Java - Gustavo Guanabara](https://www.youtube.com/playlist?list=PLHz_AreHm4dkI2ZdjTwZA4mPMxWTfNSpR)
- [Curso de Java - eXcript](https://www.youtube.com/watch?v=gsy5GqwWqjw&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD)
- [Tutorial Java (Oracle)](https://docs.oracle.com/javase/tutorial/)
