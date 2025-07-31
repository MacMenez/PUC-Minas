public class listaduplamenteEncadeadaInteiro {
    private int valor;

    public listaduplamenteEncadeadaInteiro() {
        valor = 0;
    }

    public listaduplamenteEncadeadaInteiro(int i) {
        valor = i;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println("Valor: " + this.valor);
    }
}