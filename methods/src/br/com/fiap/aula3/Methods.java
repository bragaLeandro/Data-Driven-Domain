package br.com.fiap.aula3;

public class Methods {
	
	//fun��o existe return
	public static double descontar(double valorBoleto, double desconto) {
		// produto pela metade
		return valorBoleto - desconto;
	}
	
	public static double aumentar(double valorBoleto, double desconto) {
		//produto com juros
		
		return valorBoleto + desconto;
	}
	
	public static double multiplicar(double valorBoleto, int parcela) {
	
		return valorBoleto * parcela;
}

	public static void main(String[] args) {
		double valorBoleto = 913.20;
		double desconto = 91.320;
		int parcela = 14;
		double resultadoDescontado = descontar(valorBoleto, desconto);
		double resultadoComJuros = aumentar(valorBoleto, desconto);
		double totalParcelamento = multiplicar(valorBoleto, parcela);
		
		System.out.println("O valor do boleto final � " + resultadoDescontado + "\n");
		System.out.println("O valor do boleto final � " + resultadoComJuros + "\n");
		System.out.println("O valor total do parcelamento � " + totalParcelamento);
	
}
	
}
