class Veiculo{

    var pneus: String?
    var assentos: String?
    var motor: String?
    
    func desc() {
        print("Número de rodas \(self.pneus ?? " "), Número de Assentos \(self.assentos ?? " "), Potencia Motor \(self.motor ?? " ")") 
    }
}


class Motocicleta {
    var cilindradas: Int?
}

class Aviao, Veiculo {
    var numMotores: Int?
}