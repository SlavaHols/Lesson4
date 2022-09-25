package lesson4;
import java.util.Scanner;

public class Branch03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int	a = sc.nextInt();
	 
	 if (a < 3 ) {
		 System.out.println("yes.");
	 } 
	 else {
		 System.out.println("no.");
	 }
       sc.close();
	}

}
