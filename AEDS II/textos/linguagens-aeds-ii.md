# Introdução às linguagens C, C++ e Java

Na disciplina de **Algoritmos e Estruturas de Dados I** foi estudado a Linguagem C e algumas integrações com OO (Orientação A Objetos) através da Linguagem C++. Dando continuidade ao estudo de orientação a objetos, haverá um disciplina de mesmo nome que aboradará os conceitos, definições e demais práticas da orientação a objetos. Haverá também nesta disciplina o estudo inicial dos principios e práricas da orientação a objetos.

Para a disciplina de **Algoritmos e Estruturas de Dados II**, os conceitos e praticas de orientação a objetos serão estudados através da lingugem Java, oriunda do C, participando assim da família das **Linguagens C Like**, ou seja, derivadas da linguagem C, contendo algumas diferenciações nas chamadas de métodos e/ou funções específicas da linguagem. Há também alguns cursos abordam a linguagem da Microsoft, C#, para estudar Orientação A Objeto em Algoritmos e estrutura de Dados II, além também de outros cursos que tem foco na linguagem Python.

Uma breve introdução/revisão das linguagens será apresentada abaixo, seja para apresentar a linguegem, revisar a lingugem ou apenas demonstrar de forma superficial a diferença entre cada uma delas com alguns conceitos. Ela foi baseada no material do professor Rodrigo Richard Gomes.

## Linguagem C

Desenvolvida em 1972 por Denis Ritchie (pai do sistema operacional Unix (usado no Linux, Macs, smarthpones(Android e iOS))) nos laboratório bell, ganhou também o premio Turing. Veio a falecer em 2000.

C não apresenta suporte para orientação a objetos, ela é uma linguagem procedural. 

A diretiva `#include` é para que a lingem C acrescete umadeterminada biblioteca. A principal,ou uma das principasi é a bibliteca `stdio.h`que contem funções de entrada e saída.

A função `main()` é a função prncipal e é obrigatoria para o código funcionar, é a partir dela que o programa inicia e direciona chamada de funções ao longo do progrmama.

### Hello World

Denis Ritchie junto de Brian W. Kergan lançaram o livro intitulado "_The C Programing Language_", neste livro no página 6, eles usam um exemplo de impressão de comando de saída com a frase "hello, word\n", esta expressão então seria utilizada em todos o aprendizado de programção, tento como primiero exemplo de saída de daodos o "hello world".

```c
#include <stdio.h>

int main(){
    printf("hello, world\n");
    return 0;
}
```

[Download do código aqui](codigos/0-apresentacao-linguagens/hello.c)

### Tipos Primitivos
### Comandos de Entrada e Saída
### Operadores Aritméticos e Relacionais
### Estruturas de Controle: decisão e Repetição

```c

```

[Download do código aqui](codigos/0-apresentacao-linguagens/)

## Linguagem C++

Desenvolvida em 1979 por Bjarne Strupup, também expressa verbalmente como "_c plus-plus_" no idioma ingles. Muito ocnhecida também com o nome **C Com Classes**.

Embora esta linguagem suporte a orientação a objetos, para manter a maior compatibilidade com a lingegem c, a linguegem c++ é usada como uma programaçaõ orientada a procedimentos, então muito do código em C++ será semelhante, senão identico a lingem C.

A diretiva `#include` é para que a lingem C++ acrescete umadeterminada biblioteca. A principal,ou uma das principasi é a bibliteca `iostream`que contem funções de entrada e saída.

A função `main()` é a função prncipal e é obrigatoria para o código funcionar, é a partir dela que o programa inicia e direciona chamada de funções ao longo do progrmama.

### Hello World

Denis Ritchie junto de Brian W. Kergan lançaram o livro intitulado "_The C Programing Language_", neste livro no página 6, eles usam um exemplo de impressão de comando de saída com a frase "hello, word\n", esta expressão então seria utilizada em todos o aprendizado de programção, tento como primiero exemplo de saída de daodos o "hello world".

```cpp
#include <iostream>
using namespace std;

int main(){
    std::cout << "hello, world\n";
    return 0;
}
```

[Download do código aqui](codigos/0-apresentacao-linguagens/hello.cpp)

### Tipos Primitivos
### Comandos de Entrada e Saída
### Operadores Aritméticos e Relacionais
### Estruturas de Controle: decisão e Repetição

```cpp

```

[Download do código aqui](codigos/0-apresentacao-linguagens/)

## Linguagem Python

Desenvolvida em 1991 por Guido Von Rossum que levou os principios de criar uma linguagem com:
- simplicidade
- llegibilidade
- produtividade

Com isso Python seria uma liguagem de fácil leitura e fácil manutenção.

### Hello World

Denis Ritchie junto de Brian W. Kergan lançaram o livro intitulado "_The C Programing Language_", neste livro no página 6, eles usam um exemplo de impressão de comando de saída com a frase "hello, word\n", esta expressão então seria utilizada em todos o aprendizado de programção, tento como primiero exemplo de saída de daodos o "hello world".

```python
print("hello, world")
```

[Download do código aqui](codigos/0-apresentacao-linguagens/hello.py)

### Tipos Primitivos
### Comandos de Entrada e Saída
### Operadores Aritméticos e Relacionais
### Estruturas de Controle: decisão e Repetição

```python

```

[Download do código aqui](codigos/0-apresentacao-linguagens/)

## Linguagem Java

Desenvolvida em 1995 por James Goslin. No inicio do desenvolvimento o nome da linguagem era Olk, porém por questões de direitos autorais, mudou para o nome Java e se torna propiedade da empresa Oracle.

Assim como a linguagem C#, a linguagem java também é orientada a objetos,logo deve ser declarada como uma classe e uma das diferenças entre C# e java é que, deferente dos métodos de C# que iniciam com letra maiuscula, em java são consideradas funções e começam com letra minuscula.

### Hello World

Denis Ritchie junto de Brian W. Kergan lançaram o livro intitulado "_The C Programing Language_", neste livro no página 6, eles usam um exemplo de impressão de comando de saída com a frase "hello, word\n", esta expressão então seria utilizada em todos o aprendizado de programção, tento como primiero exemplo de saída de daodos o "hello world".

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello, world");
    }    
}
```

[Download do código aqui](codigos/0-apresentacao-linguagens/Hello.java)

### Tipos Primitivos
### Comandos de Entrada e Saída
### Operadores Aritméticos e Relacionais
### Estruturas de Controle: decisão e Repetição

```java

```

[Download do código aqui](codigos/0-apresentacao-linguagens/)

## Linguagem C#

Desenvolvida em 2002 por Anders Helsbj, desenvolvedor e projetista das linguagens Defi e Turbo Pascal quando trabalhava na Borland. A linguegem C# em si foi lançada pela Microsoft.

Diferente daa lingagem c e lingengem c++, a linguagem c# tem algumas estruturas de código maiores, em relação a escrita, devido ao fato de ela ser uma lnguem completamente orientada a objetos.

Deve informar então que está usando o namespace `System`para o compilador do C#, tendo assim as classes fundamentais da linguagem. Dentro da função `Main()`, agora nesta linguagem recebera o nome de **método**, todo método (por convenção) se iniciará com letra maiuscula, diferente de C e C++.

### Hello World

Denis Ritchie junto de Brian W. Kergan lançaram o livro intitulado "_The C Programing Language_", neste livro no página 6, eles usam um exemplo de impressão de comando de saída com a frase "hello, word\n", esta expressão então seria utilizada em todos o aprendizado de programção, tento como primiero exemplo de saída de daodos o "hello world".

```cs
using System;

class Program {
  public static void Main (string[] args) {
    Console.WriteLine ("Hello World");
  }
}
```

[Download do código aqui](codigos/0-apresentacao-linguagens/hello.cs)

### Tipos Primitivos
### Comandos de Entrada e Saída
### Operadores Aritméticos e Relacionais
### Estruturas de Controle: decisão e Repetição

```cs

```

[Download do código aqui](codigos/0-apresentacao-linguagens/)

## Próximos Passos ⏭️

[Seção Anterior: Ambientes de Desenvolvimento Integrado](ide-aeds-ii.md)

[Próxima Seção: Introdução ao Java](introducao-java-aeds-ii.md)