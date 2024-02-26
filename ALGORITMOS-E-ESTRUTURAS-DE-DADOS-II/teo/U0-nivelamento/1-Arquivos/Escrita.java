//Arquivo Escrita.java 
class Escrita { 
    public static void main (String[] args){ 
        Arq.openWrite("exemplo.txt"); //Abrindo Arquivo

        Arq.println(1); //Escrevendo um Número Inteiro
        Arq.println(5.3); //Escrevendo um Número Real
        Arq.println('X'); //Escrevendo Uma Letra
        Arq.println(true); //Escrevendo Valores Booleanos
        Arq.println("Algoritmos"); //Escrevendo Palavras ou Textos
        
        Arq.close(); //Fechando Arquivos
    
    }    
}