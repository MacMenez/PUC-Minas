/*
    Uso de expressões lógicas no corpo de um programa 
    (lembrando sempre que as variáveis devem ser declaradas, apropriadamente, como Bool)
*/

var x, y, resultado: Bool

x = true
y = false

resultado = x || y

print("O resultado de \(x) || \(y) é \(resultado)") 



resultado = !x

print("O resultado de !x é \(resultado)") 



resultado = !y && x

print("O resultado de !y && x é \(resultado)") 



resultado = false || false

print("O resultado de false && false é \(resultado)") 