package br.com.sistemadecompras;

import java.util.Scanner;

public class EntraSenha {
	static Scanner inputEntradaSenha = new Scanner (System.in);
	
	static void entradaSenha() {
		String novaEntradaSenha = inputEntradaSenha.nextLine();
		if (ListaSenhas.listaDeSenhas.contains(novaEntradaSenha)) {
			System.out.println("Usuário logado com sucesso, o que deseja fazer agora? ");
			OpcoesLoja.opcoesDaLoja();
			CasesLoja.casesDaLoja();
		} else {
			System.out.println("Por favor, insira uma senha válida");
			entradaSenha();
		}
	}
}
