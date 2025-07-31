class Carro {
    
    var modelo: String = "Gool"
    
    //Criamos a propriedade privada
    private var qtdeCombustivel: Float = 25
    
    //Criamos o método que abastece o carro
    func abastecer(qtdeLitros: Float)->Void{
        qtdeCombustivel += qtdeLitros
    }
    
    func quantidadeCombustivel()->Void{
        print(qtdeCombustivel)
    }
}

//Criamos o objeto da classe
var carro1 = Carro()
   
//Faz a alteração da qtdeCombustivel, usando o método da classe
carro1.abastecer(qtdeLitros: 35)
carro1.quantidadeCombustivel()
//Resultado: 35
