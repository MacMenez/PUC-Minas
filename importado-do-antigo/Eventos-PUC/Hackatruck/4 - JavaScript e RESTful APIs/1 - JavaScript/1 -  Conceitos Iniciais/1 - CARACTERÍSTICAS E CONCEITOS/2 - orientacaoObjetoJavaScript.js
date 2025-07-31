function Carro(numeroDeRodas, cor){
    this.numeroDeRodas = numeroDeRodas
    this.cor = cor  
    this.isLigado = false
    
    
    this.ligar = function(){
        if (this.isLigado == false) {
            console.log('o carro está ligado.')
            this.isLigado = true
        }else{
            console.log('o carro já estava ligado.')
        }
    }
}

var meuCarro = new Carro(4, 'azul')

meuCarro.ligar()
meuCarro.ligar()