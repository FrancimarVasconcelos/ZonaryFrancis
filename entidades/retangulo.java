package entidades;

public class retangulo {
	
	public double altura;
	public double largura;
	
	public double area() {
		return altura * largura;
	}
	
	public double parametro() {
		return (altura + largura) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(altura * largura + altura * largura);
		}

}
