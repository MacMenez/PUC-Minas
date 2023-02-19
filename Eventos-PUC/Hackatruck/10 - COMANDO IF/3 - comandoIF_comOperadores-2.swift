//Teste com resultados FALSE

var estaSol: Bool = false
var estaChovendo: Bool = false
var estaNublado: Bool = true
var descricaoTempo: String = "Chuvoso"


if estaSol {
  print("O sol está visível")  
}

//Operador AND
if estaSol && estaChovendo {
  print("Chuva & Sol...")  
}

//Operador OR
if estaSol || estaChovendo {
  print("Opa, parece que está sol ou está chovendo")  
}

//Comparações
if 5 > 10 {
  print("Sim! Cinco é maior que dez.")  
}

//Comparações
if descricaoTempo == "Ensolarado" {
  print("Sim! O tempo está ensolarado.")  
}