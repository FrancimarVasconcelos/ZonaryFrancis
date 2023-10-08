package programa;

import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		InfPessoa[] vetor = new InfPessoa[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa:\n", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa:\n", i + 1);
			char genero = sc.next().charAt(0);
			vetor[i] = new InfPessoa(altura, genero);

		}

		double maior = vetor[0].getAltura();
		double menor = vetor[0].getAltura();
		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i].getAltura() > maior) {
				maior = vetor[i].getAltura();
			}
			if (vetor[i].getAltura() < menor) {
				menor = vetor[i].getAltura();
			}
			if (vetor[i].getGenero() == 'm') {
				cont += 1;
			}
		}

		System.out.println();
		System.out.print("Menor altura = " + menor);
		System.out.println();
		System.out.print("Maior altura = " + maior);
		System.out.println();
		System.out.println("Numero de homens = " + cont);

		sc.close();

	}

}
