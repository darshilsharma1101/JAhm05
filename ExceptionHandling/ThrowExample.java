package ExceptionHandling;

public class ThrowExample {
	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		try {

			if(marks <0) {
				throw new Exception();
			}
			else {
				this.marks = marks;
			}
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
	}


	@Override
	public String toString() {
		return "ThrowExample [marks=" + marks + "]";
	}
}
