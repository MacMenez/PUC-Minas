# Introdução às linguagens C, C++ e Java

Na disciplina de **Algoritmos e Estruturas de Dados I** foi estudado a Linguagem C e algumas integrações com OO (Orientação A Objetos) através da Linguagem C++. Dando continuidade ao estudo de orientação a objetos, haverá um disciplina de mesmo nome que aboradará os conceitos, definições e demais práticas da orientação a objetos. Haverá também nesta disciplina o estudo inicial dos principios e práricas da orientação a objetos.

Para a disciplina de **Algoritmos e Estruturas de Dados II**, os conceitos e praticas de orientação a objetos serão estudados através da lingugem Java, oriunda do C, participando assim da família das **Linguagens C Like**, ou seja, derivadas da linguagem C, contendo algumas diferenciações nas chamadas de métodos e/ou funções específicas da linguagem, por exemplo. Há também alguns cursos abordam a linguagem da Microsoft, C#, para estudar Orientação A Objeto em Algoritmos e Estrutura de Dados II, além também de outros cursos que tem foco na linguagem Python.

## Compilador Online, Debugger Visual e Tutor IA

O [Tutor](https://pythontutor.com/) é uma plataforma online para testes de c´digos, onde se é possível visualizar o funcioamento e cada linha do código através de uma ferramenta chamada _Debbuger_, est mesma ferramenta é encontrada em outras IDE, poré para fim deestudo e amostragem, sera falado um pouco sobre esta plataforma online que poderá auxiliar nos estudos de algoritmos.

Para utilizar a parte de visualizaçãod a plataforma vá para sua página aqui: [Python Tutor](https://pythontutor.com/visualize.html#mode=edit).

Como dito anteriormente, várias linguagens serão estudadas ao longo do curso, logo, o máximo de conhecimento, exemplos e demosntrações possíveis que huver, melhor será o desempenho na disciplina. Aliias, a pataforma Tutor citada possui visualização e dubbger para as linguagens estudadas durante a disciplina e durante o curso de computação no geral, apresentado visaliaç~ao para os códigos desenvolvidos nas linguagns Python, Java, C, C++. o C# porṕem não pode ser visualizado nesta plataforma, como compensação há visualização de códigos em JavaScript.

Acessado a plataforma, haverá um campo que ermite escolhr qual a liguagem será compilada pela plataforma.
![Campo de escolha das linguuagens](../imagens/tutor-tela-linguagem.png)

Selecionada a linguagem, outra parte estará a mostra com um cursor piscando, este campo é o campo parainseir o código criado.
![Campo de escrita de código](../imagens/tutor-tela-codigo.png)

Após digitar ou colar seu código na área de escrita de código, é necessário clicar no botão de visualização para que o  ódigo seja lido, compilado e apresentado em modo de visualizção.
![Identificação da parte de compilação d código](../imagens/tutor-tela-compilar.png)

Abaixo deste botão há diponível uma série de tutoiais e guias de estudos para linguagens de proramaçã e algoritmos, caso seja do seu ineresse, é uma boa recomendação de estudo.

Pressionado o botão de viisualiazação, uma nova tela será exibida.
![Tela de visualização da compilação do código](../imagens/tutor-tela-visualizacao.png)

Inicialmente é possivel identificar á esquerda o código digitado com algma setas informando onde haverá uma saída de dados e/ou a linha que está sendo executada no mometo. A mudança de linha de comando é feita pelo botão de **next** que mostrará liha a liha, ou pelo botão **last**, que executará o programa por completo, mostrando assim apenas a visulaização final  do códgo, **first** para retornar ao início do código e **prev** para voltar para a última execução concluída. Para casos em que seja necessário uma correção, há também o botão de **Edit  this code**, que permitirá relizar alterações no código paa ser xecutado novamente. Já à direita, há um campo para saída de dados, ou seja, todos os dados que serão exibidos na tela serão apresentados neste campo e, abaixo, á também uma  visualizaçõa da chamad **pilha deexecução** (stack ou heap, depedendo da linguagem), que contém  os resolutados de cada execução por linha de comando.

Para estudo de caso da linguagem java, há uma otra pplataforma, muito semlehante ao Tutor, que tamém permite a visualizzação da execução do código chamada [cscircles](https://cscircles.cemc.uwaterloo.ca/java_visualize/). Seu princṕio de funcionamkento é muito parecido com a plataforma Tutor, porém volada apenas para a linguagem Java.

Esta parte do Tutor foi desenvolvida através do vídeo abaixo disponível  na área do aluno. Sua adaptação para esta seção foi feita de forma a agraga anda mais o uso de ferramentas para ampliar e desenvolver cada vez mais ferramentas e/ou mecanismos de estudos de linguagens de programação e algoritmos na disciplina, além de, demostrar o conteúdo em língua portuguesa, já que o tuorial é em língua inglẽsa.

[Python Tutor, C Tutor, Java Tutor](https://www.youtube.com/watch?v=TRMKJucB3B8)

## Linguagens C, C++ e Java

A apresentação  e/ou "_revisão_" das linguagens a seguir são a representação dos vídeos do Professor Rodrigo Richard Gomes, disponibilizada na área do aluno na seção de nivelamento.

Uma breve introdução das linguagens será apresentada abaixo, demosntrando de forma superficial a diferença entre cada uma delas com alguns conceitos. Para executar os códigos apresentados, pode-se utilizar as feramentas , citadas no tópico anterior ou as ferramentas de compilação porIDE ou plataformas online, vistos na seção [Ambientes de Desenvolvimento Integrado](../textos/ide-aeds-ii.md).

### Linguagem C

Desenvolvida em 1972 por Denis Ritchie (pai do sistema operacional Unix (usado no Linux, Macs, smarthpones(Android e iOS))) nos laboratório bell, ganhou também o premio Turing. Veio a falecer em 2000.

C não apresenta suporte para orientação a objetos, ela é uma linguagem procedural. 

A diretiva `#include` é para que a lingem C acrescete umadeterminada biblioteca. A principal,ou uma das principasi é a bibliteca `stdio.h`que contem funções de entrada e saída.

A função `main()` é a função prncipal e é obrigatoria para o código funcionar, é a partir dela que o programa inicia e direciona chamada de funções ao longo do progrmama.

#### Hello World

Denis Ritchie junto de Brian W. Kergan lançaram o livro intitulado "_The C Programing Language_", neste livro no página 6, eles usam um exemplo de impressão de comando de saída com a frase "hello, word\n", esta expressão então seria utilizada em todos o aprendizado de programção, tento como primiero exemplo de saída de daodos o "hello world".

```c
#include <stdio.h>

int main(){
    printf("hello, world\n");
    return 0;
}
```

[Download do código aqui](../codigos/0%20-%20apresentacao-linguagens/hello.c)

#### Tipos Primitivos

Na linguagem C os tipos primitivos são divididos em:

- `char`: representação de caractres
- `int`: represenando números inteiros
- `float`: epresentando númeroscom Ponto FLutuante
- `double`: representnado números  com Ponto FLutuante
- `char[]`: vetor de caacteres usado para representar paalavra, frases, etc.

Há também alguns modificadores de tipos como `short`, `long`, `unsigned` e  `signd`.

#### Comandos de Entrada e Saída

Na linguagem C os comandos de saída, ou seja, os comandos que mostram um resultado na tela são:
- `printf()`

Já os comandos de entrada, ou seja, os comandos que receberã uma informação do teclado são
- `scanf()`

Uma forma de se aplicar estes comandos são da seguinte forma:

```c
int x;
scanf(x); //Comando de Entrada
printf("Hello World!\n");  //Comando de Saída
```

Um código de exemplo utilizando os tpos primitivos com comandos de entrada e saída pode ser apresentado da seguinte forma:

```c
#include <stdio.h>

int main(){
  //Exemplo
  char nome[20];
  int idade;
  float altura;

  printf("Digite seu primeiro nome: ");
  scanf("%s", nome); //Não utiliza o & pois é uma cadeia de caractere

  printf("Digite sua idade: ");
  scanf("%d", &idade);

  printf("Digite sua altura: ");
  scanf("%f", &altura);

  printf("%s tem %d anos de idade e mede %.2fm.", nome,idade, altura);
  return 0;
}
```

[Download do código aqui](../codigos/0%20-%20apresentacao-linguagens/inputOutput.c)

#### Operadores Aritméticos e Relacionais
#### Estruturas de Controle: decisão e Repetição

```c

```

[Download do código aqui](../../codigos/0%20-%20apresentacao-linguagens/)

### Linguagem C++

Desenvolvida em 1979 por Bjarne Strupup, também expressa verbalmente como "_c plus-plus_" no idioma ingles. Muito ocnhecida também com o nome **C Com Classes**.

Embora esta linguagem suporte a orientação a objetos, para manter a maior compatibilidade com a lingegem c, a linguegem c++ é usada como uma programaçaõ orientada a procedimentos, então muito do código em C++ será semelhante, senão identico a lingem C.

A diretiva `#include` é para que a lingem C++ acrescete umadeterminada biblioteca. A principal,ou uma das principasi é a bibliteca `iostream`que contem funções de entrada e saída.

A função `main()` é a função prncipal e é obrigatoria para o código funcionar, é a partir dela que o programa inicia e direciona chamada de funções ao longo do progrmama.

#### Hello World

Denis Ritchie junto de Brian W. Kergan lançaram o livro intitulado "_The C Programing Language_", neste livro no página 6, eles usam um exemplo de impressão de comando de saída com a frase "hello, word\n", esta expressão então seria utilizada em todos o aprendizado de programção, tento como primiero exemplo de saída de daodos o "hello world".

```cpp
#include <iostream>
using namespace std;

int main(){
    std::cout << "hello, world\n";
    return 0;
}
```

[Download do código aqui](../codigos/0%20-%20apresentacao-linguagens/hello.cpp)

#### Tipos Primitivos

Na linguagem C++ os tipos primitivos são divididos em:

- `char`: representação de caractres
- `int`: represenando números inteiros
- `float`: epresentando númeroscom Ponto FLutuante
- `double`: representnado números  com Ponto FLutuante
- `bool`: representnado valores booleanos (verdadeiro ou falso)
- `char[]`: vetor de caacteres usado para representar paalavra, frases, etc.

Há também alguns modificadores de tipos como `short`, `long`, `unsigned` e  `signd`.

#### Comandos de Entrada e Saída

Os comandos da linguagem C, como `printf()` e `scanf()`, também são disponibilizados em C++, apesar da sintaxe em C++ mudar, ela é compatível com algumas sintazxes de linguagem C, mas lembre-se, C++ tem seus próprios objetos para representações e aplicações de entrada e saída de código.

Na linguagem C os comandos de saída, ou seja, os comandos que mostram um resultado na tela são:
- `cout <<`

Já os comandos de entrada, ou seja, os comandos que receberã uma informação do teclado são
- `cin >>`

Uma maneira de se aplicar estes comandos são da seguinte forma:

```cpp
#include <iostream>

using namespace std;

int main(int argc, char const *argv[]){
  int x;
  std::cin >> x; // Entrada de Dados
  std::cout << "Hello World!\n"; // Saída de Dados
}
```

Um código de exemplo utilizando os tipos primitivos com comandos de entrada e saída pode ser apresentado da seguinte forma:

#### Operadores Aritméticos e Relacionais
#### Estruturas de Controle: decisão e Repetição

```cpp

```

[Download do código aqui](../codigos/0%20-%20apresentacao-linguagens/)

### Linguagem Python

Desenvolvida em 1991 por Guido Von Rossum que levou os principios de criar uma linguagem com:
- simplicidade
- llegibilidade
- produtividade

Com isso Python seria uma liguagem de fácil leitura e fácil manutenção.

#### Hello World

Denis Ritchie junto de Brian W. Kergan lançaram o livro intitulado "_The C Programing Language_", neste livro no página 6, eles usam um exemplo de impressão de comando de saída com a frase "hello, word\n", esta expressão então seria utilizada em todos o aprendizado de programção, tento como primiero exemplo de saída de daodos o "hello world".

```python
print("hello, world")
```

[Download do código aqui](../codigos/0%20-%20apresentacao-linguagens/hello.py)

#### Tipos Primitivos

Na linguagem Python os tipos primitivos são divididos em:

- `int`: represenando números inteiros
- `float`: epresentando númeroscom Ponto FLutuante
- `bool`: representnado valores booleanos (verdadeiro ou falso)
- `str`: vetor de caacteres usado para representar cadeia de carateres.

#### Comandos de Entrada e Saída
#### Operadores Aritméticos e Relacionais
#### Estruturas de Controle: decisão e Repetição

```python

```

[Download do código aqui](../codigos/0%20-%20apresentacao-linguagens/)

### Linguagem Java

Desenvolvida em 1995 por James Goslin. No inicio do desenvolvimento o nome da linguagem era Olk, porém por questões de direitos autorais, mudou para o nome Java e se torna propiedade da empresa Oracle.

Assim como a linguagem C#, a linguagem java também é orientada a objetos,logo deve ser declarada como uma classe e uma das diferenças entre C# e java é que, deferente dos métodos de C# que iniciam com letra maiuscula, em java são consideradas funções e começam com letra minuscula.

#### Hello World

Denis Ritchie junto de Brian W. Kergan lançaram o livro intitulado "_The C Programing Language_", neste livro no página 6, eles usam um exemplo de impressão de comando de saída com a frase "hello, word\n", esta expressão então seria utilizada em todos o aprendizado de programção, tento como primiero exemplo de saída de daodos o "hello world".

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello, world");
    }    
}
```

[Download do código aqui](../codigos/0%20-%20apresentacao-linguagens/Hello.java)

#### Tipos Primitivos

Na linguagem Java os tipos primitivos são divididos em:

- `char`: represenando caracteres
- `byte`, `short`, `int`, `long`: representação de números interios
- `float`, `double`: epresentando númeroscom Ponto FLutuante
- `boolean`: representnado valores booleanos (verdadeiro ou falso)
- `String`: representado cadeias de caracteres. É representado como uma classe.

#### Comandos de Entrada e Saída
#### Operadores Aritméticos e Relacionais
#### Estruturas de Controle: decisão e Repetição

```java

```

[Download do código aqui](../codigos/0%20-%20apresentacao-linguagens/)

### Linguagem C#

Desenvolvida em 2002 por Anders Helsbj, desenvolvedor e projetista das linguagens Defi e Turbo Pascal quando trabalhava na Borland. A linguegem C# em si foi lançada pela Microsoft.

Diferente daa lingagem c e lingengem c++, a linguagem c# tem algumas estruturas de código maiores, em relação a escrita, devido ao fato de ela ser uma lnguem completamente orientada a objetos.

Deve informar então que está usando o namespace `System`para o compilador do C#, tendo assim as classes fundamentais da linguagem. Dentro da função `Main()`, agora nesta linguagem recebera o nome de **método**, todo método (por convenção) se iniciará com letra maiuscula, diferente de C e C++.

#### Hello World

Denis Ritchie junto de Brian W. Kergan lançaram o livro intitulado "_The C Programing Language_", neste livro no página 6, eles usam um exemplo de impressão de comando de saída com a frase "hello, word\n", esta expressão então seria utilizada em todos o aprendizado de programção, tento como primiero exemplo de saída de daodos o "hello world".

```cs
using System;

class Program {
  public static void Main (string[] args) {
    Console.WriteLine ("Hello World");
  }
}
```

[Download do código aqui](../codigos/0%20-%20apresentacao-linguagens/hello.cs)

#### Tipos Primitivos

Na linguagem C# os tipos primitivos são divididos em:

- `sbyte`, `short`, `int`, `long`: representação de números interios **com** sinal
- `byte`, `ushort`, `uint`, `ulong`: representação de números interios **sem** sinal
- `char`: represenando caracteres
- `float`, `double`, `decimal`: epresentando númeroscom Ponto FLutuante
- `bool`: representnado valores booleanos (verdadeiro ou falso)
- `String`: representado cadeias de caracteres. É reconhecido como uma classe.

#### Comandos de Entrada e Saída
#### Operadores Aritméticos e Relacionais
#### Estruturas de Controle: decisão e Repetição

```cs

```

[Download do código aqui](../codigos/0%20-%20apresentacao-linguagens/)

## Próximos Passos ⏭️

[Seção Anterior: Ambientes de Desenvolvimento Integrado](ide-aeds-ii.md)

[Próxima Seção: Introdução ao Java](introducao-java-aeds-ii.md)