import java.util.Scanner;

public class CheckSSN {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for SSN
		System.out.print("Enter a SSN: ");
		String social = input.nextLine();

		// Checks for the correct order of the numbers
		for (int i = 0; i < social.length(); i++) {
			   if ((i == 3 || i == 6) && social.charAt(i) == '-') {
			    continue;
			   }
			   // Checks if the user input is the correct length and that it is numbers
			   if (!Character.isDigit(social.charAt(i)) || (social.length() > 11 ) || (social.length() < 11)) {
			    System.out.println(social + " is an invalid social security number");
			    System.exit(0);
			   }
			  }
			 // Outputs values
			  System.out.println(social + " is a valid social security number");
	}

}
