package br.com.sistemadecompras;

import java.util.ArrayList;
import java.util.List;

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
	
	static void listaDeProdutos() {
		List<Produtos> listaProdutos = new ArrayList<>();
		listaProdutos.add(new Produtos("Chuteira", true, 10));
		listaProdutos.add(new Produtos("Calça", true, 2));
		listaProdutos.add(new Produtos("Sunga", false, 0));
	}
}
