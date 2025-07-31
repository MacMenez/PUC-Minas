let vetor = [1, 2, 3, 4]

func duplicador(i: Int) -> Int {
    return i * 2
}

let vetorDuplicado = vetor.map(duplicador) 

print (vetorDuplicado)

/*Sugestão de estudo: procure na documentação do Array de Swift pelos métodos filter e sort. 
Note como as funções e como os parâmetros são utilizados nesses casos.*/