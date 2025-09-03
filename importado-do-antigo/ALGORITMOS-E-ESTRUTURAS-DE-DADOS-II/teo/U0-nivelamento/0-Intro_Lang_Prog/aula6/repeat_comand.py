#Exemplo 1
base = float(input("Digite a base do retângulo: "))

while base > 0:
    altura = float(input("Digite a altura do retângulo: "))
    
    area = base * altura
    
    print("A área do retângulo = {0} \n".format(area))
    base = float(input("Digite a base do retângulo: "))
print("\nFim do Programa!")

#Exemplo 2
base = 1

while base <= 5:
    altura = 2
    while altura <= 10:
        area = base * altura
        
        print("Base = {0} e altura = {1}".format(base, altura))
        print("Área do retângulo = {0} \n".format(area))
        
        altura += 2
base += 1