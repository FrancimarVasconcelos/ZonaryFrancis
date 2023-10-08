package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Desafio;

public class Curso2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Desafio data = new Desafio();
		
		data.dia = 20;
		data.ano = 1992;
		data.mes = "Setembro";
		System.out.print(data);
		
		sc.close();

	}

}
