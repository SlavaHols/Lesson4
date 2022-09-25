package lesson4;

public class Loops08 {
	public static void main (String[]args) {
		double a = 10;
		double b = 20;
		double h = 1;
		double y = 0;
		double c = -2;
		
		for(double x = a; x <= b; x = x + h) {
			if(x == 15) {
				y = (x + c) * 2;
				System.out.println("at x = "+ x+" -- y = "+ y);
			} if(x != 15) {
				y = (x - c) + 6;
				System.out.println("at x = "+ x+" -- y = "+ y);
			}
		}
	}
}
