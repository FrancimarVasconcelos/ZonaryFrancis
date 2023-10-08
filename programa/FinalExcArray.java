package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.HotelFinalArray;

public class FinalExcArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("quantos quartos serão avaliados? ");
		int n = sc.nextInt();
		
		HotelFinalArray[] vetor = new HotelFinalArray[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println();
			System.out.printf("Quarto #%d:\n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("N° do Quarto: ");
			int quarto = sc.nextInt();
			vetor[i] = new HotelFinalArray(nome, email, quarto);
			
		}
		
		//int zero = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].getQuarto() > 0);
		}
		
		
		sc.close();

	}

}
