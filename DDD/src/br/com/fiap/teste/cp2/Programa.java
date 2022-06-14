package br.com.fiap.teste.cp2;

public class Programa {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		c1.setNumConta(1234);
		c1.setDono("Leandro");
		c1.abrirConta("cp");
		c1.estadoAtual();
		c1.sacar(100);
		c1.estadoAtual();
		c1.sacar(50);
		c1.estadoAtual();

	}

}
