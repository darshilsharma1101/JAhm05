package tns.newpackage.person;

import tns.newpackage.country.Country;
import tns.newpackage.country.State;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Country c1= new Country("India");
		State s1=new State("Gujrat");
		Person p1 =new Person("Darshil",c1,s1);
		System.out.println(p1);
		
	}

}
