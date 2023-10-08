package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.ExcProdutos;

public class Facu {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ExcProdutos[] vetor = new ExcProdutos[n];
		
		for(int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new ExcProdutos(name, preco);
		}
		
		double soma = 0.0;
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		double result = soma / vetor.length;
		
		System.out.printf("Preço da media é = %.2f%n", result);
		
		sc.close();

	}

}
