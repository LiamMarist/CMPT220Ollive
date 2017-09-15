import java.util.Scanner;

public class FindUnicodeOfCharacter {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt User for a character
		System.out.printf("Enter a character: ");
			String a = input.nextLine();
			char b = a.charAt(0);
				
		// Output unicode of character
		System.out.print("The Unicode for the character " + b + " is "
					    + (int) b);
	}

}
