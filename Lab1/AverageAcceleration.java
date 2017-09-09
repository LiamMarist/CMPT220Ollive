import java.util.Scanner;
// Problem 2.9
public class AverageAcceleration {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for starting velocity v0, end velocity v1, and time span t 
				System.out.print("Enter v0, v1, and t: ");
				double v0 = input.nextDouble();
				double v1 = input.nextDouble();
				double t = input.nextDouble();
				
				//finds average for velocity
				double average = (v1 - v0) / t;
				
				// Output the results of velocity average
		        System.out.println("The average acceleration is " + average);

	}

}
