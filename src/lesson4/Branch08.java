package lesson4;

public class Branch08 {
	public static void main(String[] args) {
		int a = 37;
		int b = 23;
		double a2 = (double)Math.pow(a,2);
		double b2 = (double)Math.pow(b,2);
		
		if (a2 < b2) {
		System.out.println("Smallest number  = " + a2);	
		}
		if (a2 == b2) {
			System.out.println("Number equals  : " +a2+" =" +" " +b2);	
}
		else 
			System.out.println("Smallest number = "+ b2);
}
}
