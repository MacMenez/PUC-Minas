class CelulaCliente {
    Cliente item;
    CelulaCliente proximo;

    public CelulaCliente() {
        this.item = new Cliente();
        this.proximo = null;
    }

    public CelulaCliente(Cliente cli) {
        this.item = cli;
        this.proximo = null;
    }
}