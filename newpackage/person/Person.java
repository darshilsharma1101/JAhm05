package tns.newpackage.person;

import tns.newpackage.country.Country;
import tns.newpackage.country.State;

public class Person {
	private String person;
	private Country c1;
	private State s1;
	
	
	public Person() {
	}
	public Person(String person, Country c1, State s1) {
		
		this.person = person;
		this.c1=c1;
		this.s1=s1;
		
	}
	
	public String getPerson() {
		return person;
	}
	
	public void setPerson(String person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Person [person=" + person + ", c1=" + c1 + ", s1=" + s1 + "]";
	}
	

}
