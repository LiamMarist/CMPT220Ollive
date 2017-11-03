/** This is the Account Object */

public class Account 
{	
	
	protected int id;
	protected double balance;
	protected double annualInterestRate;
	protected static double monthlyInterest;
	protected java.util.Date dateCreated;
	
	 

		 Account() {
			//int id = 1122;
			//double balance = 20000;
		    double annualInterestRate = 0.0;
			//double monthlyInterest = (0.045 / 12);
			dateCreated = new java.util.Date();
		
		 
		 }
		
		//Account(); sets up account information
	 Account(int id, double balance)
		{
		 this();
			this.id = id;
			this.balance = balance;
			// double monthlyInterest = mI;
			dateCreated = new java.util.Date();
		}
		
	/** Must now set up the id, balance and annual interest rate methods
	 * These are the setters or the accessors */
		
		public void setID(int ssn)
		{
			id = ssn;
		}
		
		public void setBalance(double balance)
		{
			this.balance = balance;
		}
		
		public void setMonthlyInterest(double mI)
		{
			monthlyInterest = mI;
		}
		
		public void setAnnualInterestRate(double annualInterestRate)
		{
			this.annualInterestRate = annualInterestRate;
		}
		
		
		
	/** These are the Mutators or the getters that get information */
		public int getID()
		{
			return id;
		}
		
		public double getBalance()
		{
			return this.balance;
		}
		
	//	public double getAnnualInterestRate()
	//	{
		//	return annualInterestRate;
	//	}
		
		public double getMonthlyInterestRate()
		{
			return (annualInterestRate / 100);
		//	monthlyInterest = ((balance * 0.045) / 12);
		}
		
		public String getDate()
		{
			return dateCreated.toString();
		}
		
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
		// Get monthly interest
	//	double monthlyInterest = balance * (0.045/12);
		
	//}

	public void deposit(double amount) {
		// deposit $3,000
		this.balance += amount;
	}

	public void withdraw(double amount) {
		// withdraw $2,500
		this.balance -= amount;
		
	}
	
	
		 	 
	 
}
