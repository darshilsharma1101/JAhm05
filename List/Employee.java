package List;

public class Employee implements Comparable<Employee> {
     public String Ename;

     public Employee() {
 	}     
	public Employee(String ename) {
		super();
		Ename = ename;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		this.Ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [Ename=" + Ename + "]";
	}
     
   public int compareTo(Employee e1) {
	return this.Ename.compareTo(e1.Ename);
	   
   }
}
