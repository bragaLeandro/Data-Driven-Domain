package aula2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em °F: ");
		float temperaturaF = input.nextFloat();
		
		float temperaturaC = (temperaturaF-32)/1.8f;
		
		System.out.println("A temperatura em °C é: " + temperaturaC);

	}

}
