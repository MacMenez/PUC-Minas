function criarFuncaoDeMultiplicar(multiplicador) {
    return function(numero){
        return numero * multiplicador
    }
}

var dobrar = criarFuncaoDeMultiplicar(2) // falamos que nosso multiplicador é 2 para dobrar



console.log( dobrar(19) ) // chamamos dobrar passando o número a ser dobrado
console.log( dobrar(7) )