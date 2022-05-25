package br.com.fiap.objetos;

public class Veiculo {
	
	//public = atributo(visibilidade, ex: public, reserved...)
	public String cor;
	public String modelo;
	
	//visib método(se for void = procedimento) nome
	public void iniciar() {
		System.out.println("Ligando veiculo");
	}
	
	public void frear() {
		System.out.println("Freando veiculo");
	}
	
	public void ligarParabrisa() {
		System.out.println("Ligando Parabrisa");
	}
}