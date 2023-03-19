class Carro {
    
    var modelo: String = "Gool"
    
    //Criamos a propriedade privada
    private var qtdeCombustivel: Float = 25
    
    func quantidadeCombustivel()->Void{
        print(qtdeCombustivel)
    }
}

//Criamos o objeto da classe
var carro1 = Carro()

//Tenta fazer a alteração da qtdeCombustivel, atribuindo diretamente no atributo qtdeCombustivel       
carro1.qtdeCombustivel = 35
//Resultado: erro
