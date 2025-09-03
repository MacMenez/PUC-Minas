class Person {
    var nome: String?
    var sobrenome: String?
     
    func nomeCompleto() {
        print(" \(self.nome ?? " ") \(self.sobrenome ?? " ")")
    }
}

