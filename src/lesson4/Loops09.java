package lesson4;

public class Loops09 {
	public static void main (String[]args) {
		int result = 0;
		for(int i = 0; i <= 100; i++ ) {
			int x = (int)Math.pow(i,2);
			int sum = x;
			result += sum;
		}
			System.out.println("Summ pow from 0 to 100 = " +result );	
					}
			}

