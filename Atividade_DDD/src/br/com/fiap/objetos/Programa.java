package br.com.fiap.objetos;

public class Programa {
	
	public static void main(String[] args) {
		
		Animal papagaio = new Ave();
		Animal humano = new Mam�fero();
		
		papagaio.andar();
		papagaio.comer();
		papagaio.dormir();
		System.out.println();
		humano.andar();
		humano.comer();
		humano.dormir();
		
		
		
	}

}
