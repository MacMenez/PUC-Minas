func contagemRegressiva(numero: Int) {
    
    print(numero)

    if numero > 0 {
        contagemRegressiva(numero: numero - 1)
    }
}

print("Contagem Regressiva:")
contagemRegressiva(numero:3)