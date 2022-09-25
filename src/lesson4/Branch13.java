package lesson4;

public class Branch13 {
	public static void main (String[]args) {
		
		int xA = -30;
		int yA = -20;
		int summA = Math.abs(xA) + Math.abs(yA);
		
		int xB = 30;
		int yB = -20;
		int  summB = Math.abs(xB) + Math.abs(yB);
		
		if (summA < summB) {
			System.out.println("Point A closer to 0 coordinate");
		} else if(summA == summB) {
			System.out.println("Point A equals B closer to 0 coordinate");
		} else { 
			System.out.println("Point B closer to 0 coordinate");
			}
		}
	}

