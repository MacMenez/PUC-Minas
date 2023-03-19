// segunda forma de desempacotamento de opcionais:
let stringDeNumero2 = "Dois"
let numeroInteiro2 = Int(stringDeNumero2)

if let a = numeroInteiro2 {
    print(a * 2)
}
/* nada será impresso nesse caso, pois o fluxo de execução não passará por dentro do bloco do if */
