/*
    Qualquer decimal criado de for implícita, será definido como Double!
    Então, se quisermos trabalhar com nosso Float, precisamos fazer de forma explícita.
*/

var pi =  3.14 //Tipificação Implicita

var piDouble: Double = 3.14 //Tipificação Explicita

var piFloat: Float = 3.14//Tipificação Explicita


print (pi)
print(type(of: pi)) //Comando para verificar o tipo


print (piDouble)
print(type(of: piDouble))//Comando para verificar o tipo


print (piFloat)
print(type(of: piFloat))//Comando para verificar o tipo