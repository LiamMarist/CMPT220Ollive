import java.util.Scanner;
// Problem 2.7
public class MinutesToYears {

	public static void main(String[] args) {
		// Create the Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for minutes
		System.out.print("Enter the number of minutes: ");
		double minutes = input.nextDouble();
		
		// Converts minutes to years
		int years = (int) (minutes / 525600);
		
		//the years with its remaining decimals
		double yearsRemainder = (minutes / 525600);
			
		// subtracts the whole number in years leaving the decimal to be multiplied 		
		double amountRemaining =  (yearsRemainder - years);
		
		// Takes the remainder from years and converts them to days
		int days = (int) (amountRemaining * 365);
	
		    			
		
		 // Output the results
		 System.out.println(minutes + " minutes is approximately " + years + " year(s) and " + days + " day(s). ");

	}

}
