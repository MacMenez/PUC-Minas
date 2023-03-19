class FormaGeometrica {
    func descricao() {
        print("Decrição de uma forma geométrica")
    }
}

class Quadrado: FormaGeometrica {
    var tamanho: Int
    
    init(tamanho: Int) {
        self.tamanho = tamanho
    }
    
    func area() -> Int {
        return tamanho * tamanho
    }
}

let quadrado = Quadrado(tamanho: 2)
let area = quadrado.area()

print("Área do quadrado é \(area)")
// Será impresso: "Área do quadrado é 4"

quadrado.descricao()
// Será impresso: "Decricao de uma forma geométrica"
