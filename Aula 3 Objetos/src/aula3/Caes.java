package aula3;

public class Caes {
	
	//atributos
	String nome;
	String raca;
	int idade;
	float peso;
	char sexo;
	String porte;
	String corOlhos;
	String corPelagem;
	boolean vacina;
	
	//metodos
	public void latir() {
		System.out.println("Cachorro latindo");
	}
	public void comer() {
		System.out.println("Cachorro comendo");
	}
	public void andar() {
		System.out.println("Cachorro andando");
	}
	public void correr() {
		System.out.println("Cachorro correndo");
	}
		public void parar() {
		System.out.println("Cachorro parando");
	}
	
	public static void main(String[] args) {
		//instanciando objeto, <nomeClasse> nomeObj = new <nomeClasse>
		Caes cachorro1 = new Caes();
		cachorro1.nome = "Pitas";
		cachorro1.idade = 4;
		cachorro1.corOlhos = "Marrons";
		cachorro1.corPelagem = "Preta";
		cachorro1.porte = "Pequeno Porte";
		cachorro1.raca = "Yorkshire";
		cachorro1.sexo = 'M';
		cachorro1.peso = 16.7f; //casting
		cachorro1.vacina = true;
	
		Caes cachorro2 = new Caes();
		cachorro1.nome = "Davi";
		cachorro1.idade = 3;
		cachorro1.corOlhos = "Azuis";
		cachorro1.corPelagem = "Amarela";
		cachorro1.porte = "Grande Porte";
		cachorro1.raca = "Golden Retriever";
		cachorro1.sexo = 'M';
		cachorro1.peso = 42.7f; //casting
		cachorro1.vacina = true;
		
		System.out.println("Nome" + cachorro1.nome);
		System.out.println("Raça" + cachorro1.raca);
		System.out.println("Idade" + cachorro1.idade);
		cachorro1.andar();
		cachorro1.correr();
		cachorro1.parar();
	}
}


