package programa;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		int[] vetA = new int[n];
		int[] vetB = new int[n];
		int[] vetSoma = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for (int i = 0; i < n; i++) {
			vetA[i] = sc.nextInt();
		}
		
		System.out.println("Digite Os valores do Vetor B: ");
		
		for (int i = 0; i < n; i++) {
			vetB[i] = sc.nextInt();
		}
		
		for(int i = 0; i<n; i++) {
			vetSoma[i] = vetA[i] + vetB[i];
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println(vetSoma[i]);
		}

		sc.close();

	}

}
