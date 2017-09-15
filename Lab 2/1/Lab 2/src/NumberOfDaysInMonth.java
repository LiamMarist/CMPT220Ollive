import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt User for number of month
		System.out.printf("Enter the number of month: ");
		int monthValue = input.nextInt();
		
		// prompt User for year
		System.out.printf("Enter the year: ");
		int year = input.nextInt();
		
		int days = 0;
		String month;
		
		switch (monthValue)
		{
		case 1: month = "January"; break;
		case 2: month = "February"; break;
		case 3: month = "March"; break;
		case 4: month = "April"; break;
		case 5: month = "May"; break;
		case 6: month = "June"; break;
		case 7: month = "July"; break;
		case 8: month = "August"; break;
		case 9: month = "September"; break;
		case 10: month = "October"; break;
		case 11: month = "November"; break;
		case 12: month = "December"; break;
		}
		
		if (monthValue ==  1) {					
			System.out.printf("January " + year + " has 31 days.");
		}
		else if (monthValue == 2 && (year % 4 != 0)) {
			System.out.printf("February " + year + " has 28 days.");
		}
		else if (monthValue == 2 && (year % 4 == 0)) {
			System.out.printf("February " + year + " has 29 days.");
		}
		else if (monthValue == 3) {
			System.out.printf("March " + year + " has 31 days.");
		}
		else if (monthValue == 4) {
			System.out.printf("April " + year + " has 30 days.");
		}
		else if (monthValue == 5) {
			System.out.printf("May " + year + " has 31 days.");
		}
		else if (monthValue == 6) {
			System.out.printf("June " + year + " has 30 days.");
		}
		else if (monthValue == 7) {
			System.out.printf("July " + year + " has 31 days.");
		}
		else if (monthValue == 8) {
			System.out.printf("August " + year + " has 31 days.");
		}
		else if (monthValue == 9) {
			System.out.printf("September " + year + " has 30 days.");
		}
		else if (monthValue == 10) {
			System.out.printf("October " + year + " has 31 days.");
		}
		else if (monthValue == 11) {
			System.out.printf("November " + year + " has 30 days.");
		}
		else if (monthValue == 12) {
			System.out.printf("December " + year + " has 31 days.");
		}
	}

}
