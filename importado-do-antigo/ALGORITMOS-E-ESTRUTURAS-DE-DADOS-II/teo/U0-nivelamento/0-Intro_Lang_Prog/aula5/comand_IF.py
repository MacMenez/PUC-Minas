num = int(input("Digite um número: "))
if(num < 0):
    print("O número {0} é negativo!".format(num))

#Considerar 0 como nulo
elif(num == 0):
    print("O número {0} é nulo!".format(num))
else:     
    print("O número {0} é positivo!".format(num))