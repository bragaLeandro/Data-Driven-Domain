package br.com.fiap.tds;

public class TiposDeDados {

	public static void main(String[] args) {
		
			String nome = "Leandro";
			int idade = 19;
			double peso = 62.9;
			char genero = 'M';
			boolean maioridade = true;

			System.out.println("Meu nome é" + " " + nome);
			System.out.println("eu tenho" + " " + idade + " " + "anos");
			System.out.println("e peso" + " " + peso + " " + "quilos");
			System.out.println("sou do sexo" + " " + genero + " " + "ou seja, masculino");
			System.out.println("mas eu sou de maior?" + " " + maioridade);
			
			int pesoArredondado = (int) Math.ceil(peso);
			
			System.out.println("O peso arredondado é" + " " + pesoArredondado);
			
			int soma = 10*5;
			
			System.out.println(soma);
			
			int a = 10;
			a++;
			System.out.println(a);
				
	}
		

}
	