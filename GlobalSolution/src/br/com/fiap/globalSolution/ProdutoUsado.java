package br.com.fiap.globalSolution;

public class ProdutoUsado extends Produto {

	private float desconto;
	
	public ProdutoUsado(String nome, float preco, float desconto) {
		super(nome, preco);
		this.setDesconto(desconto);
	}
	
	public float calcularPreco() {
		float preco = this.getPreco();
		this.setPreco(preco - (preco*desconto/100));
		return preco;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

}
