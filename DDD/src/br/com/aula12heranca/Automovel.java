package br.com.aula12heranca;

public class Automovel extends Veiculo {
	
	//Construtor
	public Automovel() {
		System.out.println("Automovel");
	}
	
	//M�todos
	public void checkList() {
		System.out.println("Automovel.checklist()");
	}
	
	public void adjust() {
		System.out.println("Automovel.adjust()");
	}
	
	public void cleanup() {
		System.out.println("Automovel.cleanup()");
	}
}

