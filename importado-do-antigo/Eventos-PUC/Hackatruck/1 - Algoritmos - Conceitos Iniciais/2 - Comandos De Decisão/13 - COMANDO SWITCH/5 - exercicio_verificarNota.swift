/*
    ********************
        ENUNCIADO
    ********************

    Crie um switch que trate os seguintes casos e imprima a mensagem correspondente:
    Porcentagem seja 0 - “Insatisfatório, não acertou nenhuma questão.”
    Porcentagem esteja entre 1 e 20 (Incluindo 20) - “Insatisfatório, desempenho muito baixo.”
    Porcentagem esteja entre 21 e 50 (excluindo 50) - “Insatisfatório, vamos estudar mais?”
    Porcentagem esteja entre 50 e 70 (excluindo 70) - “Foi por pouco, vamos estudar mais!”
    Porcentagem esteja entre 70 e 90 (excluindo 90) - “Satisfatório, você foi aprovado!”
    Outros casos - “Excelente, desempenho memorável!”
*/

/*
    ********************
        RESOLUÇÃO
    ********************
*/

var porcentagem: Double = 70
 
switch porcentagem {
case 0:
    print("O preço está entre 0 e 4 reais.")
case 1...20:
    print("Insatisfatório, desempenho muito baixo.")
case 21..<50:
    print("Insatisfatório, vamos estudar mais?")
case 50..<70:
    print("Foi por pouco, vamos estudar mais!")
case 70..<90:
    print("Satisfatório, você foi aprovado!")
default:
    print("Excelente, desempenho memorável!")
}
