package br.com.fiap.aula13.classeAbstrata;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Cachorro poodle = new Cachorro();
		Gato cat = new Gato();
		
		poodle.setNome("Luca");
		System.out.println(poodle.getNome());
		cat.fazerBarulho();
		poodle.fazerBarulho();
		
	}
}