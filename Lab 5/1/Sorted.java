import java.util.Scanner;

public class Sorted {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a list
		System.out.print("Enter list: ");
		
		int[] list = new int[input.nextInt()];
		
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();

		// Displays whether the list is sorted or not.
		System.out.println("The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
	}

	// checks if true, if true returns with already sorted, if false returns with not sorted
	public static boolean isSorted(int[] list) {
		
		for (int i = 0; i < list.length - 1; i++) {
			
			if (list[i] > list[i + 1])
				return false;
		}
		
		return true;
	}
}
