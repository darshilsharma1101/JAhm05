package studentinfo;

public class Student {
	private String sname;

	public Student() {
		sname="unknown";
	}
	
	public Student(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + "]";
	}
	
}
