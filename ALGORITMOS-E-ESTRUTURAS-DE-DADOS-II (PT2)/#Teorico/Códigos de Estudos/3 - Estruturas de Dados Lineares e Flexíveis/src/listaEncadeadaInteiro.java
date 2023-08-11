public class listaEncadeadaInteiro {
    private int valor;

    public listaEncadeadaInteiro() {
        this.valor = 0;
    }

    public listaEncadeadaInteiro(int i) {
        this.valor = i;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println("Valor: " + this.valor);
    }
}