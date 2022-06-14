package br.com.fiap.globalSolution;

public class TesteProduto {

	public static void main(String[] args) {
		
		// porcentagem é dividida por 100 no método calcularPreco()
		ProdutoNovo p1 = new ProdutoNovo("Celular", 1500, 10);
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Preco: " + p1.getPreco());
		p1.calcularPreco();
		System.out.println("Preço com adicional: " + p1.calcularPreco());
		System.out.println("------------------------------------");
		ProdutoUsado p2 = new ProdutoUsado("Telefone", 2000, 25);
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Preco: " + p2.getPreco());
		p2.calcularPreco();
		System.out.println("Preço com desconto: " + p2.calcularPreco());
	}
}
