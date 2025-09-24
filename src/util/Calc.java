package util;

public class Calc {
	
	public double DOLAR;  
	public double COMPRA; 
	public static final double TAX = 0.06;
	
	public static double IOF(double conta, double soma) {
		return conta * soma * (1.0 + TAX);
	}

}
