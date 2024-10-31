LABORATÓRIO DE ALGORITMOS E ESTRUTURS DE DADOS II

diff compara arquivos no Linux  
`diff arquivo1 arquivo2`

fc compara arquivos no Windows  
`fc arquivo1 arquivo2`

Estas funções auxiliam a comparar arquivs de entrada ou saida que determinado programa gera, permitindo assim uma análise de dados mais concisa.

Por questões de práticas de ensino e até mesmo práticas reais, com situações cotidianas, será desenvolvido a compilaçao através

Compilação de Programas de Linguagem C - Terminal

`gcc arquivo.c`

`gcc arquivo.c -o nomeArquivoDesejado`

`./ nomeArquivoDesejado`

```
make
make exec
make clean
```

javac Lab02.java | java Lab02 < labJava02.in > saida1.out | cat | diff  

Tendo os conhecimentos da seção anterior e compreendendo a linguagem Java, realize o seguinte desafio, inicialmente na linguagem C e adapte-o para a Linguagem Java.

> No código em Java, criar uma fução que recebe um valor inteiro e imprime 1 se for par e 2 se for ímpar. Crie o programa para testar sua função lendo o número inteiro.

OBS: Os código em Java possuem a seguinte estrutra de funcionamento:

- 1° **pré-processador**: substiui texto. copia o conteudo interiro para um determinado local. contem os prototipos

- 2° **compilador**: análise sintática

- 3° **linker**: faz os apontamentos de referência

Para testar os programas em linguagem Java, o processo é um pouco diferente da linguagem C. Primeiro é necessário tornar o código Java pré-compilado através do Comando de Terminal `javac NomeArquivo.java`, que após executado fará criação de um arquivo `.class` que permitirá a JBC linkar o `.class`com o compilador da JVM, que assim executará o código em Java atraves do Comando Terminal `java NomeArquivo.java`.

Após criar e testar seu código, implemente-o de modo que ela tenha as seguintes modificações.

> No código em Java, criar uma fução que recebe um valor inteiro e imprime 1 se for par e 2 se for ímpar. Crie um programa que lê **n** valores inteiros e os classifica através da função criada. O valor de **n** é informado pelo usuário. **Nesta etapa, use o redirecionamento de arquivos já citado anteriormente**.

## Próximos Passos ⏭️

[Seção Anterior: Introdução ao Java](introducao-java-aeds-ii.md)

[Próxima Seção: Processo AEDs II de Exercícios - Plataforma VERDE](exercicio-verde.md)