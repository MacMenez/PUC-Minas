//INTERROMPENDO WHILE COM BREAK

var numero = 1
var menorQueCinco = true
 
while menorQueCinco {
    if numero < 5{
        print("o número \(numero) é menor que 5")
    }else{
       break
    }
    numero += 1 //Essa linha é igual a escrever numero = numero + 1
}
 
