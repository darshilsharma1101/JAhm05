package bankactivites;

public class Account {
	String name;
	String email;
	int bal;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", email=" + email + ", bal=" + bal + "]";
	}
	
}
