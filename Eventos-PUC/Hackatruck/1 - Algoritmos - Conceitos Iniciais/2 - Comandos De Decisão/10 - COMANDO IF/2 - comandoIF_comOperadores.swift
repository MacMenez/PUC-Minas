/*
    No if podemos utilizar operadores lógicos e aritméticos.
    Para ambos a regra é a mesma, se a expressão for verdadeira, 
    o trecho de código daquele if será executado.
*/

//Teste com resultados TRUE

var estaSol: Bool = true
var estaChovendo: Bool = true
var estaNublado: Bool = false
var descricaoTempo: String = "Ensolarado"


if estaSol {
  print("O sol está visível")  
}

//Operador AND
if  estaSol && estaChovendo {
  print("Chuva & Sol...")  
}

//Operador NOT
if !estaNublado {
  print("Opa, parece que está nublado sim! - Nesse caso o estaNublado (false), foi negado.")  
}

//Operador OR
if estaSol || estaChovendo {
  print("Opa, parece que está sol ou está chovendo")  
}

//Comparações
if 5 > 1 {
  print("Sim! Cinco é maior que um.")  
}


//Comparações
if descricaoTempo == "Ensolarado" {
  print("Sim! O tempo está ensolarado.")  
}