package br.com.sistemadecompras;

import java.util.HashMap;
import java.util.Map;

public class Carrinho {
	static Map<String, Produtos> carrinhos = new HashMap<>();
	
	static void adicionaCarrinho(String novaEntradaUsuario,Produtos produto) {
		carrinhos.put(novaEntradaUsuario, produto);
	}
	static void imprimeCarrinho() {
		for (Map.Entry<String, Produtos> entry : carrinhos.entrySet()) {
			String novaEntradaUsuarios = entry.getKey();
			Produtos novaEntradaProdutos = entry.getValue();
			
			System.out.println(novaEntradaProdutos.toString());
		}
	}
}
