package ListExample;
import java.util.ArrayList;
import java.util.List;
public class listInt {
	  public static void main(String[] args) {
	    List<Integer> l1 = new ArrayList<>();
	    l1.add(145);
		l1.add(259);
		l1.add(369);
		l1.add(159);
		l1.add(852);
		l1.add(10);
		l1.add(789);
		l1.add(168);
		l1.add(999);
	   System.out.println("List of numbers: " + l1);
	    int evenSum = 0;
	    for (int number : l1) {
	      if (number % 2 == 0) { 
	        evenSum += number;
	      }
	    }
	    l1.forEach(v -> System.out.println(v) );
	    System.out.println("Sum of even numbers is: " + evenSum);
	  }
	}
