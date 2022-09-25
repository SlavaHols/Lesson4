package lesson4;
import java.util.Scanner;
public class Loops06 {
	public static void main (String[]args) {
		System.out.println("Enter positive number: ");
		Scanner sc = new Scanner(System.in);
		int inPutNum = sc.nextInt();
		
		int summ = 0;
		for (int i = 1; i <=inPutNum; i++ ) {
			summ +=i; 
		}
		System.out.println("Summ of all numbers from 1 to "+ inPutNum+" = "+summ);
		sc.close();
	}

}
