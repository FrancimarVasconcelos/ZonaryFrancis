package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Velho;

public class Mais_velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		Velho[] vetor = new Velho[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vetor[i] = new Velho(nome, idade);

		}

		int velhao = vetor[0].getIdade();
		String name = "";
		for (int i = 0; i < n; i++) {
			if (vetor[i].getIdade() > velhao) {
				velhao = vetor[i].getIdade();
				name = vetor[i].getNome();
			}
		}

		System.out.println(name);

		sc.close();
	}

}
