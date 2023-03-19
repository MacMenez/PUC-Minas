var precosDosProdutosMutavel = ["Livro": 20.0, "Lapiseira": 2.0, "Caneta": 4.0] 
precosDosProdutosMutavel["Borracha"] = 0.5 
/* precosDosProdutosMutavel agora vale: ["Livro": 20.0, "Lapiseira": 2.0, "Caneta": 4.0, "Borracha": 0.5] */

for (chave, valor) in precosDosProdutosMutavel {
    print("O preço de \(chave) é: \(valor)")
}

// Será impresso:
// O preço de Lapiseira é: 2.0
// O preço de Borracha é: 0.5
// O preço de Livro é: 20.0
// O preço de Caneta é: 4.0
