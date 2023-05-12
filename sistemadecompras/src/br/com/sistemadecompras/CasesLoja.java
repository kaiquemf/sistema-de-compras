package br.com.sistemadecompras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CasesLoja {
	static void casesDaLoja() {
		Scanner inputPesquisaLoja = new Scanner(System.in);

		try {
			int pesquisaLoja = inputPesquisaLoja.nextInt();
			
			switch (pesquisaLoja) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("Entre ou crie uma nova conta: ");
				OpcoesLogin.opcoesDeLogin();
				CasesLogin.casesDeLogin();
				break;
			case 5:
				System.out.println("Orbigado, volte sempre!");
				break;
			default:
				System.out.println("Selecione uma das opções válidas: ");
				casesDaLoja();
				break;
			}
		} catch (InputMismatchException erro) {
			System.out.println("Selecione uma opção válida");
			OpcoesLoja.opcoesDaLoja();
			inputPesquisaLoja.nextLine();
			casesDaLoja();
		} finally {
			inputPesquisaLoja.close();
		}

	}
}