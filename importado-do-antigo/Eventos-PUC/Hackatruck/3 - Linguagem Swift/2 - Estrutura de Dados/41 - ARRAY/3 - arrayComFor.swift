var imparesMutaveis = [1, 3, 5, 7]
imparesMutaveis.append(9)

for impar in imparesMutaveis {
    print(impar)
}

// Será impresso:
// 1
// 3
// 5
// 7
// 9

// Caso prefira também pode-se utilizar um for com 
// a quantidade de elementos do Array, obtida com 
// o método count
for i in 0 ..< imparesMutaveis.count {
    print(imparesMutaveis[i])
}
