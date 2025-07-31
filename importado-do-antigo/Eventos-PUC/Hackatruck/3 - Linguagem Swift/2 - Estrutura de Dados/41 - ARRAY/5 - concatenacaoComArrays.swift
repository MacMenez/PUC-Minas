// Esse é um jeito de se iniciar um array de inteiros vazio:
var pares = [Int]() 

// E esse é outro jeito de se concatenar elementos:
pares += [2, 4, 6, 8, 10]
pares += [12, 14, 16, 18, 20]
print(pares)
// Será impresso: "[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]"

// Esse é outro jeito de se iniciar um array de inteiros vazio:
var impares = Array<Int>()
impares += [1, 3, 5, 7]
print(impares)
// Será impresso: "[1, 3, 5, 7]"
