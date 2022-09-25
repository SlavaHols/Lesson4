package lesson4;

public class Loops05 {
	public static void main (String[]args) {
		int a = 1;
		int b = 0;
		int summ = 0;
		while (a <= 99) {
			a++;
			b = a%2;
					if(b!=0)
						summ += a;
		}
		System.out.println("Summ Numbers 1 to 99 = "+summ);
	}

}
