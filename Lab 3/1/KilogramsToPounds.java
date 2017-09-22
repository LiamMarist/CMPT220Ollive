import java.util.Scanner;

public class KilogramsToPounds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		
		System.out.println("Kilograms    Pounds     |     Pounds      Kilograms");
		
			for (int kilo = 1, pound = 20; kilo <= 199 && pound <= 515; kilo += 2, pound += 5) {
				
				System.out.printf("%-12d%7.1f", kilo, (kilo * 2.2));
				
				System.out.print("     |     ");
				
				System.out.printf("%-9d%12.2f\n", pound, (pound / 2.2));
			}
	}

}
