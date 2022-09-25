package lesson4;

public class Branch10 {
	public static void main(String[]args) {
		
		double rad1 = 5;
		double rad2 = 3;
		double square1 = Math.PI*(double)Math.pow(rad1, 2);
		double square2 = Math.PI*(double)Math.pow(rad2, 2);
		
		if (square1 < square2) {
			System.out.println("Square 2 > Square 1");
		} else if (square1 == square2) {
			System.out.println("Square 1 = Square 2");
		 } else 
			System.out.println("Square 1 > Square 2");
			}
	}

