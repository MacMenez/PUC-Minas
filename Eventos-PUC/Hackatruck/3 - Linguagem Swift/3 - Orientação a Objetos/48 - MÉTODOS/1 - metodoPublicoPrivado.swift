class Bicicleta {
    var rodas: Int
    var dono: String
    var qtdeCiclistas: Int
    
    init(dono: String, rodas: Int) {
        self.dono = dono
        self.rodas = rodas
        
        // no inicio não temos ciclista sobre a
        // bicicleta ainda
        self.qtdeCiclistas = 0
    }

    // retorna true caso seja possível dar carona
    // na bicicleta e false em caso contrário
    func darCarona(para: String) -> Bool {
        if qtdeCiclistas < quantidadeMaxima() {
            if para == dono {
                print("\(dono) subiu em sua própria bicicleta")
            } else {
                print("\(para) subiu na bicicleta de \(dono)")
            }
            qtdeCiclistas += 1
            
            return true
        } else {
            print("A bicicleta de \(dono) já está lotada! \(qtdeCiclistas) ciclista(s)!")
            
            return false
        }
    }
    
    // método que só faz sentido ser utilizado internamente
    // na classe por isso é private
    private func quantidadeMaxima() -> Int {
        if rodas > 1 {
            // 2 rodas => 1 ciclista
            // 3 rodas => 2 ciclistas
            // 4 rodas => 3 ciclistas
            // e assim por diante...
            return rodas - 1
        } else {
            // monociclo: 1 roda => 1 ciclista
            return 1
        }
    }
}

// Vamos instanciar uma bicicleta para Matheus
let b = Bicicleta(dono: "Matheus", rodas: 2)

// Matheus sobe em sua propria bicicleta
b.darCarona(para: "Matheus") 
// Será impresso: "Matheus subiu em sua própria bicicleta"

// Matheus tenta dar carona para João
b.darCarona(para: "João")
// Será impresso: "A bicicleta de Matheus já está lotada! 1 ciclista(s)!"

// Matheus reforma sua bicicleta e adiciona uma roda
// agora poderá transportar até 2 pessoas
b.rodas = 3

// Matheus dá carona para João agora com sucesso!
b.darCarona(para: "João")
// Será impresso: "João subiu na bicicleta de Matheus"

// Matheus tenta dar carona para Maria
b.darCarona(para: "Maria")
// Será impresso: "A bicicleta de Matheus já está lotada! 2 ciclista(s)!"

