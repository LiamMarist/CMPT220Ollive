import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		double[] numbers = new double[10];
		int currentMinIndex = 0;
		
		// Prompt user to enter 10 numbers
		System.out.print("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++) 
		{
			numbers[i] = input.nextDouble();	
		}
		for (int i = 0; i < 10; i++) 
		{
			double currentMin = numbers[i];
			currentMinIndex = i;
			for (int j = i + 1; j < 10; j++) 
			{
				if (currentMin < numbers[j]) 
				{
					currentMin = numbers[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i)
			{
				numbers[currentMinIndex] = numbers[i];
				numbers[i] = currentMin;
			}
		}
		System.out.println("The minumum number is: " + numbers[currentMinIndex]);
	}

}
