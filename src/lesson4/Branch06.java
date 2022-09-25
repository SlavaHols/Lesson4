package lesson4;
import java.util.Scanner;

public class Branch06 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		  int a = sc.nextInt();
		
		System.out.println("Enter b: ");
	      int b = sc.nextInt();
	      
	      if (a > b) {
	    	  System.out.println("Largest number : " + a);  
	      } 
	      else if ( a == b) {
	    	  System.out.println("Input numbers equals: " +a + " = "+ b);
	      }
	      else {
	    	  System.out.println("Largest number : " + b);
	      }
	      sc.close();
	}
}

