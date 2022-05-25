package br.com.fiap.objetos;

public class Ave extends Animal{
	
	private String especie; 
	public void andar() {
		System.out.println("Ave andando");
	}
	
	public void comer() {
		System.out.println("Ave comendo");
	}
	
	public void dormir() {
		System.out.println("Ave dormindo");
	}
	
	public void voar() {
		System.out.println("Ave voando");
	}
}
