package Interface;

public class Transaction implements Bank{
	public void deposit(Account acc, int amt) {
		int newbal = acc.getBalance();
		acc.setBalance(newbal);
		
		System.out.println("Balance deposited");
		
	}


	public void withdraw(Account acc, int amt) {
		int newbal = acc.getBalance()-amt;
		acc.setBalance(newbal);
		
		System.out.println("Balance updated");
	
		
	}

}
