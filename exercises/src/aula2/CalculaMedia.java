package aula2;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		//cria��o do objeto Scanner (input)
		Scanner input = new Scanner (System.in);
		
		//declara��o de vari�veis
		float n1;
		float n2;
		float media;
		String nome;
		
		System.out.println("*-- C�lculo M�dia --*");
		
		//entrada	
		System.out.println("Digite o seu nome: ");
		nome = input.next();
		
		System.out.println("Nota 1: ");
		n1 = input.nextFloat();
		
		System.out.println("Nota 2: ");
		n2 = input.nextFloat();
		
		//processamento
		media = (n1+n2)/2;
		
		//sa�da
		System.out.println(nome + ", a sua m�dia �: " + media);
	}

}
