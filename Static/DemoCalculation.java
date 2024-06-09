package Static;

public class DemoCalculation {
public static void main(String[] arg) {
	Calculation c1 = new Calculation();
	System.out.println(c1);
	Calculation c2 = new Calculation();
	System.out.println(c2);
	Calculation c3 = new Calculation();
	System.out.println(c3);
	System.out.println(Calculation.count);
	Calculation.display();
	ChildClass cs = new ChildClass();
}
}
