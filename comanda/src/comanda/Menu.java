package comanda;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Comanda comanda = new Comanda();
		int opcao;

		while (true) {
			System.out.println("""
					============================
					         MENU COMANDA
					============================

					1 - Cadastrar Cliente
					2 - Registrar Gasto
					3 - Exibir Informações de Cliente
					4 - Listar Clientes
					5 - Sair

					============================
					""");

			System.out.print("Digite a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				String nome = sc.nextLine();
				comanda.adicionarCliente(nome);
				break;

			case 2:
				System.out.print("Digite o nome do cliente: ");
				nome = sc.nextLine();
				System.out.print("Digite o valor gasto: ");
				float valor = sc.nextFloat();
				sc.nextLine();
				comanda.registrarGasto(nome, valor);
				break;

			case 3:
				System.out.print("Digite o nome do cliente: ");
				nome = sc.nextLine();
				comanda.exibirInformacoes(nome);
				break;

			case 4:
				comanda.listarClientes();
				break;

			case 5:
				System.out.println("Saindo...");
				sc.close();
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
		}
	}
}
