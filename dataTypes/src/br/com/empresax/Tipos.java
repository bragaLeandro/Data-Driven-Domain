package br.com.empresax;

import java.util.ArrayList;

public class Tipos {

	public static void main(String[] args) {

		// Tipo array, usado para listas telefônicas, lista de usuários..

		ArrayList<String> listinha = new ArrayList<>();

		listinha.add("Topico 1 da lista me achou");
		listinha.add("Topico 2 da lista me achou");

		String captura0 = listinha.get(1);
		System.out.println(captura0);
	}

}
