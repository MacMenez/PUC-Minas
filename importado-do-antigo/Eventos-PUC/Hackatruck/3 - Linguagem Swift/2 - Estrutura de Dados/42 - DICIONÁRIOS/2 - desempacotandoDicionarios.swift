var precosDosProdutosMutavel = ["Livro": 20.0, "Lapiseira": 2.0, "Caneta": 4.0] 
precosDosProdutosMutavel["Borracha"] = 0.5 
/* precosDosProdutosMutavel agora vale: ["Livro": 20.0, "Lapiseira": 2.0, "Caneta": 4.0, "Borracha": 0.5] */

if let preco = precosDosProdutosMutavel["Borracha"] {
    print("O preço da borracha é: \(preco)")
    // será impresso "O preço da borracha é: 0.5"
}
