import java.text.DecimalFormat;
import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		DecimalFormat format = new DecimalFormat ("##.00");
		
		// Prompt User for a name
		System.out.print("Enter employee's name: ");
		String name  = input.nextLine();
		
		// Prompt User for hours worked
		System.out.print("Enter number of hours worked in a week: ");
		Double hours = input.nextDouble();
		
		// Prompt User for pay rate
		System.out.print("Enter hourly pay rate: ");
		Double payRate = input.nextDouble();
		
		// Prompt User for federal tax withholding rate
		System.out.print("Enter federal tax withholding rate: ");
		Double fedTaxRate = input.nextDouble();
		
		// Prompt User for state tax withholding rate
		System.out.print("Enter state tax withholding rate: ");
		Double stateTaxRate = input.nextDouble();
		
		// Calculates gross pay
		Double grossPay = (hours * payRate);
		
		// Calculates federal withholdings total
		Double fedTotal = (grossPay * fedTaxRate);
		
		// Calculates state withholdings total
		Double stateTotal = (grossPay * stateTaxRate);
		
		// Calculates total deduction
		Double totalDeduct = (fedTotal + stateTotal);
		
		// Calculates final total
		Double total = (grossPay - totalDeduct);
		
		//Display information
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + payRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions:");
		System.out.println("Federal Withholding (" + fedTaxRate * 100 + "%) : $" + format.format(fedTotal));
		System.out.println("State Withholding (" + stateTaxRate * 100 + "%) : $" + format.format(stateTotal));
		System.out.println("Total Deduction: $" + format.format(totalDeduct));
		System.out.println("Net Pay: $" + format.format(total));
		
	}



}
