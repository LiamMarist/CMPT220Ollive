
public class FeetToMeters {

	public static void main(String[] args) {
		
		
		System.out.println("\nfeet       meters   |     meters          feet     "); // prints out the label above the values
		System.out.println("-----------------------------------------------------");
		
		// Displays the conversion
		for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5)
		{
			System.out.printf("%4.1f     ", feet);
			System.out.printf("%6.3f", Meters(feet));
			System.out.print("     |     ");
			System.out.printf("%-11.1f", meters);
			System.out.printf("%7.3f\n", Feet(meters));
		}
		
	}
	
	public static double Meters(double n)
	{
		double conv = 0;	
		for (double i = 1; i <= n; i++)
		{
			conv = i * 0.305;
		}
		return conv;
	}
	
	public static double Feet(double n)
	{
		double conv = 0;	
		for (double j = 5; j <= n; j++)
		{
			conv = j * 3.279;
		}
		return conv;
	}
}
