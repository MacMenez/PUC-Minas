class Correntista {
    
    var nome: String?
    
    //Criamos a propriedade privada
    private var saldo: Double = 1000
    
    //Criamos o método que altera o Saldo
    func mudarSaldo(novoSaldo: Double){
        
        saldo = novoSaldo
    }
    
    func verSaldo(){
        print(saldo)
    }
    
}
