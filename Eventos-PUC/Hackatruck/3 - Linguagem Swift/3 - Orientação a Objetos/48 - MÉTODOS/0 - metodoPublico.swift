class Bicicleta {
    let rodas = 2
    var dono: String
    
    init(dono: String) {
        // utilizamos "self.dono" para se referir a propriedade
        // já que somente "dono" se refere ao parametro String
        // do construtor
        self.dono = dono
    }

    func emprestar(para: String, horas: Int) {
        print("A bicicleta de \(dono) foi emprestada para \(para) por \(horas) horas")
    }
}

// Vamos instanciar uma bicicleta e emprestá-la
let b = Bicicleta(dono: "Matheus")
b.emprestar(para: "João", horas: 2)

// Será impresso: "A bicicleta de Matheus foi emprestada para João por 2 horas"
