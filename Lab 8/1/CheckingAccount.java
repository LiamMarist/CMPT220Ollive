
public class CheckingAccount extends Account{

	protected double limit = -100; // this is the overdraft limit
	
	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double b) {
		
		if (this.balance - b >= limit) {
			super.withdraw(b);
		}
		else
			System.out.println("Error! Amount exceeds overdraft limit.");
	}
	
	public String toString() {
		return " checking account balance: " + this.balance;
	}
	
}

