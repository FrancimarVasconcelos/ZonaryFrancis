package programa;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] par = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			par[i] = sc.nextInt();
		}
		int getPar = 0;
		int contPar = 0;
		for (int i = 0; i < n; i++) {
			if (par[i] % 2 == 0) {
				getPar += par[i];
				contPar += +1;
			}
		}
		
		if(contPar == 0) {
			System.out.println("NENHUM NUMERO PAR ");
		}else {
			double media = getPar / contPar;
			System.out.println("MEDIA DOS PARES = " + media);
		}


		sc.close();

	}

}
