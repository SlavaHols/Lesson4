package lesson4;
import java.util.Random;
import java.util.Scanner;

public class Loops31 {
	public static void main(String[]args) {
		System.out.println("Guess a number from 1 to 15:");
		
		int  rannum = new Random().nextInt(15);
		Scanner sc = new Scanner(System.in);
		int InputNum = sc.nextInt();
		int guess = 0;
		
		while (InputNum!= rannum) {
			if (InputNum <= 0 || InputNum >15) {
				System.out.println("You are entering the wrong number!");
			} else
			System.out.println("You didn't guess!");
			System.out.println("Please try again: ");
			InputNum = sc.nextInt();
			guess++;
			
		}
		System.out.println("You win!");
		System.out.println("Hidden number = "+InputNum );
		System.out.println("Numbers of Guesses = " + guess );
		sc.close();
		
		}
	}

