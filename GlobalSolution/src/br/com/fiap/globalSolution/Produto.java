package br.com.fiap.globalSolution;

public abstract class Produto {
	
	private String nome;
	private float preco;
	
	public Produto(String nome, float preco) {
		super();
		this.setNome(nome);
		this.setPreco(preco);
	}
	
	public abstract float calcularPreco();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	

}
