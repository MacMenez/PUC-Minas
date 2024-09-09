### Descrição

Hmm! Aqui você foi solicitado a fazer uma simples ordenação. A você serão dado N números e um inteiro positivo M. Você terá que ordenar estes N números em ordem ascendente de seu módulo M. Se houver um empate entre um número ímpar e um número par (para os quais o seu módulo M dá o mesmo valor) então o número impar irá preceder o número par. Se houver um empate entre dois números ímpares (para os quais o seu módulo M dá o mesmo valor), então o maior número ímpar irá preceder o menor número ímpar. Se houve um empate entre dois números pares (para os quais o seu módulo M dá o mesmo valor), então o menor número par irá preceder o maior número par. Para o resto de valores negativos siga a regra de linguagem de programação C: um número negativo nunca pode ter módulo maior do que zero. Por exemplo, -100 MOD 3 = -1, -100 MOD 4 = 0, etc.

## Entrada

A entrada contém vários casos de teste. Cada caso de teste inicia com dois inteiros N (0 < N ≤ 10000) e M (0 < M ≤ 10000) que denotam quantos números existirão neste conjunto. Cada uma das próximas N linhas conterá um número cada. Estes números deverão caber em um inteiro de 32 bits com sinal. A entrada é terminada por uma linha que conterá dois valores nulos (0) e não deve ser processada.

## Saída

A primeira linha de cada conjunto de saída irá contér os valores de N e M. As próximas N linhas irão contér N números, ordenados de acordo com as regras acima mencionadas. Imprima os dois últimos zeros da entrada para a saída padrão.