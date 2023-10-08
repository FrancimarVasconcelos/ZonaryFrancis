package programa;

import java.util.Locale;
import java.util.Scanner;

public class numerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double valorMaior = vetor[0];
		int posicao = 0;
		
		for (int i = 0; i < n; i++) {
			if( vetor[i] > valorMaior ) {
				valorMaior = vetor[i];
				posicao = i;
			}
		}

		System.out.println(valorMaior+" "+ posicao);
		

		sc.close();

	}

}
