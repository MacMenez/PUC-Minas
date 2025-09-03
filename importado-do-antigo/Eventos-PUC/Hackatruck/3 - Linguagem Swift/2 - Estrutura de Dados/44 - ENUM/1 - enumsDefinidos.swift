enum Bussola {
    case Norte, Sul, Leste, Oeste
}

var direcao = Bussola.Norte // inferencia de tipo: Bussola
print(direcao)

direcao = .Leste // atribuindo novo valor
print(direcao)