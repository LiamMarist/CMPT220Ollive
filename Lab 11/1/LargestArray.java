package Default;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LargestArray {

	// exercise 18.13
	public static void main(String[] args) {
		
		// prompt user to enter eight integers
		Scanner input = new Scanner(System.in);
		System.out.print("Enter eight integers: " );
		
		double a = input.nextInt();
		double b = input.nextInt();
		double c = input.nextInt();
		double d = input.nextInt();
		double e = input.nextInt();
		double f = input.nextInt();
		double g = input.nextInt();
		double h = input.nextInt();
		
		
		double[] list = {a,b,c,d,e,f,g,h};
		double largest = 0;
		double index = 0;
		
		System.out.println("The largest number in the list is: " + getLargest(list, index, largest));
	
		
	}
	//recursive method
	public static double getLargest(double[] list, double index, double largest) {

	    if (index == list.length) {
	        return largest;
	    }
	    if (list[(int) index] > largest) {
	    	largest = list[(int) index];
	    }
	    // returns the largest number in the list
	        return getLargest(list, index + 1, largest);
	    
	}
	
	
	

}
