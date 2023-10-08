package entidades;

public class Alturas {
	
	private String nome;
	private int idade;
	private double altura;
	private int quant;
	public double SomaAlt;
	

	public Alturas(String nome, int idade, double altura, int quant, double somaAlt) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.quant = quant;
		this.SomaAlt = somaAlt;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getSomaAlt() {
		return SomaAlt;
	}

	public void setSomaAlt(double somaAlt) {
		 SomaAlt += altura / quant;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	public String toString() {
		return nome;
	}
	

}

