/*
    O resultado de uma operação de comparação é um valor lógico, 
    podemos utilizá-lo no meio de uma expressão lógica. Neste caso, 
    os operadores de comparação têm precedência sobre os operadores lógicos.
*/
print(1 > 2)

print(1 == 2)

print(1 != 2)

print(1 <= 2 && false) //true && false

print(1 < 2 && true) //true && true

print(2 < 2 || true) //false || true

print(2 <= 2 && true) //true && true

