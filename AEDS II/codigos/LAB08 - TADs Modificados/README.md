# LAB 08 - Conversões de TADs(Tipos Abstratos de Dados)

Exercícios baseados nos códigos de Pilha e Fila Flexíveis vistos em sala de aula e disponíveis no GitHub.

1. Executar os programas (Principal.java) para Pilha e Fila para fim de teste.
2. Implementar na classe Pilha um método que converte a pilha em uma fila na ordem que os elementos são desempilhados.

Protótipo do método:

```java
public Fila toFila();
    /* Testar seu método. */
```

3. Repita o exercício 2, porém os elementos são inseridos na fila na ordem que foram inseridos na pilha.
4. Repita os exercícios 2 e 3, porém sem considerar a existência da classe Fila. Seu método deve manipular célula diretamente:

```java
public Celula toFila();
```

O método retorna um ponteiro para célula da fila.
