/*Criei um algoritmo que complete a sequencia 1, 3, 5, 7, ___ , 
até seu décimo elemento, declarando o fator de crescimento em uma constante
e imprimindo o próximo sempre em uma variável chamada auxiliar.*/

let fator = 2
var auxiliar = 1

for i in 0..<10{
    print (auxiliar)
    auxiliar += fator
}