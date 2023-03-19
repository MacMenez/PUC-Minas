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

let bicicleta = Bicicleta(dono: "João") // Instanciamos a bicicleta de João.

print("A bicicleta de \(bicicleta.dono) tem \(bicicleta.rodas) rodas")

// Será impresso: "A bicicleta de João tem 2 rodas"

// Suponha que João venda sua bicicleta para Matheus, podemos representar
// isso em nosso programa alterando o dono de bicicleta. Perceba que não
// atribuímos uma nova bicicleta à constante, algo que ocasionaria um erro, 
// apenas alteramos o estado do objeto bicicleta, alterando sua propriedade
// nome.

bicicleta.dono = "Matheus"

print("A bicicleta de \(bicicleta.dono) tem \(bicicleta.rodas) rodas")

// Será impresso: "A bicicleta de Matheus tem 2 rodas"
