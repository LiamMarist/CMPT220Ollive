
public class SavingsAccount extends Account {

protected double limit = 0; // this is the overdraft limit
	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double a) {
		if (this.balance - a >= 0) {
			super.withdraw(a);
		}
	 else 
		System.out.println("You can't withdraw more than ammount in balance!");
	 
	}
	
	public String toString() {
		return "savings account balance " + this.balance;
	}
	
}
