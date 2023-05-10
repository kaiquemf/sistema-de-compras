package br.com.sistemadecompras;

import java.util.HashSet;
import java.util.Set;

public class ListaUsuarios {
	static Set<String> listaDeUsuarios = new HashSet<String>();
	
	static void adicionaUsuario(String novoUsuario) {
		listaDeUsuarios.add(novoUsuario);
	}
	
	static void contemUsuario(String novoUsuario) {
		if (listaDeUsuarios.contains(novoUsuario)) {
			System.out.println("Usuário já existente, por favor faça o login ou "
					+ "crie um novo usuário");
			OpcoesLogin.opcoesDeLogin();
			CasesLogin.casesDeLogin();
		} else {
			adicionaUsuario(novoUsuario);
			System.out.println("Insira uma nova senha: ");
			CriarSenha.criaSenha();
		}
	}

}
