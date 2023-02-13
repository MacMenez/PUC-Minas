a = 5 
b = 3

soma = a + b
print(a, " + ", b, " = ", soma)

subt = a - b
print(a, " - ", b, " = ", subt)

mult = a * b
print(a, " * ", b, " = ", mult)
    
#Divisão exata entre a e b, isto inclui as casas decimais, por isso da conversão feita abaixo
div = a / b; #Variavel a foi convertida para Ponto Flutuante
print(a, " / ", b, " = ", div)

#Mantem o valor inteiro e deixa o resto. Calcula a divisão "inteira"
quoc = a // b
print(a, " // ", b, " = ", quoc)

#Resto da divisão inteira
resto = a % b
print(a, " % ", b, " = ", resto)

increm = a
print("Antes do incrimento, o valor da variavel increm = ", increm)
increm += 1 #Atribuição Composta
print("Após o incrimento, o valor da variavel increm = ", increm)

decrem = b
print("Antes do decremento, o valor da variavel increm = ", decrem)
decrem -= 1 #Atribuição Composta
print("Após o decremento, o valor da variavel increm = ", decrem)