let stringImutável = "Uma string imutável" 
/* perceba que podemos acentuar nomes de varíaveis ou constantes em Swift! :)*/

// o símbolo + nesse caso será utilizado para concatenação de string 
// (explicaremos melhor no próximo parágrafo)

let novaString = stringImutável + ", ou seja, constante." 

// valor de novaString = "Uma string imutável, ou seja, constante."
// concatenação e atribuição válidas, mesmo a string inicial sendo constante.

// Observe esse outro exemplo
let outraStringImutavel = "Outra string imutável"
outraStringImutavel += " concatenada com outra string?!" // Erro!!!!

/* O erro ocorre porque não podemos alterar a string imutável propriamente 
dita,apenas poderíamos criar uma nova a partir dela.  Por fim, vamos fazer o 
mesmo com uma string mutável agora */

var stringMutavel = "Uma String mutável"
stringMutavel += " concatenada com outra string!!"

/* O valor de stringMutavel é "Uma string mutável concatenada com outra 
string!!". Pois, podemos concatenar uma nova string ao valor inicial dela, já 
que ela é mutável.*/
