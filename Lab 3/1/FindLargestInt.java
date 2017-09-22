import java.util.Scanner;

public class FindLargestInt {

	public static void main(String[] args) {
		
			        
		 int n = 1;
		 // n to the 3rd power
		  while (Math.pow(n, 3) <= 12000) {
		   n++;
		  }
		   n--;
		   // Will display the maximum of n^3 while being less than 12000
		  System.out.println("The largest integer to the 3rd power less than 12000 is: " + n);
		  System.out.println("The integer to the 3rd power is: " + Math.pow(n, 3));
		 }
		
			
		

	

}
