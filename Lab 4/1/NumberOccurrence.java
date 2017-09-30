import java.util.Scanner;

public class NumberOccurrence {
	public static void main(String[] args) {
		int[] counts = new int[100]; // Counts the number of times a number occurs

		// Get the user to enter numbers between 1 - 100
		System.out.print("Enter the integers between 1 and 100, end input with 0: ");

		
		count(counts);

		
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0)
				System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
		}
	}

	
	public static void count(int[] counts){
		
		Scanner input = new Scanner(System.in);
		
		int n; // holds user input
		do {
			n = input.nextInt();
			if (n >= 1 && n <= 100)	
				counts[n - 1]++;
		} while (n != 0);
	}
}
