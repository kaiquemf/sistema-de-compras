package br.com.sistemadecompras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CasesLogin {
	static void casesDeLogin() {
		Scanner inputOpcaoLogin = new Scanner(System.in);
		try {
			int opcaoSelecionada = inputOpcaoLogin.nextInt();
			switch (opcaoSelecionada) {
			case 1:
				
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Opção inválida. Digite um valor numérico:");
			OpcoesLogin.opcoesDeLogin();
			inputOpcaoLogin.nextLine();
			casesDeLogin();
		} finally {
			inputOpcaoLogin.close();
		}
	}
}
