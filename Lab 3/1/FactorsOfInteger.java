import java.util.Scanner;

public class FactorsOfInteger {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer:");
		
		int b = input.nextInt();
		int i = 2;
		int t = b;
		String s = "";
		
		while (b != 1) {						
			
			if(b % i == 0) {
				s = s + ", " + i;
			    b = b / i; // divides the integer entered by 2			    
			    
			}
			else
			{
			    i++;
			}
		
		}
		// Displays results
		System.out.print("The factors of " + t + " are: " + s.substring(2) + ".");

	}

}
