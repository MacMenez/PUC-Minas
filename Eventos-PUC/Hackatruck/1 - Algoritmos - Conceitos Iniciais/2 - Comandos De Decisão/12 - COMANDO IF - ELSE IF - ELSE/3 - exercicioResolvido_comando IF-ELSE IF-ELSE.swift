/*Vamos exercitar:
Crie uma condicional que trate o seguinte cenário:
Idade menor que 3 a saída deve ser “Um bebê”
Idade de 3 a 10 a saída deve ser “Uma criança”
Idade de 11 a 17 saída deve ser “Um adolescente”
Qualquer outra idade deve ser “Um adulto”*/

var idade: Int = 1

if idade < 3 {
    print("Um bebê")
}
else if idade >= 3 && idade <= 10 {
    print("Uma criança")
}
else if idade > 10 && idade <= 17 {
    print("Um adolescente")
        
}
else {
    print("Um Adulto")
      
}