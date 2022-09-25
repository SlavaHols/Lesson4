package lesson4;

public class Loops10 {
	public static void main (String[]args) {
		double result = 1;
		for (double i = 1; i <= 200 ; i++) {
			double a = (double)Math.pow(i, 2);
			double product = a;
			result *= product; 
		}
		System.out.println("Product  of squares of all numbers from 0 to 200 =  "+ result);
		System.out.printf("Or so :"+"\t%4.1f\t", result);
	}
}
