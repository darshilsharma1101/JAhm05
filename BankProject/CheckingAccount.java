package BankProject;

public class CheckingAccount extends Account{


	private static final double OVERDRAFT_LIMIT = 500.00;

	public CheckingAccount(double balance) {
		super(balance);
	}
	
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	public void withdraw(double amt)
	{
		if(amt <= balance + OVERDRAFT_LIMIT)
		{
			balance -= amt;
		}
		
		else
		{
			System.out.println("Overdraft limit exceeded!");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}

}
