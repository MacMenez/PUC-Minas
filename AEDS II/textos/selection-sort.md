# Ordenação Por Seleção

## Algoritmo de Ordenação Por Seleção

```java
for (int i = 0; i < (n - 1); i++) {
    int menor = i;
    for (int j = (i + 1); j < n; j++){
        if (array[menor] > array[j]){ menor = j; }
    }
    swap(menor, i);
}
```

```java
public void swap(int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
}
```

if(menor != i){
    swap(menor, i);
}