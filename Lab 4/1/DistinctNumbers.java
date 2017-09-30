import java.util.Scanner;

public class DistinctNumbers {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        //Create Array
		int[] distinctNumbers = new int[10];
		int num; 				
		int counts = 0;			

		// Prompt the user to enter 10 numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();

			// checks if num is distinct
			if (isDistinct(distinctNumbers, num)) {
				distinctNumbers[counts] = num;
				counts++;	
			}
		}

		// Displays the distinct numbers
		System.out.println("The number of distinct numbers is " + counts);
		System.out.print("The distinct numbers are");
		
		for (int i = 0; i < distinctNumbers.length; i++) 
		{
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();
	}

	// returns if not distinct numbers
	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}

}
