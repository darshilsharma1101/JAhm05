package bankactivites;

public class Transection implements bank{
	public void deposit(Account acc,int amt)
	{
		int newbal = acc.getBal() + amt;
		acc.setBal(newbal);
		System.out.println("Balance Deposite "+ amt + " Current Ballance "+ newbal);
	}
	
	public void withdraw(Account acc,int amt)
	{
		int newbal = acc.getBal() - amt;
		acc.setBal(newbal);
		System.out.println("Balance Withdraw "+ amt + " Current Ballance "+ newbal);
	}
	 

}
