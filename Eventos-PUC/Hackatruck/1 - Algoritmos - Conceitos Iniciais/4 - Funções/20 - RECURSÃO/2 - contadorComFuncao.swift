func contador(numero: Int) {
    
    if numero > 0 {
        contador(numero: numero - 1)
    }
    
    print(numero)
}

print("Contador:")
contador(numero:3)