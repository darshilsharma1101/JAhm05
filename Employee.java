package com.studyopedia;

public class Employee {
	private int eid;
	private String email;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", email=" + email + "]";
	}
	
}
