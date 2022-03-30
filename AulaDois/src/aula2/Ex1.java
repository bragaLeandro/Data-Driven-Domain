package aula2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		double numero = input.nextDouble();
	
		double dobroNumero = numero*2;
		
		System.out.println("O dobro do número informado é: " + dobroNumero);
	}

}
