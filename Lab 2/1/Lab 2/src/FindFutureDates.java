import java.util.Scanner;

public class FindFutureDates {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
				
				// Prompt user to enter a number for the day of the week
			System.out.printf("Enter today's day: ");
				int day = input.nextInt();
				
				// Prompt user to enter a number of days that have elapsed since the first day
				System.out.print("Enter the number of days elapsed since today: ");
				int daysElapsed = input.nextInt();
				
				// find value of the next day and create string for display
				int newDay = (day + daysElapsed) % 7;
				 String nextDay = " ";
				 
				// have each day of the week assigned to a value
				switch (day)
				{
				
				case 0: nextDay = "Sunday"; break;
				case 1: nextDay = "Monday"; break;
				case 2: nextDay = "Tuesday"; break;
				case 3: nextDay = "Wednesday"; break;
				case 4: nextDay = "Thursday"; break;
				case 5: nextDay = "Friday"; break;
				case 6: nextDay = "Saturday"; break;
				}
				
				if (newDay ==  0) {					
					System.out.printf("Today is %s and the future day is Sunday", nextDay);
				}
				else if (newDay == 1) {
					System.out.printf("Today is %s and the future day is Monday", nextDay);
				}
				else if (newDay == 2) {
					System.out.printf("Today is %s and the future day is Tuesday", nextDay);
				}
				else if (newDay == 3) {
					System.out.printf("Today is %s and the future day is Wednesday", nextDay);
				}
				else if (newDay == 4) {
					System.out.printf("Today is %s and the future day is Thursday", nextDay);
				}
				else if (newDay == 5) {
					System.out.printf("Today is %s and the future day is Friday", nextDay);
				}
				else if (newDay == 6) {
					System.out.printf("Today is %s and the future day is Saturday", nextDay);
				}

	}
}
