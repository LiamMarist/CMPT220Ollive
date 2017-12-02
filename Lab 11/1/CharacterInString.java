package Default;

import java.util.Scanner;

public class CharacterInString {

	// exercise 18.15
	public static void main(String[] args) {
		int high = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: " );
		String str = input.next();
		
		System.out.println("Enter a character: " );
		
		char a =  input.next().charAt(0);
		
	//	count(str, a, high);
		System.out.println("Character " + count(str, a, high) + " appears " + "high" + " time(s)." );
		
		

	}
	
	// recursive method
	public static int count(String str, char a) {
		return count(str, a, str.length() + 1);
	}
	
	// recursive helper method
public static int count(String str, char a, int high) {
	
	if(str.length() == 0) {
		return 0;
	}
		
	// issue with line 39, I think the organization of this exercise problem may be the cause
	else if(str.charAt(a) >= str.charAt(high) + 1) { // troubled line
		return high + 1;
	}
	else
		return count(str, a, high + 1);		
		
	}
}
