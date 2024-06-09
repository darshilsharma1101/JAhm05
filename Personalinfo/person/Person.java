package tns.newpackage.person;

import tns.newpackage.country.Country;
import tns.newpackage.country.State;

public class Person {
	private String person;
	private int income;
	private int age;
	private Country c1;
	private State s1;
	
	
	public Person(String person, Country c1, State s1,int income,int age) {
		
		this.person = person;
		this.c1=c1;
		this.s1=s1;
		this.income=income;
		this.age=age;
		
	}
	
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPerson() {
		return person;
	}
	
	public void setPerson(String person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Person [person=" + person + ", income=" + income + ", age=" + age + ", c1=" + c1 + ", s1=" + s1 + "]";
	}
	
	

}
