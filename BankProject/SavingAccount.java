package BankProject;

public class SavingAccount extends Account{

	private static final double INTEREST_RATE = 0.02;

	public SavingAccount(double balance) {
		super(balance);
	}
	
	public void deposit(double amt)
	{
		balance += amt;
		balance += balance * INTEREST_RATE;
	}
	
	public void withdraw(double amt)
	{
		if(amt <= balance)
		{
			balance -= amt;
		}
		else
		{
			System.out.println("Insufficient balance!");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	

	

}
