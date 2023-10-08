package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.retangulo;

public class principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		retangulo ret = new retangulo();

		System.out.println("Insira a largura e a altura do retângulo: ");
		ret.altura = sc.nextDouble();
		ret.largura = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", ret.area());
		System.out.printf("PARAMETRO = %.2f%n", ret.parametro());
		System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());
		
		sc.close();
	}

}
