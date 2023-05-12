package br.com.sistemadecompras;

import java.util.Scanner;

public class CriarUsuario {
	static Scanner inputNovoUsuario = new Scanner(System.in);

	static void criaUsuario() {

		String novoUsuario = inputNovoUsuario.nextLine();

		if (novoUsuario != null && !novoUsuario.equals("")) {
		    ListaUsuarios.contemUsuario(novoUsuario);
			System.out.println("Insira uma nova senha (mínimo de 8 dígitos): ");
			CriarSenha.criaSenha();
			
			System.out.println();
			System.out.println("O que deseja fazer agora?");
			OpcoesLogin.opcoesDeLogin();
			CasesLogin.casesDeLogin();
		} else {
		    System.out.println("Insira um usuário válido: ");
		    criaUsuario();
		}
	}
}
