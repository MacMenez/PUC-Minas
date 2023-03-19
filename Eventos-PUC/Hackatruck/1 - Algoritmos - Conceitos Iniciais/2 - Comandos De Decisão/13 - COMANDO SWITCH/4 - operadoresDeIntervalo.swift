let reais = 10
 
switch reais {
    case 0..<5: //Defini um intervalo entre um numero A e B excluindo B.
        print("O preço está entre 0 e 4 reais.")
    case 5...10: //Defini um intervalo entre um numero A e B incluindo B.
        print("O preço está entre 5 reais e 10 reais.")
    default:
        print("O preço é maior que 10 reais.")
}
