package programa;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numero voce vai digitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		int contador = 0;
		double maior = vetor[0];
		System.out.println();
		System.out.print("MAIOR VALOR = ");

		for (int i = 0; i < n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				contador = i;
			}

		}
		System.out.println(maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + contador);

		sc.close();

	}

}
