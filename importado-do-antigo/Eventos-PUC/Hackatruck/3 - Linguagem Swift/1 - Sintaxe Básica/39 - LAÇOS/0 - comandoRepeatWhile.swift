// Exemplo de do-while: suponha que temos uma função funcQuePodeRetornarUmInt() que retorne 
// um Int?, ou seja, ela pode retornar um inteiro ou nil. Queremos iterar, chamando-a até que
// um inteiro seja de fato retornado

var intOpcional: Int? // inicialmente nil, pois não atribuímos nenhum valor

repeat {
    intOpcional = funcQuePodeRetornarUmInt()
} while intOpcional == nil
