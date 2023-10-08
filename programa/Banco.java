package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta;

		System.out.print("Digite o número da conta: ");
		int senha = sc.nextInt();
		System.out.print("Insira o titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Existe depósito inicial (s/n)? ");
		char simNao = sc.next().charAt(0);
		if (simNao == 's') {
			System.out.print("Digite o valor do depósito inicial: ");
			double quantidade = sc.nextDouble();
			conta = new Conta(senha, nome, quantidade);
		} else {
			conta = new Conta(senha, nome);
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		System.out.println();

		System.out.print("Digite um valor de depósito: ");
		double quantidade = sc.nextDouble();
		conta.deposito(quantidade);
		System.out.println("Conta Atualizada: ");
		System.out.println(conta);
		System.out.println();

		System.out.print("Insira um valor de retirada: ");
		quantidade = sc.nextDouble();
		conta.saque(quantidade);
		System.out.println("Conta Atualizada: ");
		System.out.println(conta);
		System.out.println();
		System.out.print("Voce quer alterar o nome? ");
		simNao = sc.next().charAt(0);
		if (simNao == 's') {
			System.out.print("Qual novo nome: ");
			sc.nextLine();
			String novoNome = sc.nextLine();
			conta.setNome(novoNome);
			System.out.println("Conta Atualizada");
		} else {
			System.out.println("Sem Alteração ");
			conta = new Conta(senha, nome, quantidade);
		}

		System.out.println(conta);

		sc.close();
	}

}
