import java.util.Date;

/** This is the Account Object */

public class Account 
{	
	
	private int id;
	private static double balance;
	private static double annualInterestRate;
	private static double monthlyInterest;
	private static java.util.Date dateCreated;
	
	 

		 Account() {
			int id = 1122;
			double balance = 20000;
			//double annualInterestRate = 0.045;
			double monthlyInterest = (0.045 / 12);
			dateCreated = new java.util.Date();
		
		 
		 }
		
		//Account(); sets up account information
		Account(int ssn, double balanceT, double mI)
		{
			int id = ssn;
			double balance = balanceT;
			double monthlyInterest = mI;
			dateCreated = new java.util.Date();
		}
		
	/** Must now set up the id, balance and annual interest rate methods
	 * These are the setters or the accessors */
		
		public void setID(int ssn)
		{
			id = ssn;
		}
		
		public void setBalance(double balanceT)
		{
			balance = balanceT;
		}
		
		public void setMonthlyInterest(double mI)
		{
			monthlyInterest = mI;
		}
		
		public void setAnnualInterestRate(double annualInterestRate2)
		{
			annualInterestRate = annualInterestRate2;
		}
		
		
		
	/** These are the Mutators or the getters that get information */
		public int getID()
		{
			return id;
		}
		
		public double getBalance()
		{
			return balance;
		}
		
		public double getAnnualInterestRate()
		{
			return annualInterestRate;
		}
		
		public double getMonthlyInterest()
		{
			return monthlyInterest;
			//monthlyInterest = ((balance * 0.045) / 12);
		}
		
		public String getDate()
		{
			return dateCreated.toString();
		}
		
//	public static void getMonthlyInterest(double amount) {
		// Get monthly interest
	//	double monthlyInterest = balance * (0.045/12);
		
	//}

	public static void deposit(double amount) {
		// deposit $3,000
		balance = balance + amount;
	}

	public static void withdraw(double amount) {
		// withdraw $2,500
		balance = balance - amount;
	}
	
	public static void Month(double amount) {
		// applys monthly interest
		monthlyInterest = ((balance * 0.045) / 12);
	}
		 	 
	 
}
