package br.com.fiap.aula3;

import java.util.Date;

public class BoasVindas {
	
		public static void comprimentarCliente() {
		System.out.println("Bom dia");
		
		Date data = new Date();
		System.out.println("a data de hoje � " + data);
	}
	
		public static void reconhecerCliente() {
			String nome = "Jo�o";
			System.out.println("Bem vindo!");
			System.out.println("Ol� " + nome + ", " + "tudo bem? \nvoc� mora em S�o Paulo");
	}
	
		public static void main(String[] args) {
		
			comprimentarCliente();
			reconhecerCliente();
			
		}
		
}
		

