package br.com.sistemadecompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.sistemadecompras.EntraUsuario;

public class Produtos {
	private String nomeDoProduto;
	private boolean disponibilidadeProduto;
	private int quantidadeDeProdutos;

	public Produtos(String nomeDoProduto, boolean disponibilidadeProduto, int quantidadeDeProdutos) {
		this.nomeDoProduto = nomeDoProduto;
		this.disponibilidadeProduto = disponibilidadeProduto;
		this.quantidadeDeProdutos = quantidadeDeProdutos;
	}

	public String getNomeDoProduto() {
		return this.nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public int getQuantidadeDeProdutos() {
		return this.quantidadeDeProdutos;
	}

	public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
		this.quantidadeDeProdutos = quantidadeDeProdutos;
	}

	public boolean isDisponibilidadeProduto() {
		return this.disponibilidadeProduto;
	}

	public void setDisponibilidadeProduto(boolean disponibilidadeProduto) {
		this.disponibilidadeProduto = disponibilidadeProduto;
	}

	static List<Produtos> listaDeProdutos() {
		List<Produtos> listaProdutos = new ArrayList<>();
		listaProdutos.add(new Produtos("calça", true, 2));
		listaProdutos.add(new Produtos("chuteira", true, 10));
		listaProdutos.add(new Produtos("sunga", false, 0));

		return listaProdutos;
	}

	static void imprimeListaDeProdutos() {
		List<Produtos> listaProdutos = listaDeProdutos();
		for (Produtos produto : listaProdutos) {
			System.out.println(produto.getNomeDoProduto());
		}
	}

	static void consultaProdutos() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome do produto desejado: ");
		String produtoDesejado = scanner.nextLine();

		Produtos produtoEncontrado = null;
		for (Produtos produto : listaDeProdutos()) {
			if (produto.getNomeDoProduto().equalsIgnoreCase(produtoDesejado)) {
				produtoEncontrado = produto;
				break;
			}
		}

		if (produtoEncontrado != null) {
			System.out.println("Produto encontrado!");
			if (produtoEncontrado.isDisponibilidadeProduto()) {
//				Carrinho.adicionaCarrinho(novaEntradaUsuario , produtoEncontrado);
				System.out.println("O produto foi adicionado a sua lista e ainda tem "
						+ produtoEncontrado.getQuantidadeDeProdutos() + " unidades restantes em estoque!");
			} else {
				System.out.println("O produto não está disponível.");
			}
		} else {
			System.out.println("Produto não encontrado!");
		}
	}
}
