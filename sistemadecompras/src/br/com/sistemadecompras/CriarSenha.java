package br.com.sistemadecompras;

import java.util.Scanner;

public class CriarSenha {
	static Scanner inputNovaSenha = new Scanner(System.in);

	static void criaSenha() {
		String novaSenha = inputNovaSenha.nextLine();
		
		if(novaSenha != null && !novaSenha.equals("") && novaSenha.length() >= 8) {
			ListaSenhas.adicionaSenha(novaSenha);
			System.out.println("Usuário criado com sucesso!");
		} else {
			System.out.println("Digite uma senha válida (mínimo de 8 dígitos): ");
			criaSenha();
		}
	}
}
