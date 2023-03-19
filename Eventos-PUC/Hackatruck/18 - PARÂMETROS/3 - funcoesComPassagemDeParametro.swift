/* Crie uma função que se chame nomeCompleto 
e imprima a frase “Meu nome completo é" 
+ os valores recebidos por parâmetro.
Em seguida chame sua função e confira a saída.*/


func nomeCompleto(pNome: String, pSobrenome: String){
    print("Meu nome completo é \(pNome) \(pSobrenome)")
}

var nome: String = "Monteiro"
var sobrenome: String = "de Souza"

nomeCompleto(pNome: nome, pSobrenome: sobrenome)