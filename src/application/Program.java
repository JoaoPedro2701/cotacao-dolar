package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calc;

public class Program {
	

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Calc ss = new Calc();
		
		System.out.println(" What is the dollar price? ");
		ss.DOLAR = input.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		ss.COMPRA = input.nextDouble();
		
		double result = Calc.IOF(ss.DOLAR, ss.COMPRA);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);

		
		
		
		input.close();
	}

}
