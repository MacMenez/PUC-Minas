public class CelulaPilha {
    private int valor;
    private CelulaPilha anterior;

    public CelulaPilha() {
        this.anterior = null;
    }

    public CelulaPilha(int val) {
        this.valor = val;
        this.anterior = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public CelulaPilha getAnterior() {
        return anterior;
    }

    public void setAnterior(CelulaPilha anterior) {
        this.anterior = anterior;
    }
}