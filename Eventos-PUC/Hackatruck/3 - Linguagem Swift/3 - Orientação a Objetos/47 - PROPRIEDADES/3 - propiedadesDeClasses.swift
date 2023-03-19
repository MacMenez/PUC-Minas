class Bicicleta {
    let rodas = 2
    var dono: String
    
    init(dono: String) {
        // utilizamos "self.dono" para se referir a propriedade
        // já que somente "dono" se refere ao parametro String
        // do construtor
        self.dono = dono
    }
}
