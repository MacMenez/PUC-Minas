// Função que recebe uma String como parâmetro e
// imprime "String passada como parametro: " seguido
// de seu valor.
func imprima(str: String) {
    print("String passada como parametro: \(str)")
}

// Atribui-se a função anterior a uma constante 
let funcao = imprima

// Agora tanto funcao(str) como imprima(str) chamam
// os mesmos comandos, a mesma função!
funcao("Hello World!") // irá imprimir "String passada como parametro: Hello World!"
