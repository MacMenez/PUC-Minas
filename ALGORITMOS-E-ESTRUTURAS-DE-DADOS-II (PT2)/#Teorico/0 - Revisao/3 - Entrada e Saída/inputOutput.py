print() #Saída Padrão
input() #Entrada Padrão

nome = input("Digite seu primeiro nome: ")
idade = int(input("Digite sua idade: ")) #Faz a leitura em String e converte para numérico
altura = float(input("Digite sua altura: "))

print("{0} tem {1} anos de idade e mede {2}m.".format(nome, idade, altura))
print(nome, " tem ", idade, " anos de idade e mede ", altura, "m.")