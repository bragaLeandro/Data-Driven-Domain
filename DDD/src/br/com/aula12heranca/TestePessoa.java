package br.com.aula12heranca;

import java.util.Date;

public class TestePessoa {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Leandro", "45715089808", new Date(), "94513", "ADS", 1200 );
		System.out.println(aluno1.toString());
	}

}
