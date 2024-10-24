# LAB09 - Garbage Colector

Este laboratório tem como objetivo estudar o uso de processamento e alocação de memória nas linguagens Java e C. Para visualização da proposta utilize o comando `top` no **terminal Linux** ou o programa **_Gerenciador de Tarefas_** no **Windows** para visualizar o comportamento do sistema e do hardware conforme o código **_Coleta de Lixo_** é compilado e executado pelo sistema operacional.

Analise o comportamento verificando as porcentagem de CPU  e Memória RAM.

**Usar o comando `top` no diretório atual do projeto onde se encontram os arquivos.**

Este estudo de laboratório, traz uma prática de entendimento visual sobre a importância da alocação e desalocação de momória e como as linguagens de programação lidam com isso durante a execução do programa através de mecanismos e ferramentas da linguagem para realizar a chamada _Coleta de Lixo_, expressão para desalocamento de dados da memória secundária que, conforme execução do programa, ficaria sobrecarregada sendo algo danoso para o funcionamento do computador como um todo.

**Coletor de Lixo _(Garbage Collector)_** da linguagem Java e a função `free()` na linguagem C são utilizados com este proposito. Para entender como funciona a alocação e desalocação de memória os arquivos [coletaLixo.c](coletalixo.c) e [ColetaLixo.java](ColetaLixo.java).

Ao executar os códigos, será identificando um comportamento onde o código não será "prejudicial" ao computador, pois o memos fará a desalocação de momória seja por ponteiro ou referência.

Em C o ódigo realiza a desalocação de memória através do comando `free();`, que no código desaloca a variável `temp`da seguinte forma `free(tmp);`. Assim o laço de repetição fará com que o programa não sobrecarregue a memória RAM e, por ser recursivo, utilizará altos níveis de processamento de CPU. 

Compile códigos em C com o comando `gcc coletalixo.c -o coletorLixo` e execute o programa com o comando `./coletorLixo`.

Ao comentar o comando `free(tmp);` no código em C e recompilar o programa, a alocação de memória não será executada, logo os indices de memória irão aumentar rapidamente, ocasinando algumas situações interessantes de se avaliar:

- o computador pode ter travamentos e ser obrigado a reininciar, principalmente se for Windows;
- a IDE pode identificar que correrá um erro fatal e  interromper a execução do programa com ferramentas internas de prevenção a códigos prejudiciais ao funcionamento do sistema operacional;
- O sistema operacional (Linux) interrompe o processo de execução do programa. Ele identificará qual o processo que está sendo prejudicial ao funcionamento do sistema operacional e informará que ele foi eliminado(kill). A saída será igual ou semelhante a esta:

```bash
[1]    42027 killed     ./coletorLixo
```

Em Java foi desenvolvido uma classe denominada Celula que criará objetos de tipo Celula, estes por sua vez serão alocados via **referência** e desalocados imediatamente, tendo assim a coleta de lixo feita pelo Garbage Colector (ferramente da linguagem) para desalocar o objeto que não possui mais uma referência. Compile códigos em Java utilizando o comando `javac ColetaLixo.java` e execute o programa com o comandos `java ColetaLixo`.

Em Java, ao comentar o comando `primeiro = primeiro.prox;` no código e recompilar o programa, a alocação de memória não será executada, porém diferente de do código em C, aqui será necessário acrescentar algumas linhas extras para se obter o mesmo resultado de análise. Para isto, basta seguir os comentário do código  e recompilar o programa que, logo os indices de memória irão aumentar rapidamente, ocasinando algumas situações interessantes de se avaliar. De forma análoga:

- o computador pode ter travamentos e ser obrigado a reininciar, principalmente se for Windows;
- a IDE pode identificar que correrá um erro fatal e  interromper a execução do programa com ferramentas internas de prevenção a códigos prejudiciais ao funcionamento do sistema operacional;
- o sistema operacional (Linux) interrompe o processo de execução do programa. Ele identificará qual o processo que está sendo prejudicial ao funcionamento do sistema operacional e informará que ele foi eliminado(kill). A saída será igual ou semelhante a esta:

```bash
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at ColetaLixo.inserir(ColetaLixo.java:15)
        at ColetaLixo.main(ColetaLixo.java:23)
```

Para o sistema operacioanl Windows, esta análise é identificada através dos gráficos do **Gerenciador de Tarefas**, isto não significa que o sistema não será reininciado caso o programa não seja interrompido.
