package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Registo;

public class AppRegisto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Registo> lista = new ArrayList<>();
		
		System.out.print("Quantas pessoas serão adicionada: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Funcionario #%d\n:", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			Registo fun = new Registo(id, nome, salario);
			
			lista.add(fun);
		}

		
			
			
		
		
		

		sc.close();

	}

}
