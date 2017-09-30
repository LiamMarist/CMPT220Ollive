
public class Summation {

	public static void main(String[] args) {
		
		
				double start  =  1.0;	
				double end = 20.0;	

				
				System.out.println("\ni          m(i)     "); // prints out the label above the values
				System.out.println("---------------------");

				// Displays the answers
				for (double i = start; i <= end; i++)
				{
					System.out.printf("%-10.0f", i); // Allows the answers to be displayed orderly
					System.out.printf("%7.4f\n", sum(i));
				}
			}

			
			public static double sum(double n)
			{
				double sum = 0;	
				for (double i = 1; i <= n; i++)
				{
					sum += i / (i + 1);
				}
				return sum;

	}

}
