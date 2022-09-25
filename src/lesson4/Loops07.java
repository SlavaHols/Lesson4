package lesson4;

public class Loops07 {
	public static void main(String[]args) {
		double a = -10;
		double b = 20;
		double h = 3 ;
		
		 
		for (double x = a; x <= b; x = x + h) {
			if(x > 2) {
			double y1 = x;
			System.out.println("y = "+ y1);
		} else if(x <=2) {
			double y2 = -x;
			System.out.println("y = "+ y2);
		}
	}
}
}
