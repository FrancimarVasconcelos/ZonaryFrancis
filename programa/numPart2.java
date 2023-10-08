package programa;

import java.util.Locale;
import java.util.Scanner;

public class numPart2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		int cont = 0;
	
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.println(vetor[i]);
				cont = cont +1;
			}
		}
		
		System.out.println(cont);
		sc.close();

	}

}
