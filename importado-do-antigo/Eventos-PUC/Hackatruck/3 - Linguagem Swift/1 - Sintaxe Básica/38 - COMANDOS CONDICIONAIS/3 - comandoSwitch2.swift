let temperatura = 29

switch temperatura {
case 30...50:
    // 30...50 define um intervalo (tipo Range) que vai de 30 até 50 (inclusive)
    print("Muito quente!")
case 29:
    // temperatura exatamente igual a 29 graus
    print("Vinte e nove graus.")
case 20..<29:
    // 20..<29 define um Range que vai de 20 até 28 (29 é excluído nesse caso)
    print("Temperatura confortável.")
default:
    print("Outra temperatura.")
}
