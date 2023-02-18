/*
    Para utilizar no print( ) as variáveis em conjunto com os demais textos(Strings), 
    precisamos converter eles para String. 
    
    Por isso utilizamos String( ) para transformar os números em texto. 
    Veremos uma forma mais prática de fazer essa junção mais abaixo: a interpolação de Strings!
*/
var x: Int = 10
var y: Int = 2


var total: Int 
total = x + y
print("Resultado - Adição de " + String(x) + " + " + String(y) + " é " + String(total))


total = x - y
print("Resultado - Subtração de " + String(x) + " - " + String(y) + " é " + String(total))


total = x * y
print("Resultado - Multiplicação de " + String(x) + " * " + String(y) + " é " + String(total))


total = x / y
print("Resultado - Divisão de " + String(x) + " / " + String(y) + " é " + String(total))


total = x % y
print("Resultado - O resto da Divisão de " + String(x) + " % " + String(y) + " é " + String(total))

total = x % 3
print("Resultado - O resto da Divisão de " + String(x) + " % " + String(3) + " é " + String(total))