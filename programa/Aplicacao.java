package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario fun = new Funcionario();

		System.out.print("Nome: ");
		fun.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		fun.salarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		fun.taxa = sc.nextDouble();

		System.out.println("Funcionario: " + fun);
		System.out.println();
		System.out.println("Qual percentual aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		fun.aumentarSalario(porcentagem);
		System.out.println();
		System.out.println("Dados Atualizados: " + fun);

		sc.close();
	}

}
