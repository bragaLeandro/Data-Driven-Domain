package br.com.fiap.aula3;

import java.util.Date;

public class BoasVindas {
	
		public static void comprimentarCliente() {
		System.out.println("Bom dia");
		
		Date data = new Date();
		System.out.println("a data de hoje é " + data);
	}
	
		public static void reconhecerCliente() {
			String nome = "João";
			System.out.println("Bem vindo!");
			System.out.println("Olá " + nome + ", " + "tudo bem? \nvocê mora em São Paulo");
	}
	
		public static void main(String[] args) {
		
			comprimentarCliente();
			reconhecerCliente();
			
		}
		
}
		

