package bankactivites;

public interface bank {
	int MIN_BAL=1000;
	int DEPOSIT_LIMIT=20000;
	int WITHDRAW_LIMIT=10000;
	
	void deposit(Account acc,int amt);
	void withdraw(Account acc,int amt);

}
