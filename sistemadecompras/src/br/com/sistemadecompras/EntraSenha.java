package br.com.sistemadecompras;

import java.util.Scanner;

public class EntraSenha {
	static Scanner inputEntradaSenha = new Scanner (System.in);
	
	static void entradaSenha() {
		String novaEntradaSenha = inputEntradaSenha.nextLine();
		if (ListaSenhas.listaDeSenhas.contains(novaEntradaSenha)) {
			
		} else {
			System.out.println("Por favor, insira uma senha válida");
			entradaSenha();
		}
	}
}
