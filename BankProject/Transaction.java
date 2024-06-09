package BankProject;

public class Transaction{
private final double transactionFee = 2.50;
	
	public final void performTransaction(Account account,double amt,String type)
	{
		if(type.equalsIgnoreCase("deposit"))
		{
			account.deposit(amt);
			account.withdraw(transactionFee);
		}
		
		else if(type.equalsIgnoreCase("withdraw"))
		{
			account.withdraw(amt+transactionFee);
		}
		
		else
		{
			System.out.println("Invalid transaction type!");
		}
	}
	
	public double getTransactionFee()
	{
		return transactionFee;
	}
}
