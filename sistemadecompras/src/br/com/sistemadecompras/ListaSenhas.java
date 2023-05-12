package br.com.sistemadecompras;

import java.util.ArrayList;
import java.util.List;

public class ListaSenhas {
	static List<String> listaDeSenhas = new ArrayList<String>();
	
	static void adicionaSenha(String novaSenha) {
		listaDeSenhas.add(novaSenha);
	}
}
