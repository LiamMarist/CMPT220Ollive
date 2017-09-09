import java.util.Scanner;
// Problem 2.1
public class CelsiusToFahrenheit {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Get temperature from the user
		System.out.print("Enter a temperature in Celsius: ");
		double celsius = input.nextDouble();
		
		// Convert to fahrenheit
				double fahrenheit = (9.0 / 5) * celsius + 32;
				System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");
			}
}

