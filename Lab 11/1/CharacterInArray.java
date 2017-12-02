package Default;

import java.util.Scanner;

public class CharacterInArray {

	// exercise 18.17
	public static void main(String[] args) {
		
		// prompt user to enter characters
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 characters: " );
		
		char char1 = input.next().charAt(0);
		char char2 = input.next().charAt(0);
		char char3 = input.next().charAt(0);
		char char4 = input.next().charAt(0);
		char char5 = input.next().charAt(0);
		
		char[] chars = {char1,char2,char3,char4,char5};
		int high = 0;
		
		System.out.println("Enter the character to be searched for in the array: " );
		char ch =  input.next().charAt(0);
		
		System.out.println(ch + " appears " + count(chars, ch, high) + " time(s).");
	}
	
	// recursive method
	public static int count(char[] chars, char ch) {
		
		return count(chars, ch);
	}
	
	// recursive helper method
	public static int count(char[] chars, char ch, int high) {
		
		if(chars == null)
		return 0;
		
		else if(chars.length == high) { // I've gotten it to display the number of chars in the array, even though that is incorrect
			return high;
		}
		
		else
			return count(chars, ch, high + 1); // No Longer   causes a StackOverflowError
		
	}
	// side note: recursion methods can be a very useful tool, I just need to understand more about how they work
}
