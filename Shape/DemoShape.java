package Shape;

public class DemoShape {
	public static void main(String[] args) {
		

		Square s = new Square();
		s.setLength(5);
		s.setBreadth(4);
		
		System.out.println("Area="+s.getArea());
		System.out.println("Perameter="+s.getPerimeter());
	}
}
