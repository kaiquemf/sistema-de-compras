package br.com.sistemadecompras;

import java.util.Scanner;

public class CriarUsuario {
	static Scanner inputNovoUsuario = new Scanner(System.in);

	static void criaUsuario() {

		String novoUsuario = inputNovoUsuario.nextLine();

		if (novoUsuario != null && !novoUsuario.equals("")) {
		    ListaUsuarios.contemUsuario(novoUsuario);
		} else {
		    System.out.println("Insira um usuário válido");
		    criaUsuario();
		}
	}
}
