package entidades;

public class Conta {
	
	private int senha;
	private String nome;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int senha, String nome) {
		this.senha = senha;
		this.nome = nome;
	}
	
	public Conta(int senha, String nome, double saldo) {
		this.senha = senha;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString() {
		return "Conta " + senha + "," + " Proprietario: "  + nome + "," + " Valor na conta: $ " + String.format("%.2f",getSaldo());
	}

}
