package Default;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a multi-digit integer: ");
		int n = input.nextInt();
		long num = 0;
		
		System.out.println("The sum of the digits is: " + sumDigits(n, num));
		

	}
	// recursive method
	public static int sumDigits (long n, long num) {
	
	if (n == 0) {
		return (int) num;
	}
	else {
		num = num + n % 10; // num stores the sum of the digits
		n = n/10; 
		return sumDigits(n, num);
	}	
		
	}
 
}
