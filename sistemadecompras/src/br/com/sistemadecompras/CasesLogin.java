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
				System.out.println("ainda não dá");
				break;
			case 2:
				System.out.println("Insira o nome de usuário: ");
				CriarUsuario.criaUsuario();
				break;
			case 3:
				System.out.println("Até a próxima!");
				break;
				default:
					System.out.println("Opção inválida. Digite uma das opções abaixo:");
					OpcoesLogin.opcoesDeLogin();
					break;
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
