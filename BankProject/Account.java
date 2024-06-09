package BankProject;

public abstract class Account {
	protected double balance;

	public Account(double balance) {
		this.balance = balance;
		Bank.incrementTotalAccounts();
	}

	public abstract void deposit(double amt);
	public abstract void withdraw(double amt);
	public abstract double getBalance();
	
	
}
