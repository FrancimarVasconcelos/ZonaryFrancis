package programa;

public class InfPessoa {

	private double Altura;
	private char Genero;

	public InfPessoa(double altura, char genero) {
		Altura = altura;
		Genero = genero;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	public char getGenero() {
		return Genero;
	}

	public void setGenero(char genero) {
		Genero = genero;
	}

}
