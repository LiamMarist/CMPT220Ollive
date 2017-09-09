import java.util.Scanner;

public class SubtotalAndGratuityRate {
// Problem 2.5
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the subtotal and gratuity
		System.out.print("Enter the subtotal and the gratuity rate: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		
		// Divide number2 by 100 to get gratuity percentage and multiplies by the subtotal to get gratuity
		double gratuity =  (number2 / 100) * number1;
		
		//adds the gratuity and the subtotal(number1) to create the total
		double total =  gratuity + number1;
		
		// Results of the total and the gratuity displayed together
		System.out.println("The gratuity is: $" + gratuity + " and total is $" + total);
	}

}
