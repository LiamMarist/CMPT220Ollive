import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for a letter
		System.out.printf("Enter a letter: ");
		String letter = input.nextLine();

		 // Checks if characters are between A - Z
		  char ch = Character.toUpperCase(letter.charAt(0));
		  if (ch > 'Z' || ch < 'A') {
		   System.out.println(letter + " is an invalid input");
		   System.exit(1);
		  }
		  
		  // Checks for Vowels
		  if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			   System.out.println(letter + " is a vowel");  
			   System.exit(1);
			  }
			  System.out.println(letter + " is a consonant");
	}

}
