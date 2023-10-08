package programa;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double media = 0.0;
		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			media = media + vetor[i];
		}

		media = media / n;
		System.out.println();
		System.out.println("MEDIA DO VETOR = " + media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

		double baixo = 0.0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] < media) {
				baixo = vetor[i];
				System.out.println(baixo);
			}
		}

		sc.close();

	}

}
