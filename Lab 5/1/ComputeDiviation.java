import java.util.Scanner;

public class ComputeDiviation {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		// Create Array
		double[] numbers = new double[10]; 

		// Prompt the user to enter 10 numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();

		// Displays the mean and the standard deviation
		System.out.println("The mean is: " + mean(numbers));
		System.out.println("The standard deviation is: " + deviation(numbers));
	}

	// Computes the mean
	public static double mean(double[] x)
	{
		double mean = 0;
		
		for (double e: x) 
		{
			mean += e;
		}
		
		return mean / x.length;
	}
	// Computes deviation
		public static double deviation(double[] x)
		{
			double dev = 0;
			double mean = mean(x);
			
			for (double e: x)
			{
				dev += Math.pow(e - mean, 2);
			}
			
			return Math.sqrt(dev / (x.length - 1));
		}
}
