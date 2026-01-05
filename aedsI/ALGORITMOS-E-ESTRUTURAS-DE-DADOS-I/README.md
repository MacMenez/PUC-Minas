# ALGORITMOS-E-ESTRUTURAS-DE-DADOS-I
 #### _Repositório da disciplina ALGORITMOS E ESTRUTURAS DE DADOS I do cursode Engenharia da Computação_

## ALGORITMOS E ESTRUTURAS DE DADOS I - Engenharia de Computação
##### _UNID. EDUC. SÃO GABRIEL - PSG - MANHÃ - 2022/1_

**Objetivos:**
Fornecer ao aluno condições de expressar soluções de modo algorítmico em uma linguagem de programação. Levar o aluno a entender os principais conceitos e usos de linguagens de programação. Permitir que o aluno desenvolva técnicas para a construção e documentação de programas. Dar condições ao aluno de utilizar uma linguagem de programação para a resolução de problemas computacionais.


**Linguagem de Programação utilizada no  1°. semestre de 2022 :** _Java_

**Ambiente de Programação utilizado:** _Eclipse_

**Dia de aula no laboratório:** _Terça-feira - 08:50 às 10:30 hs_

Para acessar os trabalhos que foram desenvolvidos, verifique o **desenvolvimento da disciplina** abaixo ou os **trabalhos e atividade** feitos no 1° Período.

### **Desenvolvimento da disciplina**
Utilizado para consultas durante o 1° Período, de maneira a facilitar e auiliar o desenvolvvimento de atividades e trabalhos propostos. COntém dicas, exemplos e aplicações.

- [Aula 1 - Introduction](#introduction)
    - [Análise de Desenvolvimento de Um Programa](#análise-de-desenvolvimento-de-um-programa)
        - [Paradigmas de Programação](#paradigmas-de-programação)
- [Aula 2 - Tipos de Dados](#tipos-de-dados)
    - [Dados](#dados)
    - [Variável](#variável)
        - [Declaração de Variáveis](#declaração-de-variáveis)
    - [Atribuição](#atribuição)
    - [Conversão de Tipos](#conversão-de-tipos)
        - [Conversão Implícita](#conversão-implícita)
        - [Conversão Explícita](#conversão-explícita)
    - [Modificadores](#modificadores)
    - [Constantes](#constantes)
- [Aula 3 - Entrada e Saída](#entrada-e-saída)
    - [Saída Formatada](#saída-formatada)
- Aula 2 - JAVA Language
- Aula 3 - Conditional Structure
- Aula 4 - Repeat Structure
- Aula 5 - Repeat Structure - Flag
- Aula 6 - Repeat Structure - FOR
- Aula 7 - Method
- Aula 8 - Function
- Aula 9 - Vector
- Aula 10 - Matrix


### **Trabalhos e Atividade**
- Somar 3 números inteiros quaisquer e mostrar o resultado.
    - Q1_ATVD1
- Calcular e mostrar a área de um quadrado.
    - Q1_ATVD2

---
# INTRODUCTION 
O desenvolvimento de algoritmos é feito através de _Linguagens de Prgramação_, elas estruturam um programa e fazem com que as regras de execução do programa sejam **interpretadas** e **executadas** corretamente pelo **computador**.

O _computador_ ao receber as informações geradas com a programação das linguagens de programação fazem o chamado _Processamento de Dados_, ou seja recebem dados, seja de _periféricos computacionais_, _linguagens de programção_, _softwares_, etc; e geram um resultado conforme **intruções** recebidas. Estas por sua vez são executadas e apresentadas em _dispositivos de saída_, sejam eles **monitores**, **projetores**, **impressoras**, dentre outros.

### CONCEITOS IMPORTANTES
**Programa/Código/Software**  
São nomes atribuidos a um conjunto de comandos que nada mais são do que as instruções que serão lidas e interpretadas pela máquina ou computador.

**Linguagem de Programação**  
São definidas por um conjunto de regras que irão definir como escrever um programa, cada uma tem uma maneira de transmitir informações para serem compiladas pelo computador. Dentre várias temos como exemplos:  
- Linguagem JAVA
- Linguagem C/C++
- Linguagem C#
- Linguagem Pascal
- Linguagem Visual Basic

**Editor de Código**  
Trata-se de um programa que permite escrever de um outro prgrama, dentre os mais utilizados temos:  
- Visual Studio
- Code Blocks
- Eclipse
- Bloco de Notas

**Compilador**  
É um programa responsavel por "_traduzir_" o código escrito, seguindo as regras da linguagem de programação escolhida, em **Linguagem de Máquina**(ou **_Código Binário_**), que é a forma compreendida pelo computador.

![Fluxograma de Prcessos na programação](_imagensAEDS1/Compilar%20e%20Eecutar.png)

**IDE - Integrated Development Environment(Ambiente de Desenvolvimento Integrado)**
É a integração de todos os elementos anteriores. Uma IDE é um ambiente em que se pode escrever um código de determinada linguagem de programação e ao ser concluído a escrita do código, o mesmo pode em seguida ser excecutado e demostrar seu funcionamento e falhas, caso haja alguma.

[Cálculo de Fatorial - Código em Linguagem Java](1%20-%20Analise%20de%20Desenvolvimento%20de%20um%20Programa/5%20-%20Factorial_JAVA/)

Para fazer com que um programa, através de uma linguegem de programação, tenha exito em seu propósito ele deve passar pelo processo de **Ánalise e Desenvolvimento de Software**.

# ANÁLISE DE DESENVOLVIMENT DE UM PROGRAMA
**Análise:** É feita com base no enunciado ou definições apresentadas de um determinado problema a ser resolvido, identifica-se as entradas, aquilo que será recebido, saídas,aquilo que será entregue e o processamento necessário, sejam em equações, comparações, etc.

**Algoritmo:** Trata-se de uma sequência de passos para resolver o problema da análise. Podem existir diversas sequências possíveis com vários desdobramentos, alguns claro mais complexos, compridos ou até maiores(em quantidade de linhas) que outros. Estas soluções são apresentadas de diversas formas podendo ser por meio de narrativas ou textos explicativos, fluxogramas, pseudocódigo(ou portugês estruturado), estas por sua vez são as mais utilizadas em algoritmos.

![Descritivo de Fluxograma](_imagensAEDS1/Descritivo%20de%20Fluxograma.png)

**Codificação:** Representação do algoritmo em comandos da linguagem de programação.

Um exemplo de codificação seria o seguinte:

**ANÁLISE:** Somar 3 números. 

**ALGORITMO:**
1. Solicitar e memorizar cada um dos números.
2. Realizar operações de soma dos números e memorizar o resultado
3. Exibir o resultado

**CODIFICAÇÃO:**
1. Pseudocódigo

~~~
INÍCIO_ALGORITMO
    DECLARE X, Y, Z, resultado NUMÉRICO

    ESCREVA “Digite o primeiro número”
    LEIA X
    
    ESCREVA “Digite o segundo número”
    LEIA Y
    
    ESCREVA “Digite o terceiro número”
    LEIA Y
    resultado ← X + Y + Z
    
    ESCREVA “A soma deles é ”, resultado
FIM_ALGORITMO
~~~

2. Código em JAVA  

~~~JAVA
import java.util.*;

Scanner entrada = new Scanner (System.in);

int X, Y, Z, resultado;

System.out.print (“Digite o primeiro número: ”);
X = entrada.nextInt();

System.out.print (“Digite o segundo número: ”);
Y = entrada.nextInt();

System.out.print (“Digite o terceiro número: ”);
Z = entrada.nextInt();

resultado = X + Y + Z;

System.out.println (“A soma deles é ” + resultado);
~~~

3. Exercício de Soma em JAVA: [Somar 3 Números - JAVA](1%20-%20Analise%20de%20Desenvolvimento%20de%20um%20Programa/2%20-%20Somar_Numeros/)

## PARADIGMAS DE PROGRAMAÇÃO
Se trata das possibilidades de se desenvolver um código disponveis a um desenvolvedor, são eles:

1. **Paradigma Estruturado (ou Procedural):**  
solução que pode ser divididas em funções e/ou porcedimentos, utilizando estruturas sequenciais,
condicionais e de repetição.

~~~JAVA
modificadorAcesso tipoRetorno nomeFuncao (parâmetros){
    [……]
}
~~~

2. **Paradigma Orientado À Objeto (POO):**  
Solução dividida em objetos que trocam mensagens entre si. Objetos são estruturas contendo estados (dados) 
e comportamento (lógica).

~~~JAVA
class NomeClasse{
    …atributos…
    …métodos……
}
~~~

**Comentários**  
Forma de realizar anotações no código pelo desenvolvedor que serão ignoradas
pelo compilador

_Comentários de UMA Linha:_  
A linha que deve ser comentada deve iniciar com o //

~~~JAVA
int quantidade; // indica quantidade de portas
~~~

_Comentários de VÁRIAS Linhas:_  
O trecho que possua mais de uma linha deve se iniciar com /*
e encerrar com */

~~~JAVA
/*
    Essa variável foi criada apenas para a versão 1,
    contemplando a quantidade de portas existentes
    no carro
*/
~~~

---

# Tipos de Dados
Quando falamos em comunicação de Linguagens de Programação e computadores, dizemos que há uma troca ou envio de dados, que estão definidos conceitualmente a seguir:

## DADOS 
Representa toda e qualquer tipo de informação manipulada por um programa e/ou computador.

**TIPO DE DADO:**  
Representação computacional da informação, através da representação
o computador sabe como armazenar e como interpretar o que será lido e mostrado

**TIPOS BÁSICOS:**  
- **Numéricos:** 2, 10, 381, -4, -215, 10.21, -25.63
Representam qualquer tipo de número conhecido.

- **Lógicos:** true, false
Representam tipos binários onde só se pode ter uma representação ou seu oposto.
Usado em operações de análise compatacional.

- **Literais:** "Esse é um exemplo"
Sejam palavra ou palavras, frases, etc. Armazena conteudo de texto.

- **Caracteres:** 'c', '*', ' ', '1'
Representam caracteres únicos e apenas 1 único carctere é reconhecido.

Estes tipos de dados são reconhecidos e classificados bináriamente conforme a _**Tabela ASCII**_.
![Tabela ASCII](_imagensAEDS1/Tabela%20ASCII.png)

## VARIÁVEL
Considere a seguinte suposição:

>Uma pessoa tem uma **FAZENDA** e precisar separar seus animais. No **ESTÁBULO** ficariam apenas os _cavalos_,no **PASTO** apenas _bois_ ou _vacas_, no **CHIQUEIRO** os _porcos_.

Com a programação não é diferente, se precisar **armazenar** qualquer tipo de **dado**, o dado é **nomeado** pelo desenvolvedor do código, um **espaço na memória RAM** é criado e juntamente atribuido uma **identificação**.   
Assim como no exemplo, _ESTÁBULOS_ é local apenas de _CAVALOS_, se um porco ou boi estiver no local, estarão ali indevidamente. A mesma coisa acontece se em uma **LISTA DE CHAMADA** aparecer a _IDADE_ ao invés do **NOME**, imagine, que estiver lecionando na hora da chamada "_Idade 15? Idade 14? Idade 17?_", seria muito confuso, ainda mais com idades se repetindo.

Nos exemplos os "_locais_"(estábulos e lista de chamada) correspondem ao _NOME_ que se é **atribuido** ao dado. Já o _TIPO DE DADO_ é delimitado conforme o programa necessite, no exemplo citado, o tipo era **PALAVRA** ou  **STRING**, pois o conteúdo que será armazenado na "_etiqueta_" **NOME**, será nomes de pessoas ou dos tipos de animais. O local que será **delimitado** para cada tipo, no caso do exemplo _FAZENDA_, é a **Memória RAM**.

As variáveis são criadas e utilizadas durante o uso do programa, quando o mesmo é **encerrado**, todas as variáveis são **apagadas** da memória. Isto pois váriaveis utilizam a memória RAM, que por sua vez é uma **memória volátil**, ou seja, quando determinado espaço de memória não estiver mais em uso, ele será tranferido para outro programa ou finalidade, caso o computador seja desligado, ela perde todos os dados contidos nela. para que os dados não sejam perdidos, eles devem ser **salvos localmente** em **HDs**, **pendrives**, **CDs**, **disquetes**, etc.

O nome que será pensado atribuído desenvolvedor a uma variável, deve atender algumas regras:
1. Diferente de palavras reservadas
2. Não pode ter símbolos, exceto o underline ‘_’
3. Deve começar por uma letra ou pelo underline ‘_’
4. Não podem existir nomes repetidos em um mesmo escopo
5. Minúsculas e maiúsculas são consideradas diferentes (case sensitive)
6. Não podem ser acentuados ou utilizar o ‘ç’(cedilha)

Sugere-se que comece com minúscula ou ‘_’ e todas as palavras que compõe o nome com maiúsculas (CamelCase), não é obrigatório, mas isto se aplica a boas práticas dentro da escrita de um código.

### DECLARAÇÃO DE VARIÁVEIS
É o ato de "_dar nome aos bois_", ou seja, dizer o que cada informação no programa é. Quando se dá nomes como LISTA DE CHAMADA, ESTÁBULO, PASTO, CHIQUEIRO, estamos implicitamente criando espaços (mentalmente ou não) onde só terá determinado tipo de informação, seja quantidade, nomes, adjetivos, etc.

Este ato de criar nomes, nada mais é do que dar comandos a um computador para **limitar um espaço na Memória RAM** para determinada finalizadade. Internamente este espaço na Memória RAM é denominado **ENDEREÇO DE MEMÓRIA**.

> Sempre, por questões de boa prática e melhor legibilidade do código, deixe o mais explícito sobre o que é aquela variável. Como já citado, se usarmos nomes vagos, podemos nos perder durante a escrita do código, porém com um nome bem definido, não tems este problema.

## ATRIBUIÇÃO
Nada mais é do que informar "_O QUE É_" que será **armazenado** no **endereço de memória** que foi criado. Por exemplo se criarmos a variável _CARDÁPIO_, ela conterá nomes apenas, valores apenas, texto médio/lngo apeas
e etc.

Como não sabemos PARA QUE será utilizada a variável sem executarmos o código ou ler suas 100, 500, Mil linhas de código, com uma atribuição seria mais fácil de se identificar sobre o que se trata a informação.

Se criarmos a variável numérica CARDÁPIO, sabemos que ou será uma variável de preço ou de quantidade(cardápio 6(mesa 6)).
Assim conseguimos rapidamente identificar sobre o que será utilizado no código.

Para atribuirmos estes tipos de dados, devemos saber qual será o dado aramazenado na variável. 
Existem alguns tipos muito usados, são denominados:

- **Tipos Básicos (em Java):**
    - int (inteiro, sem casa decimal),
    - float/double (ponto flutuante, com casa decimal),
    - boolean (lógico), 
    - string (literal), 
    - char (caracter)

Para declararmos uma variável de maneira correta, temos que seguir o padrão, informando o **modificador**, **tipo**, **nome definido** e se houver algum dado que deve ser inserido antes de iniciar o programa, defini-lo também.

**Formato**
~~~
<modificador> <tipo> <nomeEscolhido> = dadoInicial;(opcional)
~~~

Exemplos em JAVA:

~~~JAVA
int quantidade, portas = 4, idade;
double velocidade = 5.0d;
float aceleracao = 2.0f;
String nome = "Maria";
boolean carregado = true;
~~~

## CONVERSÃO DE TIPOS 
Trata-se da mudança de representação de um tipo de dado para outro tipo de dado. Esta conversão
pode ser de 2 tipos, **CONVERSÃO IMPLÍCITA** e **CONVERSÃO EXPLÍCITA**.

### CONVERSÃO IMPLÍCITA
Geralmente é feita de maneira automática para alguns tipos. Normalmente ocorre com tipos de dados que são subconjuntos de outros tipos de dados. Assim a variável de um engloba o outro, porém, não que dizer que se feito da maneira inversa dará certo.

3 é um número de tipo **NÚMERO INTEIRO**, ele pode ser representado como 3, 3.0 ou 3,0. 
3.1 ou 3,1 porém são de tipo **NÚMERO REAL**, que englobam os números **INTEIROS**, então 3.1, pode ser arredondado para 3.0 ou 3 por exemplo. Mas 3, não pode ser arredondado e virar 3.1, pois este não engloba os **NÚMEROS INTEIROS**.

### CONVERSÃO EXPLÍCITA
É utilizada quando a precisão dos dados devem ser exatas e não se pode perder informação nenhuma na precisão da conversão.

**Exemplos em Java**

~~~JAVA
float aceleracao = 2; //Número tipo FLOAT que engloba números tipo INT

double velocidade = 5.0d; //Número tipo DOUBLE que engloba FLOAT

String entrada = "54"; //Tipo STRING que engloba todos os caracateres que são por sua vez tipo CHAR

//CONVERSÃO IMPLÍCITA
int quantidade = (int) velocidade; // casting

//CONVERSÃO EXPLÍCITA
int fator = Integer.parseInt(entrada);
~~~

## MODIFICADORES
Relembrando a regra para declaração de variáveis, temos o seguinte formato:

**Formato**
~~~
<modificador> <tipo> <nomeEscolhido> = dadoInicial;(opcional)
~~~

Os tipos já foram citados, **INT** para números interios, **FLOAT/DOUBLE** para números reais, **CHAR** para caracteres,**STRING** para palavras ou texto e **BOOLEAN** para valores lógicos(0/1 - V/F - True/False - T/F).

Os nomes são escolhidos conforme necessário a declaração e o mais coerente possível para que se tenha o entendimento do que se trata a variável até mesmo na leitura de escopo do projeto, como já citado.

Os dados iniciais são dados que _**NÃO SÃO OBRIGATORIOS**_, mas podem ser utilizados para que quando um programa inicie, ela(variável) já tenha um valor pré-definido para ser reconhecido e utilizado durante a executção do programa.

Os **MODIFICADORES** por sua vez, são **ATRIBUTOS ESPECIAIS**, pois eles definem caracteristicas que uma declaração de variáveis comum sem seu uso não teria a diposição e não seria possível de se fazer com programação comum.

Os modificadores utilizados na Linguagem JAVA são:

```private```: também visto como padrão/default, utilizados para deixar as classes privadas e não visivéis durante chamads de procedimentos e/ou funções por exemplo.

```protected```: são classes "protegidas", variam do mesmo pacote em que se encontram os códigos fonte ou são de classes derivadas umas das outras.

```package```: são utilizados para definir que estão no mesmo pacote de código fonte.

```public```: são utilizados como classes livre, ou seja, em caso de chamada de função e/ou procedimento, ela será encontrada na guia de busca do usuário e fará as funções que se encontram para serem executadas. Ela é o oposto
do modificador **PRIVATE** citado acima.

## CONSTANTES
São informações que ao serem armazenadas **não podem sofrer alterações posteriores** à sua decclaração.

A declaração de nomes de constantes segue as mesmas regras da declaração de nomes de veriáveis, tendo como sugestões e/ou boas praticas por determinados programadores o nome da declaração de constantes ser feita toda com letras **MAIÚSCULAS**.

**Exemplos em JAVA**
~~~JAVA
public final double VELOCIDADE = 5.0d;
~~~

----

# ENTRADA E SAÍDA
Por padrão é considerado **saída** de um programa a **TELA**, chamado por alguns de console. Como os dados são apenas 0 e 1, ao serem interpretados pelo monitor, a saída se transforma em dados de leitura humana.

**Exemplos em JAVA**  
Escreve a informação entre parênteses e aspas duplas a partir da posição atual do cursor no Console.

~~~JAVA
System.out.print ("...");
~~~

Escreve a informação entre parênteses a partir da posição atual do cursor no Console e pula uma linha no final

~~~JAVA
System.out.println("...");
~~~

## SAÍDA FORMATADA
Especificados   |  Tipo
:-------------: | :-----: 
%d  |   int
%f | float
%.xf | float limitando casas decimais, X representa a quantidade de casas decimais que serão apresentadas.

~~~JAVA
System.out.printf ("O carro possui %d portas e sua velocidade é %2.1f km/h", quantidade, veloc);
~~~
