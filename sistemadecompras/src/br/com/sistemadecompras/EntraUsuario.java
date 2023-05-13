package br.com.sistemadecompras;

import java.util.Scanner;

public class EntraUsuario {
	static Scanner inputEntradaUsuario = new Scanner(System.in);

	static String entraUsuarios() {
		System.out.println("Digite o nome de usuário: ");

		String novaEntradaUsuario = inputEntradaUsuario.nextLine();
		if (ListaUsuarios.listaDeUsuarios.contains(novaEntradaUsuario)) {
			System.out.println("Por favor insira a senha: ");
			EntraSenha.entradaSenha();
		} else {
			System.out.println("Por favor, insira um nome de usuário válido: ");
			entraUsuarios();
		}
		return novaEntradaUsuario;
	}
}
