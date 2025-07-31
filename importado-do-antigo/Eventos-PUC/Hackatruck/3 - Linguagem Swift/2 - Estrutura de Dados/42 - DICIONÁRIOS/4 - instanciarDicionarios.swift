// Esse é um jeito de se iniciar um dicionário vazio: com chaves do
// tipo String e valores do tipo Double:
var precosDosProdutos = Dictionary<String, Double>()
precosDosProdutos["Borracha"] = 0.5
print(precosDosProdutos)
// Será impresso: "[Borracha: 0.5]"

// Esse é um outro jeito de se iniciar um dicionário em Swift:
var precoCombustivel = [String: Double]()
precoCombustivel["Gasolina"] = 3.555
print(precoCombustivel)
// Será impresso: "[Gasolina: 3.555]"
