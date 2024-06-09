package firstproject;

public class Maths {

	public static void main(String[] args) {
		 int no , no1;
		 no = 10;
		 no1 = 20;
		 int S = no+no1;
		 int Su = no-no1;
		 int M = no*no1;
		 int D = no1/no;
		 System.out.println("Sum Is="+S);
		 System.out.println("Substraction Is="+Su);
		 System.out.println("Multiplication Is="+M);
		 System.out.println("Division Is="+D);
		 
		 Emp st = new Emp();
		 st.setRollno(5);
		 System.out.println(st.getRollno());
	}

}
