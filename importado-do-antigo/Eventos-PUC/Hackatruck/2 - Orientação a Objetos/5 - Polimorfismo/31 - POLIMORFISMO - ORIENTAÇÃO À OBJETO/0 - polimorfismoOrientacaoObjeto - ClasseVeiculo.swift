class Veiculo{

    var modelo: String?
    var marca: String?
    var ano: Int?

    func desc() {
        print(" \(self.modelo ?? " "),  marca \(self.marca ?? " ") e ano \(self.ano ?? 0) ")
    }
    
    func buzinar() {
        print(" Barulho emitido pelo respectivo veiculo") 
    }
}


class Motocicleta: Veiculo {
   
 override func buzinar() {
        print(" Barulho emitido pela \(self.modelo ?? " ")") 
        print(" biiip biiiip biiip \n") 
    }
    
    init (ma: String, mo: String, a: Int)
    {
        super.init()
        marca = ma
        modelo = mo
        ano = a
    }
    
}
class Carro: Veiculo {
    
  override  func buzinar() {
        print(" Barulho emitido pelo \(self.modelo ?? " ")") 
        print(" baaaaanp baaaaaanp baaaanp \n") 
    }
    
    init (ma: String, mo: String, a: Int)
    {
        super.init()
        marca = ma
        modelo = mo
        ano = a
    }

    
}

class Caminhão: Veiculo {
    
 override func buzinar() {
        print(" Barulho emitido pelo \(self.modelo ?? " ")") 
        print(" fooon foooooon fooon \n") 
    }
    
    init (ma: String, mo: String, a: Int)
    {
        super.init()
        marca = ma
        modelo = mo
        ano = a
    }

}




var mot = Motocicleta(ma:"Hond", mo: "GC" , a: 2013)
mot.desc()
mot.buzinar()

var car = Carro(ma:"VW", mo: "Gool" , a: 2019)
car.desc()
car.buzinar()

var cam = Caminhão(ma:"GM", mo: "Trucker" , a: 2018)
cam.desc()
cam.buzinar()