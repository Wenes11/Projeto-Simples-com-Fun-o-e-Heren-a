package Entidade;

public class Produto {
	
	public String name;
	public double valor;
	public int quantidade;
	
	
	public double totalValor() {
		
		return valor*quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
}


