package br.com.sistemadecompras;
import java.util.Scanner;

public class PesquisaItens {
	static void pesquisaDeItens() {
		Produtos.imprimeListaDeProdutos();
		System.out.println("Deseja adicionar algum item a sua lista? (responda com sim ou não)");
		Scanner inputResposta = new Scanner(System.in);
		String resposta = inputResposta.nextLine();
		resposta.toLowerCase();
		
		if (resposta.equals("sim")) {
			Produtos.consultaProdutos();
			
		} else if(resposta.equals("não") || resposta.equals("nao")) {
			System.out.println();
			System.out.println("O que deseja fazer?");
			OpcoesLoja.opcoesDaLoja();
			CasesLoja.casesDaLoja();
		}
	}
}
