package br.com.fiap.aula14.array;

import java.util.Scanner;

public class Exemplo2_Aula {

	public int tamanhoVetor() {
		System.out.println("*-- Tamanho Vetor --*");
		Scanner input = new Scanner(System.in);
		System.out.println("Tamanho: ");
		int t = input.nextInt();
		return t;
	}
	
	public int[] criarVetor(int t) {
		System.out.println("*-- Cria Vetor --*");
		Scanner input = new Scanner(System.in);
		int[] v = new int[t];
		for(int i=0; i<v.length;i++) {
			System.out.printf("vetor[%d]: ", i);
			v[i] = input.nextInt();
		}
		return v;
	}
	
	public void imprimirVetor(int[] v) {
		System.out.println("*-- Imprime Vetor --*");
		for(int i=0; i<v.length; i++) {
			System.out.printf("vetor[%d]: %d \n", i, v[i]);
		}
	}
	
	public int maiorElemento(int[] v) {
		System.out.println("*-- Maior Vetor --*");
		int maior = v[0];
		for(int i=0; i<v.length; i++) {
			if(v[i]>maior) {
				maior = v[i];
			}
		}
		return maior;
	}
}
