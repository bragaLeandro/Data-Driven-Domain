package br.com.fiap.globalSolution;

public class ProdutoNovo extends Produto {

	private float adicional;
	
	public ProdutoNovo(String nome, float preco, float adicional) {
		super(nome, preco);
		this.setAdicional(adicional);
	}

	public float calcularPreco() {
		float preco = this.getPreco();
		this.setPreco(preco + (preco*adicional/100));
		return preco;
	}

	public float getAdicional() {
		return adicional;
	}

	public void setAdicional(float adicional) {
		this.adicional = adicional;
	}

}
