//1. O código abaixo foi elaborado para atender uma determinada regra com divisões.

var numero = 4
var resultado = 0

for i in 1..<12{
    if i % numero == 0{
        resultado += i
    }
}

print(resultado)

/*
    3. Qual das implementações abaixo resolve o seguinte enunciado:
    Imprima uma tabela de conversão de polegadas para centímetros, de 1 a 20 polegadas. 
    Considere uma polegada como 2,54cm.
*/

var polegada = 2.54
for i in 1...20{
    print("\(i) centimetros é igual a \(Double(i) * polegada) polegadas")
}

/*4. Analise o código abaixo:*/
for index in 95...100{
    if((index % 2) != 0){
        print (index)
    }
}

//7. Analise o código abaixo:
var contador = 0;

repeat {
    print("\(contador) Passagem")
    contador += 2
} while contador <= 12

//8. Analise o código a seguir:

var valorUm, valorDois : Int;

valorUm = 0
valorDois = 0

for sequenciaUm in 0...2{
    valorUm = sequenciaUm
    valorUm += 1
    print("ValorUm", valorUm)
    
    for sequenciaDois in 0...2{
        valorDois = sequenciaDois
        valorDois += 1
        print("ValorDois", valorDois)
    }
}

print("ValorUm:", valorUm, "ValorDois", valorDois)

//9. Analise o código abaixo:

for index in 0...200{
    if((index % 10) == 0){
        print(index, "OK")
    }
}

