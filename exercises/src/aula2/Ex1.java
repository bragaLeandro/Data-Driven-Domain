package aula2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		double numero = input.nextDouble();
	
		double dobroNumero = numero*2;
		
		System.out.println("O dobro do n�mero informado �: " + dobroNumero);
	}

}
