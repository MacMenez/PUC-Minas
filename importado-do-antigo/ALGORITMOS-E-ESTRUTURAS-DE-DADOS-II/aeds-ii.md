
# Teoria

- [Escrita de Arquivos em JAVA](teo/U0-nivelamento/1-Arquivos/Escrita.java)
- [Leitura de Arquivos em JAVA](teo/U0-nivelamento/1-Arquivos/Leitura.java)

# Revisão

## Teórico
- [Localizar Informações](teo/U0-nivelamento/Revisao/0-localizarInformacao/App.java)

## Laboratório

### Linguagem C

- [Revisão de Código em Linguagem C](lab/aula_24_02_07_Introducao/c/primeiro-programa.c)
- [Verificação de números Pares e/ou Ímpares](lab/aula_24_02_07_Introducao/c/parImpar.c)
- [Palindromo](lab/aula_24_02_21_Palindromo/c/palindromo.c)

### Linguagem Java

- [Primeiro Programa em Linguagem Java](lab/aula_24_02_07_Introducao/java/PrimeiroPrograma.java)
- [Verificação de números Pares e/ou Ímpares](lab/aula_24_02_07_Introducao/java/ParImpar.java)
- [Palindromo](lab/aula_24_02_21_Palindromo/java/App.java)

# Algoritmos E Estruturas de Dados II

Após conhecer os comandos básicos e primordiais oriundos da Lógica Computacional aplicada à Computação e Programação, visto em Algoritmos e Estruturas de Dados I, sabe-se então que cada comando (em visão computacional de hardware ou software) tem um tempo, ou custo, necessário para que cumpra sua tarefa, seja ela escrever uma informação na tela ou realizar um cálculo matemático.

TEMPO! O único recurso que não se pode comprar, recuperar, desperdiçar ou despresar. Estes fatores então, torna o tempo um objeto de estudo em algoritmos computacionais a partir de agora. Se o tempo é tão precioso, uma máquina (computador por exemplo), tem que aproveitá-lo com o máximo de eficiência, para que este recurso tão precioso não seja desprezado durante o funcionamento das mesmas.

Em diversas áreas da computação, termos como "ping", "latência", "super computadores", "computadores gamer", "terabyte", "memória virtual", dentre vários outros, são termos relacionados (de certa forma) à potência computacional. Analisando cada exemplo, por comparações equívocas ou não de usuários, muitos deles se referem ao alto desempenho do hardware e das redes de comunicação. Mas para se ter algo potente é necessário apenas um hardware potente? Para um computador ser "gamer", basta colocar componentes eletrônicos de última geração e pronto? Bom...não exatamente.

Um hardware, quanto mais potente for, maior será sua capacidade de executar tarefas, seja em velocidade, quantidade ou ambas. Porém, conforme a aplicação exigir, um hardware não atenderá todos os requisitos, então ele se unificará com um software. Software este que ficará operacional graças ao hardware, porém ele não deve ser invalidado como algo superficial ou descartável. A unificação do hardware e software torna determinados requisitos para aplicações possíveis, contudo, um software apto para se comunicar com um hardware, analisado da perspectiva da visão computacional, gera um custo tanto para o hardware, que terá o custo energético para o funcionamento das portas lógicas, quanto o próprio software, que ao utilizar o hardware, tem um tempo de espera para que cada linha de código seja interpretada e executada pelo hardware no geral.

Assim como encontrados nas ciências, engenharias e até filosofias, a matemática fomenta os pilares do universo. Logo não seria diferente no universo da computação, que utiliza estudos matemáticos específicos, como equações e funções, como prova cabal de observações de aplicações computacionais, seja no âmbito geral, seja no âmbito do hardware, seja no âmbito do software. Logo, muitos problemas computacionais, utilizam de recursos matemáticos para serem explicados, aplicados e/ou observados(fenômenos) em uso diário na computação.

Sendo assim, Algoritmos e Estruturas de Dados, utiliza da matemática a todo momento para integrar melhorias e evoluções computacionais. Algoritmos tem como premissa resolver tarefas, seja elas quais forem, através da já conhecida Lógica Computacional para fomentar maneiras e/ou soluções de forma rápida, obtendo assim um resultado, se não perfeito, o mais próximo do perfeito.

Sendo assim, a forma de se resolver logicamente uma determinada tarefa é utilizando "ações". Estas "ações" são diversas, podendo ser:
- Ações de Repetição (laços de repetição)
- Ações de Escolhas (tomada de decição)
- Ações Acionadas em Momentos Específicos (procedimentos e/ou funções)

Estas ações, para se realizarem, necessitam de um processamento, que é o tempo do hardware executar o comando e/ou processar a informação dada, contúdo, se estas ações forem informadas ou organizadas de forma leviana, o hardware terá uma sobrecarga ou utilizará seus recursos de forma banal, tornando o hardware inoperante ou funcionando de forma incorreta ou inapropriada, não condizente com sua capacidade. Entretanto para se evitar este desperdício de hardware ou sobrecarga do hardware, de linhas de código e de tempo (foco do estudo), há formas que solucionam este desperdício de hardware e que são implementadas, deixando assim o código mais robusto, eficiente, rápido e de certa forma, apropriado para qualquer tipo de hardware.

Os conceitos abordados a partir daqui mostrarão como todo este conceito, até então apresentado, é aplicado em linhas de código visando o melhor desempenho do código e apresentando técnicas e mecanismos de lógica para solucionar problemas existentes.

## Pré-Requisitos

- Lógica de Programação
- Conceitos de Programação
- Paradigmas de Programação
- Conhecimentos Matemáticos (Cálculo I)[RECOMENDADO]
- Conhecimentos de Versionamento de Código [OPCIONAL]

### Algoritmos e Técnicas de Programação

- Conhecimentos em Linguagem de Programação  
    **1 - Introdução À Liguagem de programação**
    - [Hello World em Linguagem C](teo/U0-nivelamento/0-Intro_Lang_Prog/aula1/HelloWorld.c)
    - [Hello World em Linguagem C++](teo/U0-nivelamento/0-Intro_Lang_Prog/aula1/HelloWorld.cpp)
    - [Hello World em Linguagem C#](teo/U0-nivelamento/0-Intro_Lang_Prog/aula1/HelloWorld.cs)
    - [Hello World em Linguagem Java](teo/U0-nivelamento/0-Intro_Lang_Prog/aula1/HelloWorld.java)
    - [Hello World em Linguagem Python](teo/U0-nivelamento/0-Intro_Lang_Prog/aula1/HelloWorld.py)

    **2 - Tipos de Dados**
    - [Tipos de Dados em Linguagem C](teo/U0-nivelamento/0-Intro_Lang_Prog/aula2/tiposDeDados.c)
    - [Tipos de Dados em Linguagem C++](teo/U0-nivelamento/0-Intro_Lang_Prog/aula2/tiposDeDados.cpp)
    - [Tipos de Dados em Linguagem C#](teo/U0-nivelamento/0-Intro_Lang_Prog/aula2/tipoDeDados.cs)
    - [Tipos de Dados em Linguagem JAVA](teo/U0-nivelamento/0-Intro_Lang_Prog/aula2/tipoDeDados.java)
    - [Tipos de Dados em Linguagem Python](teo/U0-nivelamento/0-Intro_Lang_Prog/aula2/tipoDeDados.py)

    **3 - Entrada e Saída**
    - [Entrada e Saída de Dados em Linguagem C](teo/U0-nivelamento/0-Intro_Lang_Prog/aula3/inputOutput.c)
    - [Entrada e Saída de Dados em Linguagem C++](teo/U0-nivelamento/0-Intro_Lang_Prog/aula3/inputOutput.cpp)
    - [Entrada e Saída de Dados em Linguagem C#](teo/U0-nivelamento/0-Intro_Lang_Prog/aula3/inputOutput.cs)
    - [Entrada e Saída de Dados em Linguagem Java](teo/U0-nivelamento/0-Intro_Lang_Prog/aula3/inputOutput.java)
    - [Entrada e Saída de Dados em Linguagem Python](teo/U0-nivelamento/0-Intro_Lang_Prog/aula3/inputOutput.py)

    **4 - Operadores Aritméticos e Relacionais**
    - [Operadores Aritméticos e Relacionais em Linguagem C](teo/U0-nivelamento/0-Intro_Lang_Prog/aula4/operadoresAritmedicos.c)
    - [Operadores Aritméticos e Relacionais em Linguagem C++](teo/U0-nivelamento/0-Intro_Lang_Prog/aula4/operadoresAritmedicos.cpp)
    - [Operadores Aritméticos e Relacionais em Linguagem C#](teo/U0-nivelamento/0-Intro_Lang_Prog/aula4/operadoresAritmedicos.cs)
    - [Operadores Aritméticos e Relacionais em Linguagem Java](teo/U0-nivelamento/0-Intro_Lang_Prog/aula4/operadoresAritmedicos.java)
    - [Operadores Aritméticos e Relacionais em Linguagem Python](teo/U0-nivelamento/0-Intro_Lang_Prog/aula4/operadoresAritmedicos.py)
- Estrutura Condicional  
    **5 - Comando IF**
    - [Condicionais em Linguagem C](teo/U0-nivelamento/0-Intro_Lang_Prog/aula5/comand_IF.c)
    - [Condicionais em Linguagem C++](teo/U0-nivelamento/0-Intro_Lang_Prog/aula5/comand_IF.cpp)
    - [Condicionais em Linguagem C#](teo/U0-nivelamento/0-Intro_Lang_Prog/aula5/comand_IF.cs)
    - [Condicionais em Linguagem Java](teo/U0-nivelamento/0-Intro_Lang_Prog/aula5/comand_IF.java)
    - [Condicionais em Linguagem Python](teo/U0-nivelamento/0-Intro_Lang_Prog/aula5/comand_IF.py)
- Estruturas de Repetição  
    **6 - Comandos de Repetição**
    - [Laço de Repetição em Linguagem C](teo/U0-nivelamento/0-Intro_Lang_Prog/aula6/repeat_comand.c)
    - [Laço de Repetição em Linguagem C++](teo/U0-nivelamento/0-Intro_Lang_Prog/aula6/repeat_comand.cpp)
    - [Laço de Repetição em Linguagem C#](teo/U0-nivelamento/0-Intro_Lang_Prog/aula6/repeat_comand.cs)
    - [Laço de Repetição em Linguagem Java](teo/U0-nivelamento/0-Intro_Lang_Prog/aula6/repeat_comand.java)
    - [Laço de Repetição em Linguagem Python](teo/U0-nivelamento/0-Intro_Lang_Prog/aula6/repeat_comand.py)
- Métodos de Procedimentos
- Métodos de Funções
- Vetor
- Matriz
- Ponteiros
- Redirecionamento de Entrada e Saída de Dados
- Arquivos
- Tratamentos de Exceção

### Programação Orientada A Objetos

- Introdução A Orientação A Objeto
- Classes

## Noções de Complexidade

## Recursividade

## Estruturas de Dados Lineares e Flexíveis
### Pilha
#### Pilha Nativa
#### Pilha Implementada Por Vetor
#### Pilha Implementada Por Referência (Ponteiro)

### Fila
#### Fila Nativa
#### Fila Implementada Por Vetor
#### Fila Implementada Por Referência (Ponteiro)


### Lista
#### Lista Nativa
#### Lista Implementada Por Vetor
#### Lista Implementada Por Referência (Ponteiro)
#### Lista Encadeada
#### Lista Duplamente Encadeada

## Métodos de Ordenação
### Bubble Sort
### Selection Sort
### Insertion Sort
### Quick Sort

## Métodos de Pesquisa
### Pesquisa Sequencial

### Pesquisa Binária
#### Pesquisa Binária Iterativa
#### Pesquisa Binária Recursiva

## Árvores
### Árvores de Busca Binárias
### Árvores Balanceadas (AVL)

## Tabela Hash
### Tabela Hash Com Endereçamento Em Separado
### Tabela Hash Com Endereçamento Em Aberto