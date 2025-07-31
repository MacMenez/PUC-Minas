// primeira forma de desempacotamento de opcionais:
let stringDeNumero1 = "Um"
let numeroInteiro1 = Int(stringDeNumero1)
let somaDeInteiros = numeroInteiro1! + 1 
/* Um erro em tempo de execução ocorrerá porque estamos tentando desempacotar um valor nil */
