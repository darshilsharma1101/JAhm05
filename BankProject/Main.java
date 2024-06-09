package BankProject;

public class Main {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(1000.00);
		CheckingAccount ca = new CheckingAccount(500.00);
		
		Transaction ta = new Transaction();
		
		ta.performTransaction(sa, 200.00, "deposit");
		ta.performTransaction(ca, 100.00, "withdraw");
		
		System.out.println("Savings acc balance: $" + sa.getBalance());
		System.out.println("Checking acc balance: $" + ca.getBalance());
		
		System.out.println("Total acc: "+ Bank.getTotalAccounts());
	}

	}


