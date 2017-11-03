

public class TestAccount {

	public static void main(String[] args) {
		
		
		/** Calls to Account obj */
		Account myAccount = new Account();
	
		
		// sets the id to 1122
		myAccount.setID(1122);
		System.out.println("Account ID: " + myAccount.getID());
		
		// sets balance 20000
		myAccount.setBalance(500);
		
		// sets annual interest
		 myAccount.setAnnualInterestRate(4.5);
	
		 // deposits money
		 myAccount.deposit(0);
		
		//withdraws 2500 from balance and calls to method
		myAccount.withdraw(1);
		System.out.println("Current Balance: $" + myAccount.getBalance());
		
		//myAccount.Month(1);
		System.out.println("Current Annual Interest is: $" + myAccount.getMonthlyInterest());
		
		//calls to date mutator in Account obj to get the current date
		myAccount.getDate();
		System.out.println("This Account was created on: " + myAccount.getDate());
		
		// New Stuff
		
		CheckingAccount checkingAccount = new CheckingAccount(1122, 400);
		checkingAccount.withdraw(501);
		System.out.println(checkingAccount.toString());

		SavingsAccount savingsAccount = new SavingsAccount(1122, 400); // sets id and balance
		savingsAccount.withdraw(3); // this is the amount withdrawn from savings account
		System.out.println(savingsAccount.toString()); // displays return from savings class
		
	}

}
