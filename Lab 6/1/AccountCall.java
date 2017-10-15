
public class AccountCall {

	public static void main(String[] args) {
		
		
		/** Calls to Account obj */
		Account myAccount = new Account();
		
		// sets the id to 1122
		myAccount.setID(1122);
		System.out.println("Account ID: " + myAccount.getID());
		
		// sets balance 20000
		myAccount.setBalance(20000);
	
		//deposits 3000 into balance and calls to method
		myAccount.deposit(3000);
		
		//withdraws 2500 from balance and calls to method
		myAccount.withdraw(2500);
		System.out.println("Current Balance: $" + myAccount.getBalance());
		
		myAccount.Month(0);
		System.out.println("Current Monthly Interest is: $" + myAccount.getMonthlyInterest());
		
		//calls to date mutator in Account obj to get the current date
		myAccount.getDate();
		System.out.println("This Account was created on: " + myAccount.getDate());
		
	//	myAccount.getMonthlyInterest();
	}

}
