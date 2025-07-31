protocol OperacaoMatematica {
    func calcular(x: Double, y: Double) -> Double
}

class Soma: OperacaoMatematica {
    func calcular(x: Double, y: Double) -> Double {
        return x + y
    }
}

class Subtracao: OperacaoMatematica {
    func calcular(x: Double, y: Double) -> Double {
        return x - y
    }
}
