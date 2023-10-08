package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Convertor;

public class Dollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o preço do dólar? ");
		double precoDollar = sc.nextDouble();
		System.out.println();
		System.out.print("Quantos dólares serão comprados? ");
		double quantidade = sc.nextDouble();
		double resultado = Convertor.dollarParaReal(precoDollar, quantidade);
		System.out.println();
		System.out.printf("Valor a ser pago em reais = %.2f%n", resultado );
		
		sc.close();
		
	}

}
