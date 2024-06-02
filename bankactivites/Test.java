package bankactivites;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account();
		a1.setName("Darshil");
		a1.setEmail("d@gmail.com");
		a1.setBal(5000);
		
		System.out.println(a1);
		Transection t1 = new Transection();
		t1.deposit(a1,100);
		t1.withdraw(a1,500);
		System.out.println(t1);
		

	}

}
