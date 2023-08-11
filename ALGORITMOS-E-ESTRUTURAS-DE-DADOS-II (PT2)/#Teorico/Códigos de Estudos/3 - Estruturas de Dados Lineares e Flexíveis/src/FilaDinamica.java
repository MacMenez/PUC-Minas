
public class FilaDinamica {
	CelulaCliente frente;
	CelulaCliente tras;
	
	public FilaDinamica(){
		this.frente = new CelulaCliente();
		this.tras = this.frente;
	}
	
	public void enfileirar(Cliente cli) {
		CelulaCliente novaCelula = new CelulaCliente(cli); 
		this.tras.proximo = novaCelula;
		this.tras = novaCelula;
		
		/*
		//versão alternativa dos comandos anteriores
		this.tras.proximo = new CelulaCliente(cli);
		this.tras = this.tras.proximo;
		*/
	}
	
	public boolean filaVazia() {
		return (this.frente == this.tras);
	}
	
	public Cliente desenfileirar() {
		if(!this.filaVazia()) {
			CelulaCliente celulaRetirada = this.frente.proximo;
			this.frente.proximo = celulaRetirada.proximo;
			celulaRetirada.proximo = null;
			
			if(this.tras == celulaRetirada) {
				this.tras = this.frente;  //atualiza para sentinela
			}
			
			return celulaRetirada.item;
		}
		
		return null;
	}
	
	public void imprimir() {
		
	}
}