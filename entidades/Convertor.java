package entidades;

public class Convertor {
	
	public static double iof = 0.06;
	
	public static double dollarParaReal(double quantidade, double precoDollar) {
		return quantidade * precoDollar * (1.0 + iof);
	}

}
