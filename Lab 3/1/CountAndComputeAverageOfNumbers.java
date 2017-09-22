import java.util.Scanner;

public class CountAndComputeAverageOfNumbers {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int n = input.nextInt();
		int positive = 0;
		int negative = 0;
		int counter = 0;
		double total = 0;
		
		if (n == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}
		
		while (n != 0) {
			if (n > 0)
				// Adds to positive
				positive++;	
			else
				// Adds to negative
				negative++;
			// The total sum of the numbers entered
			total += n;	
			// The number of integers counted in total
			counter++;			
			n = input.nextInt();
		}
		
		double average = total / counter;
		
		// Displays the results
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
				
			
		
	}
}


