package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Alturas;

public class Exercicios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int quant = sc.nextInt();
		
		Alturas[] vetor = new Alturas[quant];
		
		double media = 0.0;
		int quantMenor = 0;
		double porcentNome = 0;
		String nome = "";
		
		for (int i = 0 ; i < quant; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Alturas(nome, idade, altura, quant, altura);
			media += altura / quant;
		
		}
		
		for (int i = 0 ; i < quant; i++) {
			if(vetor[i].getIdade() < 16) {
				quantMenor += 1;
				
			}
		}
		
		porcentNome = ((double)quantMenor / quant) * 100;
		
		for(int i=0; i<quant; i++) {
	        if (vetor[i].getIdade() < 16) {
	        	System.out.printf("idade " ,vetor[i].getNome());
	        }
	    }
		
		System.out.println();
		System.out.printf("ALTURA MEDIA = %.2f%n" , media);
		System.out.println("Pessoas com menos de 16 anos: " + porcentNome);
		
		sc.close();

	}

}
