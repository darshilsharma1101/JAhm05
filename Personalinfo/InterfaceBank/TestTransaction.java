package Interface;

public class TestTransaction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		acc.setAccname("Darshil N Sharma");
		acc.setEmail("darshil1101@gmail.com");
		acc.setBalance(8000);
		
		
		
		Transaction tcs = new Transaction();
		tcs.deposit(acc, 3000);
		
		System.out.println(acc);
		
		tcs.withdraw(acc, 1000);
		System.out.println(acc);
		
	}
}
