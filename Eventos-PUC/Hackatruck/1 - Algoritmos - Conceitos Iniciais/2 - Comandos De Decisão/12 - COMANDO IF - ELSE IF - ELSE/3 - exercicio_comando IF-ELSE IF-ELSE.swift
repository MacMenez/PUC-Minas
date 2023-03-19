/*
********************
    ENUNCIADO
********************

Idade menor que 3 a saída deve ser “Um bebê”
Idade de 3 a 12 a saída deve ser “Uma criança”
Idade de 13 a 17 saída deve ser “Um adolescente”
Qualquer outra idade deve ser “Um adulto”
*/

/*
********************
    RESOLUÇÃO
********************
*/
var idade:Int = 14

if idade < 3 {
    print ("Um bebê")
} else if idade >= 3 && idade <= 12 {
    print ("Uma criança")
} else if idade >= 13 && idade <= 17 {
    print ("Um adolescente")
} else {
    print ("Um adulto")
}