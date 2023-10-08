package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.NotaFinal;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();

		NotaFinal[] vetor = new NotaFinal[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d° aluno:\n", i + 1);
			sc.nextLine();
			String nome = sc.nextLine();
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			vetor[i] = new NotaFinal(nome, n1, n2);
		}
		
		System.out.println("Alunos aprovado = " );
		double total = 0.0;
		for (int i = 0; i < n; i++) {
			total = vetor[i].result();
			if (total > 6.0) {
				System.out.println(vetor[i].getNome());
			}
		}

		sc.close();

	}

}
