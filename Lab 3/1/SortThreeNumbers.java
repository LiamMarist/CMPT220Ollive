import java.util.Scanner;

public class SortThreeNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three different numbers: ");
		
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		displaySortedNumbers(n1, n2, n3);

	}

	private static void displaySortedNumbers(double n1, double n2, double n3) {
		
		// These check the numbers individually to see which ones are greater or less than the other
		if( n3 > n2)
		{
			double temp = n2;
			n2 = n3;
			n3 = temp;
		}
		
		if( n2 > n1)
		{
			double temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		if( n1 > n3)
		{
			double temp = n3;
			n3 = n1;
			n1 = temp;
		}
		
		System.out.println("The numbers in order from lowest to highest: " + n1 + ", " + n2 + ", " + n3);
		
	}

}
