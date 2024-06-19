package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> lste = new ArrayList<Employee>();
		lste.add(new Employee("Darshil"));
		lste.add(new Employee("Parth"));
		lste.add(new Employee("Nikhil"));
		lste.add(new Employee("Yagnik"));
		lste.add(new Employee("Dhruv"));
		lste.add(new Employee("Khushi"));
		lste.add(new Employee("Priyank"));
		lste.add(new Employee("Mayank"));
		System.out.println(lste);
		//Print One By One NAmes:-
		lste.forEach(obj1 -> System.out.println(obj1.getEname()));
		
		//Sorting:-
		Collections.sort(lste);
		lste.forEach(obj1 -> System.out.println(obj1.getEname()));
	}

}
